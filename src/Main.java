public class Main {
    public static void main(String[] args) {
        Car2 car2 = new Car2("blue","tesla");
        System.out.println(car2.color);
    }
}

class Car2 {
    String color; // 생성자의 컬러
    String maker;
    Car2(String color, String maker) {
        System.out.println("Car 객체가 생성됨");
        this.color = color; //메소드의 컬러
        this.maker = maker;
    }
}