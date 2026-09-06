import java.util.Scanner;

public class CSVParser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String csv = sc.nextLine();

        printFields(csv);
    }

    static void printFields(String csv) {

        String[] fields = csv.split(",");

        for (String field : fields) {
            System.out.println(field);
        }
    }
}
