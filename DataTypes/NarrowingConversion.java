public class NarrowingConversion {
     public static void main(String[] args) {
          System.out.println("Narrowing conversion Example:");
          System.out.println("-----------------------------");
          double doubleValue2 = 123.456;
          float floatValue2 = (float) doubleValue2;
          long longValue2 = (long) floatValue2;
          int intValue2 = (int) longValue2;

          System.out.println("Double value: " + doubleValue2);
          System.out.println("Float value: " + floatValue2);
          System.out.println("Long value: " + longValue2);
          System.out.println("Int value: " + intValue2);
          System.out.println();
     }
}
