/*input: call me at 10 p.m
2
1
outout:
ecnn og cv 21 r.o
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    //char c[]=s.toCharArray();
    int sh=sc.nextInt();
    int n2=sc.nextInt();
    String d="";
    for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        if(Character.isLowerCase(a)){
            if(a!='z'){
                a=(char)(a+sh);
            }else{
                a=(char)('a'+sh-1);
            }
            d+=a;
        }
        else if(Character.isDigit(a)){
             d+=(a-'0')+n2;
        }
        else{
            d+=a;
        }
	}
	System.out.print(d);
    }
}