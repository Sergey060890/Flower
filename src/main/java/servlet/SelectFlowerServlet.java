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
import java.sql.SQLException;

@WebServlet("/select")
public class SelectFlowerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FlowerService flowerService = new FlowerServiceImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        try {
            FlowerDTO flowerDTO = flowerService.findFlowerById(id);

            request.setAttribute("name", flowerDTO.getName());
            request.setAttribute("color", flowerDTO.getColor());
            request.setAttribute("price", flowerDTO.getPrice());
            request.setAttribute("size", flowerDTO.getSize());
            request.getServletContext().getRequestDispatcher("/myFlower.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
