import java.util.*;
// parameteres are used to clearly state inputs to a function
// while return type and return statement denotes for its output
public class parameter {

    static int  calculatesum(int num1 , int num2){
      // num1.num2 are formal parameters used in function definition

        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      // passed on values to a functions i.e, here a and b are arguments or Actual parameter
      int sum = calculatesum(a,b);
      // this sum is different variable cause in different functions 
      // we 'll study it in topic scope
      System.out.println(sum);
    }
}


// functions also require some memory in form of call stack 
// stake frames are formed w.r.t each functions
// main>>>>>string variable stored
//sum>>>>>> integer worth variable stored
