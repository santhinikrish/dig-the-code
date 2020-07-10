/*input: FILIPEK
output: 4
*/


#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    string s;
    getline(cin,s);
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s[i]=='T'||s[i]=='L'||s[i]=='F'||s[i]=='D'){
            c*=2;
        }
    }
    cout<<c;
}
