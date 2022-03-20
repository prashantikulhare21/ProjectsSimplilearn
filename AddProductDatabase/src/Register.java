

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet {
private static final long serialVersionUID = 1L;
 /**
 * @see HttpServlet#HttpServlet()
 */
 public Register() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, 
HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse 
response) 
throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
	}
/**
* @see HttpServlet#doPost(HttpServletRequest request, 
HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, 
HttpServletResponse response)
throws ServletException, IOException {
String id = request.getParameter("id");
String name = request.getParameter("name");
String cost = request.getParameter("cost");
String quantity = request.getParameter("quantity");
Product member = new Product(id, name, cost, quantity);
ProductAdd rDao = new ProductAdd();
String result = rDao.insert(member);
response.getWriter().print(result);
}
}