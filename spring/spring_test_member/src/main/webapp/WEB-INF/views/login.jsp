<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login_check" method="post">
		<table border="1" align="center">
			<tr>
				<td>사용자 ID</td>			
				<td><input type="text" name="mem_uid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="mem_pwd"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인"></td>			
			</tr>
		</table>
	</form>
</body>
</html>