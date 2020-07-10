/*input: 4
1 5 9 4
3 5 2 8
7 4 1 9
3 5 4 6
output:
0 5 9 0
3 0 0 8
7 0 0 9
0 5 4 0
*/
sum of diagonals are equal so replace it with 0 or replace by 1.
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    int s1=0,s2=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                s1+=a[i][j];
            }
            if(i+j==n-1){
                s2+=a[i][j];
            }
        }
    }
    int k=(s1!=s2);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j||i+j==n-1){
                printf("%d ",k);
            }else{
                printf("%d ",a[i][j]);
            }
        }
        printf("\n");
    }
}