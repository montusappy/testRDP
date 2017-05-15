<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method = "POST" modelAttribute="agentForm" action = "${pageContext.request.contextPath}/register">
         <table>
         	<tr><td><form:errors path="*"/></td></tr>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input type="text" path = "name" /></td>
            </tr>
             <tr>
               <td><form:label path = "email">Email</form:label></td>
               <td><form:input type="text" path = "email" /></td>
            </tr>
            <tr>
               <td><form:label path = "pc">Primary Contact</form:label></td>
               <td><form:input type="text" path = "pc"/></td>
            </tr> <tr>
               <td><form:label path = "ac">Alternative Contact</form:label></td>
               <td><form:input type="text" path = "ac" /></td>
            </tr> 
            <tr>
               <td><form:label path = "dob">DOB</form:label></td>
               <td><form:input type="text" path = "dob" /></td>
            </tr> 
            <tr>
               <td><form:label path = "doj">DOJ</form:label></td>
               <td><form:input type="text" path = "doj" /></td>
            </tr> 
            <tr>
               <td><form:label path = "address">Address</form:label></td>
               <td><form:input type="textArea" path = "address" /></td>
            </tr>
             <tr>
               <td><form:label path = "city">City</form:label></td>
               <td><form:input type="text" path = "city" /></td>
            </tr>
            <tr>
               <td><form:label path = "country">Country</form:label></td>
               <td><form:input type="text" path = "country" /></td>
            </tr>   
            <tr>
               <td><form:label path = "state">State</form:label></td>
               <td><form:input path = "state" /></td>
            </tr>
             <tr>
               <td><form:label path = "pin">Zip Code</form:label></td>
               <td><form:input type="text" path = "pin" /></td>
            </tr>            
            <tr>
               <td><form:label path = "jobType">JobType</form:label></td>
               <td><form:select path="jobType">
            			<form:option value="CA" label="CA" />
           		 		<form:option value="IA" label="IA" />
        		</form:select>
        </td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Register"/>
               </td>
               <td colspan = "2">
                  <button type="reset" value="Reset">Reset</button>
               </td>
               <td colspan = "2">
                  <button type="submit" value="Cancel" disabled="disabled">Cancel</button>
               </td>
            </tr>
         </table>  
      </form:form>

</body>
</html>