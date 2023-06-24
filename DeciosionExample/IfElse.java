public class IfElse {
    public static void main(String args[]) {
        int x = 30;
        int y = 20;
  
        if( x == 10 ) {
           System.out.println("Value of X is 10");
        }else if( x == 20 ) {
           System.out.println("Value of X is 20");
        }else if( x == 30 ) {
            if ( y == 20){
                System.out.println("Value of X is 30 and Y is 20");
            }else {
                System.out.println("Value of X is 30");
            }
        }else {
           System.out.println("This is else statement");
        }
     }
}
