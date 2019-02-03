package lk.lib.ijse.repository;

import lk.lib.ijse.model.BookIssue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookIssueRepo extends JpaRepository<BookIssue,Integer> {
}
