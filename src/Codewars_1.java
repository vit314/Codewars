public class Codewars_1 {
    public static void main(String[] args) {

//        System.out.println(sortDescSecond(635241));
        System.out.println(revString("olleh"));
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





}


