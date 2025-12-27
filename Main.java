import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long studentId = 403324343l;
        long topStudentId = 403324343l;
        long top_student_id = 403324343l;




        int sum = 0;
        int id1 = 2079;
        long id2 = 4379875443l;
        long id3 = 3379;
        long id4 = 3379l;
        id2 = id1;
        id1 = (int) id3; // type cast

        float score1=3;
        double score2=3;
        double score3=3.2;
        double score4=3.2;
        double score5=3.2f;

        System.out.println(4444234234l);
        int temp=234234;
//        int i;

        System.out.println("Enter count: ");
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();

        for (int i = 0; i < count; i++) {
            int j=i+1;
            if(i<10){
                int k=9;
            }
            double random = Math.random();
            System.out.println(100+(int)(random*100));
        }
//        System.out.println(i);

        System.out.println(temp);
//        int sum;
//        sum=0;
        for (int i = 1; i <= 10; i++) {
            sum += i;//sum=sum+i
        }
        System.out.println(sum);

        System.out.println("______________________");

        int sumE = 0;
        for (int i = 0; i <= 10; i += 2) {
            sumE += i;
        }
//        System.out.println(sumE);


        float sumO = 0;
        for (int i = 1; i <= 10; i += 2) {
            sumO += i;
        }
//        System.out.println(sumO);

        System.out.println(sumO / sumE);

        System.out.println("___________________");

        double sumEv = 0;
        int sumOd = 0;
//        long sumOd = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                sumEv += i;
            else
                sumOd += i;
        }
        System.out.println(sumOd / sumEv);

    }
}