/*
The program must accept a string S containing digits as the input.
The program must check whether it is a palindrome or not.
If it is not a palindrome, reverse the string, add it to the original string and check again.
The program must repeat the process until the string becomes palindrome.
Finally, the program must print the length of the palindromic string.

Boundary Condition(s):
1 <= Length of S <= 10^8

Input Format:
The first line contains S.

Output Format:
The first line contains the length of the palindromic string.

Example Input/Output 1:
Input: 145
Output: 3
Explanation:
The given string is 145, it is not a palindrome.
After reversing and adding, 145+541 = 686.
The length of the palindromic string 686 is 3.
Hence the output is 3

Example Input/Output 2:
Input: 1
Output: 1
*/

import java.util.*;
public class Hello {
    public static long pal(long n){
        long t=n,sum=0;
        while(n>0){
            sum=sum*10+(n%10);
            n/=10;
        }
        if(t==sum){
            return t;
        }
        return pal(sum+t);
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n>0 && n<10){
            System.out.print("1");
        }else{
            int p=Long.toString(pal(n)).length();
            System.out.print(p);
        }
	}
}
