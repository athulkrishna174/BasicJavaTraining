import java.util.Scanner;

class UndoExamp{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Editor editor = new Editor();
        int choice;

        do{
            System.out.print("1. Insert Content \n2. Undo \n3. Display content \n4. Exit \nEnter Your Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1:
                    System.out.print("Enter Content to Insert: ");
                    editor.setContent(scanner.nextLine());
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    System.out.println("\nContent: " + editor.getContent() + "\n");
                    break;
                case 4: 
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choice != 4);

        scanner.close();

    }
}