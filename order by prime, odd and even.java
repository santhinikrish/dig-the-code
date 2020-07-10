/*input: 4 5 9 11 2 15
output: 2 5 11 9 15 4 22
*/


import java.util.*;
public class Hello {
public static boolean prime(int a){
    if(a==2){
        return true;
    }else if(a%2==0){
        return false;
    }
    for(int i=3;i*i<=a;i+=2){
        if(a%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] a=str.split(" ");
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        ArrayList<Integer> v=new ArrayList<Integer>();
        for(int g:b){
            v.add(g);
        }
        ArrayList<Integer> p=new ArrayList<Integer>();
        ArrayList<Integer> o=new ArrayList<Integer>();
        ArrayList<Integer> e=new ArrayList<Integer>();
        for(int x:v){
             if(prime(x)){
                 p.add(x);
             }
             else if(x%2!=0){
                 o.add(x);
             }
             else{
                 e.add(x);
             }
        }
        Collections.sort(p);
        Collections.sort(o);
        Collections.sort(e);
        for(int j=0;j<p.size();j++){
            System.out.print(p.get(j)+" ");
        }
        for(int s=0;s<o.size();s++){
            System.out.print(o.get(s)+" ");
        }
        for(int d=0;d<e.size();d++){
            System.out.print(e.get(d)+" ");
        }
	}
}
