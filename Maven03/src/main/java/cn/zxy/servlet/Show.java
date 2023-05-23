package cn.zxy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/show.do")
public class Show extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>赵同学 QQ:1803172431 Email:zxy06291@163.com</title>");
        out.println("<meta name=\"keywords\" content=\"关键字\">");
        out.println("<meta name=\"description\" content=\"简介\">");
        out.println("</head>");
        out.println("<body>");

        out.println("<h3>Hello World 中文效果  Servlet 4.0.1</h3>");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=root");
            Statement stmt = conn.createStatement();

            String del = req.getParameter("del");
            if(del!=null){
                conn.createStatement().execute("drop database if exists "+del);
            }

            ResultSet rs = stmt.executeQuery("show databases");
            while (rs.next()){
                out.println("<h3>" + rs.getString(1) + "&nbsp;&nbsp;" + "<a href=\"?del=" + rs.getString(1)
                        +"\">删除" + rs.getString(1)+"</a></h3>");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }

}












