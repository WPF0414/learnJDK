#!/bin/bash

startTime=$(date +%s)
echo "===========编译开始=============="
find /Users/wangpengfei/work/personal/learnJDK/src/java -name "*.java" > filelist.txt 2>&1

if [ ! -d "classes" ]; then mkdir classes; fi
if [ ! -f "filelist.txt" ]; then touch filelist.txt; fi
if [ ! -f "log.txt" ]; then touch log.txt; fi


javac -J-Xms1G -J-Xmx1G -sourcepath ../src -cp rt.jar:tools.jar -d ./classes -g @filelist.txt > log.txt 2>&1
echo "编译中..."
cd classes || exit
jar cf0 rt_debug.jar ./*
sudo -S mv rt_debug.jar /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/jre/lib/endorsed
cd .. && rm -rf classes filelist.txt log.txt && cd ..
pwd
echo "=====操作结束===="
endTime=$(date +%s)
echo "本次运行时间： "$((endTime-startTime))"s"