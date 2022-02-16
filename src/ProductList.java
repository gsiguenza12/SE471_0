import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @@ - indicates comment to be deleted.
 *
 * @@implement from superclass?, import ArrayList?, Generics?
 */

public class ProductList<Product> implements List<Product> {

    private List<Product> productList;


    public ProductList(List<Product> productList) {
        this.productList = productList;
    }



    /****** @@Do we want public getters and setters for our product list? ******/


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /***** OVERRIDDEN METHODS FOR INTERFACE LIST *****/
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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

    @Override
    public boolean add(Product product) {
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
