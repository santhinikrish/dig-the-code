/*input: 45102
output: 3
*/

#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int n;
    cin>>n;
    int t=n,sum=0;
    while(t>0){
        sum+=(t%10);
        t/=10;
    }
    if(sum>9){
        cout<<(sum%9);
    }else{
        cout<<sum;
    }
}
