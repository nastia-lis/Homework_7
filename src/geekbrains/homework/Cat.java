package geekbrains.homework;

public class Cat {
    private String name;
    private int appetite;
    private int hunger;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        hunger = plate.getFood() - appetite;
        if (plate.getFood() < appetite) {
            System.out.println("Кот " + name + " не ест.");
        } else {
            System.out.println("Кот " + name + " ест...");
        }
        plate.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public boolean isHunger() {
        if (hunger <= 0) {
            System.out.println("Кот " + name + " голоден.");
            return false;
        } else {
            System.out.println("Кот " + name + " сыт.");
            return true;
        }
    }
}
