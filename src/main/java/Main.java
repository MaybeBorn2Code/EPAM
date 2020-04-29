import Lesson11.MyException;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws MyException {
        final Scanner scanner = new Scanner(System.in);
        final Aquarium aquarium = new Aquarium();
        System.out.print("Please, enter the number of fish to add ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; ++i) {
            System.out.print("enter name of " + i + " fish: ");
            String kindOfFish = scanner.next();
            System.out.print("color: ");
            String color = scanner.next();
            System.out.print("What type of food fish prefer: ");
            String feed = scanner.next();
            System.out.print("price for one fish: ");
            int price = scanner.nextInt();
            Fish fish = new Fish(kindOfFish, color, feed, price);
            aquarium.addFish(fish);
        }
        System.out.println("press 1 to show fish in aquarium");
        System.out.println("press 2 to remove fish from the aquarium");
        System.out.println("press 3 to change kind of fish");
        System.out.println("press 4 to change color of fish");
        System.out.println("press 5 to feed fish");
        System.out.println("press 6 to close program");
        while (true) {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    aquarium.printAll();
                    break;
                case 2: {
                    try {
                        aquarium.removeFish(0);
                        break;
                    } catch (Exception e) {
                        System.out.println("No more fishes in aquarium");
                        break;
                    }
                }
                case 3: {
                    System.out.println("Press number of fish to change kind of fish to Guppy");
                    try {
                        int num = scanner.nextInt();
                        aquarium.changeKindOfFish(num, "Guppy");
                        aquarium.printAll();
                        break;
                    } catch (Exception e) {
                        System.out.println("Fish with this number does not exist");
                        break;
                    }
                }
                case 4: {
                    System.out.println("Press number of fish to change color to black");
                    try {
                        int num = scanner.nextInt();
                        aquarium.changeColor(num, "black");
                        aquarium.printAll();
                        break;
                    } catch (Exception e) {
                        System.out.println("Fish with this number does not exist");
                        break;
                    }
                }
                case 5: {
                    System.out.println("Choose fish to feed");
                    try {
                        int num = scanner.nextInt();
                        aquarium.feedTheFish(num);
                        break;
                    } catch (Exception e) {
                        System.out.println("Fish with this number does not exist");
                        break;
                    }
                }
                case 6: {
                    System.out.println("press 6 again to quit");
                    int num = scanner.nextInt();
                    break;
                }
            }
            if (input == 6) {
                System.out.println("Closing...");
                break;
            }
        }
    }
}