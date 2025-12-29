package edu.icet.repository.custom;

import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CrudDao;

public interface CustomerDao extends CrudDao<CustomerEntity> {
    CustomerEntity findByPhone(String phone);
}
