public class animals {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.color = "grey";
        cat.eat();
        cat.grooming();
        cat.walking.pet();

        Dog dog = new Dog();
        dog.color = "black";
        dog.eat();
        dog.digging();
        dog.walking.pet();
    }
}

class Animal {
    String color;

    Walking walking = new Walking();
    void eat() {
        System.out.println("이 동물의 색상은 " + color);
        System.out.println("사료를 먹습니다.");
    }
}

class Cat extends Animal {

    Walking walking = new Walking();
    void grooming() {
        System.out.println("그루밍합니다.");
    }

}

class Dog extends Animal {

    Walking walking = new Walking();
    void digging() {
        System.out.println("땅을 파기 시작합니다.");
    }
}

class Walking {
    void pet() {
        System.out.println("반려동물이 됐습니다.");
    }
}