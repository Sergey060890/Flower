package service;

import dao.EnityDaoHorse;
import dao.HorseDao;
import dto.HorseDTO;
import dto.mapper.HorseMapper;
import entity.Horse;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class HorseServiceImpl implements HorseService {

    HorseDao horseDao = new EnityDaoHorse();

    @Override
    public Horse createHourse(String type, Integer age, Integer price) {
        Horse horse = Horse.builder()
                .type(type)
                .age(age)
                .price(price)
                .build();
        horseDao.create(horse);
        return horse;
    }

    @Override
    public List<HorseDTO> findAll() {
        return horseDao.findAll()
                .stream()
                .map(HorseMapper::mapFrom)
                .collect(Collectors.toList());
    }

    @Override
    public void updateHourse(Integer id, String type, Integer age, Integer price) throws SQLException {
        Horse horse = horseDao.findOne(id);
        horse.setType(type);
        horse.setAge(age);
        horse.setPrice(price);
        horseDao.update(horse);
    }

    @Override
    public void deleteHourse(Integer id) throws SQLException {
        horseDao.deleteById(id);
    }

    @Override
    public HorseDTO findHourseById(Integer id) throws SQLException {
        return HorseMapper.mapFrom(horseDao.findOne(id));
    }
}
