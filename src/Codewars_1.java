import java.util.ArrayList;
import java.util.List;

public class Codewars_1 {
    public static void main(String[] args) {

//        System.out.println(sortDescSecond(635241));
//        System.out.println(Arrays.toString(reverse(5)));
        System.out.println(digitize(12345));
    }

//    Write a method that takes an array of characters and reverses the letters in place.

    static String reverse(String str) {
        int n = str.length();

        char[] temp = new char[n];
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);

        }
        return String.copyValueOf(temp);
    }

    //
//    public static String stringToNumber(String str) {
//        //TODO: Convert str into a number
//        return Integer.parseInt(str);
//    }

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
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != false && arrayOfSheep != null)
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

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }

        double ave = sum / classPoints.length;
        if (yourPoints > ave) {
            return true;
        } else {
            return false;
        }
    }


    //Abbreviate a Two Word Name
    public static String abbrevName(String name) {
        int ws = name.lastIndexOf(' ');
        return name.substring(0, 1).toUpperCase() + "." + name.substring(ws + 1, ws + 2).toUpperCase();
    }


    //Beginner Series #2 Clock
    public static int Past(int h, int m, int s) {

        int ms = 1000;
        return h * 3600 * ms + m * 60 * ms + s * ms;
    }

    //Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
    public static String doubleChar(String s) {

        return s.replaceAll(".", "$0$0");
    }

    //Given an array of ones and zeroes, convert the equivalent binary value to an integer.

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String str = "";

        for (int i = 0; i < binary.size(); i++) {
            str += binary.get(i);
        }
        return Integer.parseInt(str, 2);
    }

    //Calculate BMI

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        String str = "";

        if (bmi <= 18.5) {
            str = "Underweight";
        } else if (bmi <= 25.0 && bmi > 18.5) {
            str = "Normal";
        } else if (bmi <= 30.0 && bmi > 25.0) {
            str = "Overweight";
        } else if (bmi > 30.0) {
            str = "Obese";
        }

        return str;
    }

    //Find the stray number
    //https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

    static int stray(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[0]) {
                num = numbers[i];
            }
        }
        return num;
    }

    //Beginner Series #4 Cockroach
    //https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java

    public int cockroachSpeed(double x) {
        double res = x * 100000 / 3600;
        int resInt = (int) res;
        return resInt;
    }

    //Basic Mathematical Operations
    //https://www.codewars.com/kata/57356c55867b9b7a60000bd7/java

    public static Integer basicMath(String op, int v1, int v2) {
        int res = 0;
        if (op.equals("+")) {
            res = v1 + v2;
        } else if (op.equals("-")) {
            res = v1 - v2;
        } else if (op.equals("*")) {
            res = v1 * v2;
        } else if (op.equals("/")) {
            res = v1 / v2;
        }
        return res;
    }

    //You only need one - Beginner
    //https://www.codewars.com/kata/57cc975ed542d3148f00015b/java

    public static boolean check(Object[] a, Object x) {
        boolean res = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                res = true;
            }
        }
        return res;
    }

    //Switch it Up!
    //https://www.codewars.com/kata/5808dcb8f0ed42ae34000031/train/java

    public static String switchItUp(int number) {
        String res = "";
        switch (number) {
            case 1:
                res = "One";
                break;
            case 2:
                res = "Two";
                break;
            case 3:
                res = "Three";
                break;
            case 4:
                res = "Four";
                break;
            case 5:
                res = "Five";
                break;
            case 6:
                res = "Six";
                break;
            case 7:
                res = "Seven";
                break;
            case 8:
                res = "Eight";
                break;
            case 9:
                res = "Nine";
                break;
            case 0:
                res = "Zero";
                break;
        }
        return res;
    }

    //Volume of a Cuboid
    //https://www.codewars.com/kata/58261acb22be6e2ed800003a/train/java

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }

    //List Filtering
    //https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

    public static List<Object> filterList(final List<Object> list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                result.add(list.get(i));
            }
        }
        return result;
    }

