package service;



import dto.HorseDTO;
import entity.Horse;


import java.sql.SQLException;
import java.util.List;

public interface HorseService {
    Horse createHourse(String type, Integer age, Integer price);

    List<HorseDTO> findAll();


    void updateHourse(Integer id, String type, Integer age, Integer price) throws SQLException;

    void deleteHourse(Integer id) throws SQLException;


    HorseDTO findHourseById(Integer id) throws SQLException;


}
