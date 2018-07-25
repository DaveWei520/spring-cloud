#!/bin/bash

##file name     : setenv.sh
##author        : weiyu
##version       : v1.0
##date          : 2018-07-16 13:34:00
##copyright     : willem
##description   : spring-cloud-learning
##usage         : spring-cloud-learning
##history       : 第一版脚本，无历史

cd `dirname $0`
BIN_DIR=`pwd`
cd ..
DEPLOY_DIR=`pwd`
JAVA_OPTS=" -Xms256m -Xmx256m "
PIDS=0

if [ -r "$DEPLOY_DIR"/bin/setenv.sh ]; then
    . "$DEPLOY_DIR"/bin/setenv.sh
else
    echo "cannot find $DEPLOY_DIR/bin/setenv.sh"
    echo "this file is needed to run this program"
    exit 1
fi

getPid(){
    PIDS=`ps -ef | grep java | grep "$MAIN_JAR" |awk '{print $2}'`
    if [ -z "$PIDS" ]; then
        PIDS=0
    fi
}

check() {
    getPid
    if [ $PIDS -ne 0 ]; then
        echo "ERROR: The $SERVER_NAME already started!"
        echo "PID: $PIDS"
        exit 1
    fi
    if [ -n "$SERVER_PORT" ]; then
        SERVER_PORT_COUNT=`netstat -tln | grep ":$SERVER_PORT " | wc -l`
        if [ $SERVER_PORT_COUNT -gt 0 ]; then
            echo "ERROR: The $SERVER_NAME port $SERVER_PORT already used!"
            exit 1
        fi
    fi
}

start() {  
   check
   echo -n "Starting $SERVER_NAME ..."  
   nohup $JAVA_HOME/bin/java -jar $JAVA_OPTS $LIB_DIR/$MAIN_JAR >/dev/null 2>&1 &
   getPid
   if [ $PIDS -ne 0 ]; then
      echo "(pid=$PIDS) [OK]"
   else  
      echo "[Failed]"  
   fi  
}


stop() {
   getPid
   if [ $PIDS -ne 0 ]; then
      echo -n "Stopping $SERVER_NAME ...(pid=$PIDS) "
      kill -9 $PIDS
      if [ $? -eq 0 ]; then
         echo "[OK]"
      else
         echo "[Failed]"
      fi

      getPid
      if [ $PIDS -ne 0 ]; then
         stop
      fi
   else
      echo "================================"
      echo "warn: $SERVER_NAME is stopped"
      echo "================================"
   fi
}

status() {  
   getPid 
   if [ $PIDS -ne 0 ];  then
      echo "$SERVER_NAME is running! (pid=$PIDS)"
   else  
      echo "$SERVER_NAME is not running"  
   fi  
}

case "$1" in  
   'start')  
      start  
      ;;  
   'stop')  
     stop  
     ;;  
   'restart')  
     stop  
     start  
     ;;  
   'status')  
     status  
     ;;    
   *)
     echo "Usage: $0 {start|stop|restart|status}"  
     exit 1  
esac  
exit 0
