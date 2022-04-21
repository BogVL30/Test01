package Lesson7;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppData {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
            StringBuilder sb = new StringBuilder();

            sb.append("Value 1;");
            sb.append("Value 2;");
            sb.append("Value 3");
            sb.append(System.getProperty("line.separator"));

            sb.append("111;");
            sb.append("222;");
            sb.append("333");
            sb.append(System.getProperty("line.separator"));

            sb.append("333;");
            sb.append("222;");
            sb.append("111");

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        AppData testCSV = new AppData();
        testCSV.readCSVFile();
    }

    public void readCSVFile() {
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}