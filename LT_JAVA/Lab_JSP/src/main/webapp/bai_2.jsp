<%-- 
    Document   : bai_2
    Created on : Oct 16, 2024, 8:20:49 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <h1>Tính diện tích - chu vi hình chữ nhật</h1>
        <form action="Bai2.jsp" method="POST">
            <table border="0">
                <tr>
                    <td>Nhập chiều dai</td>
                    <td><input type="text" name="dai"/></td>
                </tr>
                <tr>
                    <td>Nhập chiều rông</td>
                    <td><input type="text" name=ng"rong"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Tính Toán" />
                        <input type="reset" value="Tiếp tục" />
                    </td>
                </tr>
            </table>

        </form>
        <% 
String dai=request.getParameter("Dai");
String rong=request.getParameter("rong");
if(dai!=null && rong!=null){
double r= Double.parseDouble(dai);
double d=Double.parseDouble(rong);
double dt=d*r;
double cv=(d+r)*2;
out.println("Diện tích: <b>"+dt+"</b></br>");
out.println("Chu vi: <b>"+cv+"</b>");
            }
            %>
    
    </head>
  </html>
