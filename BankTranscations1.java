import java.util.Scanner;
public class BankTranscations1 {
    public static void main(String[] args){
       BankTranscations BT=new BankTranscations();
        final BankTranscations c=new BankTranscations();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("enter the number");
            int number = sc.nextInt();
            String name;


            switch (number) {
                case 1:
                    System.out.println("to open the new account");
                    //BankTranscations BT=new BankTranscations("prashanthi","xyz",123456789L,15000);
                    System.out.println("enter the name ");
                    BT.setName("prashanthi");
                    BT.setAddress("xyz");
                    BT.setPhnno(123456789L);
                    BT.setAmount(15000);
                    break;
                case 2:
                    System.out.println("deposit money to account ");
                    new Thread() {
                        public void run() {
                            BT.deposit(10000);
                        }
                    }.start();
                    break;
                case 3:
                    System.out.println("withdraw money from account");
                    new Thread() {
                        @Override
                        public void run() {
                            BT.withdraw(15000);
                        }
                    }.start();
                    break;
                default:
                    System.out.println("Close the account");


            }
        }


    }
}


