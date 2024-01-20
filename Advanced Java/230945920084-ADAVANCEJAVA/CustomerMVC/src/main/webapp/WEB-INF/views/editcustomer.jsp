<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="/CustomerMVC/customer/updateCustomer" method="post">
   
  
   Customer No : <input type="text" name="cid" id="cid">
        <br>
        
        <label for="bpack">Base Pack:</label>
			<select id="bpack" name="bpack">
				<option value="select">select</option>
`			 	 <option value="${c.bpack}">Disco Hindi</option>
  				 <option value="${c.bpack}">Classical Magic</option>
 				 <option value="${c.bpack}">Western Goodies</option>

		    </select>
        
        <br>
         <label for="oppack">Optional Pack :</label>
			<select id="oppack" name="oppack">
				<option value="select">select</option>
`			 	 <option value="${c.oppack}">Sports Pack</option>
  				 <option value="${c.opack}">Comedy Pack</option>
  				  <option value="na">N/A</option>
 	
		    </select>
   
   
   
   
   
   
       Customer id : <input type="text" name="cid" id="cid" value="${c.cid}" readonly><br>
       Base Pack : <input type="text" name="bpack" id="bpack" value="${p.bpack}"><br>
        Optional Pack: <input type="text" name="qty" id="qty" value="${p.qty}"><br>
       
         <button type="submit" name="btn" id="btn">update Product</button>
   </form>
</body>
</html>