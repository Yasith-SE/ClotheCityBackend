package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sell_items")
public class SellItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemTitle;
    private String clothType;
    private Integer quantity;
    private Double price;

    @Column(length = 1500)
    private String description;

    @ElementCollection
    private List<String> sizes;

    @ElementCollection
    private List<String> colors;

    private String coverImageUrl;
    private String glbModelUrl;
}