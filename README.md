# SpringMVC
《SpringMVC学习指南》（Paul Deck著，林仪明 崔毅译，人民邮电出版社）书籍学习

  2017年3月23日：
###  一、解耦控制器代码  
将原先的ControllerServlet解耦成InputProductController、SaveProductController、Controller以及DispatcherServlet
  
  
  2017年3月22日：
####  二、Servlet控制器
#####  1、新建Spring - Spring MVC模块：app02a
#####  2、File -> Project Structure ... -> Libraries -> 左侧中间一个窗口“+”  引入javaxServlet.jar文件
#####  3、设置：Intellij IDEA 自动生成 serialVersionUID
#####  4、在web.xml文件配置修改servlet拦截器映射关系
#####  5、根据书本创建相关类和方法
#####  6、File -> Project Structure中添加Artifacts并相应地修改合适的out目录
#####  7、配置和启动tomcat，浏览器中访问[http://localhost:8080/product_input.action](http://localhost:8080/product_input.action)

#####  8、问题：jsp输入页面输入中文后，jsp显示页面乱码显示
原因分析：**程序用UTF-8编码，而浏览器用GB2312解码，因此会出现乱码**  
解决办法：POST请求中设置字符格式为UTF-8即可


####  一、工程创建
#####  1、intellij idea新建空白工程SpringMVC
*  目的：书籍《Spring MVC学习指南》(Paul Deck著，林仪明、崔毅译，人民邮电出版社)的学习过程
