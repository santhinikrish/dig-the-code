/*input: icecream 4 10
out: YES
expla: iceCreamiCecream
*/

#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    char s[100];
    scanf("%s",s);
    int l=strlen(s);
    int a,b;
    cin>>a>>b;
    a=a-1;b=b-1;
    if(a>=l){
        a=a%l;
    }
    if(b>=l){
        b=b%l;
    }
    if(s[a]==s[b]){
        cout<<"YES";
    }else{
        cout<<"NO";
    }
}
