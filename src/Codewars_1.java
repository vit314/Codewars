import java.util.ArrayList;

public class Codewars_1 {
    public static void main(String[] args) {

//        System.out.println(sortDescSecond(635241));
        System.out.println(countSheeps(array1));
    }


    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        return Integer.parseInt(str);
    }

//Your task is to make a function that can take any non-negative integer as an argument
// and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

//    public static int sortDesc(final int num) {
//        if (num < 0) return num;
//
//        int sortedNumber = 0;
//
//        for (int i = 9; i >= 0; i--) {
//            int tmpNumber = num;
//            while (tmpNumber > 0) {
//                int digit = tmpNumber % 10;
//                if (digit == i) {
//                    sortedNumber *= 10;
//                    sortedNumber += digit;
//                }
//                tmpNumber /= 10;
//            }
//        }
//        return sortedNumber;
//    }

    public static int sortDescSecond(final int num) {
        if (num < 0) return num;

        String baseNumber = Integer.toString(num);

        int n = baseNumber.length();

        char[] temp = new char[n];
        for (int i = 0; i < n; i++) {
            if (temp[n - i - 1] > baseNumber.charAt(i)) {

                temp[n - i - 1] = baseNumber.charAt(i);
            }
        }
        String str = String.copyValueOf(temp);

        int sortedNumber = Integer.parseInt(str);
        return sortedNumber;
    }

    //    Write a function which converts the input string to uppercase.
    static String makeUpper(String str) {
        String newStr = str.toUpperCase();
        return newStr;
    }

    // the solution so that it reverses the string passed into it.

    public static String revString(String str) {
        int n = str.length();
        char[] temp = new char[n];
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
        return String.copyValueOf(temp);
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //We need a function that counts the number of sheep present in the array (true means present).

    static Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != false && arrayOfSheeps[i] != null)
                count++;
        }
        return count;
    }

    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean value : arrayOfSheeps) {
            if (value.booleanValue()) {
                count++;
            }
        }
        return count;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code h
        int getIn = 0;
        int getOff = 0;
        for (int[] stop : stops) {
            getIn += stop[0];
            getOff += stop[1];
        }
        return getIn - getOff;
    }

    //string repeat
    public static String repeatStr(final int repeat, final String string) {
        String rep = "";
        for (int i = 0; i <= repeat; i++) {
            rep += string;
        }
        return rep;
    }

    //This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            n *= 8;
        } else {
            n *= 9
            ;
        }
        return n;
    }

    //Square(n) Sum
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }

    //Return Negative
    public static int makeNegative(final int x) {
        int neg = 0;
        if (x > 0) {
            neg = -x;
        } else {
            neg = x;
        }
        return neg; // Your code here.
    }

    //Returning Strings
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";

    }

    //https://www.codewars.com/kata/5601409514fc93442500010b/java

}


