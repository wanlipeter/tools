package synctool.model.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wanli on 2019/6/5.
 */
public class CmdUtils {
    public static void main(String[] args) throws IOException {
    }

    public static String executeCmd(String command) throws IOException {
        System.out.println("Execute command : " + command);
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd /c " + command);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
        String line = null;
        StringBuilder build = new StringBuilder();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            build.append(line);
        }
        return build.toString();
    }

}
