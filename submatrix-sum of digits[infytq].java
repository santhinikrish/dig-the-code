/*input: 4 4
18 19 72 42
92 84 60 63
12 50 93 35
24 54 94 37
output:
72 42 
60 63
12 50
24 54
expla: print all possible 2x2 submatrix where each integers should be divisible by sum of its digits.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();       
            }
        }
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=m-2;j++){
                int c=0;
                for(int k=i;k<i+2;k++){
                    for(int l=j;l<j+2;l++){
                        int x=a[k][l];
                        int sum=0,t=x;
                        while(x>0){
                            sum+=(x%10);
                            x/=10;
                        }
                        if(t%sum==0){
                            c++;
                        }
                    }
                }
                if(c==4){
                    for(int p=i;p<i+2;p++){
                        for(int q=j;q<j+2;q++){
                            System.out.print(a[p][q]+" ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}