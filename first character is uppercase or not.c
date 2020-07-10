/*input: Apple Mango
output: YES
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[100];
    while(scanf("%s ",s)>0){
        for(int i=0;i<strlen(s);i++){
            if(!(isupper(s[0]))){
                printf("NO");
                return 0;
            }
        }
    }
    printf("YES");
}
