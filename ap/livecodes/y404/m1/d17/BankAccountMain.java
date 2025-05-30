package ap.livecodes.y404.m1.d17;

public class BankAccountMain {
    public static void main(String[] args) throws Exception {// throws Exception {

        BankAccount bankAccount1= new BankAccount();

        System.out.println("1- "+bankAccount1.getBalance());

        bankAccount1.deposit(100);
        System.out.println("2- "+bankAccount1.getBalance());

        try {
            bankAccount1.withdraw(120);
            System.out.println("3- "+bankAccount1.getBalance());

        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
        }

        bankAccount1.withdraw(-120);
        System.out.println("4- "+bankAccount1.getBalance());


        BankAccount bankAccount2= new BankAccount(1000);
    }
}
