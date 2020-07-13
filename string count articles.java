/* input: i am a girl of a man
output: 2
*/ 


import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Matcher m=Pattern.compile("(?i)\\b((a)|(an)|(the))\\b").matcher(str);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.print(count);
    }
}