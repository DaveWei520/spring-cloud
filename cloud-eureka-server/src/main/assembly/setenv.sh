#!/bin/bash

##file name     : setenv.sh
##author        : weiyu
##version       : v1.0
##date          : 2018-07-16 13:34:00
##copyright     : willem
##description   : spring-cloud-learning
##usage         : spring-cloud-learning
##history       : 第一版脚本，无历史

CONF_DIR=$DEPLOY_DIR/conf

SERVER_NAME=`sed '/spring.application.name/!d;s/.*=//' $CONF_DIR/application.yml| tr -d '\r'`
SERVER_PORT=`sed '/server.port/!d;s/.*=//' $CONF_DIR/application.yml | tr -d '\r'`

if [ -z "$SERVER_NAME" ]; then
    SERVER_NAME=`hostname`
fi

LIB_DIR=$DEPLOY_DIR/lib
MAIN_JAR=`ls $LIB_DIR|grep "$SERVER_NAME"|awk "{print $2}"`
