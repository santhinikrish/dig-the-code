/*input: 5 2 3
output: 2
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x,y,z,c=0;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if((z>x&&z>y)||(z%2!=0&&x%2==0&&y%2==0)||((x-y)<z)){
            System.out.print("-1");
        }else{
            while((x-y)>=z){
                c++;
                x=(x-y);
                if(x==z){
                    break;
                }
            }
            System.out.print(c*2);
        }
	}
}
