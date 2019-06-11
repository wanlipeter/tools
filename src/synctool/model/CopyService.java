package synctool.model;

import synctool.model.utils.CmdUtils;

import java.io.IOException;

/**
 * Created by wanli on 2019/6/5.
 */
public class CopyService {
    public static void main(String[] args) throws IOException {

    }

    public static String copylog(){
        //组装cmd
        String cmd = "cmd /c";
        String enterdir = "cd %localappdata%/Fangcloud";
        String xcopy = "xcopy /C Log %systemdrive%%homepath%\\desktop\\Fangcloud_log\\";
        String finalcmd = cmd + enterdir + "&" +xcopy;
        //调用cmd复制
        try {
            String result = CmdUtils.executeCmd(finalcmd);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }
    }

    public static String copydata(){
        //组装cmd
        String cmd = "cmd /c";
        String enterdir = "cd %appdata%";
        String xcopy = "xcopy /C Fangcloud %systemdrive%%homepath%\\desktop\\Fangcloud_log\\";
        String finalcmd = cmd + enterdir + "&" +xcopy;
        //调用cmd复制
        try {
            String result = CmdUtils.executeCmd(finalcmd);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }

    }

}
