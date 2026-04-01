class Clothes extends Products implements Discountable {
    private String size;
    private double discount;

    Clothes(String name, double price, int id, double discount, String size) {
        super(name, price, id);
        this.size = size;
        this.discount = discount;
    }

    @Override
    public double applyDiscount() {
        return getPrice() - discount;
    }

    @Override
    public void display() {
        super.displayBasic();
        System.out.print("\nSize: " + size);
        System.out.println(discount>0?"Final Price "+applyDiscount():" No discount");
    }

}
