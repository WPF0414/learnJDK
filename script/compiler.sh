#!/bin/bash

startTime=$(date +%s)
echo "===========编译开始=============="
find /Users/wangpengfei/work/personal/learnJDK/src/java -name "*.java" > filelist.txt 2>&1

if [ ! -d "classes" ]; then mkdir classes; fi
if [ ! -f "filelist.txt" ]; then touch filelist.txt; fi
if [ ! -f "log.txt" ]; then touch log.txt; fi


javac -J-Xms1G -J-Xmx1G -sourcepath /Users/wangpengfei/work/personal/learnJDK/src/java -cp /Users/wangpengfei/work/personal/learnJDK/script/rt.jar:/Users/wangpengfei/work/personal/learnJDK/script/tools.jar -d /Users/wangpengfei/work/personal/learnJDK/script/classes/ -g @filelist.txt > log.txt 2>&1
echo "编译中..."
#cd ../target || exit
jar cf0 rt_debug.jar ./*
sudo -S mv rt_debug.jar /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/jre/lib/endorsed
rm -rf classes filelist.txt log.txt
echo "=====操作结束===="
endTime=$(date +%s)
echo "本次运行时间： "$((endTime-startTime))"s"