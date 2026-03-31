class Electronics extends Products {
    private String brand;

    Electronics(String name, int price, int id,double discount,String brand) {
        super(name, price, id,discount);
        this.brand = brand;
    }

    @Override
    public void display() {
        super.displayBasic();
        System.out.println("Brand: " + brand);

    }
}