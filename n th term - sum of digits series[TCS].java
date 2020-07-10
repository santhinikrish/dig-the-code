/*The program must accept an integer N as the input. The program must print the Nth term in the series as the output.
The order of series must be 1, 1, 2, 4, 8, 16, 23, 28, 38, 49 and so on.
Each term in the series is formed from the sum of the digits of all preceding terms.
Note:
The first term of the series must be 1.
Boundary Condition(s):
1 <= N <= 10^7
Input Format:
The first line contains the value of N.
Output Format:
The first line contains the Nth term in the above mentioned series.
Example Input/Output 1:
Input:
7
Output:
23
Explanation:
The 7th term in the series is 23. 23 is formed from the sum of the digits of all preceding terms (1, 1, 2, 4, 8, 16).
1 + 1 + 2 + 4 + 8 + 1 + 6 = 23 Hence the output is 23
Example Input/Output 2:
Input:
54
Output:
538
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int x[]=new int[n+6];
        x[0]=1;x[1]=1;x[2]=2;x[3]=4;x[4]=8;x[5]=16;
        for(int i=0;i<5;i++){
            sum+=x[i];
        }
        for(int i=6;i<n;i++){
            while(x[i-1]>0){
                sum+=x[i-1]%10;
                x[i-1]/=10;
            }
            x[i]=sum;
        }
        System.out.print(x[n-1]);
	}
}
