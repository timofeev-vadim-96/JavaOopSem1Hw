//Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать. Подумать и сделать так, чтобы классы, не умеющие
// летать, в итоговом коде летать не должны, не плавающие - не плавать, и т.д.

/**
 * Плавают: рыба, утка, собака
 * Бегают: кот, собака, утка
 * Летают: утка, птеродактиль :)
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        Cat cat2 = new Cat();
        cat2.setName("Пушистик");
        animals.add(cat2);
        Animal fish1 = new Fish("Barabulya");
        animals.add(fish1);
        animals.add(new Duck("Гусь"));
        animals.add(new Dog("Жопка"));
        Animal pterosaur = new Pterosaur("Pterodactyl");
        animals.add(pterosaur);
        for(Animal a: animals){
            a.toFly();
            a.toSwim();
            a.toGo();
        }
    }

}