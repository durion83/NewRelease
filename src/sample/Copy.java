package sample;

import java.io.IOException;

/**
 * Created by ahmad on 22-Nov-15.
 * Class to execute the Robocopy batch and pass parameters
 * parameters to be passed are Source, destination and copy log name
 */
public class Copy {

    public void StartCopy (String src,String dest,String log){

        String copyLog = log;
        String source = src;
        String destination = dest;

        try{
            Process p = Runtime.getRuntime().exec("cmd /c start D:/Java_Programs/NewRelease/batch/Copy.bat " + source + " " + destination + " "+ copyLog);
            p.waitFor();

        }catch (IOException e) {
            e.printStackTrace();


        }catch( InterruptedException e ){

        }

        try {
            Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
