import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	 public  void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
		 
		 System.out.println("Hello Servlet World");
		 
		 PrintWriter out = response.getWriter();
	     try {
		     String username=request.getParameter("uname");
		     String password=request.getParameter("pword");
		     
		     out.println("Username Welcome :"+username);
		     out.println("Passwrod Welcome "+password);
		     
		     out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet FormParameters</title>");  
	            out.println("</head>");
	            out.println("<body bgcolor='#DFBDEA'>");
	            out.println("<center>");
	            
	            out.println("<h3> User Name : " + username + "</h3>");
	            out.println("<h3> Password  : " + password + "</h3>");
	            out.println("</center>");
	            out.println("</body>");
	            out.println("</html>");
		     

	     }
	     finally
	     {
	    	 out.close();
	     }
		 
	            
	       
	

}
}