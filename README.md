## Overview of the project
This is my backend server using Java and Spring Boot to build RestfulAPI for CRUD Blog data, MySQL for database
This project aims for CRUD Blog API, using for [My Frontend NextJS Application](https://github.com/TranTanDat1162/fe-blog-crud-nextjs)

## How to run backend server
First, we need to set up MySQL Workbench, you could follow [This Tutorial](https://www.youtube.com/watch?v=u96rVINbAUI), then create a new database with your preference name for testing

Second, I suggest to use JetBrain IDE for opening this project, then open your terminal in Jetbrain using git version to clone the project with cmd below:
```
git clone https://github.com/TranTanDat1162/backend-blog-crud-springboot-nextjs
```

Third, to the left corner of the ide, there is a button 4 straight parallel lines, click and open with name backend-blog-crud-springboot-nextjs

Fourth, click **BlogApplication** and **Edit Configurations**..., there will be a window appear, click **Modify option**s and check **Environemt variables**. Then, copy this one:
```
db_username=[your_db_username];db_password=[your_db_password];db_url=jdbc:mysql://localhost:3306/[your_db_name]
```

Final, just run Spring Boot Application to test blog api

Open [http://localhost:8080/api/blogs](http://localhost:8080/api/blogs) with your browser to see the result.




