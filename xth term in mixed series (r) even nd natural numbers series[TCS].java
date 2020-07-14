/*input1: 5
output: 4
input2: 8
output: 3
series: 0 0 2 1 4 2 6 3 8 4 10 5 12 6 14 7
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.print((n%2==0)?(n/2-1):n-1);
	}
}
