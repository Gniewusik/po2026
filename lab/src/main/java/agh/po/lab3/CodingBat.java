package agh.po.lab3;

public class CodingBat {
    public boolean array123(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat(); // Poprawiono nazwę klasy

        System.out.println("wynik: " + codingBat.array123(new int[]{1, 2, 3, 4, 5, 6}));
    }
}

