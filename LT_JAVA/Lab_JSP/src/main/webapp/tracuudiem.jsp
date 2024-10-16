<%-- 
    Document   : tracuudiem
    Created on : Oct 16, 2024, 10:07:34 AM
    Author     : ACER
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="my.common.DataBaseUtil"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tra cứu điểm</h1>
        <form action="tracuudiem.jsp" method="POST">
            Số báo danh <input type="text" name="sobd" value="" />
            Họ tên <input type="text" name="hoTen" value="" />
            <button type="Submit"> Tra cứu </button>
        </form>

        <%
            request.getParameter("UTF-8");
            String hoTen = request.getParameter("hoTen");
            String sobd = request.getParameter("sobd");
            if (hoTen != null && sobd != null) {
                Connection conn = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                conn = DataBaseUtil.getConnection();
                if (hoTen != null && !hoTen.isEmpty()) {
                    ps = conn.prepareStatement("select * from thisinh where hoTen like'?'");
                    ps.setString(1, "%" + hoTen + "%");
                } else if (sobd != null && !sobd.isEmpty()) 
                {
                    ps = conn.prepareStatement("select * from thisinh where sobd like'?'");
                    ps.setString(1, sobd);
                }
                rs = ps.executeQuery();
        %>

        <table border="0">
            <tr>
                <th>Số báo danh</th>
                <th>Họ tên</th>
                <th>Địa chỉ</th>
                <th>Điểm toán</th>
                <th>Điểm Hóa</th>
                <th>Tổng Điểm</th>

            </tr>

            <%
                while (rs.next()) {
                    double tongdiem = rs.getFloat("toan") + rs.getFloat("ly") + rs.getFloat("hoa");
            %>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getFloat(4)%></td>
                <td><%=rs.getFloat(5)%></td>
                <td><%=rs.getFloat(6)%></td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            }
        %>
    </body>
</html>
