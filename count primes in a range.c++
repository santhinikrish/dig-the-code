/*input: 6142 6200
output: 6
*/


#include <bits/stdc++.h>

using namespace std;
bool prime(int n){
    if(n==0||n==1){
        return false;
    }
    else if(n==2){
        return true;
    }else if(n%2==0){
        return false;
    }
    for(int i=3;i*i<=n;i+=2){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
int main(int argc, char** argv)
{
    int a,b,c=0;
    cin>>a>>b;
    for(int i=a;i<=b;i++){
        if(prime(i)){
            c++;
        }
    }
    cout<<c;
}
