import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
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
            System.out.println("press 0 to close program");
            while (true) {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        aquarium.printAll();
                        break;
                    case 2: {
                        aquarium.removeFish(0);
                        break;
                    }
                    case 3: {
                        System.out.println("Press number of fish to change kind of fish to Guppy");
                        int num = scanner.nextInt();
                        aquarium.changeKindOfFish(num, "Guppy");
                        aquarium.printAll();
                        break;
                    }
                    case 4: {
                        System.out.println("Press number of fish to change color to black");
                        int num = scanner.nextInt();
                        aquarium.changeColor(num, "black");
                        aquarium.printAll();
                        break;
                    }
                    case 5: {
                        System.out.println("Choose fish to feed");
                        int num = scanner.nextInt();
                        aquarium.feedTheFish(num);
                        break;
                    }
                }
                if (input == 0) {
                    System.out.println("Closing program...");
                    break;
                }
            }
        }
    }

