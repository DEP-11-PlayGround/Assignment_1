public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minutes = 59;
        int second = 59;

        String reset = "\033[0m";

       
        System.out.printf("\033[31m%02d\033[0m/\033[32m%02d\033[0m/\033[34m%04d \033[31m%02d\033[0m:\033[36m%02d\033[0m:\033[32m%02d%s",
                          month, day, year, hour, minutes, second, reset);
    }
}
