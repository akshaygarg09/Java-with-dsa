public class array {
    public static void main(String[] args) {
        int[] array = {34, 78, 12, 89, 23, 56, 99, 1, 45};
        
        int largest = array[0];
        int smallest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
