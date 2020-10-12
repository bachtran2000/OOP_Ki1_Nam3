package Bai12;

public class Person {
    protected String HT, AGE, QQ;

    public Person(String HT, String AGE, String QQ) {
        this.HT = HT;
        this.AGE = AGE;
        this.QQ = QQ;
    }

    public Person() {
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    @Override
    public String toString() {
        return "HT='" + HT + '\'' +
                ", AGE='" + AGE + '\'' +
                ", QQ='" + QQ + '\'';
    }

    public String TTCB(){
        return "Ho ten: "+HT+"| Nam sinh: "+AGE+"| Que quan: "+QQ;
    }
}
