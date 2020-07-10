/*input1: 
20 30 40
50 10
output: 90
input2:
40 42 60
0 100 56
output: 156
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] c1=str.split(" ");
        String st=sc.nextLine();
        String[] c2=st.split(" ");
        int sum1=0,sum2=0;
        for(int i=0;i<c1.length;i++){
            int a=Integer.parseInt(String.valueOf(c1[i]));
            if(a<0){
                System.out.print("INVALIDINPUT");
                System.exit(1);
            }else{
                sum1+=a;
            }
        }
        for(int j=0;j<c2.length;j++){
            int b=Integer.parseInt(String.valueOf(c2[j]));
            if(b<0){
                System.out.print("INVALIDINPUT");
                System.exit(1);
            }else{
                sum2+=b;
            }
        }
        int av1,av2;
        av1=sum1/c1.length;
        av2=sum2/c2.length;
        if(av1==av2){
            System.out.printf("%d",(sum1<sum2)?sum2:sum1);
        }else if(av1>av2){
            System.out.print(sum1);
        }else{
            System.out.print(sum2);
        }
	}
}
