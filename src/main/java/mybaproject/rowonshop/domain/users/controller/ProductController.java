package mybaproject.rowonshop.domain.users.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mybaproject.rowonshop.global.dto.Product;
import mybaproject.rowonshop.domain.users.service.ProductService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;

    @PostMapping("/insertProduct")
    public void insertProduct (@RequestParam("id") String id,
                              @RequestParam("category") String category,
                              @RequestParam("productName") String productName,
                              @RequestParam("price") int price,
                              @RequestParam("stocks") int stocks,
                              @RequestParam("miniText") String miniText,
                              @RequestParam("mainImage") MultipartFile mainImage) throws IOException {

        System.out.println(productName);

        String newName = java.net.URLDecoder.decode(productName,"UTF-8");
        String newText = java.net.URLDecoder.decode(miniText,"UTF-8");

        Product product = new Product();
        product.setId(id);
        product.setCategory(category);
        product.setProductName(newName);
        product.setMiniText(newText);
        product.setPrice(price);
        product.setStocks(stocks);
        product.setMainImage(mainImage.getBytes());

        String filePath = "C:\\Users\\user\\Desktop\\git\\rowonshop\\src\\main\\resources\\productImages\\" + id;

        File file = new File(filePath);

        try{
            mainImage.transferTo(file);
        }
        catch (IllegalStateException | IOException e){
            e.printStackTrace();
        }

        productService.insertProduct(product);

    }
}
