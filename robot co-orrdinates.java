/*input: x2 y1 N3 E2 S1
output: x4 y3

input: x-2 y3 N1 W3
output: x-5 y4
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String sr=sc.nextLine();
        String[] s=sr.split(" ");
        int sum1=0,sum2=0;
        for(int i=0;i<s.length;i++){
            String a=s[i];
            char c=a.charAt(0);
            String s1=a.substring(1,a.length());
            int n=Integer.parseInt(s1);
            if(c=='x'||c=='E'){
                sum1+=n;
            }else if(c=='W'){
                sum1-=n;
            }else if(c=='N'||c=='y'){
                sum2+=n;
            }else{
                sum2-=n;
            }
        }
        System.out.print("x"+sum1+" "+"y"+sum2);
	}
}