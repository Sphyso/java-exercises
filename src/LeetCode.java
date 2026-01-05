//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LeetCode {
    public static void main(String[] args) {
        int[] digits = {1,2,9};
        int lastNum = digits[digits.length - 1];
        int test = 0;
        // Check if last is nine
        if (lastNum != 9){
            int[] newDigits = new int[digits.length];
            test = digits.length;
        }else{
            int[] newDigits = new int[digits.length+1];
            test = digits.length+1;
        }
        int num = 0;

        for (int x = 0; x < digits.length; x++){
            num += digits[x];
        }
        System.out.println(test);
    }

    // 66. Plus One
    public int[] plusOne(int[] digits) {

        return digits;
    }
}