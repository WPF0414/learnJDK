find /Users/wangpengfei/work/personal/learnJDK/src -name "*.java" > filelist.txt

javac -J-Xms2048m -J-Xmx2048m -sourcepath /Users/wangpengfei/work/personal/learnJDK/src -cp /Users/wangpengfei/work/personal/learnJDK/script/rt.jar:/Users/wangpengfei/work/personal/learnJDK/script/tools.jar -d /Users/wangpengfei/work/personal/learnJDK/out -g @filelist.txt

cd ../out || exit
jar cf0 rt_debug.jar *
sudo -S mv rt_debug.jar /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/jre/lib/endorsed