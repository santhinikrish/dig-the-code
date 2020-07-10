/*input: 
whiteblackgreen 3
output:
white black green
input:
pencilrubber 5
output: -1
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    int n;
    scanf("%s %d",s,&n);
    int l=strlen(s),a=l/n;
    if(l%n==0){
        for(int i=0;i<l;i+=a){
            for(int j=i;j<i+a;j++){
                printf("%c",s[j]);
            }
            printf(" ");
        }
    }else{
        printf("-1");
    }
}
