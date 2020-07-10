/*input: 60@2 120@3
output: 36.00 kmph
expla: 60+120=180, 2+3=5, 180/5=36.00
*/


#include <bits/stdc++.h>
 
using namespace std;

int main(int argc, char** argv)
{
    int n,d;
    double sum=0.0,s1=0.0;
    while(scanf("%d@%d",&n,&d)>0){
        sum+=n;
        s1+=d;
    }
    double av=sum/s1;
    printf("%.2lf kmph",av);
}