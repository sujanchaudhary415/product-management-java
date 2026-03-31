class Electronics extends Products {
    private String brand;

    Electronics(String name, int price, int id,String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    
    public void display() {
        super.displayBasic();
        System.out.println("Brand: " + brand);
    }
}