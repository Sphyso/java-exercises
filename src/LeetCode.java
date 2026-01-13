import  java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

public class LeetCode {
    public static void main(String[] args) {
        LeetCode lc = new LeetCode();

        // 66. Plus One
        /*
        used to convert to a string
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        lc.plusOne(digits); */

        // 961. N-Repeated Element in Size 2N Array
        /*
        Dictionary where key is num and value is occurrence
        int[] nums = {1,8,3,8};
        System.out.println(lc.repeatedNTimes(nums)); */

        // 1390. Four Divisors
        //Approach eliminate all non-possible values first.
        int[] nums = {21,4,7};

        int[] primeNumbers = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89, 97, 101};
        for (int x = 0; x < nums.length; x++)
        {
            if (nums[x] < 6)
            {
                continue;
            }
        }

    }


    // 1390. Four Divisors
    public int sumFourDivisors(int[] nums) {
        return 0;
    }

    // 961. N-Repeated Element in Size 2N Array
    public int repeatedNTimes(int[] nums)
    {
        HashMap <Integer, Integer> occur = new HashMap<>();
        for (int x = 0; x < nums.length; x++)
        {
            if (occur.containsKey(nums[x]))
            {
                int value = occur.get(nums[x]);
                value += 1;
                occur.put(nums[x], value);
            }else
            {
                occur.put(nums[x], 1);
            }
        }

        int maxValue = Collections.max(occur.values());
        int max = 0;

        for (Integer i : occur.keySet())
        {
            if (occur.get(i) == maxValue)
            {
                max = i;
            }
        }

        return max;
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
        number = number.add(BigInteger.valueOf(1));
        numberString = "";
        numberString += number.toString();
        System.out.println(numberString);
        // returned array with new length
        int[] newDigits = new int[numberString.length()];

        for (int x = 0; x < numberString.length(); x++){
            newDigits[x] = Character.getNumericValue(numberString.charAt(x));
        }

        return newDigits;
    }
}