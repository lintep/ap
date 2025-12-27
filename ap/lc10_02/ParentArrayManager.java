package ap.lc10_02;

import java.time.LocalDateTime;

public class ParentArrayManager {

    private String createDate;

    public ParentArrayManager(){
        this.createDate=LocalDateTime.now().toString();
    }
    public void print() {
    }

    public void printMinWithIndex() {
    }

    public void printMaxWithIndex() {
    }

    public void changeTwoIndexValues(int index1, int index2) {
    }

    @Override
    public String toString() {
        return "ParentArrayManager{" +
                "createDate='" + createDate + '\'' +
                '}';
    }

    public void printCreateDate(){
        System.out.println(this.createDate);
    }
}
