#spring-transaction
jdbc连接数据库的问题？<br>
jdbc配置文件一定要如下格式：<br>
(带上jdbc.)<br>
jdbc.driver=...<br>
jdbc.url=...<br>
jdbc.username=...<br>
jdbc.password=...<br>

spring将事务管理分为两类：<br>
1>编程式事务管理<br>
 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;手动编写代码进行事务管理<br>
2>声明式事务管理<br>
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;基于TransactionProxyFactoryBean的方式<br>
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;基于aspectj的xml方式<br>
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;基于注解方式<br>
