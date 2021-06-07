package hsexamduniabyamit2022.example.hsexam2022;

public class Contacts3 {
    private  String PracName,PracNo,Link;

    public Contacts3 ()
    {

    }

    public Contacts3(String PRACNAME,String PRACNO,String LINK) {
        this.PracName = PRACNAME;
        this.PracNo = PRACNO;
        this.Link = LINK;

    }

    public String getPracName() {
        return PracName;
    }

    public void setPracName(String pracName) {
        PracName = pracName;
    }

    public String getPracNo() {
        return PracNo;
    }

    public void setPracNo(String pracNo) {
        PracNo = pracNo;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
