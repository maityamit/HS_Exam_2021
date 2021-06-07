package hsexamduniabyamit2022.example.hsexam2022;

public class LAQ {

    private  String Qn,Ans;

    public LAQ ()
    {

    }

    public LAQ(String QN,String ANS) {
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