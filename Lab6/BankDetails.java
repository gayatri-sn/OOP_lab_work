import java.util.Scanner;

class Bank {
    float rate;

    float getRateOfInterest(){
        return 0;
    }

    float calcInterest(int amt,int time){
        rate = getRateOfInterest();
        return((rate*amt*time)/100);
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8;
    }

}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 9;
    }
}

public class BankDetails{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        System.out.println("Enter time: ");
        int time = sc.nextInt();

        System.out.println("Interest for SBI = " +sbi.calcInterest(amount,time));
        System.out.println("Interest for ICICI = " +icici.calcInterest(amount,time));
        System.out.println("Interest for AXIS = " +axis.calcInterest(amount,time));

    }
}
