public class Demo6c {
    public static void main(String[] args) {

        System.out.printf("+-----------------------+--------------------+-----------------+%n");
        System.out.printf("| %-21s | %-18s | %-15s |%n", "CITY", "STATE", "POPULATION");
        System.out.printf("+-----------------------+--------------------+-----------------+%n");

        System.out.printf("| %-21s          | %-18s          | \u001B[35m%,-15d\u001B[0m |%n", "\u001B[35mNew\u001B[0m York", "\u001B[35mNew\u001B[0m York", 8336817);
        System.out.printf("| %-21s | %-18s | \u001B[35m%,-15d\u001B[0m |%n", "Los Angeles", "California", 3966939);
       
        
        System.out.printf("+-----------------------+--------------------+-----------------+%n");
    }
}
