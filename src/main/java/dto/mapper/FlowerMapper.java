package dto.mapper;


import dto.FlowerDTO;
import entity.Flower;

public class FlowerMapper {

    public static FlowerDTO mapFrom(Flower flower) {
        return new FlowerDTO(flower.getId(), flower.getName(), flower.getSize(), flower.getColor(), flower.getPrice());
    }
}
