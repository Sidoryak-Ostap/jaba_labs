public class Main {

    public static int getNextGap(int gap){
        gap = (gap*10)/13;
        if(gap < 1){
            return 1;
        }
         return gap;
    }


    public static void sort(int[] arr){
        int n = arr.length;

        int gap = n;

        boolean swapped = true;

        while (gap != 1 || swapped){
            gap = getNextGap(gap);
            swapped = false;
            for(int i = 0; i<n-gap; i++){
                if(arr[i]> arr[i+gap]){
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{5,2,-6,15,-44,2,1,77};

        System.out.println("Before");
        for(int num : numbers){
            System.out.println(num);
        }

        sort(numbers);

        System.out.println("After");
        for(int num : numbers){
            System.out.println(num);
        }



    }
}