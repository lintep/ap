public class Ex1 {

    public static void main(String[] args) {

//        System.out.println("Ex1");

        int[] intArray = new int[20];
        for (int i = 0; i < 20; i++) {
            intArray[i]=(int) (Math.random()*100);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(intArray[i]);
        }
    }
}
