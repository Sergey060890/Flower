package servlet;


import service.FlowerService;
import service.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateFlowerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/createFlower.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            FlowerService flowerService = new FlowerServiceImpl();
//            String name = request.getParameter("name");
//            String color = request.getParameter("color");
//            String size = request.getParameter("size");
//            Integer price = Integer.valueOf(request.getParameter("price"));
            String name = "Ws";
            String color = "ds";
            Integer price = 3;
            String size = "122";
            flowerService.createFlower(name,color,price,size);
            response.sendRedirect(request.getContextPath() + "/FlowerServlet");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/createFlower.jsp").forward(request, response);
        }
    }
}
