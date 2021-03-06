package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HorseDTO implements Serializable {
    private Integer id;
    private String type;
    private Integer age;
    private Integer price;
}
