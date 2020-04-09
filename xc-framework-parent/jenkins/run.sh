#!/bin/bash

cd xc-framework-parent
mvn clean package

if [ $COMMON ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-common
    mvn clean package
fi
if [ $MODEL ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-model
    mvn clean package
fi
if [ $UTILS];then
    cd /var/lib/jenkins/workspace/xc_project/xc-framework-utils
    mvn clean package
fi
if [ $API ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-service-api
    mvn clean package
fi
if [ $CMS ];then
    cd /var/lib/jenkins/workspace/xc_project/xc-service-manage-cms
    mvn clean package
fi


