
public class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;

    public void setValues(T length, T base, T height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public T getLength() {
        return length;
    }

    public T getBase() {
        return base;
    }

    public T getHeight() {
        return height;
    }

    public double calculateVolume() {
        return length.doubleValue() * (0.5 * base.doubleValue() * height.doubleValue());
    }
}
    
