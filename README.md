# dubbo测试

* **dubbo-sample-service**: 服务接口
* **dubbo-sample-provider**: 服务提供者
* **dubbo-sample-consumer**: 服务消费者
* **dubbo-sample-ds**: 数据库连接模块

### 初始化数据
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
	
### 启动服务提供者
	cd dubbo-sample
	mvn clean package
	cd dubbo-sample-provider/target
	tar zxvf dubbo-sample-provider-0.0.1-SNAPSHOT-assembly.tar.gz
	cd dubbo-sample-provider-0.0.1-SNAPSHOT/bin
	./start.sh
	
### 测试服务消费者
	cd dubbo-sample
	mvn test -Dtest=dubbo.sample.consumer.Consumer#hello -DfailIfNoTests=false
	mvn test -Dtest=dubbo.sample.consumer.Consumer#user -DfailIfNoTests=false
	mvn test -Dtest=dubbo.sample.consumer.Consumer#list -DfailIfNoTests=false
	
	
