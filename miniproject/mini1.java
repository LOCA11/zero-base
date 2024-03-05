/*
    김병진
    과제1
    콘솔 화면에 구구단 출력하기
*/
공개 클래스 mini1 {
    공용 정적 보이드 메인(String[] args) {
        System.out.println("구구단 출력");
        (inti = 1; i <= 9; i++) {
 (int j = 1; j <= 9; j++) {
                System.out.printf("%02d x %02d = %02d%n", i, j, i * j);
            }
        }
    }
}
