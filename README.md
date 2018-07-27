# sbtbankg6tomcat
1) Сборка самого проекта: https://www.shortn0tes.com/2017/01/intellij-idea-community-edition-tomcat.html

2) Установка Tomcat 9 на сервер AWS: https://www.rosehosting.com/blog/install-tomcat-9-on-an-ubuntu-16-04-vps/
apache-tomcat-9.0.10.tar.gz
Все или почти все команды через sudo!

Для настройки Java home:
echo $JAVA_HOME
sudo update-alternatives --config java

https://www.build-business-websites.co.uk/install-tomcat-9-on-ubuntu-16-04/

Для доступа к web-manager'у из вне (не с локального компа, а с другого IP) нужно добавить его в файл apache-tomcat-9.0.10/webapps/manager/META-INF/context.xml

3) Установка БД PosgreSQL

4) Развёртывание war файла из п.1 на сервере Tomcat: http://localhost:8080/manager/text/deploy?path=/footoo&war=file:/path/to/foo
При этом для Tomcat нужно настройить пользователя с ролями: в файле tomcat-users.xml нужно добавить:
<role rolename="manager-gui"/>
<role rolename="manager-script"/>
<role rolename="manager-jmx"/>
<user username="username" password="userpass" roles="manager-gui,manager-script,manager-jmx"/>
После развёртывания можно достучаться по адресу: http://localhost:8080/sbtbankg6tomcat/

