# Easy-parking project

### travis-ci

[![travis-ci](https://api.travis-ci.org/lijun003/easyparking.svg)](https://travis-ci.org/lijun003/easyparking)

### BUILD

#### Generate IntelliJ IDEA project
`./gradlew cleanIdea idea`

Open the `easyparking.ipr` using IntelliJ

#### Run clean and build tasks
`./gradlew clean build`

This will run checkstyle, unit test and code coverage check

#### start application
`./gradlew bootRun` or `java -jar build/libs/easy-parking-0.1.0.jar`

### Git提交规范：

[卡号][提交作者&Pair作者] - comment here

Note: [提交作者]和comment之间需要有 空格+minus+空格，comment内容不要出现minus。

**Example:** `[M001][lijun&jason] - add the order domain object`


### Java代码规范：

- Java代码必须删去没有引用到的包，Import语句为灰色即是可删去。
- 类文件开始处不要出现 "/* xxx create xxx */" 这样自动生成的注释。
- 还有其他规范Checkstyle也会覆盖到

