import  java.math.BigInteger;

public class LeetCode {
    public static void main(String[] args) {
        // used to convert to a string
        int[] digits = {9,8,7,6,5,4,3,2,1,0};

        LeetCode lc = new LeetCode();
        lc.plusOne(digits);

    }

    // 66. Plus One
    public int[] plusOne(int[] digits) {
        String numberString = "";

        // convert to a string so I can add one
        for (int x = 0; x < digits.length; x++){
            numberString += Integer.toString(digits[x]);
        }

        // convert str to num and add one
        // then convert back
        // int not ideal, double returns scientific notation
        //long number = Long.parseLong(numberString);
        BigInteger number = new BigInteger(numberString);
        number += 1;
        numberString = "";
        numberString += Long.toString(number);

        // returned array with new length
        int[] newDigits = new int[numberString.length()];

        for (int x = 0; x < numberString.length(); x++){
            newDigits[x] = Character.getNumericValue(numberString.charAt(x));
            System.out.println(newDigits[x]);
        }

        return newDigits;
    }
}