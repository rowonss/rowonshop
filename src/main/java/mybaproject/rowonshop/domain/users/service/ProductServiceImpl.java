package mybaproject.rowonshop.domain.users.service;

import lombok.RequiredArgsConstructor;
import mybaproject.rowonshop.global.dao.ProductMapper;
import mybaproject.rowonshop.global.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    @Override
    public List<Product> getAllprocuts() {
        return null;
    }
    @Override
    public void insertProduct(Product product) {

        productMapper.insertProduct(product);
    }
}
