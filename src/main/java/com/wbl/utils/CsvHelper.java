package com.wbl.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CsvHelper {
	private static Logger Log = LogManager.getLogger(CsvHelper.class);
	
	public static String[][] getCSVData(String filename) throws IOException {
        String[][] arrayList = new String[2][2];
        int cols = 0;
        int rows = 0;
        String line;
        
        BufferedReader br = new BufferedReader(new FileReader(filename));
        Log.info("Cols: " + cols + " rows: " + rows);

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            
            while (st.hasMoreTokens()) {
                arrayList[rows][cols] = st.nextToken();
                cols++;
            }
            
            cols=0;
            rows++;
        }

        br.close();
        return arrayList;
    }
	 

}
