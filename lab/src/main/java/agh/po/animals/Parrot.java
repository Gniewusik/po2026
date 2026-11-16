package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Kra kra!");
    }
}