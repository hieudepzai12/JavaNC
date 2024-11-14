<%-- 
    Document   : list_product
    Created on : Oct 22, 2024, 2:11:45 PM
    Author     : ADMIN
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Hoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../shared/header.jsp" />

<jsp:include page="../shared/nav.jsp" />

<%
    if (request.getAttribute("success") != null) {
%>

<script>
    Swal.fire({
        title: "Good job!",
        text: "<%=request.getAttribute("success")%>",
        icon: "success"
    });
</script>
<%
    }
%>


<%
    if (request.getAttribute("error") != null) {
%>

<script>
    Swal.fire({
        title: "Good job!",
        text: "<%=request.getAttribute("error")%>",
        icon: "error"
    });
</script>
<%
    }
%>
<div class="container">
    <h2> Danh sách sản phẩm</h2>
    <div class="mb-2 text-end">
        <a href="ManageProduct?action=ADD" class="btn btn-success"> <i class="bi bi-plus-circle"></i> Thêm mới</a>
    </div>

    <table class="table table-bordered table-striped">
        <tr>
            <th>Tên hoa</th>
            <th>Giá</th>
            <th>Hình ảnh</th>
            <th>Loại</th>
            <th>Action</th>
        </tr>  
        <%
            DecimalFormat fmt = new DecimalFormat("#,##0 VND");
            ArrayList<Hoa> dsHoa = (ArrayList<Hoa>) request.getAttribute("dsHoa");
            for (Hoa x : dsHoa) {
        %>
        <tr>    
            <td><%=x.getTenhoa()%></td>
            <td><%=fmt.format(x.getGia())%></td>
            <td> <img src="assets/images/products/<%=x.getHinh()%>" style="width: 100px">  </td>
            <td><%=x.getMaloai()%></td>
            <td>
                <a href="ManageProduct?action=EDIT&mahoa=<%=x.getMahoa()%>" class="btn btn-secondary"> <i class="bi bi-pencil-square"></i> Sửa</a>
                <a href="ManageProduct?action=DELETE&mahoa=<%=x.getMahoa()%>"  class="btn btn-danger"
                   onclick="return confirm('Bạn có đồng ý xoá sản phẩm?')"
                   > <i class="bi bi-trash"></i> Xoá</a>
            </td>
        </tr>       
        <%
            }
        %>
    </table>

    <ul class ="pagination justify-content-center">
        <%
            //lấy tổng sớ trang từ Servlet
            int sumOfPage = (int) request.getAttribute("sumOfPage");
            int pageIndex = (int) request.getAttribute("pageIndex");
            for (int i = 1; i < sumOfPage; i++) {
        %>
        <li class="page-item <%= pageIndex == i ? "active" : ""%>"><a class="page-link" href="ManageProduct?page=<%=i%>"><%=i%></a></li>
            <%
                }
            %>
    </ul>

<!--    <ul class="pagination">
        <li class="page-item <%=pageIndex == 1 ? "disabled" : ""%>">
            <a class="page-link" href="ManageProduct?page=<%=pageIndex > 1 ? pageIndex - 1 : pageIndex%>">Previous</a></li>
            <%
                for (int i = 1; i <= sumOfPage; i++) {
            %>
        <li class="page-item <%= pageIndex == i ? "active" : ""%>""><a class="page-link" href="ManageProduct?page=<%=i%>"><%=i%></a></li>
            <%
                }
            %>
        <li class="page-item <%=pageIndex==sumOfPage?"disabled":"" %>">
            <a class="page-link" href="ManageProduct?page=<%=pageIndex<sumOfPage? pageIndex+1: pageIndex %>">Next</a></li>
        <li class="page-item <%=pageIndex==sumOfPage?"disabled":"" %>">
            <a class="page-link" href="ManageProduct?page=<%= sumOfPage %>">Last</a></li>
    </ul>-->

    <jsp:include page="../shared/footer.jsp" />
