package SortingUtility;

/**
 * ABC Company SortingUtility.ProductList class. Has at least 3 attributes.
 *
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 * @author
 * @author
 *
 * @@ - indicates comment to be deleted.
 * TODO: ADD YOUR INFORMATION TO AUTHOR LIST
 */

import java.util.*;


public class ProductList<Product> implements List<Product> {

    private ArrayList<Product> items;
    private Product temp;

    public ProductList(List<Product> productList) {
        this.items = (ArrayList<Product>) productList;
    }

    public ProductList() {
        items = new ArrayList<Product>();
    }


    /****** @@Do we want public getters and setters for our product list? ******/


    public List<Product> getProductList() {
        return items;
    }

    public void setProductList(List<Product> productList) {
        this.items = (ArrayList<Product>) productList;
    }


    /***** OVERRIDDEN METHODS FOR INTERFACE LIST *****/
    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    /**
     * TODO: Test this method.
     * @param product
     * @return
     */
    public boolean add(Product product) {
        // cannot access Product members directly. must use getClass().methodCall()
        if(product != null) {
            items.add(product);
        }
        else{
            System.out.println("invalid Product passed in parameter!");
            System.exit(0);
        }


        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Product get(int index) {
        return null;
    }

    @Override
    public Product set(int index, Product element) {
        return null;
    }

    @Override
    public void add(int index, Product element) {

    }

    @Override
    public Product remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Product> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return null;
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return null;
    }
    /***** END OF OVERRIDDEN METHODS FOR INTERFACE LIST *****/

}
