public class BankTranscations  {

    public BankTranscations() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhnno() {
        return phnno;
    }

    @Override
    public String toString() {
        return "BankTranscations{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phnno=" + phnno +
                ", amount=" + amount +
                '}';
    }

    public void setPhnno(long phnno) {
        this.phnno = phnno;
    }





    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    String name;
    String address;
    long phnno;
    int amount;

        synchronized void withdraw(int amount){
            System.out.println("going to withdraw...");

            if(this.amount<amount){
                System.out.println("Less balance; waiting for deposit...");
                try
                {
                    wait();
                }
                catch( InterruptedException e){

                }
            }
            this.amount-=amount;
            System.out.println("withdraw completed...");
        }

        synchronized void deposit(int amount){
            System.out.println("going to deposit...");
            this.amount+=amount;
            System.out.println("deposit completed... ");
            notify();
        }
    }


    /*Simulate a banking application where multiple accounts can be created a user can do following activities:

        Open a new account

        Deposit money to an account

        Withdraw money from the account

        Close the account

        If someone is withdrawing money from an account, deposit should not

        Happen at the same time and if someone is depositing money to an account

        Then withdraw should not happen at the same time. Implement

        Synchronization between these operations using wait(), notify() methods. */