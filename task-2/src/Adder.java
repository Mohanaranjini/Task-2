public class Adder {
    public static <T extends Number> T add(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else if (num1 instanceof Short) {
            return (T) Short.valueOf((short) (num1.shortValue() + num2.shortValue()));
        } else if (num1 instanceof Byte) {
            return (T) Byte.valueOf((byte) (num1.byteValue() + num2.byteValue()));
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        double sum2 = add(3.5, 2.5);
        float sum3 = add(2.5f, 3.5f);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}