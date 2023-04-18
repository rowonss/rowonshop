package mybaproject.rowonshop.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class product {

    private int nums;

    private String id;
    private String category;
    private String producName;
    private int price;
    private int stocks;
    private byte[] mainImage;


}