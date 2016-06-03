/*
    AmmMic1604@gmail.com
 */
package excercise;

import java.text.DecimalFormat;

/**
 *
 * @author vatcharavaree
 */
public class Excercise 
{
    public static void main(String[] args) 
    {
       int l = 10, w = 5, h = 4, r = 3,n=5,th = 1000, mi = 1000000;
       final int no = 50;
       String m = "มีนาคม", ss = "Hello";
       String[] word = {"th","en","jp","kr"};
       
       ExcerciseOne a = new ExcerciseOne();
       System.out.println("------------ Exercise 1a ------------ ");
       System.out.println(l + " Meters = " + a.meterToFoot(l) + " Feet");
       System.out.println(l + " Feet = " + a.footToMeter(l) + " Meters");
       System.out.println("Area of The Rectangle (4,5) = " + a.areaOfRectangle(w,h));
       System.out.println("Area of Circle = " + a.areaOfCircle(r));
       System.out.println("Volume = " + a.volume(r));
       System.out.println("");
       System.out.println("------------ Exercise 1b ------------ ");
       System.out.println("The GCD of 18, 45 is " + a.gcd(18, 45));
       System.out.println("The LCM of 18, 45 is " + a.lcm(18, 45));
       System.out.println("Sum of Odd Number = " + a.sumOdd(n));
       System.out.println(m + " in English = " + a.thaiToEnglishMonth(m));
        if(a.isPrime(n))
       {
           System.out.println(n + " is a prime number");
       }else
           System.out.println(n + " is not a prime number");
        
        System.out.println("------------ Exercise 1c ------------ ");
        System.out.print("Summation of ");
        System.out.println("= " + a.total(new Excercise().AssignNum(n)));
        System.out.print("Average of ");
        double result = a.average(new Excercise().AssignDouble(n));
        System.out.println("= " + new DecimalFormat("0.00").format(result));
        
        int[] re = a.divider(n);   
        System.out.print("The divider of "+ n + " is :");
        for(int j=0;j<re.length;j++)
        {
            System.out.print(" "+ re[j]);
        }
        System.out.println(" ");
        
       //a.sum(new Excercise().AssignNum(th), no);
       if((a.sum(new Excercise().AssignNum(th),9) == true))
           System.out.println("Yes");
       else
           System.out.println("No");
       
       //1d
       System.out.println("------ 1d ---------");
       //----------Permute----------------
       a.walk("NNEESNESENNENWW");
       //----------Permute----------------
       a.permute("ABCD");
       //----------Search-----------------
       boolean search = a.search(word, "th");      
       if(search == true)
           System.out.println("True");
       else
           System.out.println("False");
      //----------Anagram-----------------
      String s = "gallery", t="largely";
      boolean output = a.anagram(s, t);
      if(output == true)
          System.out.println(s + " and "+ t + " is Anagram");
      else
          System.out.println(s + " and "+ t + " is not Anagram");
      
      
      //----------Palindrom----------------- 
       boolean b = a.palindrome(ss);
       if(b == true)
           System.out.println(ss + " is Palindrome");
       else
           System.out.println(ss + " is not Palindrome");
       
       
        
    }

    int[] AssignNum(int size)
    {
        int[] num = new int[size];
        
        for(int i =0;i < num.length ; i++)
        {
            num[i] = (int) (Math.random() * 50 + 1);
            //System.out.print(num[i] + " ");
            
        }
        
        return num;
    }
    
    double[] AssignDouble(int size)
    {
        double[] num = new double[size];
        
        for(int i =0;i < num.length ; i++)
        {
            num[i] = (Math.random() * 50 + 1);
            System.out.print(new DecimalFormat("##.##").format(num[i]) + " ");
      
        }
        return num;
    }
   
}
