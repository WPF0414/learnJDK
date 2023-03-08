#!/bin/bash
# shellcheck disable=SC2034
# shellcheck disable=SC2046
# shellcheck disable=SC2035
projectHome=/Users/wangpengfei/work/personal/learnJDK
scriptHome=/Users/wangpengfei/work/personal/learnJDK/src/main/resources/script
waitingToCompileHome=/Users/wangpengfei/work/personal/learnJDK/src/main/java
startTime=$(date +%s)
echo "===========编译开始=============="
find "$waitingToCompileHome" -name "*.java" > "$scriptHome"/filelist.txt 2>&1
if [ ! -f "$scriptHome"/filelist.txt ]; then exit; fi
if [ ! -f "$scriptHome"/log.txt ]; then touch "$scriptHome"/log.txt; fi
#if [ ! -f "$projectHome"/target/classes ]; then mkdir -p "$projectHome"/target/classes; fi
cd "$projectHome" || exit
mvn clean compile -Dmaven.test.skip=true > /dev/null 2>&1
javac -J-Xms1G -J-Xmx1G -sourcepath "$projectHome"/src/java -cp "$projectHome"/lib/rt.jar:"$projectHome"/lib/tools.jar -d "$projectHome"/target/classes -g @"$scriptHome"/filelist.txt > "$scriptHome"/log.txt 2>&1
cd "$projectHome"/target/classes || exit
jar cf0 rt_debug.jar java
sudo -S mv rt_debug.jar /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/jre/lib/endorsed
cd "$scriptHome"
rm -rf filelist.txt log.txt
echo "=====操作结束===="
endTime=$(date +%s)
echo "本次运行时间： "$((endTime-startTime))"s"