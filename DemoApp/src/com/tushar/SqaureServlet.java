package com.tushar;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SqaureServlet extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
//    	HttpSession session=req.getSession();
//    	int k=(int)session.getAttribute("k");
    	int k=0;
    	Cookie cookie[]=req.getCookies();
    	for(Cookie c:cookie){
    		if(c.getName().equals("k")){
    			 k=Integer.parseInt(c.getValue());
    		}
    	}
    	k=k*k;
    	PrintWriter out=res.getWriter();
       out.println("Sqaure of Sum is : "+k);	
    }
}
