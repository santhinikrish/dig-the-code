/*
The program must accept N integers as the input.
The program must sort only the odd integers among the N integers in ascending order.
The even integers must be retained in their position.
Finally, the program must print the modified values of the N integers as the output.

Boundary Condition(s):
1 <= N <= 100 1 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the modified values of the N integers separated by a space.

Example Input/Output 1:
Input: 6
45 34 29 11 13 60
Output:
11 34 13 29 45 60
Explanation:
The odd integers are 45, 29, 11 and 13.
So these odd integers are sorted in ascending order.
The even integers 34 and 60 are retained in their position.
Hence the output is 11 34 13 29 45 60

Example Input/Output 2:
Input: 13
39 79 31 82 73 10 51 48 36 78 35 63 15
Output:
15 31 35 82 39 10 51 48 36 78 63 73 79
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        int a[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            if(b[i]%2!=0){
                a[k++]=b[i];
            }
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<k-i;j++){
                if(a[j-1]>a[j] ){
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        int h=0;
        for(int i=0;i<n;i++){
            if(b[i]%2!=0){
            System.out.print(a[h++]+" ");
            else
            System.out.print(b[i]+" ");
        }
	}
}
