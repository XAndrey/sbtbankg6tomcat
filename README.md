# sbtbankg6tomcat
1) ������ ������ �������: https://www.shortn0tes.com/2017/01/intellij-idea-community-edition-tomcat.html

2) ��������� Tomcat 9 �� ������ AWS: https://www.rosehosting.com/blog/install-tomcat-9-on-an-ubuntu-16-04-vps/
apache-tomcat-9.0.10.tar.gz
��� ��� ����� ��� ������� ����� sudo!

��� ��������� Java home:
echo $JAVA_HOME
sudo update-alternatives --config java

https://www.build-business-websites.co.uk/install-tomcat-9-on-ubuntu-16-04/

��� ������� � web-manager'� �� ��� (�� � ���������� �����, � � ������� IP) ����� �������� ��� � ���� apache-tomcat-9.0.10/webapps/manager/META-INF/context.xml

3) ��������� �� PosgreSQL

4) ������������ war ����� �� �.1 �� ������� Tomcat: http://localhost:8080/manager/text/deploy?path=/footoo&war=file:/path/to/foo
��� ���� ��� Tomcat ����� ���������� ������������ � ������: � ����� tomcat-users.xml ����� ��������: 
<role rolename="manager-gui"/>
<role rolename="manager-script"/>
<role rolename="manager-jmx"/> 
<user username="username" password="userpass" roles="manager-gui,manager-script,manager-jmx"/>
����� ������������ ����� ����������� �� ������: http://localhost:8080/sbtbankg6tomcat/

