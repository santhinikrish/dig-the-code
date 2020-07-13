'''The program must accept N integers as the input and print the count C of combinations of K integers which add upto a special sum S which is an integer value.
Boundary Condition(s):
1 <= K <= N <= 25
Input Format:
The first line contains N, K and S separated by a space.
The second line contains N integer values separated by a comma.
Output Format:
The first line contains C.
Example Input/Output 1:
Input:
6 4 0
-1,1,0,0,2,-2
Output: 3
Explanation:
As K is 4 and S is 0, we need to consider the combination of four integers.
(-1,1,2,-2), (0,0,1,-1), (0,0,-2,2) are the combinations which add upto S (as S is 0).
Example Input/Output 2:
Input:
6 4 3
5,1,0,0,2,-2
Output: 2
'''


import itertools
s=list(map(int,input().strip().split()))
x,k,u=s[0],s[1],s[2]
fin=list(map(int,input().split(",")))
l=list(itertools.combinations(fin,k))
sum1=0
for i in l:
    a=sum(i)
    if a==u:
        sum1+=1
print(sum1)



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ArrayList;
public class Question19 {
public static void main(String[] args)throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArr[] = br.readLine().split(",");
	int inputSum = Integer.parseInt(br.readLine());
	int n = strArr.length;
	int combination = 0;
	for (int i = 0; i < (1<<n); i++)
	{
		//finding subset
		ArrayList<Integer> subset = new ArrayList<>();
		for (int j = 0; j < n; j++)
		{
		// (1<<j) is a number with jth bit 1 // so when we 'and' them with the
		// subset number we get which numbers// are present in the subset and which are not

			if ((i & (1 << j)) >0)
			subset.add(Integer.parseInt(strArr[j]));
		}
		int size = subset.size();
		if(size==0)
		continue;
		else if(size == 4)
		{
			int sum = subset.get(0) ;
			for(int x = 1 ; x < size ; x++)
			sum += subset.get(x);
			if(sum==inputSum)
				combination++;
		}
	}
	System.out.println(combination);
    }
}
