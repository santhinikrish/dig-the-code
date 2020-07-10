
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String top="";
        int max=0,dis,a,b;
        for(int i=0;i<n;i++){
            String str=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            /*String[] s=str.split(" ");
            a=Integer.parseInt(s[1]);
            b=Integer.parseInt(s[2]);*/
            dis=(a*b)/100;
            if(i==0){
                top=str;
                max=dis;
            }
            if(dis<max){
                max=dis;
                top=str;
            }
        }
        System.out.print(top);
	}
}
