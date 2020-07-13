/*input: GooD mOrninG12_3
output: gOOd MoRNINg12_3
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int l=c.length;
        for(int i=0;i<l;i++){
            if(Character.isLowerCase(c[i])){
                System.out.print(Character.toUpperCase(c[i]));
            }else if(Character.isUpperCase(c[i])){
                System.out.print(Character.toLowerCase(c[i]));
            }else{
                System.out.print(c[i]);
            }
        }
	}
}