/*
The program must accept N string values as the input. The program must print the length of the longest palindrome that can be formed by the N string values as the output.

Boundary Condition(s):
1 <= N, Length of each string <= 100

Input Format:
The first line contains N. The next N lines, each contains a string.

Output Format:
The first line contains the length of the longest palindrome that can be formed by the N string values.

Example Input/Output 1:
Input:
3
LEMON
APPLE
CAT
Output: 9
Explanation:
One of the longest palindrome that can be formed by the given 3 string values is AELPNPLEA.
Here the length is 9. So 9 is printed as the output.

Example Input/Output 2:
Input:
3
engine
energy
deer
Output: 13
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ascii[]=new int[128];
        for(int i=0;i<n;i++){
            char s[]=sc.next().toCharArray();
            int k=0;
            while(k<s.length){
                ascii[s[k]]++;
                k++;
            }
        }
        int l=0,odd=0;
        for(char i='A';i<='z';i++){
            if(ascii[i]%2!=0) odd=1;
            l+=(ascii[i]/2)*2;
        }
        if(odd==1) l++;
        System.out.print(l);
	}
}
