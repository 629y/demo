 <%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/18
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    for (int i = 0; i < 3; i++) {
      out.print(String.format("<h2>hello - %02d</h2>",i));
    }
  %>
  </body>
</html>
