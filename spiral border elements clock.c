/*input: 4 4
10 24 33 45
25 64 75 87 
97 14 27 36
14 85 64 72
output:
10 24 33 45 87 36 72 64 85 14 97 25
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m;
    scanf("%d %d",&n,&m);
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            scanf("%d ",&a[i][j]);
        }
    }
    for(int j=0;j<m;j++){
        printf("%d ",a[0][j]);
    }
    for(int i=1;i<n;i++){
        printf("%d ",a[i][m-1]);
    }
    for(int j=m-2;j>=0;j--){
        printf("%d ",a[n-1][j]);
    }
    for(int i=n-2;i>0;i--){
        printf("%d ",a[i][0]);
    }
}