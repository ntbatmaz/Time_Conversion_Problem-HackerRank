import java.io.*;
import java.util.*;
public class Time_Conversion_Problem{

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String time = s;
        String result;
        String format=time.substring(8,10);
        String hour =time.substring(0,2);
        String memory = time.substring(2,8);
        int changehour = Integer.parseInt(hour);
        if(format.equals("PM") && !hour.equals("12")){
            changehour = changehour + 12;
            hour = Integer.toString(changehour);
            result = hour + memory;
         }else if(format.equals("AM") && hour.equals("12")){
             
             changehour = 0;
             hour = Integer.toString(changehour);
             result = "0" + hour + memory;
         
         }else{
             result = s.substring(0,8);
         }
        return result;

    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
