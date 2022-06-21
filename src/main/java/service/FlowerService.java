package service;



import dto.FlowerDTO;
import entity.Flower;


import java.sql.SQLException;
import java.util.List;

public interface FlowerService {
    /**
     * Create flower
     */

    Flower createFlower(String name, String color,
                        Integer price, String size);


    /**
     * Find All Flower
     */
    List<FlowerDTO> findAll();

    /**
     * Update Flower
     */
    void updateFlower(Integer id, String name, String color,
                      Integer price, String size) throws SQLException;

    /**
     * Delete Flower
     */
    void deleteFlower(Integer id) throws SQLException;

    /**
     * Find Flower
     */
    FlowerDTO findFlowerById(Integer id) throws SQLException;


}
