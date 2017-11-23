# dubbo测试

##### dubbo-sample-service          服务接口
##### dubbo-sample-provider         服务提供者
##### dubbo-sample-consumer         服务消费者
##### dubbo-sample-ds               数据库连接模块

### 初始化数据
```sql
CREATE TABLE `user` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(20) DEFAULT NULL,
`age` int(11) DEFAULT NULL,
`address` varchar(100) DEFAULT NULL,
`createdAt` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES(NULL,'aaa',11,'shanghai',NOW());
INSERT INTO `user` VALUES(NULL,'bbb',12,'beijing',NOW());
INSERT INTO `user` VALUES(NULL,'ccc',13,'xianggang',NOW());
```

### 编译打包
```
cd dubbo-sample
mvn clean package
```

### 启动服务提供者
```
cd dubbo-sample-provider/target
tar zxvf dubbo-sample-provider-0.1-assembly.tar.gz
cd dubbo-sample-provider-0.1/bin
./start.sh

如果出现类似这样的错误：
-bash: ./start.sh: /bin/bash^M: bad interpreter: 没有那个文件或目录

则：
vim start.sh
:set ff=unix
:wq
```

### 测试服务消费者
```
cd dubbo-sample
jar -jar dubbo-sample-consumer/target/dubbo-sample-consumer-0.1.jar

request : /hello
request : /user/list
request : /user/get/{id}
```