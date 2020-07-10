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
    int s1=0,s2=0;
    for(int i=0;i<n;i++){
        s1+=m[i][i];
        s2+=m[i][n-1-i];
    }
    if(s1<0 && s2>0){
        printf("%d",abs(s1+s2));
    }
    else{
        printf("%d",abs(s1-s2));
    }
}
