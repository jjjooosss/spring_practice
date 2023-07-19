<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="loginStatus" value="${loginStatus}"/>

<c:choose>
    <c:when test="${loginStatus eq '1'}">
        <script>
            location = "http://localhost:8382/loginSuccess"
        </script>
    </c:when>
    <c:when test="${loginStatus eq '-1'}">
        <script>
            alert("아이디가 존재하지 않습니다");
            history.back(-1);
        </script>
    </c:when>
    <c:otherwise>
        <script>
            alert("비밀번호가 맞지 않습니다");
            history.back(-1);
        </script>
    </c:otherwise>
</c:choose>
</body>
</html>

