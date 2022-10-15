import java.util.Scanner;

class Atm {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name-->");
        String s1=sc.next();
        System.out.println("enter a account number-->");
        long s4=sc.nextLong();
        System.out.println("enter a pswd-->");
        int s2=sc.nextInt();
        System.out.println("enter a deposite");
        double s3=sc.nextDouble();
       

        Account a=new Account(s1, s2, s3, s4);

        for(;;)
        {
            System.out.println("1.withdraw 2.Deposit 3.checkBalance 4.changePswd 5.exit");
            int  choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    a.withdraw();
                    break;
                }
                case 2:
                {
                    a.depositMoney();
                    break;
                }
                case 3:
                {
                    a.checkBalance();
                    break;
                }
                case 4:
                {
                    a.changePswd();
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
            }
        }
         
    }
}
