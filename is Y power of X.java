/*
The program accepts two integers X and Y as input. The program prints Yes if Y is a power of X.
Else the program prints No as the output.

Boundary Condition(s):
1 <= X <= 100 1 <= Y <= 10^8

Input Format:
The first line contains X and Y separated by a space.

Output Format:
The first line contains Yes or No.

Example Input/Output 1:
Input: 5 125
Output: Yes
Explanation:
5^3 = 125, here 125 is a power of 5.
So Yes is printed as the output.

Example Input/Output 2:
Input: 3 21
Output: No
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        while(y%x==0){
            y/=x;
        }
        if(y!=1)
        System.out.print("No");
        else
        System.out.print("Yes");
	}
}
