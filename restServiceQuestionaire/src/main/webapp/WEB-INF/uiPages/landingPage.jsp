<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Questionnaire</title>
</head>
<body>
	<h3>Questionnaire Search Criteria</h3>
	<form name="search" action="search" method="post">
		<table align="center">
			<tr>
				<td>Questionnaire Name:</td>
				<td>Task Type:</td>

			</tr>
			<tr>
				<td><input type="text" name="questionnairename" /></td>
				<td><select id="type" name="type">
						<option name="none" id="none" value="none">---Select---</option>
						<option name="textarea" id="textarea" value="textarea">TextArea</option>
						<option name="radio" id="radio" value="radio">Radio</option>
						<option name="checkbox" id="checkbox" value="checkbox">CheckBox</option>
				</select></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<button type="Submit">Search</button>
				</td>
			</tr>
		</table>
		</form>
		<form name="questionaire" action="questionaire" method="post">
		<table>
		<tr>
				<td align="center" colspan="2">
					<button type="Submit">Add Questionnaire</button>
				</td>
			</tr>
		</table>
	</form>


</body>
</html>