//Remove First and Last Character
//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java

    public static String remove(String str) {
        String res = "";
        for (int i = 1; i < str.length() - 1; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    //Find Maximum and Minimum Values of a List
    //https://www.codewars.com/kata/577a98a6ae28071780000989/train/java

    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    //Reversed sequence
    //https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

    public static int[] reverse(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = n - i;
        }
        return res;
    }

    //Third Angle of a Triangle
    //https://www.codewars.com/kata/5a023c426975981341000014/train/java
    public static int otherAngle(int angle1, int angle2) {

        return 180 - angle1 - angle2;
    }

    //Sum Arrays
    //https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    //Parse nice int from char problem
    //https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java

    public static int howOld(final String herOld) {
        String res = String.valueOf(herOld.charAt(0));

        return Integer.parseInt(res);
    }

    //Grasshopper - Grade book
    //https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        char res = 0;
        if (90 <= score && score <= 100) {
            res = 'A';
        } else if (80 <= score && score < 90) {
            res = 'B';
        } else if (70 <= score && score < 80) {
            res = 'C';
        } else if (60 <= score && score < 70) {
            res = 'D';
        } else if (0 <= score && score < 60) {
            res = 'F';
        }

        return res;
    }

    public static String reverString(String s) {
        int n = s.length();
        char[] temp = new char[n];
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = s.charAt(i);
        }
        return String.copyValueOf(temp);
    }

    //Find the first non-consecutive number
    //https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                return array[i + 1];
            }
        }
        return null;
    }

    //Quarter of the year
    //https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java

    public static int quarterOf(int month) {
        if (month <= 3) {
            return 1;
        } else if (month <= 6) {
            return 2;
        } else if (month <= 9) {
            return 3;
        } else
            return 4;
    }


    //Are they the "same"?
    //https://www.codewars.com/kata/550498447451fbbd7600041c/train/java

    public static boolean comp(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] * a[i] == b[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//    FIXME: Replace all dots
    //https://www.codewars.com/kata/596c6eb85b0f515834000049/train/java

    public static String replaceDots(final String str) {
        return str.replaceAll(".", "-");
    }

    //Remove exclamation marks
    //https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java

    static String removeExclamationMarks(String s) {
        return s.replaceAll("\\!", "");
    }

    //Remove String Spaces
    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }


    //Grasshopper - Summation
//https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java

    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //Growth of a Population
    //https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 = p0 + (int) (p0 * percent / 100) + aug;
            years++;
        }

        return years;
    }

    //Rock Paper Scissors!
    //https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
    public static String rps(String p1, String p2) {
        String sc = "scissors";
        String pa = "paper";
        String ro = "rock";
        String p1Won = "Player 1 won!";
        String p2Won = "Player 2 won!";
        String draw = "Draw!";

        if (p1 == sc && p2 == pa) {
            return p1Won;
        } else if (p1 == pa && p2 == ro) {
            return p1Won;
        } else if (p1 == ro && p2 == sc) {
            return p1Won;
        } else if (p1 == ro && p2 == ro) {
            return draw;
        } else if (p1 == pa && p2 == pa) {
            return draw;
        } else if (p1 == sc && p2 == sc) {
            return draw;
        } else
            return p2Won;
    }

    //Opposite number
    //https://www.codewars.com/kata/56dec885c54a926dcd001095/train/java
    public static int opposite(int number) {
        return -number;
    }

//Invert values
    //https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/java

    public static int[] invert(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] += -array[i];
        }

        return res;
    }

    //Reverse words
    //https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java

    //Thinkful - Logic Drills: Traffic light
    //https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java

    public static String updateLight(String current) {
        String r = "red";
        String y = "yellow";
        String g = "green";
        if (current == r ) {
            return g;
        } else if (current == y) {
            return r;
        } else
            return y;
    }

    //Convert number to reversed array of digits
    //https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java

    public static int[] digitize(long n) {
        String str = String.valueOf(n);
        int strLen = str.length();
        int[] result = new int[strLen];
        for (int i = 0; i < strLen; i++) {
            result[i] = (int) (str.charAt(strLen - i - 1)) - 48;
        }
        return result;
    }

}





