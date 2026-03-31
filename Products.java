abstract class Products {
    private String name;
    private double price;
    private int id;
    private double discount;

    Products(String name, double price, int id, double discount) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void showDiscount() {
        if (discount > 0) {
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("No discount");
        }
    }

    public void displayBasic() { // <-- add this polymorphism
        System.out.println("Name: " + name + " Price: " + price + " Id: " + id);
        showDiscount();
    }

    public abstract void display();  //abstract method
}