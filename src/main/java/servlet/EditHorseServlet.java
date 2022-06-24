package servlet;

import dto.HorseDTO;
import service.HorseService;
import service.HorseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class EditHorseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HorseService horseService = new HorseServiceImpl();
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id", id);
            HorseDTO horseDTO = horseService.findHourseById(id);
            if (horseDTO != null) {
                request.setAttribute("type", horseDTO.getType());
                request.setAttribute("price", horseDTO.getPrice());
                request.setAttribute("age", horseDTO.getAge());
                request.getServletContext().getRequestDispatcher("/editHorse.jsp").forward(request, response);
            } else {
                request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HorseService horseService = new HorseServiceImpl();
            int id = Integer.parseInt(request.getParameter("id"));
            String type = request.getParameter("type");
            Integer age = Integer.valueOf(request.getParameter("age"));
            Integer price = Integer.valueOf(request.getParameter("price"));

            horseService.updateHourse(id, type, age, price);
            response.sendRedirect(request.getContextPath() + "/HorseServlet");
        } catch (Exception ex) {

            request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}
