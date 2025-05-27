package Programmen;

public class bubbleSort {
    public static void main(String[] args) {

        int[] nums ={1,5,2,8,3,4};

        printArray(nums);
        bubbleSort(nums);
        printArray(nums);
    }

    public static void bubbleSort(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }

    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}