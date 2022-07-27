import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cats paws count is "+Cat.PAWS_COUNT);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Lion();
        cats[2] = new Tiger();
//        for (int i = 0; i < cats.length; i++) {
//            cats[i].hunt();
//            System.out.println("covered distance " + cats[i].run(10 * i + 1));
//        }
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < cats.length; j++) {
                cats[j].setAgeInDays(i);
                cats[j].hasBirthday();
            }

        }

    }
}