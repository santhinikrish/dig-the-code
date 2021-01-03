/*
The program must accept an integer matrix of size RxC as the input.
The program must print the elements in the diagonal (from lower left to upper right of the matrix) which has the maximum integer among the integers in the matrix.
If the maximum integer is occurred more than once then consider the first occurred one.

Boundary Condition(s):
2 <= R, C <= 50
1 <= Each integer value <= 999

Input Format:
The first line contains the values of R and C separated by a space.
The next R lines each contain C integers separated by space(s).

Output Format:
The first line contains the integers in the diagonal which have the maximum integer among the integers in the matrix separated by a space.

Example Input/Output 1:
Input:
3 4
86 81 44 95
71 16 84 63
90 75 37 21
Output:
75 84 95
Explanation:
The maximum integer in the matrix is 95. So the elements in its diagonal are 75, 84 and 95.
Hence the output is 75 84 95

Example Input/Output 2:
Input:
6 3
12 70 18
75 45 54
59 26 55
30 26 75
88 71 78
66 96 27
Output:
96 78
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m;
    scanf("%d %d\n",&n,&m);
    int a[n][m],max=0,i1=0,j1=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            scanf("%d ",&a[i][j]);
            if(a[i][j]>max){
                max=a[i][j];
                i1=i;j1=j;
            }
        }
    }
    int minI=i1,minJ=j1;
    if(i1==0 && j1==0 || i1==n-1 && j1==m-1){
        printf("%d ",a[i1][j1]);
    }
    else if((i1!=n-1 && j1==m-1) || (i1==0 && j1!=0)){
        int b[n],k=0;
        while(minI<n && minJ>=0){
            b[k++]=a[minI++][minJ--];
        }
        for(int i=k-1;i>=0;i--){
            printf("%d ",b[i]);
        }
    }else if((i1>0 && i1<n-1) && (j1>0 && j1<m-1)){
        int b[n],k=0,l=i1-1,j=j1+1;
        while(minI<n && minJ>=0){
            b[k++]=a[minI++][minJ--];
        }
        for(int i=k-1;i>=0;i--){
            printf("%d ",b[i]);
        }
        while(l>=0 && j<m){
            printf("%d ",a[l--][j++]);
        }
    }
    else if(i1==n-1 && j1!=m-1){
        while(minI>=0 && minJ<m){
            printf("%d ",a[minI--][minJ++]);
        }
    }else if(j1==0 && i1!=0){
        while(minI>=0 && minJ<m){
            printf("%d ",a[minI--][minJ++]);
        }
    }
}
