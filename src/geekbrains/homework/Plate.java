package geekbrains.homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
        if (food < amount) {
            System.out.println("Недостаточно еды!");
        } else {
            System.out.println("Поел!");
        }
    }

    public void addFood(int amount) {
        this.food += amount;
        System.out.println("Добавили " + amount + " еды.");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
