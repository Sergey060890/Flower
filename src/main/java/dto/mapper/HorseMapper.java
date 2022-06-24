package dto.mapper;


import dto.HorseDTO;
import entity.Horse;

public class HorseMapper {

    public static HorseDTO mapFrom(Horse horse) {
        return new HorseDTO(horse.getId(), horse.getType(), horse.getAge(), horse.getPrice());
    }
}
