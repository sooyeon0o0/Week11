public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.start();
        car.openSunroof();
        car.engine.run();

        Bike bike = new Bike();
        bike.color = "blue";
        bike.start();
        bike.backBreak();
        System.out.println(car.toString());
        // 오브젝트 클래스
    }
}

// 상속과 포함관계가 각각인 이유

// 1. 개발은 여러명에서 함 -> 구역을 나눠서 규칙을 제한걸어두기
// 2. 유지 보수 측면

class Vehicle {
    String color;

    void start() {
        System.out.println("차량이 출발합니다.");
    }
}

class Car extends Vehicle {  // Car 클래스는 Vehicle을 상속받음
    Engine engine = new Engine();
    void openSunroof() {
        System.out.println("선루프를 엽니다.");
    }
}

class Bike extends Vehicle {
    Engine engine = new Engine();
    void backBreak() {
        System.out.println("Hold BackBreak");
    }
}

class Engine {
    void run() {
        System.out.println("엔진이 작동합니다.");
    }
}