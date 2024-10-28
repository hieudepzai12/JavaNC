<%-- 
    Document   : Notification
    Created on : Oct 28, 2024, 10:41:36 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(request.getAttribute("success")!=null){
    
%>
<script>
    swal({
  title: "SUCCESSFUL",
  text: "<%=request.getAttribute("success")%>",
  icon: "success",
});
</script>

<%
    }
%>
<%
    if(request.getAttribute("error")!=null){
    
%>
<script>
    swal({
  title: "FALLED",
  text: "<%=request.getAttribute("error")%>",
  icon: "error",
});
</script>
<%
    }
%>
