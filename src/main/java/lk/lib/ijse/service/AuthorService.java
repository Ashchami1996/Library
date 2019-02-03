package lk.lib.ijse.service;

import lk.lib.ijse.dto.AuthorDTO;

import java.util.List;

public interface AuthorService {
    void addAuthor(AuthorDTO authorDTO);

    List<AuthorDTO> getAllauthors();
}
