/*
0,2,1,3,1,5,2,7,3,11,5,13,8,17,....
This series is a mixture of 2 series fail the odd terms in this series
 form a Fibonacci series and all the even terms are
the prime numbers in ascending order
input: 18
output: 23
input: 5
output: 1
*/

import java.util.*;
public class Hello {
public static void fibo(int n){
    int a=0,b=1,ne;
    for(int i=1;i<=n;i++){
        ne=a+b;
        a=b;
        b=ne;
    }
    System.out.print(a);

}
public static void prime(int n){
    int c=0;
    for(int i=2;i<=Integer.MAX_VALUE;i++){
        int f=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                f=1;
                break;
            }
        }
        if(f==0){
            if(++c==n){
                System.out.print(i);
                break;
            }
        }
    }
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            fibo(n/2);
        }else{
            prime(n/2);
        }
	}
}
