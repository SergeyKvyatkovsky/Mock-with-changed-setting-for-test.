import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException, ParseException {
            System.out.println("Hello World");
            Util util = new Util();
            /**
             * If you work on the os linux , you will need create *.sh file.
             */
            boolean isWindows = System.getProperty("os.name")
                    .toLowerCase().startsWith("windows");
            System.out.println(isWindows);
            Runtime rt = Runtime.getRuntime();
            rt.exec(new String[]{"cmd.exe","/c","start",".\\src\\main\\resources\\run_wiremock.bat"});
            for(int i = 0;i < 2942430;i++){
                System.out.println("Номер цикла " + i);
            }
            rt.exec(new String[]{"cmd.exe","/c","start",".\\src\\main\\resources\\close_all_cmd.bat"});
            for(int a = 0;a < 10000;a++){
                System.out.println("Открываем консоль" + a);
            }
            rt.exec(new String[]{"cmd.exe","/c","start",".\\src\\main\\resources\\run_wiremock.bat"});
            util.methodParse();
        }
}
