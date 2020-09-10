package geekbrains.homework;

public class Main {

	public static void main(String[] args) {
		Cat[] cats = {
				new Cat("Барсик", 10),
				new Cat("Мурзик", 20),
				new Cat("Рыжик", 5),
				new Cat("Васька", 15)
		};
		Plate plate = new Plate(40);
		for (int i = 0; i < cats.length; i++) {
			cats[i].eat(plate);
			cats[i].isHunger();
		}
		plate.addFood(50);
	}
}
