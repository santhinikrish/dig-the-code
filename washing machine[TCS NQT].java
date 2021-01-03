/*
The program must accept an integer representing the weight of the clothes to be washed in a washing machine.
There are 3 water levels in the washing mechanism which are given below.
- Low Water Level: The estimated time is 25 minutes, where the approximate weight is between 1 gram to 2000 grams (both inclusive).
- Medium Water Level: The estimated time is 35 minutes, where the approximate weight is between 2001 grams and 4000 grams (both inclusive).
- High Water Level: The estimated time is 45 minutes, where the approximate weight is above 4000 grams. The maximum capacity of the machine is 7000 grams.
The program must print the estimated time for the given weight of clothes W as the output.
If the weight is more than 7000 grams, the program must print the string value "OVERLOADED" as the output.
If the weight is 0, the program must print 0 as the output. For all other values of W, the program must print "INVALID INPUT" as the output.

Input Format:
The first line contains an integer representing the weight of the clothes.

Output Format:
The first line contains the estimated time for the given weight of clothes W or the string value as per the given conditions.

Example Input/Output 1:
Input:
2000
Output:
25

Example Input/Output 2:
Input:
7500
Output:
OVERLOADED

Example Input/Output 3:
Input:
-5000
Output:
INVALID INPUT
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String r="";
        if(n==0)
        r="0";
        else if(n>=1 && n<=2000)
        r="25";
        else if(n>=2001 && n<=4000)
        r="35";
        else if(n>=4001 && n<=7000)
        r="45";
        else if(n>=7001)
        r="OVERLOADED";
        else
        r="INVALID INPUT";
        System.out.print(r);
	}
}
