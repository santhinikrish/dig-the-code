/*input: abcdexyzbwqpoolj
output: b
*/



#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    char s[100],hy='a';
    scanf("%[^\n]",s);
    int l=strlen(s);
    for(int i=0;i<l;i++){
        for(int j=i+1;j<l;j++){
            if(s[i]==s[j]){
                printf("%c",s[i]);
                hy='*';
                break;
            }
        }
        if(hy=='*'){
            break;
        }
    }
}
