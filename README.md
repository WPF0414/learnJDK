# learnJDK
学习jdk源码

## install
**1.编译源码**
使用`javac`命令, 编译`src`源码

```shell
javac -J-Xms1024m -J-Xmx1024m -sourcepath source_code -cp /path/rt.jar:/path/tools.jar -d classes -g @filelist.txt
```

| A               | B                                                              | C                                                                      |
|-----------------|----------------------------------------------------------------|------------------------------------------------------------------------|
| source_code     | 源码的绝对路径, 如: /Volumes/myplace/jdk8src/src                       |                                                                        |
| /path/rt.jar    | 即rt.jar的绝对路径: 如: /Volumes/myplace/jdk8src/scripts/rt.jar       | 这个rt.jar是本人为了方便, 直接从$JAVA_HOME/jre/lib/rt.jar复制而来, 放至scripts路径下        |
| /path/rt.jar    | 即rt.jar的绝对路径: 如: /Volumes/myplace/jdk8src/scripts/rt.jar       |                                                                        |
| /path/tools.jar | 即tools.jar的绝对路径: 如: /Volumes/myplace/jdk8src/scripts/tools.jar | 这个tools.jar是本人为了方便, <br/>直接从$JAVA_HOME/lib/tools.jar复制而来, 放至scripts路径下 |
| classes         | 编译后的class文件存放路径, 如: /Volumes/myplace/jdk8src/classes           |                                                                        |
| @filelist.txt   | 编译源码的文件列表, 如: /Volumes/myplace/jdk8src/scripts/filelist.txt    |                                                                        |

**2.生成jar包**
进入classes目录, 执行如下命令生成jar包

`jar cf0 rt_debug.jar *`

**3.复制到指定目录**
将`rt_debug.jar`包保存到`$JAVA_HOME/jre/lib/endorsed`, 即: `/Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/jre/lib/endorsed`

**ps:** 如果`endorsed`不存在, 直接创建即可

### or
```shell
chmod +x script/compilerDebugJar.sh && cd script && ./compilerDebugJar.sh
```
**ps:** 如果需要日志把rm -rf classes filelist.txt log.txt 这行禁用

## uninstall

```shell
chmod +x script/cleanDebugJar.sh && cd script && ./cleanDebugJar.sh
```