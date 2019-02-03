package lk.lib.ijse.service.impl;

import lk.lib.ijse.dto.BookDTO;
import lk.lib.ijse.model.Author;
import lk.lib.ijse.model.Book;
import lk.lib.ijse.repository.AuthorRepo;
import lk.lib.ijse.repository.BookRepo;
import lk.lib.ijse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    private Author author;

    @Override
    public void addBook(BookDTO bookDTO) {

        Optional<Author> cus = this.authorRepo.findById(bookDTO.getAuthorId());
        if (cus.isPresent()) {
            author= cus.get();
        } else {

        }
        System.out.println(bookDTO.getAuthorId());
//        System.out.println(bookDTO.getBookName());
//        System.out.println(author.getAuthorName());

        Book book=new Book(bookDTO.getBookName(),bookDTO.getCategory(),author,
                bookDTO.getStatus(),bookDTO.getPages(),bookDTO.getRackno());
        System.out.println(book.getCategory());
        bookRepo.save(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }


    @Override
    public void updateBooks(BookDTO bookDTO) {
        String msg=null;
        Optional<Author> cus = this.authorRepo.findById(bookDTO.getAuthorId());
        if (cus.isPresent()) {
            author= cus.get();
        }
        System.out.println(bookDTO.getBid());
        Book book=new Book(bookDTO.getBid(),bookDTO.getBookName(),bookDTO.getCategory(),
               author,bookDTO.getStatus(),bookDTO.getPages(),bookDTO.getRackno());

        System.out.println(book.getBid());
        if(book.getBid()!= null){
            bookRepo.save(book);

        }
    }


    @Override
    public Book searchBook(Integer id) {
        Optional<Book> cus = this.bookRepo.findById(id);
        if (cus.isPresent()) {
            return cus.get();
        } else {
            return null;
        }
    }

    @Override
    public void updateBooks1(BookDTO bookDTO) {
        String msg=null;
        Optional<Author> cus = this.authorRepo.findById(bookDTO.getAuthorId());
        if (cus.isPresent()) {
            author= cus.get();
        }
        System.out.println(bookDTO.getBid());
        bookDTO.setStatus("Available");
        Book book=new Book(bookDTO.getBid(),bookDTO.getBookName(),bookDTO.getCategory(),
                author,bookDTO.getStatus(),bookDTO.getPages(),bookDTO.getRackno());

        System.out.println(book.getBid());
        if(book.getBid()!= null){
            bookRepo.save(book);

        }
    }

    @Override
    public void updateBooks2(BookDTO bookDTO) {
        String msg=null;
        Optional<Author> cus = this.authorRepo.findById(bookDTO.getAuthorId());
        if (cus.isPresent()) {
            author= cus.get();
        }
        System.out.println(bookDTO.getBid());
        bookDTO.setStatus("Booked");
        Book book=new Book(bookDTO.getBid(),bookDTO.getBookName(),bookDTO.getCategory(),
                author,bookDTO.getStatus(),bookDTO.getPages(),bookDTO.getRackno());

        System.out.println(book.getBid());
        if(book.getBid()!= null){
            bookRepo.save(book);

        }
    }

    @Override
    public List<BookDTO> getAllBook1() {
        List<BookDTO> list=new ArrayList<>();
        List<Book> allCus= bookRepo.findAll();
        System.out.println(allCus.get(0).getBid());
        for (Book c : allCus){
            System.out.println(c.getBid());
            list.add(new BookDTO(c.getBid(),c.getBookName(),c.getCategory(),c.getAuthor().getAuthorId(),c.getStatus(),
                    c.getPages(),c.getRackno()));
        }
        System.out.println(list.get(0).getBid());

        return list;

    }

//    @Override
//    public Book searchBook1(String bookName) {
//        List<Book> cus = this.bookRepo.findbybookName(bookName);
//        System.out.println(cus.get(1));
//            return null;
//
//    }
}
