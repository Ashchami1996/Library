package lk.lib.ijse.model;

import javax.persistence.*;

@Entity
public class BookIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sid")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bid")
    private Book book;

    private  String issuedate;
    private String duedate;
    private String status;

    public BookIssue() {
    }

    public BookIssue(Integer tid,Student student, Book book, String issuedate, String duedate,String status) {
        this.tid=tid;
        this.student = student;
        this.book = book;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.status=status;
    }

    public BookIssue(Student student, Book book, String issuedate, String duedate,String status) {
        this.student = student;
        this.book = book;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.status=status;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookIssue{" +
                "tid=" + tid +
                ", student=" + student +
                ", book=" + book +
                ", issuedate='" + issuedate + '\'' +
                ", duedate='" + duedate + '\'' +
                '}';
    }
}
