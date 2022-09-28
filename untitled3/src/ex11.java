import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ex11 {

    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Student.POLCOL\\Desktop\\111.txt"));
            while (strLine != null)
            {
                if (strLine == null)
                    break;
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        }catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }catch (IOException e) {
            System.err.println("Файл прочитан");
        }
    }
}
