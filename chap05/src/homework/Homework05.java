package homework;

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};
        boolean game = true;
        int draw = 0;
        int win = 0;
        int lose = 0;
        int count = 0;


        while (true) {
            // 유저 입력
            System.out.print("가위바위보: ");
            String userChoice = sc.nextLine();

            // 유저 입력 유효성 검사
            if (userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보")) {
            } else if (userChoice.equals("stop")) {
                System.out.printf("%d전 %d승 %d무 %d패",count,win,draw,lose);
                draw = 0;
                win = 0;
                lose = 0;
                count = 0;
                game = false;
            } else{
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            // 컴퓨터 선택
            String cpuChoice = null;
            int chnum = (int) (Math.random() * 30) + 1;
            if (chnum > 1 && chnum <= 10) {
                cpuChoice = choices[0];
            } else if (chnum > 10 && chnum <= 20) {
                cpuChoice = choices[1];
            } else if (chnum > 20) {
                cpuChoice = choices[2];
            }

            System.out.println("컴퓨터: " + cpuChoice);
            System.out.println("사용자: " + userChoice);

            // 승부가르기
            // 가위
            if (userChoice.equals("가위")) {
                if (cpuChoice.equals("바위")) {
                    System.out.println("졌습니다.");
                    lose++;
                } else if (cpuChoice.equals("보")) {
                    System.out.println("이겼습니다.");
                    win++;
                }
            }
            // 바위
            if (userChoice.equals("바위")) {
                if (cpuChoice.equals("보")) {
                    System.out.println("졌습니다.");
                    lose++;
                } else if (cpuChoice.equals("가위")) {
                    System.out.println("이겼습니다.");
                    win++;
                }
            }
            // 보
            if (userChoice.equals("보")) {
                if (cpuChoice.equals("가위")) {
                    System.out.println("졌습니다.");
                    lose++;
                } else if (cpuChoice.equals("바위")) {
                    System.out.println("이겼습니다.");
                    win++;
                }
            }

            // 비김
            if (userChoice.equals(cpuChoice)) {
                System.out.println("비겼습니다");
                draw++;
            }

            count++;
        }
    }
}
