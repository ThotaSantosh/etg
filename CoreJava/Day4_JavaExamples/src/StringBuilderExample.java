
public class StringBuilderExample {


public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Welcome Thota Santosh");
    
    System.out.println("Size of string: " + sb.length());
    System.out.println("Original string: " + sb);
    System.out.println("Char at index 3: " + sb.charAt(3));
    System.out.println("Index of string 'to' : " + sb.indexOf("to"));
    System.out.println("Last index of string 'to' : " + sb.lastIndexOf("os"));
    System.out.println("Substring from index 5: " + sb.substring(5));
    System.out.println("Substring ranging between index 5 and 10: " + sb.substring(5, 10));
    sb.delete(2, 8);
    System.out.println("String after delete operation: " + sb);
    System.out.println("String after deleteCharAt operation: " + sb);
    sb.replace(2, 4, "Hello");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.append(" sonata");
    System.out.println(sb);
    sb.insert(2, "Hello");
    System.out.println(sb);

    
  }
}