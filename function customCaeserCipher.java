/*
You are required to complete the given code. You can click on Run anytime to check the compilation/execution status of the program.
You can use printf to debug your code. The submitted code should be logically/syntactically correct and pass all test cases.
Do not write the main() function as it is not required.

Code Approach: For this question, you will need to complete the code as in the given implementation. We do not expect you to modify the approach.

The function/method customCaesarCipher accepts two arguments
- key and message, an integer representing the key to be used to encrypt the given message and a string representing the message to be encrypted.

The function/method customCaesarCipher must return a string containing the encrypted message. If the value of key is less than 0, the function/method must return the string value "INVALID INPUT" .

The encryption algorithm is given below.
- Each alphabet in the message must be shifted by key number of places down the alphabets.
- Each digit in the message must be shifted by key number of places down the digits.
- For all other characters in the message, they remain the same.

Note: The English alphabet set and the digits (0 to 9) must be considered in a cyclic fashion for the encryption.
Your task is to complete the code in customCaesarCipher so that it passes all the test cases.

Example Input/Output 1:
Input:
1
All is well. #45.9K Tweets
Output:
Bmm jt xfmm. #56.0L Uxffut
Explanation:
Here the given string is All is well. #45.9K Tweets and the key value is 1.
After shifting all the alphabets and digits in the string by 1, the string becomes Bmm jt xfmm. #56.0L Uxffut
Hence the output is Bmm jt xfmm. #56.0L Uxffut

Example Input/Output 2:
Input:
4
Good bye... Mr. XYZ
Output:
Kssh fci... Qv. BCD

Example Input/Output 3:
Input:
-2
SkillRack
Output:
INVALID INPUT
*/

public static String customCaesarCipher(int key, String message)
{
    if(key<0) return "INVALID INPUT";
    char s[]=message.toCharArray();
    String a="";
    for(int i=0;i<message.length();i++)
    {
        int n=key;
        if(Character.isLetter(s[i]))
        {
            while(n>0)
            {
                if(s[i]=='z' || s[i]=='Z') s[i]-=26;
                s[i]++;
                n--;
            }
        }else if(s[i]>='0' && s[i]<='9')
        {
            while(n>0)
            {
                if(s[i]=='9') s[i]='0';
                else s[i]++;
                n--;
            }
        }
        a+=s[i];
    }
    return a;
}
