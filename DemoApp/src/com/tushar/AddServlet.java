package com.tushar;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/add")
public class AddServlet extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
    	int i=Integer.parseInt(req.getParameter("num1"));
    	int j=Integer.parseInt(req.getParameter("num2"));
    	int k=i+j;
//    	req.setAttribute("k", k);
//    	RequestDispatcher rd=req.getRequestDispatcher("sq");
//    	rd.forward(req, res);
//    	res.sendRedirect("sq?k="+k);
//    	HttpSession session=req.getSession();
//    	session.setAttribute("k",k);
//    	Cookie cookie=new Cookie("k",k+"");
//    	res.addCookie(cookie);
//    	
//    	res.sendRedirect("sq");
//    	ServletConfig sc= getServletConfig();
//    	String a=sc.getInitParameter("Name");
//    	ServletContext st=getServletContext();
//    	String b=st.getInitParameter("Phone");
    	PrintWriter out=res.getWriter();
    	out.println(k);
    }
}
