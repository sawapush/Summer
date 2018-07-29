import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    String[] luck = {"大吉","中吉","小吉","末吉","吉","凶"};
    int index = (int)(Math.random()*luck.length);
    String unnsei = luck[index];
    response.getWriter().print("今日の運勢は\r\n");
    response.getWriter().print(unnsei+"\r\n");

  }
}