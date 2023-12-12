<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<body>  
<h1>Employees List</h1>    
<table border="2" width="70%" cellpadding="2">    
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>    
   <c:forEach var="emp" items="${list}">     
   <tr>    
   <td>${emp.id}</td>    
   <td>${emp.name}</td>    
   <td>${emp.salary}</td>    
   </tr>    
   </c:forEach>    
   </table>    
   <br/>    
   <a href="/SpringPagination/vieemp/1">1</a>     
   <a href="/SpringPagination/vieemp/2">2</a>     
   <a href="/SpringPagination/vieemp/3">3</a>    
</body>  
</html>