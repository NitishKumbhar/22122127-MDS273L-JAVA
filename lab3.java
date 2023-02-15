import java.util.Arrays;
import java.util.Scanner;

public class lab3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Length Of The Array: ");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.print("Enter The Elements Of The Array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Menu: ");
        System.out.println("1: Find The Mean Value ");
        System.out.println("2. Find The Median Value ");
        System.out.println("3. Find The Mode Value ");
        System.out.print("Enter your Choice (1-3): ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                double mean = computeMean(array);
                System.out.printf("Mean: %.2f", mean); //%.2f it is used for double or float 
                break;
            case 2:
                double median = computeMedian(array);
                System.out.printf("Median: %.2f", median);
                break;
            case 3:
                int mode = computeMode(array);
                System.out.printf("Mode: %d", mode);  // %d it is used for integer types
                break; 
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static int computeMode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;

    }
       
    

    private static double computeMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            int mid = array.length / 2;
            return (array[mid - 1] + array[mid]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }
        

    private static double computeMean(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
        
    }

}



        


    
