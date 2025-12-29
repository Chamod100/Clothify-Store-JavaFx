package edu.icet.service.custom;

import edu.icet.model.dto.UserCredentials;
import edu.icet.service.SuperService;

public interface AuthService extends SuperService {
    UserCredentials userAuthentication(String email, String password);
}
