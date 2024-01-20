<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer_Details</h1>

<div class="center">
<table border="12">
  <tr >
     <th>Customer No.</th>
     <th>Base Pack</th>
     <th>Optional Pack</th>
     
     <th>action</th>
  </tr>
  <c:forEach var="c" items="${plist}">
     <tr>
       <td>${c.cid}</td>
       <td>${c.bpack}</td>
       <td>${c.oppack}</td>
 
       <td><a href="delete/${c.cid}">delete</a>
       /
       <a href="edit/${c.cid}">edit</a></td>
     </tr>
  </c:forEach>
</table>

</div>
<a href="addcustomer">Add new Customer</a>
</body>
</html>