package mybaproject.rowonshop.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int nums;
    private String id;
    private String category;
    private String productName;
    private int price;
    private int stocks;
    private byte[] mainImage;
    private String miniText;


}