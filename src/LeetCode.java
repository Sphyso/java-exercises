public class LeetCode {
    public static void main(String[] args) {
        // used to convert to a string
        int[] digits = {1,2,3};

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
        int number = Integer.parseInt(numberString);
        number += 1;
        numberString = "";
        numberString += Integer.toString(number);

        // returned array with new length
        int[] newDigits = new int[numberString.length()];

        for (int x = 0; x < numberString.length(); x++){
            newDigits[x] = Character.getNumericValue(numberString.charAt(x));
            //System.out.println(newDigits[x]);
        }

        return newDigits;
    }
}