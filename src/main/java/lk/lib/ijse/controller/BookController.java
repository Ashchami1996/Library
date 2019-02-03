package lk.lib.ijse.controller;

import lk.lib.ijse.dto.BookDTO;
import lk.lib.ijse.model.Book;
import lk.lib.ijse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("book")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allcus")
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBook1();
    }


    @PostMapping("/add")
    public void addBooks(@RequestBody BookDTO bookDTO){
        System.out.println(bookDTO.getAuthorId());
        bookService.addBook(bookDTO);

    }



    @PutMapping("/update")
    public void updateBook(@RequestBody BookDTO bookDTO){

        bookService.updateBooks(bookDTO);
    }

    @PutMapping("/updatestatus")
    public void updateBook1(@RequestBody BookDTO bookDTO){
        bookDTO.setStatus("Available");
        bookService.updateBooks1(bookDTO);
    }

    @PutMapping("/updatesta")
    public void updateBook2(@RequestBody BookDTO bookDTO){
        bookDTO.setStatus("Booked");
        bookService.updateBooks2(bookDTO);
    }

    @GetMapping("/find/{id}")
    public Book searchBook(@PathVariable Integer id){

        return bookService.searchBook(id);

    }

//    @GetMapping("/findbyname/{bookName}")
//    public Book searchBook1(@PathVariable String bookName){
//
//        return bookService.searchBook1(bookName);
//
//    }


    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }



}
