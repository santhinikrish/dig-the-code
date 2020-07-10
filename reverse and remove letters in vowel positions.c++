/*input: environment
output: nenrine
*/

#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    char s[50];
    scanf("%s",s);
    int l=strlen(s),a[50],k=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='a'||s[i]=='e'||s[i]=='o'||s[i]=='u'||s[i]=='i'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'){
            a[k++]=i;
        }
    } 
    char c[50],le=0;
    for(int i=l-1;i>=0;i--){
        c[le++]=s[i];
    }
    for(int i=0;i<le;i++){
        int p=0;
        for(int j=0;j<k;j++){
            if(i==a[j]){
                p=1;
                break;
            }
        }
        if(p==0){
            printf("%c",c[i]);
        }
    }
}