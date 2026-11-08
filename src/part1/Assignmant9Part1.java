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
            IO.println("Invalid! Must be between 1 and 999\n");
        }
    }
    return value;
}

static void printNumberBackward(int n){
    if (n>0){
    IO.println(n);
    n--;
    printNumberBackward(n);}
    else return;
};
static void printNumbers(int n) {
    if (n <= 0) return; // базовий випадок
    printNumbers(n - 1);
    IO.println(n);
}
static void recurse(){
    recurse();
}

public static void main(String[] args) {

    IO.println("Enter integer number between 1 and 999");
    int n = getValidInputSafe(1,999);
    printNumberBackward(n);
    IO.println("again");
    printNumbers(n);



}
