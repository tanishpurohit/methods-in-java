public class funton{
    public static void main(String args[]){
      helloworld();
      // funtion calling
      helloworld();
    }
    // functions ko remote me mute button ki tarah suppose karo
    // jo same operations karta bar bar when it's called
     static void helloworld(){
        // return type void cause kuch return ni kar ra 
        // just print kr ra 
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        // when return type is other than void i.e than must retun some interger value at last.....
       }

       // such functions which we write inside a class are methods....
       // just terminology functions and method are otherwise same...
}