# keycloak-playground

### How to run Keycloak:

sudo docker run -itd --name dev-keycloak-mycms -p 5436:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.1.1 start-dev
sudo docker start dev-keycloak-mycms

### Admin Console:
http://localhost:5436/admin

### Resources:
https://www.keycloak.org/getting-started/getting-started-docker

https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.0&packaging=jar&jvmVersion=11&groupId=com&artifactId=keycloak-playground&name=keycloak-playground&description=Demo%20project%20for%20Spring%20Boot%20Keycloak&packageName=com.keycloak-playground&dependencies=web,oauth2-client,data-jpa,security,oauth2-resource-server