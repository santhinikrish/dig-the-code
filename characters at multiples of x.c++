/*input : abcdexyzwqpoolj  5
output: eqj
*/

#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    char s[100];
    int n;
    scanf("%[^\n]",s);
    scanf("%d",&n);
    for(int i=0;i<strlen(s);i++){
        if((i+1)%n==0){
            printf("%c",s[i]);
        }
    }
}
