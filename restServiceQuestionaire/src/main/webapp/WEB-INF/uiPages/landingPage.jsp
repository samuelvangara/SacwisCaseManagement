<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Questionaire</title>
</head>
<body>
	<form name="questionaire" action="questionaire" method="post/{value}">

		<table align="center">
		<tr>
		<td colspan="2">
		<c:out value="${error}"/>
		</td>
		</tr>
		<tr>
		<td>
		<select id="type" name="type" >
	     <option value="none">---Select---</option>
		<option value="textarea">TextArea</option>
		<option value="radio">Radio</option>
		<option value="checkbox">CheckBox</option>
		</select>
		</td>
		</tr>
			<tr>
				<td align="center" colspan="2">
					<button type="Submit">Get Questionaire</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>