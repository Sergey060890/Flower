package servlet;

import dto.FlowerDTO;
import service.FlowerService;
import service.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FlowerServlet")
public class FlowerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FlowerService flowerService = new FlowerServiceImpl();
        List<FlowerDTO> flowers = flowerService.findAll();
        req.setAttribute("flowers", flowers);
        getServletContext().getRequestDispatcher("/flowers.jsp").forward(req, resp);
    }

}
