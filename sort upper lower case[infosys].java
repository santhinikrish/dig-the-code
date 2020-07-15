/*
The program must accept a string S as the input.
The program must sort the uppercase alphabets and lowercase alphabets separately.
Then the program must print the sorted uppercase alphabets and sorted lowercase alphabets alternatively as the output.

Boundary Condition(s):
1 <= Length of String <= 10^5

Input Format:
The first line contains S.

Output Format:
The first line contains the alphabets as per the given conditions.

Example Input/Output 1:
Input:
TraDItIoN
Output: DaIoIrNtT
Explanation:
The uppercase alphabets are sorted as D I I N T.
The lowercase alphabets are sorted as a o r t.
They are alternatively printed as DaIoIrNtT.

 Example Input/Output 2:
 Input:
 SEcuRITY
 Output:
 EcIuRSTY
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        String a="";
        String b="";
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                a+=c;
            }
            if(Character.isUpperCase(c)){
                b+=c;
            }
        }
        char lo[]=a.toCharArray();
        char u[]=b.toCharArray();
        Arrays.sort(lo);
        Arrays.sort(u);
        String d="";
        for(int i=0;i<u.length||i<lo.length;i++){
            if(i<u.length)
            d+=u[i];
            if(i<lo.length)
            d+=lo[i];
        }
        System.out.print(d);
	}
}
