public class Numeric<T extends Number> {

    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    // Method to return the reciprocal of the value
    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    // Method to return the fractional part of the value
    public double fractionalPart() {
        return value.doubleValue() - Math.floor(value.doubleValue());
    }

    // Method to check if absolute values of two different types are equal
    public static boolean areAbsoluteValuesEqual(Number num1, Number num2) {
        return Math.abs(num1.doubleValue()) == Math.abs(num2.doubleValue());
    }

    public static void main(String[] args) {
        // Test: Reciprocal and Fractional Part
        Numeric<Double> num1 = new Numeric<>(9.76);
        System.out.println("Reciprocal of 9.76: " + num1.reciprocal());
        System.out.println("Fractional part of 9.76: " + num1.fractionalPart());

        Numeric<Integer> num2 = new Numeric<>(5);
        Numeric<Float> num3 = new Numeric<>(-5.0f);

        // Test: Absolute Value Comparison
        System.out.println("Are absolute values of 5 and -5.0 equal? " + Numeric.areAbsoluteValuesEqual(num2.value, num3.value));
    }
} 
