public class EsempioCicli {
    public static void main(String[] args) {

        // System.out.println("For Loop:");

        // for (int x = 0; x < 11; x++) {
        // System.out.println("X is:" + " " + x);
        // }
        // System.out.println("");

        // System.out.println("Do-while Loop:");

        // int x = 0;
        // do {

        // System.out.println("X is:" + " " + x);
        // x++;

        // } while (x < 11);

        // for (int x = 3; x < 100; x + 3) {
        // for (int x = 3; x < 100; x++) {

        // if(x % 3 == 0){
        // System.out.println("X is: " + x);
        // }

        // }
        System.out.println("******************************************************************");
        // System.out.println("FizzBuzz");
        // System.out.println("");

        // for (int i = 1; i < 100; i++) {

        // // if (i % 15 == 0) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.println("Number is: " + i + " FIZZBUZZ");

        // } else if (i % 3 == 0) {
        // System.out.println("Number is: " + i + " FIZZ");

        // } else if (i % 5 == 0) {
        // System.out.println("Number is: " + i + " BUZZ");

        // } else {
        // System.out.println("Number is: " + i);
        // }

        // }

        System.out.println("******************************************************************");
        int[] nums = new int[5];
        int x = 10;
        int mag = 0;
        int maxNumber = nums[0];
        int minNumber = nums[0];
        double avarageValue = 0;

        // SET ARRAY
        for (int y = 0; y < nums.length; y++) {

            nums[y] = x;
            x += 10;
            System.out.println(nums[y]);
        }

        System.out.println("-----------------------------------------------------");
        // SOMMA DI TUTTI I NUMERI
        double ss = sum(nums);
        System.out.println("la somma e': " + ss);

        System.out.println("-----------------------------------------------------");
        // CHECK MAX NUMBER
        for (int y = 1; y < nums.length; y++) {

            if (nums[y] > maxNumber) {

                maxNumber = nums[y];
            }

        }
        System.out.println("The Max number is: " + maxNumber);

        System.out.println("-----------------------------------------------------");
        // CHECK MIN NUMBER
        for (int y = 1; y < nums.length; y++) {

            if (nums[y] < minNumber) {

                minNumber = nums[y];
            }
        }
        System.out.println("The Min number is: " + minNumber);
        System.out.println("Goodbye Jojo!");

        System.out.println("-----------------------------------------------------");
        // Average Value
        for (int y = 1; y < nums.length; y++) {
            avarageValue = ss / nums.length;
        }
        System.out.println("The Average Value number is: " + avarageValue);

    }

    private static int sum(int[] s) {
        int sum = 0;

        for (int y = 0; y < s.length; y++) {

            sum += s[y];
        }
        return sum;
    }

}
