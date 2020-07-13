/*input: 1A
output: 27
input: 23GF
output: 10980
input: 1X
output: Invalid
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> a=new HashMap<Character,Integer>();
        a.put('a',10);
        a.put('b',11);
        a.put('c',12);
        a.put('d',13);
        a.put('e',14);
        a.put('f',15);
        a.put('g',16);
        a.put('A',10);
        a.put('B',11);
        a.put('C',12);
        a.put('D',13);
        a.put('E',14);
        a.put('F',15);
        a.put('G',16);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        long d=0;
        int v=0,l=c.length;
        for(int i=l-1;i>=0;i--){
            if((c[i]>='a' && c[i]<='g')||(c[i]>='A' && c[i]<='G')){
                d=d+a.get(c[i])*(int)Math.pow(17,v++);
            }else if(Character.isDigit(c[i])){
                d=d+((c[i]-'0')*(int)Math.pow(17,v++));
            }else{
                System.out.print("Invalid");
                System.exit(1);
            }
        }
        System.out.print(d);
	}
}