package jason;
public class studentclas {
    String branch;
    String sname;
    int sid;
    public studentclas(int sid, String sname, String branch) {
        this.sid = sid;
        this.sname = sname;
        this.branch = branch;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }


}
