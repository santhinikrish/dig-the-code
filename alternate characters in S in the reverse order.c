/*input: garden
output: erg
input: drive
output: eid
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    char a[strlen(s)];
    int k=0;
    for(int i=0;i<strlen(s);i+=2){
        a[k++]=s[i];
    }
    for(int i=k-1;i>=0;i--){
        printf("%c",a[i]);
    }
}
