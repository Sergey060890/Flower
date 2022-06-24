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
import java.sql.SQLException;

@WebServlet("/select")
public class SelectHorseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HorseService horseService = new HorseServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        try {
            HorseDTO horseDTO = horseService.findHourseById(id);

            request.setAttribute("type", horseDTO.getType());
            request.setAttribute("age", horseDTO.getAge());
            request.setAttribute("price", horseDTO.getPrice());
            request.getServletContext().getRequestDispatcher("/myHorse.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
