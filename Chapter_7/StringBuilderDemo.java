public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Java Programming");

      
        System.out.println("=== Initial State ===");
        System.out.println("sb1: \"" + sb1.toString() + "\"  | length = " + sb1.length() + " | capacity = " + sb1.capacity());
        System.out.println("sb2: \"" + sb2.toString() + "\"  | length = " + sb2.length() + " | capacity = " + sb2.capacity());

        sb1.setLength(10);   
        sb2.setLength(4);    
    }
}
