/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author wufan
 */
public class ExcerciseOne 
{
  //------------- 1a ------------------
   
    void PrintTo(String x)
    {
        System.out.println(x);
    }
    double meterToFoot(double length) 
    {
        return 3.28084*length;
    }
    double footToMeter(double length) 
    {

        return 0.3048*length;
    }
    double areaOfRectangle(double width, double height) 
    {
        return width*height;
    }
    double areaOfCircle(double radius) 
    {
        return Math.PI * Math.pow(radius, 2);
    }
    double volume(double radius) 
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

//------------- 1b ------------------
   
    int sumOdd(int n) 
    {
        int sum = 0;
      for(int i=1;i<=n;i++)
      {
          if(i % 2 != 0)
          {
             sum += i;
          }
      }       
        return sum;
    }
    
    int gcd(int a, int b)
    {
         while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
         }
        
        return a;
    }
    int lcm(int a, int b) 
    {
        int x;
        if(a > b)
            x =a; // a is greater number
        else
            x=b;
        
        while(true)
        {
            if(x % a == 0 && x % b == 0)
                return x;
            ++x;
        }	
    }
    String thaiToEnglishMonth(String m) 
    {
        String month = "";
        
        switch(m){
                case "มกราคม":
                     month = "January";
                     break;
                case "กุมภาพันธ์":
                     month = "Feburary";
                     break;
                case "มีนาคม":
                     month = "March";
                     break;
                case "เมษายน":
                     month = "April";
                     break;
                case "พฤษภาคม":
                     month = "May";
                     break;
                case "มิถุนายน":
                     month = "June";
                     break;            
                case "กรกฎาคม":
                     month = "July";
                     break;
                case "สิงหาคม":
                     month = "August";
                     break;
                case "กันยายน":
                     month = "September";
                     break;
                case "ตุลาคม":
                     month = "October";
                     break;
                case "พฤศจิกายน":
                     month = "November";
                     break;
                case "ธันวาคม":
                     month = "December";
                     break; 
                default:
                    month = "Try Again";
        }
        
        return month;
    }
    boolean isPrime(int n) 
    {
       for(int i=2;i<=n/2;i++)
	{
           int temp = n%i;
	   if(temp==0)
	   {
               return false;
	   }
	}
        return true;
    }    
    
//------------- 1c ------------------
    int total(int[] a) 
    {
        int sum =0;
        for(int i=0; i< a.length; i++)
        {
            sum += a[i];
        }
        return sum;
    }
    
    double average(double[] a)
    {
        double sum = 0.0;
        for(int i=0; i< a.length; i++)
        {
            sum += a[i];
        }
        return (sum / a.length);
    }
    int[] divider(int n) 
    {
        ArrayList <Integer> in = new ArrayList();
        for(int i=1; i <= n ;i++)
        {
            if(n%(i) == 0)
                in.add(i);
           else 
                continue;
        }
        //System.out.println(in.size());
        int[] a = new int[in.size()];    
        for(int i=0;i< a.length;i++)
            a[i] = in.get(i);
        return a;
    }
    
    boolean sum(int [] a, int x)
    {
       int sum = 0;
       Arrays.sort(a);
       boolean output = false;
       for(int i=0;i<a.length;i++)
       {
           for(int j=a.length-1 ;j>=0;j--)
           {    sum = a[i]+a[j];
                if(sum == x)
                {
                    output = true;
                }
           } 
       }
       
        return output;
    }
    
    //------------- 1d ------------------
    
    int walk(String p) 
    {
        int x=0,y=0;
        int pta;
        
        for(int i=0;i< p.length();i++)
        {
            String cut = p.substring(i,i+1);
            if(cut.equals("N"))
                x++;
             else
            if(cut.equals("S"))
                x--;
            else
            if(cut.equals("E"))
                 y++;
            else
            if(cut.equals("W"))
                y--;   
           
        }
           pta = ( (Double)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)) ).intValue();
           System.out.println(pta + " steps from start");
          return pta;
    }

    static public int facts(int x)
    {
        int sum = 1;
    for (int i = 1; i < x; i++) 
    {
        sum *= (i+1);
    }
    return sum;
}
    
    void permute(String s) 
    {
        char[] word = s.toCharArray();
        int n = word.length;
        int permutation = 0;
            for (int i = 0; i < n; i++) 
            {
                Arrays.sort(word);

                for (int j = 1, count = 0; count < facts(n-1); j++, count++) 
                {
                    if (j != n-1) 
                    {
                        char temp1 = word[j+1];
                        word[j+1] = word[j];
                        word[j] = temp1;
                    } 
                    else 
                    {
                        char temp1 = word[n-1];
                        word[n-1] = word[1];
                        word[1] = temp1;
                        j = 1;
                    } // end of else block
                    permutation++;
                    
                    System.out.print("permutation " + permutation + " is   -> ");
                    for (int k = 0; k < n; k++) 
                    {
                         System.out.print(word[k]);
                    } // end of loop k
                    System.out.println();
                } // end of loop j
         
            }
    }    
        boolean search(String [] a, String s) 
    {
        for (String a1 : a) 
        {
            if (a1.equals(s)) 
                return true;
             else 
                break;   
        }
        return false;
    }
    
    boolean anagram(String s, String t)  
   {  
      boolean result = false;
      // let's try the sorting way  
      char[] ss = s.toCharArray();  
      char[] tt = t.toCharArray();  
  
      Arrays.sort(ss);  
      Arrays.sort(tt);  
      
      if(s.length() != t.length())
          result = false;
      else
          result = Arrays.equals(ss, tt);
      
      return result;  
   }  
        
    boolean palindrome(String s) 
    {
        String ori = "";
        for(int i= s.length()-1; i>=0 ;i--)
        {
            ori = ori + s.charAt(i);
        }
        return s.equals(ori);
    }
    
}
