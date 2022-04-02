import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private static String hamletData;
    static String hamletReg = "\\bHamlet\\b";
    static String horatioReg = "\\bHoratio\\b";
    String leon = "Leon";
    static String tariq = "Tariq";

    public HamletParser(){
        this.hamletData = loadFile();
    }




    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public static void findHamlet() {
        Pattern pattern = Pattern.compile(hamletReg);
        Matcher matcher = pattern.matcher(hamletData);
        if (matcher.find()){
            System.out.println("found hamlet");
        }else{
            System.out.println("no hamlet");
        }
    }

    public static String findHoratio(String hamletData) {
        Pattern pattern = Pattern.compile(horatioReg);
        Matcher matcher = pattern.matcher(hamletData);
        if (matcher.find()){
            System.out.println("found horatio");
        }else{
            System.out.println("no horatio");
        }
    }

}
