import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[m][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c=0,p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==b[0][0]){
                    for(int s=i,t=0;s<i+m&&t<m;s++,t++){
                        for(int u=j,v=0;u<j+m&&v<m;u++,v++){
                            if(a[s][u]==b[t][v]){
                                c++;
                            }
                        }
                    }
                }
                if(c==m*m){
                    p=1;
                }
                c=0;
            }
        }
        System.out.printf((p==1)?"TRUE":"FALSE");
	}
}