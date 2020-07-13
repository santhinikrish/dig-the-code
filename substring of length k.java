input : apple 3
output : app ppl ple


import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int j,n=sc.nextInt();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(j=i;j<n;j++){
                System.out.print(c[j]);
            }
            if(j==c.length){
                break;
            }
            System.out.print(" ");
            n++;
        }
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        char[] c=s.toCharArray();
        int j=0,co;
        for(int i=0;i<c.length && j<c.length;i++){
            co=0;
            co++;
            System.out.print(c[i]);
            for(j=i+1;j<c.length;j++){
                if(co==n){
                    break;
                }else{
                    System.out.print(c[j]);
                    co++;
                }
            }
            System.out.print(" ");
        }
	}
}