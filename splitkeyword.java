import java.util.*;
public class splitkeyword{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Splitting a secntence
        String a=sc.nextLine();
        String sp[]=a.split(",");
        System.out.println(Arrays.toString(sp));
    }
}