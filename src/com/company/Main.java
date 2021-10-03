package com.company;

public class Main {

    public static void main(String[] args) {
        int nums[] = {-10, -1, 1, 4, 6, -2};
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int min_i = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int num = nums[i];
                nums[i] = nums[min_i];
                nums[min_i] = num;
                System.out.println(num);
            }
        }
    }
}
