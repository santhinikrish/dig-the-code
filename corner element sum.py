/*input 3
3 2 1
4 5 4
6 1 3
output: 13
expla: 3+1+6+3
*/

n=input().split(" ")
r=int(n[0])
c=int(n[1])
a=[[0]*c for i in range(r)]
for i in range(r):
    a[i]=[int(cellvalue) for cellvalue in input().strip().split(" ")]
sum=a[0][0]+a[0][c-1]+a[r-1][0]+a[r-1][c-1]
print(sum)
