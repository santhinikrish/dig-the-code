/*input: a.ba
output: aba
input: kajh.ak
output: kajhjak
input: a.c
output: -1
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a[100];
    scanf("%s",a);
    int i=0,p=0,n=strlen(a),l=n-1;
    while(i<l){
        if(a[i]!='.'&&a[n-i-1]!='.'&&a[i]!=a[l]){
            p=1;
        }
        i++;
        l--;
    }
    if(p==1){
        printf("-1");
    }else{
        for(int i=0;i<n;i++){
            if(a[i]!='.'){
                printf("%c",a[i]);
            }
            if(a[i]=='.'&&n%2!=0&&i==(n/2)){
                continue;
            }else if(a[i]=='.'&&n%2!=0&&i!=(n/2)){
                printf("%c",a[n-i-1]);
            }else if(a[i]=='.'&&i!=(n/2)+1 && i!=(n/2)-1){
                printf("%c",a[n-i-1]);
            }
        }
    }
}
