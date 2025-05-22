
public class TriPrism<T extends Number> {

    private T length;
    private T base;
    private T height;

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    
    public double calculateVolume() {
        return length.doubleValue() * (0.5 * base.doubleValue() * height.doubleValue());
    }
}
    


