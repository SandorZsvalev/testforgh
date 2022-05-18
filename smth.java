public class smth {
    public static void main(String[] args) {
        System.out.println(getSum(10,15));
    }
    public static int getSum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
ср