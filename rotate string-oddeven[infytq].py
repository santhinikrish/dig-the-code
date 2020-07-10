The program is provided with one or more strings separated by a comma, where each string is associated with an integer following it after a colon (:). 
If the sum of the squares of the digits of the associated integer is even then rotate the string right by one position. 
If the sum of the squares of the digits of the associated integer is odd then rotate the string left by two positions. 

Boundary Condition(s): 
1 <= Count of String Values <= 20 

Input Format: 
The first line contains the string values separated by a comma. 

Output Format: 
The lines contain the string values rotated based on the given conditions. 

Example Input/Output 1: 
Input: abcde:234,pqrs:246 
Output: cdeab spqr 
Explanation: 
For abcde, the integer is 234. The sum of squares of the digits is 4+9+16=29 which is odd. 
So abcde is rotated left by two positions resulting in cdeab. 
For pqrs, the integer is 246. The sum of squares of the digits is 4+16+36=56 which is even. 
So abcde is rotated right by one position resulting in spqr. 

Example Input/Output 2: 
Input: xyz:193 
Output: zxy
*/



#Your code below
dic=input().split(",")
for i in dic:
    s=i.split(":")
    string=s[0]
    l=len(string)
    num=s[1]
    sum=0
    for j in num:
        sum+=(int(j)**2)
    if sum%2==0:
        la=string[l-1]
        print(la+string[0:l-1],end='\n')
    else:
        f=string[0:2]
        print(string[2:l]+f)

		(or)

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question5 {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=br.readLine().split(",");
		for(String obj:str)
		{
			String ar[]=obj.split(":");
			String s=ar[0];
			int number=Integer.parseInt(ar[1]);
			int digSqSum=0;
			while(number!=0)//adding every sq of digits
			{
				int digit=number%10;
				digSqSum+=(digit*digit);
				number/=10;
			}
			int lenOfString=s.length();
			if(digSqSum%2==0)
				System.out.print(s.charAt(lenOfString-1)+s.substring(0,lenOfString-1)+" ");
				//first printing last char and then concatenating all char except last
			else
				System.out.println(s.substring(2,lenOfString)+s.substring(0,2)+" ");
				//first printing substring from 3rd position and concatenatiin first two char in it.
		}
	}
}