package mybaproject.rowonshop.domain.users.service;

import mybaproject.rowonshop.global.dto.Product;

import java.util.List;

public interface ProductService {

   List<Product> getAllprocuts ();

   void insertProduct(Product product);
}
