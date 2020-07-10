/*input: _kilo
output: _kilo
input: abcd_pqrs
output: dcba_pqrs
*/



#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    char s[100];
    scanf("%[^\n]",s);
    int in=0,p=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='_'){
            in=i;
        }else{
            p++;
        }
    }
    int l=strlen(s);
        if(p==l){
            for(int j=l-1;j>=0;j--){
                printf("%c",s[j]);
            }
        }else if(in==0){
            printf("%s",s);
        }else if(in==l-1){
            for(int j=l-2;j>=0;j--){
                printf("%c",s[j]);
            }
            printf("%c",s[in]);
        }else{
            for(int j=in-1;j>=0;j--){
                printf("%c",s[j]);
            }
            for(int k=in;k<l;k++){
                printf("%c",s[k]);
            }
        }
}