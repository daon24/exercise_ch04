public class EX4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i=0; i< str.length(); i++){
            char num = str.charAt(i);
            int num2 = num - '0';
            sum += num2;
        }
        System.out.println(sum);
        }

}
