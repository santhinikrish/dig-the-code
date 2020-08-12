/*
The program must accept an RxC matrix and an integer K as the input.
The program must find the first two occurrences of K in the given matrix.
Then the program must print the smallest sub-matrix which contains the first two occurrences of K as the output.

Note: The matrix must be traversed from left to right for each row starting from the first row to find the first two occurrences of K.

Boundary Condition(s):
1 <= R, C <= 100 1 <= K, Each integer value <= 10^8

Input Format: The first line contains R, C and K separated by a space. The next R lines contain C integers each separated by a space.

Output Format: The lines contain the sub-matrix as per the given condition.

Example Input/Output 1:
Input: 5 4 30
48 42 17 32
52 23 30 34
44 30 33 11
20 15 30 75
26 60 44 84
Output:
23 30
30 33

Explanation:
The first occurrence of 30 is highlighted in blue and the second occurrence of 30 is highlighted in red.
48 42 17 32
52 23 30 34
44 30 33 11
20 15 30 75
26 60 44 84
The smallest sub-matrix containing these two integers are printed as the output.

Example Input/Output 2:
Input: 5 5 20
11 30 63 52 78
20 82 93 53 64
23 91 21 64 64
99 88 20 56 65
64 70 76 20 66
Output:
20 82 93
23 91 21
99 88 20
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m,k;
    scanf("%d %d %d",&n,&m,&k);
    int a[n][m],c=0;
    int i1=0,i2=0,j1=0,j2=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            scanf("%d ",&a[i][j]);
            if(a[i][j]==k){
                c++;
                if(c==1){
                    i1=i;j1=j;
                }
                if(c==2){
                    i2=i;j2=j;
                }
            }
        }
    }
    if(j1>j2){
        int t=j1;
        j1=j2;
        j2=t;
    }
    for(int i=i1;i<=i2;i++){
        for(int j=j1;j<=j2;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}
