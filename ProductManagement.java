import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Products> products = new ArrayList<>();

    // add clothes
    public void addClothes() {
        System.out.println("Enter the clothe name");
        String name = sc.nextLine();

        System.out.println("Enter the price");
        int price = sc.nextInt();

        System.out.println("Enter the id");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the size");
        String size = sc.nextLine();

        Clothes clothes = new Clothes(name, price, id, size);
        products.add(clothes);

    }

    // add Electronics
    public void addElectronics() {
        System.out.println("Enter the Electronics name: ");
        String name = sc.nextLine();

        System.out.println("Enter the price: ");
        int price = sc.nextInt();

        System.out.println("Enter the Id: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the brand: ");
        String brand = sc.nextLine();

        Electronics electronics = new Electronics(name, price, id, brand);
        products.add(electronics);

    }

    // display all products
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Data is Empty");
        }
        for (Products product : products) {
            product.display();
        }
    }
}
