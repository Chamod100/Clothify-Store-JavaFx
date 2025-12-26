package edu.icet.repository;

import com.clothify.entity.UserCredentialsEntity;

public interface AuthDao {
    UserCredentialsEntity getUserByEmail(String email);
}
