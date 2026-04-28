package edu.icet.model.dto;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellItems {
    private Long id;
    private String itemTitle;
    private String clothType;
    private Integer quantity;
    private Double price;
    private String description;
    private List<String> sizes;
    private List<String> colors;
    private String coverImageUrl;
    private String glbModelUrl;
}