class Products {
    private String name;
    private double price;
    private int id;

    Products(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public void price(double price) {
        this.price = price;
    }


    public void display() {   // <-- add this polymorphism
        displayBasic();
    }

    public void displayBasic() {
       System.out.println("Name: " +name + " Price: " +price+ " Id: " +id);
    
    }
}