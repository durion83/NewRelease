package sample;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ahmad on 22-Nov-15.
 * Class to execute the Robocopy batch and pass parameters
 * parameters to be passed are Source, destination and copy log name
 */
public class Copy {

    private String src;
    private String dest;
    private String log;

    public void setVar(String src, String dest, String log) {
        this.src = src;
        this.dest = dest;
        this.log = log;

    }

    public void StartCopy() throws Exception {

        try {
            String[] cmd = new String[6];
            cmd[0] = "cmd";
            cmd[1] = "/C";
            cmd[2] = new File("").getAbsolutePath()+"/batch/Copy.bat";//D:/Java_Programs/NewRelease/
            cmd[3] = src;
            cmd[4] = dest;
            cmd[5] = log;

            Runtime rt = Runtime.getRuntime();

            Process proc = rt.exec(cmd);

            // any error message?
            copyResult errorStream = new copyResult(proc.getErrorStream(), "ERROR");

            // any output? Here We take return or output value from bach file
            copyResult outputStream = new copyResult(proc.getInputStream(), "OUTPUT");

            // kick them off
            errorStream.start();
            outputStream.start();

            // any error???
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);

        } catch (Throwable t) {
            t.printStackTrace();
        }


//        String copyLog = log;
//        String source = src;
//        String destination = dest;
//
//        try{
//            Process p = Runtime.getRuntime().exec("cmd /c start D:/Java_Programs/NewRelease/batch/Copy.bat " + source + " " + destination + " "+ copyLog);
//            p.waitFor();
//
//        }catch (IOException e) {
//            e.printStackTrace();
//
//
//        }catch( InterruptedException e ){
//
//        }
//
//        try {
//            Thread.sleep(3000);                 //1000 milliseconds is one second.
//        } catch(InterruptedException ex) {
//            Thread.currentThread().interrupt();
//        }
    }


}
