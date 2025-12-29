package edu.icet.service.custom.impl;

import edu.icet.model.dto.UserCredentials;
import edu.icet.model.entity.UserCredentialsEntity;
import edu.icet.repository.AuthDao;
import edu.icet.repository.custom.impl.AuthDaoImpl;
import edu.icet.service.custom.AuthService;
import org.mindrot.jbcrypt.BCrypt;
import org.modelmapper.ModelMapper;

public class AuthServiceImpl implements AuthService {

    @Override
    public UserCredentials userAuthentication(String email, String password) {
        AuthDao authDao = new AuthDaoImpl();
        UserCredentialsEntity userCredentials = authDao.getUserByEmail(email);

        if (userCredentials != null && checkPassword(password, userCredentials.getPassword())) {
            return new ModelMapper().map(userCredentials, UserCredentials.class);
        }
        return null;
    }

    private boolean checkPassword(String password, String encryptedPassword) {
        return BCrypt.checkpw(password, encryptedPassword);
    }

}
