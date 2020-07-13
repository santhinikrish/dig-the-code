/*input1: everest
output: 2
input2: abccbaab
output: 5
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        char[] s=c.toCharArray();
        int r=0,count;
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    count=0;
                    for(int s1=i,t=j;s1<=j&&t>=i;s1++,t--){
                        if(s[s1]==s[t])
                        count++;
                    }
                    if(count==(j-i)+1){
                        r++;
                    }
                }
            }
        }
        System.out.print(r);
	}
}