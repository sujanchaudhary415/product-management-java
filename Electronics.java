class Electronics extends Products implements Discountable {
    private String brand;
    private double discount;
    

    Electronics(String name, double price, int id,double discount,String brand) {
        super(name, price, id);
        this.brand = brand;
        this.discount=discount;
    }

    @Override
    public double applyDiscount(){
           return getPrice()-(getPrice() * discount/100);
    }

    @Override
    public void display() {
        super.displayBasic();
        System.out.println("Brand: " + brand);
       System.out.println(discount>0?"Final Price "+applyDiscount():" No discount");
    }
}