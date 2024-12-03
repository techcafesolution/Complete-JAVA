package com.demo.FileWriter;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) {
        String fileName="Sanjeeb.txt";
        String write="This is the best course in JAVA...";
        try(FileWriter file=new FileWriter(fileName)){
            file.write(write);
            file.flush();
            System.out.println("File written successfully...");
        }catch (IOException e){
            System.out.printf("An error occurred...%d",e.getMessage());
        }
    }
}
