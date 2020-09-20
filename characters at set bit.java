/*
The program must accept an integer N and a string S as the input.
The program must find the binary representation of N and print the characters in the string S at the set bits.
Note: The length of S is always greater than or equal to the number of bits in the binary representation of N.

Boundary Condition(s):
1 <= N <= 10^9 1 <= Length of S <= 100

Input Format:
The first line contains N. The second line contains S.

Output Format:
The first line contains the characters in the string S at the set bits of the binary representation of N.

Example Input/Output 1:
Input:
9
Coding
Output:
Ci
Explanation: Here N = 9.
The binary representation of 9 is 1001.
Coding 1001 The characters in string S at the set bits are C and i.
So they are printed as the output.

Example Input/Output 2:
Input:
45
wavelength
Output:
wvee
Explanation: Here N = 45.
The binary representation of 45 is 101101.
wavelength 101101 The characters in string S at the set bits are w, v, e and e.
So they are printed as the output.

Example Input/Output 3:
Input:
1023
abcdefghij
Output:
abcdefghij
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        char s[]=sc.next().toCharArray();
        char a[]=Long.toBinaryString(n).toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1') System.out.print(s[i]);
        }
	  }
}

    or

#include<stdio.h>
int main(){
  int n;
  char s[100];
  scanf("%d\n%s",&n,s);
  int bits=0;
  while((1<<bits)<=n){
    bits++;
  }
  for(int i=0;i<bits;i++){
    int l=bits-i-1;
    if(n&(1<<l)){
      printf("%c",s[i]);
    }
  }
}
