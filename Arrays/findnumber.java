public class array1 {

    public static int findnumbers(int nums[]){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int numberofdigit = digit(num);
        return numberofdigit % 2 == 0;
    }

    public static int digit(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String argc[]){
        int nums[] = {12,345,2,6,7896};
        int result = findnumbers(nums);
        System.out.println("Count of even digit numbers: " + result);
    }
}
