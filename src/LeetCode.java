//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LeetCode {
    public static void main(String[] args) {
        // used to convert to a string
        int[] digits = {1,2,3};
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


        System.out.println(numberString);
    }

    // 66. Plus One
    public int[] plusOne(int[] digits) {

        return digits;
    }
}