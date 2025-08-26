//public class EX4_12 {
//    public static void main(String[] args) {
//        for (int k = 0; k < 3; k++) {
//            Outer:
//            for (int i = 1; i <= 3; i++) {
//                for (int j = (k*3)+ 2; j <= 9; j++) {
//                    System.out.print(j + "*" + i + "=" + (j * i) + "    ");
//                    if (j == (k*3)+4) {
//                        System.out.println();
//                        continue Outer;
//                    }
//                }a
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println();
//        }
//
//    }
//}

public class EX4_12 {
    public static void main(String[] args) {
        // 1. 블록의 시작 단(2, 5, 8)을 제어하는 가장 바깥쪽 for문
        for (int startDan = 2; startDan <= 9; startDan += 3) {

            // 2. 곱하는 수(1, 2, 3)를 제어하는 중간 for문
            for (int i = 1; i <= 3; i++) {

                // 3. 한 줄에 출력될 단(2~4, 5~7, 8~9)을 제어하는 안쪽 for문
                for (int j = startDan; j < startDan + 3 && j <= 9; j++) {
                    System.out.print(j + "*" + i + "=" + (j * i) + "\t"); // \t로 간격 맞춤
                }
                // 한 줄 출력이 끝났으므로 줄바꿈
                System.out.println();
            }
            // 한 블록(예: 2~4단) 출력이 끝났으므로 빈 줄 추가
            System.out.println();
        }
    }
}