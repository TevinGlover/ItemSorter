package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
long id;
String name;
Double price;
    public Item(){
    }

    public Item(Long id, String name, Double price) { // constructor
        //method statement
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = 0L;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        price = 0.0;
    }
}
