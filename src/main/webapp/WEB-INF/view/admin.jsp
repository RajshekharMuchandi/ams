<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
 <head>
 <title>Welcome Security with Spring Boot!</title>
 </head>
 <body>
     <h1 style="color:blue"> Hello! This is Admin Page!</h1>
     
     <a style="color:blue" th:href="@{/}">Go to Home Page</a>
     
     <br/>
     
     <form th:action="@{/logout}" method="post">
         <input type="submit" value="Sign Out"/>
     </form>
     
 </body>
</html>