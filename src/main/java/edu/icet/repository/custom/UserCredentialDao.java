package edu.icet.repository.custom;


import edu.icet.model.entity.UserCredentialsEntity;
import edu.icet.repository.CrudDao;

import java.sql.SQLException;

public interface UserCredentialDao extends CrudDao<UserCredentialsEntity> {
    UserCredentialsEntity findByEmployeeId(String employeeId) throws SQLException;
    UserCredentialsEntity findByEmail(String email) throws SQLException;
}
