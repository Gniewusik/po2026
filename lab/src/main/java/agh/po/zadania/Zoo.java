package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];


    public void fillRandomly() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    animals[i] = new Parrot("Papuga " + i);
                    break;
                case 1:
                    animals[i] = new Dog("Pies " + i);
                    break;
                default:
                    animals[i] = new Snake("Waz " + i);
                    break;
            }
        }
    }

    public int countLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillRandomly();

        for (Animal animal : zoo.animals) {
            int legs = animal.getLegs();
            System.out.println(animal.getDescription());
            animal.makeSound();
        }

        System.out.println("Suma nóg wszystkich zwierząt: " + zoo.countLegs());
    }
}