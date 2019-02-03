package lk.lib.ijse.service;

import lk.lib.ijse.dto.BookIssueDTO;
import lk.lib.ijse.model.BookIssue;

import java.util.List;

public interface BookIssueService {
    void deleteBooking(Integer id);

    BookIssue searchBoooking(Integer id);

    void updateBooking(BookIssueDTO bookIssueDTO);

    List<BookIssueDTO> getAllBookings();

    void addBooking(BookIssueDTO bookIssueDTO);
}
