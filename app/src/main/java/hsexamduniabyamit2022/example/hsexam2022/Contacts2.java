package hsexamduniabyamit2022.example.hsexam2022;

public class Contacts2 {

    private  String ExamName,ExamType,Link;

    public Contacts2 ()
    {

    }

    public Contacts2(String EXAMNAME,String EXAMTYPE,String LINK) {
        this.ExamName = EXAMNAME;
        this.ExamType = EXAMTYPE;
        this.Link = LINK;

    }

    public String getExamName() {
        return ExamName;
    }

    public void setExamName(String examName) {
        ExamName = examName;
    }

    public String getExamType() {
        return ExamType;
    }

    public void setExamType(String examType) {
        ExamType = examType;
    }
    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }


}
