jpackage \
    --type exe \
    --name YourAppName \
    --input app \
    --main-jar your-app.jar \
    --main-class com.example.MainApplication \
    --runtime-image jdk \
    --icon your-icon.ico \
    --output output


# 编译

`kotlinc Example.kt -include-runtime -d app/example.jar`


`.\jdk\bin\java.exe -jar .\app\example.jar`


# 打包

## jpackage 



目录结构

```text
project/
├── app/
│   ├── your-app.jar
│   └── config/ (如果有配置文件，可以放在这里)
├── jdk/
│   └── (解压后的 JDK 文件)
```


### 使用自己的jdk 安装版
jpackage.exe --type exe --input ./app --name test1 --icon .\app.ico --win-console --win-shortcut --win-dir-chooser --main-jar example.jar --runtime-image .\jdk

### 使用自己的jdk 便携版
jpackage.exe --type app-image --input ./app --name test1 --icon .\app.ico --win-console --main-jar example.jar --runtime-image .\jdk


## launch4j

> [官网](https://launch4j.sourceforge.net)


作用：只能生成jar文件的exe启动器， 不能打包JRE

- Launch4j 只能生成 Windows 平台的 .exe 文件，无法用于其他操作系统（如 macOS 或 Linux）。