package lk.lib.ijse.controller;

import lk.lib.ijse.dto.BookDTO;
import lk.lib.ijse.dto.BookIssueDTO;
import lk.lib.ijse.model.Book;
import lk.lib.ijse.model.BookIssue;
import lk.lib.ijse.service.BookIssueService;
import lk.lib.ijse.service.BookService;
import lk.lib.ijse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BookIssue")
@CrossOrigin(origins = "*")
public class BookIssueController {

    @Autowired
    private BookIssueService bookIssueService;

    @Autowired
    private BookService bookService;

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public void addBooks(@RequestBody BookIssueDTO bookIssueDTO){
        System.out.println(bookIssueDTO.getBid());
        bookIssueService.addBooking(bookIssueDTO);

    }

    @GetMapping("/all")
    public List<BookIssueDTO> getAll(){
        return bookIssueService.getAllBookings();
    }

    @PutMapping("/update")
    public void updateBook(@RequestBody BookIssueDTO bookIssueDTO){
        Book book=bookService.searchBook(bookIssueDTO.getBid());
        BookDTO bookDTO=new BookDTO(book.getBid(),book.getBookName(),book.getCategory(),book.getAuthor().getAuthorId()
        ,book.getStatus(),book.getPages(),book.getRackno());
        bookService.updateBooks1(bookDTO);
        bookIssueService.updateBooking(bookIssueDTO);
    }

    @PutMapping("/updatestatus")
    public void updateBook1(@RequestBody BookIssueDTO bookIssueDTO){
        bookIssueDTO.setStatus("Borrow");
        bookIssueService.updateBooking(bookIssueDTO);
    }

    @PutMapping("/updatesta")
    public void updateBook2(@RequestBody BookIssueDTO bookIssueDTO){
        bookIssueDTO.setStatus("Recieved");
        bookIssueService.updateBooking(bookIssueDTO);
    }

    @GetMapping("/find/{id}")
    public BookIssue searchStudent(@PathVariable Integer id){

        return bookIssueService.searchBoooking(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        bookIssueService.deleteBooking(id);
    }


}
