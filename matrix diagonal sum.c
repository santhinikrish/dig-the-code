/*INPUT:
2
10 9
4 22
OUTPUT:
45*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int m[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d ",&m[i][j]);
        }
    }
    int s1=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                s1+=m[i][j];
            }else if(i+j==(n-1)){
                s1+=m[i][j];
            }
        }
    }
    printf("%d",s1);
}
