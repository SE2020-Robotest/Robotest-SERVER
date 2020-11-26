# Java GRPC

## 配置

+ 首先请安装maven. 应用maven构建java project

+ 依赖

```js
<dependencies>
  <dependency>
  	<groupId>com.google.protobuf</groupId>
  	<artifactId>protobuf-java</artifactId>
  	<version>3.14.0</version>
  </dependency>  		
  <dependency>
  	<groupId>io.grpc</groupId>
  	<artifactId>grpc-netty-shaded</artifactId>
  	<version>1.33.1</version>
  </dependency>
  <dependency>
  	<groupId>io.grpc</groupId>
  	<artifactId>grpc-protobuf</artifactId>
  	<version>1.33.1</version>
  </dependency>
  <dependency>
  	<groupId>io.grpc</groupId>
  	<artifactId>grpc-stub</artifactId>
  	<version>1.33.1</version>
  </dependency>
  <dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
  </dependencies>
```

+ 编译及插件具体见`pom.xml`文件

建议使用Eclipse IDE创建project

最后生成的class.java文件均位于`msg.grpc包中

## 控制端消息监听及响应服务

`services/ControlServices.java`

请补充完所有服务的消息响应, 消息为request

所有需要进行补充的地方都使用TODO进行了标记

函数中也给出了相应数据结构的操作方法, 请补完以下四个函数

+ `robotPosition`: request为接收的机器人位置消息
+ `robotPath`: request为接收到的机器人路径
+ `voiceResult`: request为接收到的语音识别结果
+ `robotFinished`: 为结束实验后机器人发送的finished消息

### 启动服务

`services/ControlServer.java`

创建子线程并使用函数`StartServer()`启动消息监听及响应服务

注意修改IP地址, 默认端口8888, 若修改端口号, 请与其它端进行同步

## 控制端数据发送服务

`services/ControlClient.java`

控制端可发送地图配置, 障碍物可使用setBlock生成发送使用的Block数据结构

发送命令消息Start, Stop, Connect

+ `SendConfigMap`
+ `SendControlCommand`

## `TestMain.java`为测试用文件