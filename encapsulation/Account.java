import java.util.Scanner;


class Account
{
    private String Name;
    private int pswd;
    private double balance;
    private long accountNamber;

    Scanner sc=new Scanner(System.in);
    Account(String s1,int s2,Double s3, long s4)
    {
        Name=s1;
        pswd=s2;
        balance=s3;
        accountNamber=s4;

    }

    public String getName()
    {
        return Name;
    }
    public void setName(String a1)
    {
        Name=a1;
    }
    public int getPswd()
    {
        return pswd;
    }
    public void setPswd(int a2)
    {
        pswd=a2;
    }
    public double getBalance()
    {
        return balance;
    }
    public void getBalance(double a3)
    {
        balance=a3;
    }

    public void withdraw()
    {
        System.out.println("Enter a account number-->");
        long an=sc.nextLong();
        if(an==accountNamber)
        {
            System.out.println("enter a money");
            double money=sc.nextDouble();
            if(money<=balance)
            {
                System.out.println("enter a pswd ");
                int p1=sc.nextInt();
                if(p1==pswd)
                {
                    balance=balance-money;
                    System.out.println("collect your cash and card");
                }
                else
                {
                    System.out.println("enter correct pswd");
                }
            }
            else
            {
               System.out.println(" insufficent balance");
            }
            
        }
        else
        {
            System.out.println("enter a correct account number");
        }

    }
    public void depositMoney()
    {
        System.out.println("enter account number");
        long an=sc.nextInt();
        if(an==accountNamber)
        {
            System.out.println("enter money");
            double money=sc.nextDouble();
            balance=balance+money;
            System.out.println("payment succefuly add"+(char)3);
        }
        else
        {
            System.out.println("enter a correct pswd");

        }
    }
    public void checkBalance()
    {
        System.out.println("enter a account number");
        long an=sc.nextLong();
        if(an==accountNamber)
        {
            System.out.println("enter a pswd");
            int p1=sc.nextInt();
            if(p1==pswd)
            {
                System.out.println(balance);
            }
            else
            {
                System.out.println("enter a correct pswd");
            }
        }
        else
        {
            System.out.println("enter a correct account number");
        }
    }
    public void changePswd()
    {
        System.out.println("enter a account number");
        long an=sc.nextLong();
        if(an==accountNamber)
        {
            System.out.println("enter a old pswd");
            int p1=sc.nextInt();
            if(p1==pswd)
            {
                System.out.println("enter a new pswd");
                int c1=sc.nextInt();
                System.out.println("confrim pswd");
                int c2=sc.nextInt();
                if(c1==c2)
                {
                    pswd=c1;
                    System.out.println("pswd change succesufly");
                }
                else
                {
                    System.out.println("enter confim pswd correct");
                }
            }
            else
            {
                System.out.println("enter a correct pswd");
            }
        }
        else
        {
            System.out.println("enter a correct pswd");
        }
    }

}