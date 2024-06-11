package Leetcode_Problems;

public class Reverse_Integer {

        public int reverse(int n) {

            long temp = 0;

            while(n != 0 ){



                int rem = n % 10;
                temp = temp * 10 + rem;
                n /= 10;


                if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) temp;
        }
    }

