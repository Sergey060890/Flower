package servlet;

import service.FlowerService;
import service.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteFlowerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            FlowerService flowerService = new FlowerServiceImpl();
            int id = Integer.parseInt(request.getParameter("id"));
            flowerService.deleteFlower(id);
            response.sendRedirect(request.getContextPath() + "/FlowerServlet");
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}