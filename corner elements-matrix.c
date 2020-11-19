/*
The program must accept an integer matrix of size NxN and an integer K as the input.
The program must replace all the elements by the asterisk (*) other than the elements which are present in the upper right triangle, upper left triangle, lower left triangle and lower right triangle with the size K.
Finally, the program must print the modified matrix as the output.

Boundary Condition(s):
2 <= N <= 50
1 <= K <= N/2
1 <= Matrix element value <= 10^8

Input Format:
The first line contains the value of N.
The next N lines each contain N integers separated by space(s).
The (N+2)th line contains the value of K.

Output Format:
The first N lines each contain N integers of the modified matrix separated by a space.

Example Input/Output 1:
Input:
5
0 0 4 9 9
1 2 6 9 3
9 5 3 4 6
0 8 1 3 6
9 2 6 8 6
2
Output:
0 0 * 9 9
1 * * * 3
* * * * *
0 * * * 6
9 2 * 8 6
Explanation:
Here the K = 2, so replace all elements by the asterisk (*) other than the elements which are present in the upper right triangle, upper left triangle, lower left triangle and lower right triangle with the size 2.

Example Input/Output 2:
Input:
8
0 0 3 8 4 4 7 7
6 9 3 6 4 0 0 7
9 3 8 0 7 2 1 4
6 1 4 3 8 6 3 4
0 0 8 4 8 4 0 5
1 0 3 4 5 1 0 9
7 1 1 2 0 2 1 0
2 0 8 5 5 3 2 2
3
Output:
0 0 3 * * 4 7 7
6 9 * * * * 0 7
9 * * * * * * 4
* * * * * * * *
* * * * * * * *
1 * * * * * * 9
7 1 * * * * 1 0
2 0 8 * * 3 2 2
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k;
    scanf("%d\n",&n);
    long int m[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%ld ",&m[i][j]);
        }
        scanf("\n");
    }
    scanf("%d\n",&k);
    if(n-k<=k){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                printf("%ld ",m[i][j]);
            printf("\n");
        }
        return 0;
    }
    int dup=k;
    for(int i=0;i<=n/2;i++){
        for(int j=0;j<n;j++){
            if((j>=0 && j<k) || (j>=n-k && j<n))  continue;
            else  m[i][j]=-1;
        }
        k--;
    }
    for(int i=n-1;i>=n/2;i--){
        for(int j=0;j<n;j++){
            if(j>=0 && j<dup || j>=n-dup && j<n) continue;
            else  m[i][j]=-1;
        }
        dup--;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(m[i][j]==-1)  printf("* ");
            else  printf("%ld ",m[i][j]);
        }
        printf("\n");
    }
}


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k;
    scanf("%d\n",&n);
    int a[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d ",&a[i][j]);
        }
    }
    scanf("%d",&k);
    int count=k;
    for(int i=0;i<n;i++,printf("\n"))
    {
        for(int j=0;j<n;j++)
        {
            if(j<count || j>=n-count)
            {
                printf("%d ",a[i][j]);
            }
            else
            {
                printf("* ");
            }
        }
        if(i>=n-k)
        {
            count++;
        }
        else
        {
            count--;
        }
        if(i==n-k-1)
        {
            count=1;
        }
    }


}
