**Install tomcat8**<br />
sudo apt install tomcat8<br />

**Building**<br />
https://github.com/myCustomDemo/servlet.git<br />
cd servlet<br />
mvn clean package<br />
sudo chmod 777 target/test-1.war<br />
sudo cp target/test-1.war /var/lib/tomcat8/webapps<br />

**Running**<br />
sudo service tomcat8 restart

**Testing**<br />
curl -l "http://localhost:8080/test-1/hello"

