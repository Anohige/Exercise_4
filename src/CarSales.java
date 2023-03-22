class Car {
    private String model,brand,year,color;
    private float price,quantity;
    public Car(String Model,String Brand,String Year,float Price,String Color,float Quantity){
        model=Model;
        brand=Brand;
        year=Year;
        price=Price;
        color=Color;
        quantity=Quantity;
    }
    void setModel(String givenModel){
        model=givenModel;
    }
    void setBrand(String givenBrand){
        brand=givenBrand;
    }
    void setYear(String givenYear){
        year=givenYear;
    }
    void setPrice(float givenPrice){
        price=givenPrice;
    }
    void setColor(String givenColor){
        color=givenColor;
    }
    void setQuantity(float givenQuantity){
        quantity=givenQuantity;
    }
    String getModel(){
        return model;
    }
    String getBrand(){
        return brand;
    }
    String getYear(){
        return year;
    }
    String getColor(){
        return color;
    }
    float getPrice(){
        return price;
    }
    float getQuantity(){
        return quantity;
    }
    public String toString(){
        return model+" "+brand+" "+year+" "+price+" "+color+" "+quantity;
    }
    void sell(){
        System.out.println("The details are: ");
        System.out.println(getModel()+" "+getBrand()+" "+getYear()+" "+getPrice()+" "+getColor()+" "+getQuantity());
        setQuantity(quantity-1);
        System.out.println("The new details after sale is: ");
        System.out.println(toString());
    }

}

public class CarSales {
    public static void main(String[] args) {
        Car c = new Car("Sonet","Kia","2021",140000,"White",20);
        System.out.println(c.toString());
        c.sell();
    }
}
