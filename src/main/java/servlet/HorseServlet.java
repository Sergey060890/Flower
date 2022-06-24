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
import java.util.List;

@WebServlet("/HorseServlet")
public class HorseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HorseService horseService = new HorseServiceImpl();
        List<HorseDTO> horses = horseService.findAll();
        req.setAttribute("horses", horses);
        getServletContext().getRequestDispatcher("/horses.jsp").forward(req, resp);
    }

}
