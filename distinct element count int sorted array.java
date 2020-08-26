/*
The program must accept N integers (where N integers are always sorted in ascending/descending order) as the input.
The program must print the count of distinct integers among the N integers as the output.

Boundary Condition(s):
1 <= N <= 100 1 <= Each integer value <= 10^5

Input Format:
The first line contains N. The second line contains N integers separated by a space.

Output Format:
The first line contains the count of distinct integers among the N integers.

Example Input/Output 1:
Input: 5
10 20 30 30 40
Output: 4
Explanation:
The distinct integers are 10 20 30 and 40.
So their count 4 is printed as the output.

Example Input/Output 2:
Input: 10
9 9 9 7 4 4 3 3 1 1
Output: 5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> b=new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            b.add(sc.nextInt());
        }
        System.out.print(b.size());
	  }
}
