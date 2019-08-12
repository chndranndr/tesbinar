Cara menjalankan aplikasi:
1. Install Docker
2. Install maven dan java
3. Ganti MYSQL_ROOT_PASSWORD pada file docker-compose.yml
4. Buka terminal pada direktori projek
5. Jalankan perintah 'docker-compose up'
6. Sesuaikan konfigurasi datasource (url, username, password)  pada file ~/testing/src/main/resources/application.properties
7. Jalankan perintah 'mvn clean spring-boot:run'
8. Aplikasi dapat diakses melalui 'localhost:8080'