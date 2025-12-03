public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
        System.out.println("American Format");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
        System.out.println("European Format");
        System.out.println(date + " " + month + " " + year + ", " + day);
    }
    

    public static void main(String[] args) {
        // TODO: test methods
                String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, date, month, year);
        System.out.println(); // bos satir
        printEuropean(day, date, month, year);
    }
}
