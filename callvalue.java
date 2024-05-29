import java.util.Scanner;
//s call by value means actual values are caleed
// a copy is made by function not the actual parameter is passed
//so change is only limited in that function not in the whole class
public class callvalue {

    static void swap(int a, int b){
       int tem=a;
       a=b;
       b=tem;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      swap(a,b);
      
      System.out.println("a = "+ a);
      System.out.println("b = "+ b);
      // no swapping done cause change in function only
      // this is called call by value
      //in java all functions have call by value means copy of original term is passed......
        }
    
}
