class Clothes extends Products{
    private String size;

    Clothes(String name,int price,int id,String size){
        super(name,price,id);
        this.size=size;
    }

    public void display()
    {
        super.displayBasic();
        System.out.print("  Size: " +size);
    }

}
