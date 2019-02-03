package lk.lib.ijse.dto;

public class BookDTO {

    private Integer bid;
    private String bookName;
    private String category;
    private int authorId;
    private String status;
    private String pages;
    private int rackno;

    public BookDTO() {
    }

    public BookDTO(Integer bid, String bookName, String category, int authorId, String status, String pages, int rackno) {
        this.bid = bid;
        this.bookName = bookName;
        this.category = category;
        this.authorId = authorId;
        this.status = status;
        this.pages = pages;
        this.rackno = rackno;
    }

    public BookDTO(String bookName, String category, int authorId, String status, String pages, int rackno) {
        this.bookName = bookName;
        this.category = category;
        this.authorId = authorId;
        this.status = status;
        this.pages = pages;
        this.rackno = rackno;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public int getRackno() {
        return rackno;
    }

    public void setRackno(int rackno) {
        this.rackno = rackno;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bid=" + bid +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", authorId=" + authorId +
                ", status='" + status + '\'' +
                ", pages='" + pages + '\'' +
                ", rackno=" + rackno +
                '}';
    }
}
