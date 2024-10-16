<%-- 
    Document   : bai_1
    Created on : Oct 16, 2024, 8:20:33 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>First JSP program</title>
        <form action="Bai1.JSP" method ="post">
            What's your name?
            <input type="text" name="hoTen"/>
            <input type="submit" value="Submit" />
            <%
                request.setCharacterEncoding(("UTF-8"));
                String hoTen=request.getParameter("hoTen");
                if(hoTen!=null){
                out.println("</br>Welcome <b>"+hoTen+"</b>");
                }
            %>
    </form>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
