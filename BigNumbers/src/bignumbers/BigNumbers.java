/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Феликс
 */
public class BigNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Input digit's");
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String readLine = reader.readLine();
        int[]readArr = new int[readLine.length()];
        for (int i=0; i<readLine.length(); i++){
            char ch = readLine.charAt(i);
            int val = Character.getNumericValue(ch);
            readArr[i] = val;
        }
        
        processingNum num = new processingNum(readArr);
        print(num);

    }
    
    static void print (processingNum iarr){
        for (int j=0; j<7; j++){
            //for (int i=0; i<iarr.totoPrint.length; i++)
            // System.out.print(iarr.toPrint[i][j]);
            for (String[] toPrint : iarr.toPrint) {
                System.out.print(toPrint[j]);
            }
            System.out.println("");
        }
    }
    
}
