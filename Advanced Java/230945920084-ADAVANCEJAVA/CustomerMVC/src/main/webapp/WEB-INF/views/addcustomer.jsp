<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="insertCustomer" method="post">
        Customer No : <input type="text" name="cid" id="cid">
        <br>
        
        <label for="bpack">Base Pack:</label>
			<select id="bpack" name="bpack">
				<option value="select">select</option>
`			 	 <option value="disco">Disco Hindi</option>
  				 <option value="classical">Classical Magic</option>
 				 <option value="western">Western Goodies</option>

		    </select>
        
        <br>
         <label for="oppack">Optional Pack :</label>
			<select id="oppack" name="oppack">
				<option value="select">select</option>
`			 	 <option value="sports">Sports Pack</option>
  				 <option value="comedy">Comedy Pack</option>
  				  <option value="na">N/A</option>
 	
		    </select>
        
        <br>
     
        <button type="submit" name="btn" id="btn">Add new Customer</button>
   </form>
</body>
</html>