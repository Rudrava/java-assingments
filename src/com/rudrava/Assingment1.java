package com.rudrava;
import java.util.Scanner;


public class Assingment1 {
    static void oe() {
        int x;
        System.out.println("Enter an integer to check if it's odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }


    static void fact() {
        int i,fact=1, number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to generate factorial");
        number = in.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    //===== FARENHEIT TO CELCIUS
    static double celsius(double f)
    {
        return  (f-32)*5/9;
    }


    static  void ftoc(){
        double a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextDouble();
        System.out.println("Celsius temperature is = "+celsius(a));
    }


    //  SWAP
    static void swap()
    {
        System.out.println("Enter the value of x ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of y ");

        int y = sc.nextInt();
        System.out.println("before swapping numbers: x:"+x +" y:"+ y);
        /*Swapping*/
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: x:"+x +" y:" + y);
    }

    static void checkPalindrome(){
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it is palindrome:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }

    static void primeChecker(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not:");
        num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    static void sumOfDigs(){
        {
            long n,sum;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number ");
            n=sc.nextLong();
            for(sum=0 ;n!=0 ;n/=10)
            {
                sum+=n%10;
            }
            System.out.println("Sum of digits of a number is "+sum);
        }
    }

    static void armstrong(){
        int c=0,a,temp, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }


    static void perfectNumber(){
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextLong();
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
            System.out.println(n+" is not a  perfect number");
    }

    static void fib() {
        long n1=0,n2=1,n3,i,count;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to calcute fib series upto...");
        count=sc.nextInt();

        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
//        1
        oe();
//        2
        fact();
//        3
        ftoc();
//        4
        swap();
//        5
        primeChecker();
//        6
        checkPalindrome();
//        7
        sumOfDigs();
//        8
            armstrong();
//        9
        perfectNumber();
//        10
        fib();
    }
}

