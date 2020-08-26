/*
The program must accept N integers as the input.
For each integer X among the N integers, the program must increment the value of X by 1 only if at least one of the adjacent integers is odd.
Then the program must print the N modified integer values as the output.

Boundary Condition(s):
2 <= N <= 100 -999 <= Each integer value <= 999

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the N modified integer values separated by a space.

Example Input/Output 1:
Input: 5
1 3 6 4 8
Output:
2 4 7 4 8
Explanation:
The first integer is 1 which has an odd integer on its right(3). So it is incremented by 1.
The second integer is 3 which has an odd integer on its left(1). So it is incremented by 1.
The third integer is 6 which has an odd integer on its left(3). So it is incremented by 1.
The fourth integer is 4 which has no odd integer on its left and right. So it remains the same.
The fifth integer is 8 which has no odd integer on its left and right. So it remains the same.
Hence the output is 2 4 7 4 8

Example Input/Output 2:
Input: 8
4 -1 -8 5 -6 -3 -11 7
Output:
5 -1 -7 5 -5 -2 -10 8
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(a[i+1]%2!=0){
                    System.out.print(a[i]+1+" ");
                }else{
                    System.out.print(a[i]+" ");
                }
            }else if(i==n-1){
                if(a[i-1]%2!=0){
                    System.out.print(a[i]+1+" ");
                }else{
                    System.out.print(a[i]+" ");
                }
            }
            else if(a[i+1]%2!=0 || a[i-1]%2!=0){
                System.out.print(a[i]+1+" ");
            }else{
                System.out.print(a[i]+" ");
            }
        }
	}
}
