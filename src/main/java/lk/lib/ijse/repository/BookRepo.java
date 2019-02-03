package lk.lib.ijse.repository;

import lk.lib.ijse.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {



   // public List<Book> findbybookName(String bookName);
}
