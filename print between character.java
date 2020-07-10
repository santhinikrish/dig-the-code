/*input: missiles s
output: sile
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		char ch[]=s.toCharArray();
		int l=ch.length,f=0,last=0;
		for(int i=0;i<l;i++){
		    if(ch[i]==c){
		        f=i;
		        break;
		    }
		}
		for(int i=l-1;i>=0;i--){
		    if(ch[i]==c){
		        last=i;
		        break;
		    }
		}
		for(int i=f+1;i<last;i++){
		    System.out.print(ch[i]);
		}
	}
}

		(or)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		char ch[]=s.toCharArray();
		int l=ch.length,f=0,last=0;
		f=s.indexOf(c);
		last=s.lastIndexOf(c);
		for(int i=f+1;i<last;i++){
		    System.out.print(ch[i]);
		}
	}
}
