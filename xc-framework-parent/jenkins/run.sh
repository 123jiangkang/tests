#!/bin/bash

cd xc-framework-parent
mvn clean package

if [ $COMMON == 'true' ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-common
    mvn clean package
fi
if [ $MODEL == 'true' ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-model
    mvn clean package
fi
if [ $UTILS == 'true' ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-utils
    mvn clean package
fi
if [ $API == 'true' ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-service-api
    mvn clean package
fi
if [ $CMS == 'true' ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-service-manage-cms
    mvn clean package
fi


