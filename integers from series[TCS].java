/*input: 7
6 5 14 129 17 65 85
output:
5 129 17 65
series: 2 3 5 9 17 33 65(power of 2)
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
        int b[]=new int[1000],k=0;
        for(int i=0;i<1000;i++){
            b[k++]=(1<<i)+1;
        }
        int p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    a[i]='\0';
                    p=1;
                }
            }
        }
        if(p==0){
            System.out.print("-1");
        }
	}
}
