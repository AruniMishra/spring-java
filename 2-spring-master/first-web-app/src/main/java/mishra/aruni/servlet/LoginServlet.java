package mishra.aruni.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 2238069719277990176L;

	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		PrintWriter printWriter = httpServletResponse.getWriter();

		printWriter.println("this is a servlet");
		String nameParameter = httpServletRequest.getParameter("name");
		System.out.println(nameParameter);

		httpServletRequest.setAttribute("name", nameParameter);

		httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
	}

	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		try (PrintWriter printWriter = httpServletResponse.getWriter()) {
			try {
				printWriter.println("this is a servlet");
			} finally {
				printWriter.close();
			}
		}

		String nameParameter = httpServletRequest.getParameter("name");
		System.out.println(nameParameter);

		httpServletRequest.setAttribute("name", nameParameter);

		httpServletRequest.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(httpServletRequest, httpServletResponse);
	}

}
