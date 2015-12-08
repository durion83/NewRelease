package sample;

import java.io.File;


/**
 * Created by ahmad on 22-Nov-15.
 * Class to execute the Robocopy batch and pass parameters
 * parameters to be passed are Source, destination and copy log name
 */
public class Copy {

    private String src;
    private String dest;
    private String log;

    public void StartCopy() throws Exception {

        System.out.println(dest);

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
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        String s = String.valueOf(dest);
        this.dest = s;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
