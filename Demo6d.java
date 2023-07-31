public class Demo6d {
    public static void main(String[] args) {
    
        System.out.printf("+------------+------------+-------------+%n");
        System.out.printf("| %-10s | %-10s | %-11s |%n", "ITEM", "QUANTITY", "PRICE");
        System.out.printf("+------------+------------+-------------+%n");

       
        System.out.printf("| %-10s | %10d | $%-10.2f |%n", "Apples", 5, 0.99);
        System.out.printf("| %-10s | %10d | $%-10.2f |%n", "Oranges", 10, 1.49);
        System.out.printf("+------------+------------+-------------+%n");
    }
}
