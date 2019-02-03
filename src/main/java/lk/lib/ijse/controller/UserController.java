package lk.lib.ijse.controller;

import lk.lib.ijse.dto.UserDTO;
import lk.lib.ijse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("User")
@CrossOrigin(origins = "*")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public void addAuthor(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);

    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody UserDTO userDTO){

        userService.updateUser(userDTO);

    }
}
