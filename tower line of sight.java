/*input: 
0 0
0 -2
2 0
0 2
output:
yes
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a1,a2,b1,b2,c1,c2,d1,d2;
        a1=sc.nextInt();
        a2=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        c1=sc.nextInt();
        c2=sc.nextInt();
        d1=sc.nextInt();
        d2=sc.nextInt();
        int flag=0;
        if(a1==c1){
            if(b1==a1){
                if((b2>=a2&&b2<=c2)||(b2>=c2&&b2<=a2))
                    flag=1;
            }
            else if(d1==a1){
                if((d2>=a2&&d2<=c2)||(d2>=c2&&d2<=a2))
                    flag=1;
            }
        }else if(a2==c2){
            if(b2==a2){
                if((b1>=a1&&b1<=c1)||(b1>=c1&&b1<=a1))
                    flag=1;
            }else if(d2==a2){
                if((d1>=a1&&d1<=c1)||(d1>=c1&&d1<=a1))
                    flag=1;
            }
        }
        if(b1==d1){
            if(a1==b1){
                if((a2>=b2&&a2<=d2)||(a2>=d2&&a2<=b2))
                    flag=1;
            }else if(c1==a1){
                if((c2>=b2&&c2<=d2)||(c2>=d2&&c2<=b2))
                    flag=1;
            }
        }else if(c2==a2){
            if(a2==b2){
                if((a1>=b1&&a1<=d1)||(a1>=d1&&a1<=b1))
                    flag=1;
            }else if(c2==a2){
                if((c1>=b1&&c1<=d1)||(c1>=d1&&c1<=b1))
                    flag=1;
            }
        }
        if(flag==1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
	}
}