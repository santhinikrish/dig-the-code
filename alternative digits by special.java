/*
The program must accept a string S as the input.
The program must count the number of special characters in S as C.
If C is odd then the program must print the odd digits and even digits alternatively starting from the odd digit.
Else the program must print the even digits and odd digits alternatively starting from the even digits.
Note: If the count of odd and even digits are not equal then the remaining digits must be printed as it is.
The odd and even digits must be printed in the order of their occurrence.

Boundary Condition(s):
1 <= Length of S <= 100

Input Format:
The first line contains S.

Output Format:
The first line contains digits separated by a space.

Example Input/Output 1:
Input: as$598 7sd%78y 6&
Output: 5 8 9 8 7 6 7
Explanation:
There are 5 special characters (including space).
Hence the digits are printed alternatively starting from the odd digit.

Example Input/Output 2:
Input: w34t^3d 2f#34s45% 97&
Output: 4 3 2 3 4 3 4 5 9 7
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char s[]=a.toCharArray();
        int c=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==' '||s[i]=='-'||s[i]=='+'||s[i]=='/'||s[i]=='$'||s[i]=='@'||s[i]=='!'||s[i]=='#'||s[i]=='%'||s[i]=='^'||s[i]=='&'||s[i]=='('||s[i]==')'||s[i]=='*'||s[i]==':'||s[i]==';'||s[i]=='`'||s[i]=='?'||s[i]=='>'||s[i]=='<'){
                c++;
            }
        }
        int even[]=new int[100];
        int odd[]=new int[100];
        int k=0,l=0;
        for(int i=0;i<s.length;i++){
            if(Character.isDigit(s[i])){
                if(s[i]%2==0){
                    even[k++]=Integer.parseInt(String.valueOf(s[i]));
                }else{
                    odd[l++]=Integer.parseInt(String.valueOf(s[i]));
                }
            }
        }
        if(c%2==0){
            for(int i=0;i<k||i<l;i++){
                if(i<k)
                System.out.print(even[i]+" ");
                if(i<l)
                System.out.print(odd[i]+" ");
            }
        }else{
            for(int i=0;i<k||i<l;i++){
                if(i<l)
                System.out.print(odd[i]+" ");
                if(i<k)
                System.out.print(even[i]+" ");
            }
        }
	}
}
