package com.demo.FileReader;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args) {
        String filename="Sanjeeb.txt";
        try(FileReader file=new FileReader(filename)){
            int read=0;
            do{
                read=file.read();
                System.out.print((char) read);
            }while(read!=-1);
        }catch (IOException e){
            System.out.printf("An error occurred %3s",e.getMessage());
        }
    }
}
