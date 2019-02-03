package lk.lib.ijse.service;

import lk.lib.ijse.dto.BookDTO;
import lk.lib.ijse.model.Book;


import java.util.List;

public interface BookService {
    void addBook(BookDTO bookDTO);

    void deleteBook(Integer id);

   

    void updateBooks(BookDTO bookDTO);


    Book searchBook(Integer id);

    void updateBooks1(BookDTO bookDTO);

    void updateBooks2(BookDTO bookDTO);

    List<BookDTO> getAllBook1();

    // Book searchBook1(String bookName);
}
