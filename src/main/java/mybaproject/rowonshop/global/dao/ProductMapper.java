package mybaproject.rowonshop.global.dao;

import mybaproject.rowonshop.global.dto.product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    List<product> getAllprocuts ();

    void insertProduct ();
}
