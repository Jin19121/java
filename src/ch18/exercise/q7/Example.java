package ch18.exercise.q7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch02/sec01/VariableUseExample.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNumber + "\t" + rowData);
            rowNumber++;
        }

        br.close();
        fr.close();
    }
}
