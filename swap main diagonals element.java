/*
The program must accept an integer matrix of size NxN as the input.
The program must swap the values in the main diagonals of the matrix.
Finally, the program must print the modified matrix as the output.

Boundary Condition(s):
2 <= N <= 50

Input Format:
The first line contains N. The next N lines, each contains N integers separated by a space.

Output Format:
The first N lines, each contains N integers separated by a space.

Example Input/Output 1:
Input:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
Output:
5 2 3 4 1
6 9 8 7 10
11 12 13 14 15
16 19 18 17 20
25 22 23 24 21

Example Input/Output 2:
Input:
4
67 49 30 12
50 89 90 73
85 84 26 13
48 68 57 91
Output:
12 49 30 67
50 90 89 73
85 26 84 13
91 68 57 48
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r=0,lc=0,rc=n-1;
        while(r<n){
            int t=a[r][lc];
            a[r][lc]=a[r][rc];
            a[r][rc]=t;
            r++;lc++;rc--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	  }
}
