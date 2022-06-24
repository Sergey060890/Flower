package servlet;


import service.HorseService;
import service.HorseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateHorseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/createHorse.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            HorseService horseService = new HorseServiceImpl();
            String type = request.getParameter("type");
            Integer age = Integer.valueOf(request.getParameter("age"));
            Integer price = Integer.valueOf(request.getParameter("price"));
            horseService.createHourse(type, age, price);
            response.sendRedirect(request.getContextPath() + "/HorseServlet");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/createHorse.jsp").forward(request, response);
        }
    }
}
