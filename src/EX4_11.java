public class EX4_11 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1+","+num2);

        for(int i=0; i<8; i++){
            num3 = num1+num2;
            System.out.print(","+num3);
            num1 = num3 - num1; //num1 은 num2가 된다
            num2 = num3; //num2는 num3가 된다

        }
    }
}
