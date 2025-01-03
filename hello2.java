import java.util.Scanner;
public class hello2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("welcome to our bank!");
    int account=2345;
    System.out.println("enter your last four digit account number");
    int pin=sc.nextInt();
    if(account==pin){
    System.out.println("1.deposit");
    System.out.println("2.withdraw");
    System.out.println("3.check balance");
    System.out.println("4.loan offers");
    System.out.println("5.exit");
    float balance=1000;
    System.out.println("enter your choice(1-5)");
    int choice=sc.nextInt();
    
    
    switch(choice){
        case 1:
            System.out.println("enter the amount to deposit");
            float amt=sc.nextInt();
            float deposit=balance+amt;
            System.out.println("your current balance:"+deposit);
            break;
        case 2:
            System.out.println("enter the amount to withdraw");
            float amt1=sc.nextInt();
            float withdraw=balance-amt1;
            System.out.println("your current balance:"+withdraw);
            break;
        case 3:
            float current=balance;
            System.out.println("your current balance:"+current);
            break;
        case 4:
            System.out.println("thank you for apply loan offers!\n we will contact you soon!");
            break;
        case 5:
            System.out.println("exit");
            break;
        }
        System.out.println("thank you!");
    }
    else{
        System.out.println("wrong account number!try after");
    }

    } 

} 