/*input: bracket 2
output: br ac ck et
input: boomerang 3
output: boo
*/



#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    int n,l,c=0,p=0,res,f;
    scanf("%s %d",s,&n);
    l=strlen(s);
    for(int i=0;i<l;i++){
        if(i!=0){
            if(s[i-1]<=s[i]){
                c++;
            }else if(s[i-1]>s[i]){
                c=0;
            }
            if(c>=n-1){
                res=c;
                if(c==n-1){
                    for(int j=i-c;j<=i;j++){
                        printf("%c",s[j]);
                    }
                    printf(" ");
                    p=1;
                }
                if(res>=n){
                    f=res-n+1;
                    for(int j=i-res+f;j<=i;j++){
                        printf("%c",s[j]);
                    }
                    printf(" ");
                    p=1;
                }
            }
        }
    }
    if(p==0){
        printf("-1");
    }
}
