<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "com.javalec.ex.DBConnection" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <center>
        <table border="3" bordercolor="skyblue">
        <tr bgcolor="skyblue"><td>이름<td>직업</tr>
        
        <%
        // 쿼리문, server 8 에서 작동 (7에서 에러)
        String query="select ename, job from emp";
        
        // 커넥션 연결
        Connection conn = DBConnection.getConnection();
        
        // DB에 쿼리문을 보낸다.
        PreparedStatement pstmt = conn.prepareStatement(query);
        
        // 쿼리문의 결과값을 rs에 담는다.
        ResultSet rs = pstmt.executeQuery();
        
        // 결과값을 출력한다.
        while(rs.next()){
            out.println("<tr>");
            out.println("<td>"+rs.getString("ename"));
            out.println("<td>"+rs.getString("job"));
            out.println("</tr>");
        }
        
        %>
        </table>
    </center>



</body>
</html>