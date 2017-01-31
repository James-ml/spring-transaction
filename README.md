#spring-transaction
jdbc连接数据库的问题？
jdbc配置文件一定要如下格式：
(带上jdbc.)
jdbc.driver=...
jdbc.url=...
jdbc.username=...
jdbc.password=...

spring将事务管理分为两类：
1>编程式事务管理
    手动编写代码进行事务管理
2>声明式事务管理
    基于TransactionProxyFactoryBean的方式
    基于aspectj的xml方式
    基于注解方式