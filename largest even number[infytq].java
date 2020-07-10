A string S which contains digits as well as non-digits is passed as the input. 
The program has to find the largest even number E that can be formed from the available digits after removing the duplicates(removing repeated digits).
If it is not possible to form an even number then the program must print -1.

Boundary Condition(s):
1 <= Length of S <= 100

Input Format:
The first line contains S.

Output Format:
The first line contains E or -1.

Example Input/Output 1:
Input:
%#36%#%6ab66
Output: 36
Explanation:
After removing duplicates we have 3 and 6.
So 36 is the largest even number that can be formed.

Example Input/Output 2:
Input:
%e#2393#@i
Output: 932

Example Input/Output 3:
Input:
%e#5393#@i
Output: -1

Example Input/Output 4:
Input:
%e#66#@66666i
Output: 6

Example Input/Output 5:
Input:
%e#66#@6600666i007
Output: 760
*/


import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Hello{
    static boolean isDigit(char digit){
        if(digit>='0' && digit<='9'){
            return true;
        }
        return false;
    }
    public static void main(String[] args)throws Exception {
		//Your Code Here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String in=br.readLine();
        StringBuilder sb=new StringBuilder();
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<in.length();i++){
            if(isDigit(in.charAt(i))){
                String dig=String.valueOf(in.charAt(i));
                h.add(Integer.parseInt(dig));
            }
        }
        ArrayList<Integer> digl=new ArrayList<>(h);
        Collections.sort(digl,Collections.reverseOrder());
        int len=digl.size();
        boolean eve=false;
        for(int i=len-1;i>=0;i--){
            int d=digl.get(i);
            if(d%2==0){
                digl.remove(i);
                digl.add(d);
                eve=true;
                break;
            }
        }
        if(eve==false){
            System.out.print("-1");
        }else{
            for(int dig:digl){
                System.out.print(dig);
            }
        }
	}
}
