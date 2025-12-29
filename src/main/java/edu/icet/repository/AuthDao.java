package edu.icet.repository;

import edu.icet.model.entity.UserCredentialsEntity;

public interface AuthDao {
    UserCredentialsEntity getUserByEmail(String email);
}
