package sample;

import java.io.*;

public class Main {


    public static void main(String[] args)throws IOException  {
        AddBranch test = new AddBranch();
        test.setBname("G1");
        test.setIp("10.10.10.10");

        File log = new File("/Users/Alkandri/Desktop/projects/boubyan/NewRelease/NewRelease/testText.txt");
        try{
            if(log.exists()==false){
                System.out.println("We had to make a new file.");
                log.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(log,true));
            out.append(test.getBname() + ',' +test.getIp()+  "\n");
            out.close();
        }catch(IOException e){
            System.out.println("COULD NOT write the log!!");
        }



    }
}
