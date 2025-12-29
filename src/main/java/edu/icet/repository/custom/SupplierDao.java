package edu.icet.repository.custom;

import edu.icet.model.entity.SupplierEntity;
import edu.icet.repository.CrudDao;

public interface SupplierDao extends CrudDao<SupplierEntity> {
    SupplierEntity findByName(String name);
}
