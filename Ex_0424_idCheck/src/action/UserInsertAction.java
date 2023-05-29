package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import vo.UserVO;

/**
 * Servlet implementation class UserInsertAction
 */
@WebServlet("/user_insert.do")
public class UserInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setName(name);
		vo.setPwd(pwd);
		
		int res = UserDAO.getInstance().insert(vo);
		
		if(res > 0) {
			response.sendRedirect("user_list.do");
		}
	}

}
