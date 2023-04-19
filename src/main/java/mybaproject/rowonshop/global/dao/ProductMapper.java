package mybaproject.rowonshop.global.dao;

import mybaproject.rowonshop.global.dto.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    List<Product> getAllprocuts ();

    void insertProduct (Product product);
}
