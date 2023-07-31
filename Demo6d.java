public class Demo6d {
    public static void main(String[] args) {
    
        System.out.printf("+------------+------------+-------------+%n");
        System.out.printf("| %-10s | %-10s | %-11s |%n", "ITEM", "QUANTITY", "PRICE");
        System.out.printf("+------------+------------+-------------+%n");

       
        System.out.printf("| %-10s | \u001B[34m%10d\u001B[0m | \u001B[32m$\u001B[0m\u001B[31m%-10.2f\u001B[0m |%n", "Apples", 5, 0.99);
        System.out.printf("| %-10s | \u001B[34m%10d\u001B[0m | \u001B[32m$\u001B[0m\u001B[31m%-10.2f\u001B[0m |%n", "Oranges", 10, 1.49);
        System.out.printf("+------------+------------+-------------+%n");
    }
}