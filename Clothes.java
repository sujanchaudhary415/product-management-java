class Clothes extends Products{
    private String size;

    Clothes(String name,int price,int id,double discount,String size){
        super(name,price,id,discount);
        this.size=size;
    }


    @Override
    public void display()
    {
        super.display();
        System.out.print("  Size: " +size);
    
    }

}
