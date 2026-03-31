import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagement productmanagement = new ProductManagement();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------PRODUCT MANAGEMENT------");
            System.out.println("1. Add Clothes");
            System.out.println("2. Add Electronics");
            System.out.println("3. Display Products");
            System.out.println("4. Exit the program");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> productmanagement.addClothes();
                case 2 -> productmanagement.addElectronics();
                case 3 -> productmanagement.displayProducts();
                default -> System.out.println("Enter the valid choice");

            }
        } while (choice != 4);
    }
}