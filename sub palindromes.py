/*input1: everest
output: 2
input2: abccbaab
output: 5
*/


def coun(s,n):
    d=[[0 for x in range(n)] for y in range(n)]
    p=[[False for x in range(n)] for y in range(n)]
    for i in range(n):
        p[i][i]=True
    for i in range(n-1):
        if(s[i]==s[i+1]):
            p[i][i+1]=True
            d[i][i+1]=n
    for g in range(2,n):
        for i in range(n-g):
            j=g+i
            if(s[i]==s[j] and p[i+1][j-1]):
                p[i][j]=True
            if(p[i][j]==True):
                d[i][j]=(d[i][j-1]+d[i+1][j]+1-d[i+1][j-1])
            else:
                d[i][j]=(d[i][j-1]+d[i+1][j]-d[i+1][j-1])
    return d[0][n-1]
s=input()
n=len(s)
print(coun(s,n))