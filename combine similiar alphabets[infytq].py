/*Example Input/Output 1: 
Input: HelLoWOrld
Output: dWerHoOlLl
Explanation:
'd', 'e', 'H', 'lLl', 'oO', 'r', 'W' are the grouped similar alphabets.
So d and W are printed first.
Then e and r are printed.
Then H and oO are printed.
Then lLl is printed.
Example Input/Output 2:
Input: tapa
Output: aatp
Example Input/Output 3:
Input: u
Output: u
*/


s=input()
ss=sorted(set(s.upper()))
res=[]
for i in range(len(ss)):
    a=""
    for j in s:
        if ss[i]==j.upper():
            a+=j
    res.append(a)
i,j=0,len(res)-1
fin=""
while i<=j:
    if i==j:
        fin+=res[i]
    else:
        fin+=res[i]+res[j]
    i+=1
    j-=1
print(fin)
