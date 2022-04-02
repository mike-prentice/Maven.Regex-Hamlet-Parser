import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private static String hamletData;
    static String hamletReg = "[H, h][A, a][M, m][L, l][E, e][T, t]";
    static String horatioReg = "[H,h][O, o][R, r][A, a][T, t][I, i][O, o]";
    static String leon = "Leon";
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

    public static String findAndChangeHamlet() {
        Pattern pattern = Pattern.compile(hamletReg);
        Matcher matcher = pattern.matcher(hamletData);
        hamletData = matcher.replaceAll(leon);
        return hamletData;
    }

    public static String findAndChangeHoratio() {
        Pattern pattern = Pattern.compile(horatioReg);
        Matcher matcher = pattern.matcher(hamletData);
        hamletData = matcher.replaceAll(tariq);
       return hamletData;

    }

    public static void print() {
        System.out.println(hamletData);
    }

}

