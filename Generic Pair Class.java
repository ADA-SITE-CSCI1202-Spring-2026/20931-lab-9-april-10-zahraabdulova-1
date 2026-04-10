public class Pair<T, U> {
    private T first;
    private U second;

    // Constructor to initialize the pair
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter methods
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Setter methods
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {
        // Testing Pair with different types
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Double, Float> pair2 = new Pair<>(2.5, 3.5f);

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
