#!/bin/bash

##file name     : server.sh
##author        : weiyu
##version       : v1.0
##date          : 2018-03-28 17:16
##copyright     : gome
##description   : 微服务eureka启动脚本
##usage         : eureka
##history       : 第一版脚本，无历史

cd `dirname $0`
APP_NAME="cloud-eureka"
APP_LOCATION=`find /data/servers -name $APP_NAME`
JAR_NAME=$APP_NAME-1.0.0.jar
JAVA_OPTS=" -Xms256m -Xmx256m "
psid=0

check() {
   javaps=`$JAVA_HOME/bin/jps -l | grep $APP_NAME`  
  
   if [ -n "$javaps" ]; then  
      psid=`echo $javaps | awk '{print $1}'`  
   else  
      psid=0  
   fi  
}

start() {  
   check
  
   if [ $psid -ne 0 ]; then  
      echo "================================"  
      echo "warn: $APP_NAME already started! (pid=$psid)"  
      echo "================================"  
   else  
      echo -n "Starting $APP_NAME ..."  
      nohup $JAVA_HOME/bin/java -jar $JAVA_OPTS $APP_LOCATION/lib/$JAR_NAME >/dev/null 2>&1 &
      check
      if [ $psid -ne 0 ]; then  
         echo "(pid=$psid) [OK]"  
      else  
         echo "[Failed]"  
      fi  
   fi  
}


stop() {
   check

   if [ $psid -ne 0 ]; then
      echo -n "Stopping $APP_NAME ...(pid=$psid) "
      kill -9 $psid
      if [ $? -eq 0 ]; then
         echo "[OK]"
      else
         echo "[Failed]"
      fi

      check
      if [ $psid -ne 0 ]; then
         stop
      fi
   else
      echo "================================"
      echo "warn: $APP_NAME is not running"
      echo "================================"
   fi
}

status() {  
   check
  
   if [ $psid -ne 0 ];  then  
      echo "$APP_NAME is running! (pid=$psid)"  
   else  
      echo "$APP_NAME is not running"  
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