/*input: midinadiazne 3
output: madeinindiaz
expla:
m i d
a n i
d i a
e n z
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char s[]=st.toCharArray();
        int n=sc.nextInt();
        int l=s.length/n,count=0;
        char m[][]=new char[100][100];
        for(int i=0;i<l;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    m[i][j]=s[count];
                    count++;
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    m[i][j]=s[count];
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                System.out.print(m[j][i]);
            }
        }
	}
}
