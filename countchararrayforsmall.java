import java.util.*;
public class countchararrayforsmall{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a="pushpa";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++){
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c));
    }
}