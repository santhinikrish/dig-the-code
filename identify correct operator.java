/*input: 5-4=20
output: *
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String sp=sc.next();
        String[] s=sp.split("[-+*/=]");
        int a,b,c;
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        c=Integer.parseInt(s[2]);
        if(a+b==c){
            System.out.print("+");
        }else if(a*b==c){
            System.out.print("*");
        }else if(a/b==c){
            System.out.print("/");
        }else if(a-b==c){
            System.out.print("-");
        }
	}
}
