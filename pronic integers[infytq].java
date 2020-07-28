/*
The program must accept an integer N as the input.
The program must print all the pronic integers formed by series of continuously occurring digits (in the same order) in N as the output.
Note: The pronic integers must be printed in the order of their occurrence.
The pronic integers can be represented as n*(n+1).

Boundary Condition(s):
1 <= N <= 10^20

Input Format:
The first line contains N.

Output Format:
The first line contains the pronic integers separated by a space.

Example Input/Output 1:
Input: 93042861
Output: 930 30 0 42 2 6
Explanation:
30 * 31 = 930
5 * 6 =
30 0 * 1 = 0
6 * 7 = 42
1 * 2 = 2
2 * 3 = 6

Example Input/Output 2:
Input: 247025123524
Output: 2 702 0 2 12 2 2352 2
*/

import java.util.*;
public class Hello {
    public static boolean isPronic(long n){
        int s=(int)Math.sqrt(n);
        int p=s*(s+1);
        if(p==n){
            return true;
        }else{
            return false;
        }
    }
    public static boolean len(String n){
        int c=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='0'){
                c++;
            }
        }
        if(c==n.length() && n.length()>1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int l=n.length();
        for(int i=0;i<l;i++){
            String a="";
            a+=n.charAt(i);
            if(isPronic(Long.parseLong(a))){
                System.out.print(a+" ");
            }
            for(int j=i+1;j<l;j++){
                a+=n.charAt(j);
                if(len(a)){
                    System.out.print("0 ");
                }
                else if(a.charAt(0)=='0' && a.length()>1){
                    continue;
                }
                else if(isPronic(Long.parseLong(a))){
                    System.out.print(a+" ");
                }
            }
        }
	}
}
