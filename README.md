openshift-jee-sample
====================

A sample app to be deployed on openshift environments

Note: to build this repository with maven you must specify "-Popenshift", eg "mvn clean package -Popenshift"

--- dev ---
***spring boot
mvn clean package -Psblocal
java -jar target\SampleApp-1.0.jar --spring.config.name=sblocal
o
mvn spring-boot:run -Psblocal -Dspring.config.name=sblocal

***jetty+jndi+postgresql
mvn clean package -Pjetty
mvn jetty:run -Pjetty

***jetty+hsqldb
mvn clean package -Pjetty_lo
mvn jetty:run -Pjetty_lo -Dspring.config.name=sblocal
