import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("소나타", 200, "휘발유"),
                new Car("테슬라 모델3", 250, "전기"),
                new Bicycle("일반 자전거", 30, false),
                new Bicycle("전동 킥보드", 50, true),
                new Bus("시내버스", 100, 45),
                new Bus("고속버스", 150, 30)
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 교통수단 관리 시스템 ===");
            System.out.println("1. 전체 목록 보기");
            System.out.println("2. 상세 정보 보기");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            String input = sc.nextLine();

            if (input.equals("0")) {
                System.out.println("종료합니다.");
                break;
            } else if (input.equals("1")) {
                System.out.println("\n--- 전체 목록 ---");
                for (int i = 0; i < vehicles.length; i++) {
                    System.out.println((i + 1) + ". " + vehicles[i].getName());
                }
            } else if (input.equals("2")) {
                System.out.print("번호 선택: ");
                int idx = Integer.parseInt(sc.nextLine()) - 1;
                System.out.println(vehicles[idx].getInfo());
            }
        }
        sc.close();
    }
}



