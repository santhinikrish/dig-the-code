/*input: 195
output: 519
*/

import java.util.*;
public class Hello {
    static void swap(char a[],int i,int j){
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    static void findnext(char a[],int n){
        int i;
        for(i=n-1;i>0;i--){
            if(a[i]>a[i-1]){
                break;
            }
        }
        if(i!=0){
            int x=a[i-1],min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]>x&&a[j]<a[min]){
                    min=j;
                }
            }
            swap(a,i-1,min);
            Arrays.sort(a,i,n);
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        char s[]=c.toCharArray();
        int n=s.length;
        findnext(s,n);
	}
}
