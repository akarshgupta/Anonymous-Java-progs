For n = 4 print the Pattern as given below

 1*2*3*4*17*18*19*20
    5*6*7*14*15*16
      8*9*12*13
        10*11
        
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x =n*2,s = 0;
        
        
            s = n*(n+1);
            StringBuffer a = new StringBuffer("");
            int i = 0;
            int r = n*2;
            int fst = 1;
            int snd = s-n+1;
            while(r > 0 && i < n)
            {
                
                for(int space = 0; space <= n-(n-i); space++) 
                a.append("  ");
                
                
                int f = fst,sec =snd;
                for(int j=1;j <= r;j++)
                {
                  if(j == r){
                        a.append(sec);
                        sec++;}
                    else if( j > r/2){
                        a.append(sec + "*");
                        sec++;}
                    else{
                        a.append(f + "*");
                        f++;}
                }
                System.out.println(a);
                fst = fst + (n-i);
                i = i+1;                
                snd = snd -(n-i);
                r = r-2;
                a=a.delete(0, a.length());
            }
    
        
        
	}
}
