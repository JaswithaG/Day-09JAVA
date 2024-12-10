import java.util.*;
public class loweranduppercaseletters{
    public static void main(string args[]){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s&32)==0)
        System.out.println("Upper case:");
        else
        System.out.println("lower case:");
    }
}