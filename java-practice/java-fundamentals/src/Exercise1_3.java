public class Exercise1_3 {
    public static void main(String[] args) {
        int number = 10;
        int before = ++number;
        int after = number++;

        System.out.println(number); // 12
        System.out.println(before); // 11
        System.out.println(after); // 11
    }
}
