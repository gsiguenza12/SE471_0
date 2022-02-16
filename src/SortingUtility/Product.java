package SortingUtility;

import java.util.Comparator;


/**
 * ABC Company SortingUtility.Product class. Has at least 3 attributes.
 *
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 * @author
 * @author
 *
 * @@ - indicates comment to be deleted.
 * TODO: ADD YOUR INFORMATION TO AUTHOR LIST
 */
public class Product {
    private String ID;
    private String name;
    private double price;

    Product(String setID){
        this.ID = setID;
    }

    Product(String ID, String name, double price){
        setAll(ID,name,price);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAll(String ID, String name, double price){
        this.ID = ID;
        this.name = name;
        this.price = price;

    }
}

// helper class
class SortByID implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getID().compareTo(o2.getID());
    }
}

class SortByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        double difference = o1.getPrice() - o2.getPrice();
        if(difference > 0.0001){return 1;}
        return -1;  // else difference is less than, return -1;
    }
//    Since Java 8 you can also use this:
//    Comparator<someClass> cp = (a, b) ->  Double.compare(a.getScore(), b.getScore());
//    Comparator<someClass> cp = Comparator.comparing(someClass::getScore);
}