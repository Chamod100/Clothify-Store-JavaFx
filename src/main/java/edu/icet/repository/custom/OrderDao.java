package edu.icet.repository.custom;

import edu.icet.model.entity.OrderDetailEntity;
import edu.icet.model.entity.OrderEntity;
import edu.icet.repository.CrudDao;
import javafx.collections.ObservableList;

import java.util.List;

public interface OrderDao extends CrudDao<OrderEntity> {
    boolean saveOrderDetail(List<OrderDetailEntity> orderDetails);
    ObservableList<OrderDetailEntity> getOrderDetails(String orderId);
}
