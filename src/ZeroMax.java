import java.util.Arrays;

public class ZeroMax {

//    public static void main(String[] args) {
////        ZeroMax zm  = new ZeroMax();
////        int[] masive = {0, 4, 0, 3};
////        masive = zm.zeroMax(masive);
////        for (int m : masive){
////            System.out.print(m + " ");
////        }
//        ZeroMax zeroMax  = new ZeroMax();
//        int[] res = zeroMax.zeroMax(new int[]{0,5,0,3});
//        System.out.println(Arrays.toString(res));
//
//    }


    public int[] zeroMax(int[] nums) {
        int max0dd = Integer.MIN_VALUE;
        boolean was0dd = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                max0dd = Math.max(nums[i], max0dd);
                was0dd = true;
            }
            if (nums[i] == 0 && was0dd) {
                nums[i] = max0dd;
            }
        }
        return nums;
    }


    public int zeroIndex(int[] mas, int index){
        int maxim = 0;
        for (int i = index; i<mas.length; i++)
        {
            if(maxim<mas[i] && mas[i]%2==1){
                maxim=mas[i];
            }
        }
        return maxim;
    }

}
