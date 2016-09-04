<%@include file="/includes/Head.jsp" %>

<script src="<c:url value="/resources/js/validation.js"/>"></script> 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div> 
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="\shcart9/index.jsp">Home</a></li>
       
        <li><a href="Contact.jsp">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <!-- <li><a  href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li> -->
<!--         <li><a class="active" href="register.jsp"><span class="glyphicon glyphicon-user"></span>SIGNUP</a></li>
 -->        <!-- <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
     -->  </ul>
    </div>
  </div>
</nav>

	<h2 align="center">Please fill the details</h2>
<c:url var="addAction" value="/register"></c:url>

<form:form action="${addAction}" commandName="register" method="post" onSubmit="return formValidation();">
		<table align="center">
			<tr>
				<td>User ID:</td>
				<td><input type="text" name="id" path="id" required="true" id="id" ></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="name" path="name"  required="true" id="name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" path="password" required="true" id="password"></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="contactNumber" path="contactNumber"  required="true" id="mobile" ></td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><input type="email" name="mailId"  path="mailId"  required="true" id="email"></td>
			</tr>
			<tr>
				<td>Addres:</td>
				<td><input type="textarea" width="20" height="10" name="address"   required="true" path="address" id="address"></td>
			</tr>
			

			
			<tr>
				<td >
						<input type="submit" value="Register" />
					</td>
					<td> <c:if test="${empty register.name}">
						<input type="reset" value="<spring:message text="reset"/>" />
					</c:if></td>
			</tr>
		</table>

	</form:form>
<%@include file="/includes/Fotter.jsp"%>
