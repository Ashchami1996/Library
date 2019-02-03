package lk.lib.ijse.service;

import lk.lib.ijse.dto.UserDTO;

public interface UserService {
    void addUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);
}
