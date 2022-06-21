package service;

import dao.EnityDaoFlower;
import dao.FlowerDao;
import dto.FlowerDTO;
import dto.mapper.FlowerMapper;
import entity.Flower;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class FlowerServiceImpl implements FlowerService {

    FlowerDao flowerDao = new EnityDaoFlower();

    @Override
    public Flower createFlower(String name, String color, Integer price, String size) {
        Flower flower = Flower.builder()
                .name(name)
                .color(color)
                .price(price)
                .size(size)
                .build();
        flowerDao.create(flower);
        return flower;
    }

    @Override
    public List<FlowerDTO> findAll() {
        return flowerDao.findAll()
                .stream()
                .map(FlowerMapper::mapFrom)
                .collect(Collectors.toList());
    }

    @Override
    public void updateFlower(Integer id, String name, String color,
                             Integer price, String size) throws SQLException {
        Flower flower = flowerDao.findOne(id);
        flower.setName(name);
        flower.setColor(color);
        flower.setPrice(price);
        flower.setSize(size);
        flowerDao.update(flower);
    }

    @Override
    public void deleteFlower(Integer id) throws SQLException {
        flowerDao.deleteById(id);
    }

    @Override
    public FlowerDTO findFlowerById(Integer id) throws SQLException {
        return FlowerMapper.mapFrom(flowerDao.findOne(id));
    }
}
