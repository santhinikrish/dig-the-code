/*input1: 12
output: 21
input2: 195
output: 519
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int i,j,l,k,m;
    char s[100];
    scanf("%s",s);
    l=strlen(s);
    int d[l];
    for(i=0;i<l;i++){
        d[i]=s[i]-'0';
    }
    for(i=l-1;i>=0;i--){
        for(j=i-1;j>=0;j--){
            if(d[i]>d[j]){
                d[i]+=d[j]-(d[j]=d[i]);
                for(k=j+1;k<l;k++){
                    for(int m=k+1;m<l;m++){
                        if(d[k]>d[m]){
                            d[k]+=d[m]-(d[m]=d[k]);
                        }
                    }
                }
                goto x;
            }
        }
    }

x:
for(i=0;i<l;i++){
    printf("%d",d[i]);
}
}
