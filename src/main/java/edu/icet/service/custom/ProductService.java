package edu.icet.service.custom;

import edu.icet.model.dto.Product;
import edu.icet.service.SuperService;
import javafx.collections.ObservableList;


public interface ProductService extends SuperService {
    boolean addProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(String id);
    ObservableList<Product> getAllProducts();
    Product searchProduct(String productID);
    String getLastProductID();
}
