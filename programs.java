
import java.util.Scanner;
public class day2
{
    public static void main(String args[])
{
    Scanner obj = new Scanner (System.in);
    int a = obj.nextInt();
       int b = obj.nextInt();
       boolean opposite=((a ^ b ) < 0);
       System.out.println(opposite);
}
}

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.println(i + "! = " + factorial);
        }

        sc.close();
    }
}



import java.util.Scanner;
public class day1
{
    public static void main(String args[])
{
    Scanner obj = new Scanner (System.in);
    int a =obj.nextInt();
    if (a%2==0)
    
         System.out.println("the number is even"+a);
         else{
             System.out.println("the number is odd"+a);
         }
}       
 
}
    


import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);

        sc.close();
    }
}








