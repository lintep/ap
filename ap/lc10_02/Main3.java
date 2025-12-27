package ap.lc10_02;

public class Main3 {
    public static void main(String[] args) {
        ParentArrayManagerInterface arrayManagerInterface = new ArrayListManager(10);
        arrayManagerInterface.print();
    }
}
