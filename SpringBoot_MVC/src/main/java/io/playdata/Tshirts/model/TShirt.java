package io.playdata.Tshirts.model;
import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class TShirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String color;
    private String logo;
    private String size;
    private int price;
}