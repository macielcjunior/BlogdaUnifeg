<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-in</title>
</head>
<body>
	<form action="/users" method="post">
		<div>
			<label>RA</label>
			<input type="text" name="RA">
		</div>
		<div>
			<label>Senha</label>
			<input type="text" name="password">
		</div>	
		<button type="submit">Login</button>
	</form>
</body>
</html>