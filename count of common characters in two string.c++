/*input: 
china
india
output:
3
input:
energy
every
output:
4
*/


#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    char a[100],b[100];
    scanf("%s\n%s",a,b);
    int l1=strlen(a);
    int l2=strlen(b);
    int f1[26]={0};
    int f2[26]={0};
    int i,c=0;
    for(i=0;i<l1;i++){
        f1[a[i]-'a']++;
    }
    for(i=0;i<l2;i++){
        f2[b[i]-'a']++;
    }
    for(i=0;i<26;i++){
        c+=(min(f1[i],f2[i]));
    }
    printf("%d",c);
}
