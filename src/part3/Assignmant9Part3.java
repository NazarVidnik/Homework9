
static void printString(String s){
    if (s.isEmpty()){
        return;
    }
    IO.println(s.charAt(0));
    printString(s.substring(1));
}
static void printReverseString(String s){
    if (s.isEmpty()){
        return;
    }
    IO.println(s.charAt(s.length()-1));

    printReverseString(s.substring(0, s.length() - 1));
}
static String ReverseString(String s){

    if (s.isEmpty()) {
        return "";
    }
    return ReverseString(s.substring(1)) + s.charAt(0);
}

public static void main(String[] args){

String row = "abcdefghij";
    printString(row);
    IO.println(" ");
    printReverseString(row);
    String s=ReverseString(row);
    IO.println(" ");
    IO.println(s);
}