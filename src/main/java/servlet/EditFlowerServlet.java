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

@WebServlet("/edit")
public class EditFlowerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            FlowerService flowerService = new FlowerServiceImpl();
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id", id);
            FlowerDTO flowerDTO = flowerService.findFlowerById(id);
            if(flowerDTO!=null) {
                request.setAttribute("name", flowerDTO.getName());
                request.setAttribute("color", flowerDTO.getColor());
                request.setAttribute("price", flowerDTO.getPrice());
                request.setAttribute("size", flowerDTO.getSize());
                request.getServletContext().getRequestDispatcher("/editFlower.jsp").forward(request, response);
            }
            else {
                request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        }
        catch(Exception ex) {
            request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            FlowerService flowerService = new FlowerServiceImpl();
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String color = request.getParameter("color");
            String size = request.getParameter("size");
            Integer price = Integer.valueOf(request.getParameter("price"));;

            flowerService.updateFlower(id,name,color,price,size);
            response.sendRedirect(request.getContextPath() + "/FlowerServlet");
        }
        catch(Exception ex) {

            request.getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}
