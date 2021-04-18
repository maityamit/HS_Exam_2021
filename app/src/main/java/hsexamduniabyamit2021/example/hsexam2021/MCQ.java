package hsexamduniabyamit2021.example.hsexam2021;

public class MCQ {

    private  String Qn,Ans;

    public MCQ ()
    {

    }

    public MCQ(String QN,String ANS) {
        this.Qn = QN;
        this.Ans = ANS;

    }

    public String getQn() {
        return Qn;
    }

    public void setQn(String qn) {
        Qn = qn;
    }

    public String getAns() {
        return Ans;
    }

    public void setAns(String ans) {
        Ans = ans;
    }
}

