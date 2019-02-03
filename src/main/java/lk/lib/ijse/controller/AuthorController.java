package lk.lib.ijse.controller;

import lk.lib.ijse.dto.AuthorDTO;
import lk.lib.ijse.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Author")
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public void addAuthor(@RequestBody AuthorDTO authorDTO){
        authorService.addAuthor(authorDTO);

    }
    @GetMapping("/all")
    public List<AuthorDTO> getAll(){
        return authorService.getAllauthors();
    }




}
