/*input1: cake
output: keca
input2: innovation
output: vtonia
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        Set<Character> a=new HashSet<Character>();
        for(int i=0;i<c.length;i++){
            a.add(c[i]);
        }
        List<Character> b=new ArrayList<Character>(a);
        Collections.sort(b);
        for(int i=b.size()-1;i>=0;i--){
            System.out.print(b.get(i));
        }
	}
}
