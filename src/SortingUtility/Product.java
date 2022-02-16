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

