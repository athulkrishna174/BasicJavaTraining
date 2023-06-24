import java.util.Scanner;

class BoxStar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the box size: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();

    }
}