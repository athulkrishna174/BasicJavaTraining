public class ArrayExmp {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
  
        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
           System.out.print(myList[i] + ", ");
        }
        System.out.println();

        for (double element: myList) {
            System.out.print(element + ", ");
         }
         System.out.println();


         // Print reverse array elements

        double[] revMyList = reverse(myList);

        for (double element: revMyList) {
            System.out.print(element + ", ");
        }
         System.out.println();


        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
           total += myList[i];
        }
        System.out.println("Total is " + total);
        
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
           if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);  
    }


    public static double[] reverse(double[] list) {
        double[] result = new double[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
