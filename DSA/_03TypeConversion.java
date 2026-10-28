
/**
 * Topic: Type Conversion in Java
 * Description: Understanding widening (implicit) type conversion.
 */
public class _03TypeConversion {

    public static void main(String[] args) {

        // 1. Type Conversion / Widening Conversion / Implicit Conversion
        // A smaller compatible data type is automatically converted
        // into a larger compatible data type.

        // Widening conversion order:
        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double

        // 2. Example of Widening Conversion

        int num = 100;

        // An int value is automatically converted into a double.
        double result = num;

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + result);


        // 3. Type Compatibility
        // The source type must be compatible with the destination type
        // for an implicit conversion to be allowed.

        int number = 25;
        long largeNumber = number; // Valid: int to long

        System.out.println("Long value: " + largeNumber);


        // 4. Destination Type
        // The destination type must be able to accommodate the source type
        // under Java's widening conversion rules.

        byte smallNumber = 10;
        int convertedNumber = smallNumber; // Valid: byte to int

        System.out.println("Converted number: " + convertedNumber);

    }
}
