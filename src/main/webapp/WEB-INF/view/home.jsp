<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
 <head>
 <title>Security with Spring Boot</title>
 </head>
 <body>
     <h1 style="color: green">Hello! This is Home Page!</h1>
     <a style="color:blue" th:href="@{/welcome}">Go to User Welcome Page!</a>
     <br/>
     <a style="color:blue" th:href="@{/admin}">Go to Admin Page!</a>
 </body>
</html>