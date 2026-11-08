import java.util.Scanner;
static Scanner cin = new Scanner(System.in); //scanner initialization

public static int getValidInputSafe(int min, int max) {
    int value = 0;
    while (value<min||value>max) {

        // First, make sure it's a number
        while (!cin.hasNextInt()) {//cin.hasNextInt() returns true if the next input can be read as an integer, false otherwise.
            IO.println("That's not a number! Try again:");
            cin.next();
            IO.println(cin);
        }

        value = cin.nextInt();
        // Then check if it's in range
        if (value<min||value>max) {
            IO.println("Invalid! Must be between " + min + " and " + max);
        }
    }
    return value;
}
static int findCountInArray(int[] array, int what, int i) {
    if (i >= array.length) {
        return 0; // елементи закінчилися
    }

    int match = (array[i] == what) ? 1 : 0;

    return match + findCountInArray(array, what, i + 1);
}
static void printArray(int[] array, int i){
    if (i >= array.length) {
        return ; // елементи закінчилися
    }else {
        IO.println(array[i]);
        printArray(array, i+1);
    }
}
static  int arraySum(int[] array, int i){
    if (i >= array.length) {
        return 0; // елементи закінчилися
    }
    int sum=array[i];
    return sum+ arraySum(array,i+1);

}
public static void main(String[] args) {
    IO.println("Enter array size (1–100):");
    int size = getValidInputSafe(1, 100);

    int[] numbers = new int[size];

    for (int i = 0; i < numbers.length; i++) {
        IO.println("Enter element " + (i + 1) + " (1–999):");
        numbers[i] = getValidInputSafe(1, 999);
    }

    IO.println("Your array:");
    printArray(numbers, 0);

    IO.println("sum of the elements of array = "+arraySum(numbers,0));

    IO.println("Enter number that you looking for in array between 1 and "+numbers.length);
    int what = getValidInputSafe(1,999);

    int count = findCountInArray(numbers, what, 0);
    IO.println(count);


}