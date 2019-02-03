package lk.lib.ijse.dto;

public class BookIssueDTO {

    private int tid;
    private int sid;
    private int bid;
    private  String issuedate;
    private String duedate;
    private String status;

    public BookIssueDTO() {
    }

    public BookIssueDTO(int tid, int sid, int bid, String issuedate, String duedate,String status) {
        this.tid = tid;
        this.sid = sid;
        this.bid = bid;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.status=status;
    }

    public BookIssueDTO(int sid, int bid, String issuedate, String duedate,String status) {
        this.sid = sid;
        this.bid = bid;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.status=status;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
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
        return "BookIssueDTO{" +
                "rid=" + tid +
                ", sid=" + sid +
                ", bid=" + bid +
                ", issuedate='" + issuedate + '\'' +
                ", duedate='" + duedate + '\'' +
                '}';
    }
}
