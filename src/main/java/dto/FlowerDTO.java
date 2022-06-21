package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlowerDTO implements Serializable {
    private Integer id;
    private String name;
    private String size;
    private String color;
    private Integer price;
}
