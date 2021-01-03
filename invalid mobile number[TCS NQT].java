/*
The program must accept a list of mobile numbers (in separate lines) as the input.
The character q or Q represents the end of the input.
The program must print the number of invalid mobile numbers among the given list of mobile numbers as the output.
A valid mobile number contains exactly 10 digits.

Boundary Condition(s):
1 <= Length of each string <= 20

Input Format:
The lines, each contains a string value.

Output Format:
The first line contains the number of invalid mobile numbers.

Example Input/Output 1:
Input:
9854653221
997878A1576
9992224578
999225789900
986578989B
817524990
Q
Output: 4
Explanation:
The 4 invalid mobile numbers are given below.
997878A1576
999225789900
986578989B
817524990
Hence the output is 4.

Example Input/Output 2:
Input:
7006868327
8745152751
90379383946799
7180S16U65
9404722712T
929191K54588G6
84385659
q
Output: 5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int c=0,f=0;
        while(sc.hasNext())
        {
            String s=sc.next();
            if(s.equalsIgnoreCase("q")) break;
            if(s.length()==10){
                for(int i=0;i<s.length();i++){
                    if(Character.isLetter(s.charAt(i))){
                        c++;
                        break;
                    }
                }
            }else c++;
        }
        System.out.print(c);
	}
}
