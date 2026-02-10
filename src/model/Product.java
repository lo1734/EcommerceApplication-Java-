package model;



public class Product {
    private int id;
    private String name;
    private Category category;
    private double price;
    private int stock;

    public Product(int id, String name, model.Category category, double price, int stock){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.stock=stock;
    }

    public int getId() { return id;}
    public String getName(){ return name; }
    public Category getCategory() {return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setStock(int stock){
        this.stock=stock;
    }

    public void reduceStock(int quantity){
        this.stock -= quantity;
    }

    public String toString(){
        return id + ", " + name + ", "+category+", "+price+", current stock : "+stock;
    }
}
