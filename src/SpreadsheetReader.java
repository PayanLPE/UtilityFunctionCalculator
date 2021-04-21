/**
 * Description: This class is for reading data from txt
 *
 * @author Peien Liu
 * @version April 21th 2021
 */

import java.io.*;
import java.util.ArrayList;

public class SpreadsheetReader {

    static ArrayList<Double> u = new ArrayList<>();
    static ArrayList<Double> x1 = new ArrayList<>();
    static ArrayList<Double> x2 = new ArrayList<>();

    SpreadsheetReader(int check) {
        try {
            //if file not exist, create it
            createFile();
            //read data
            readFile();
        } catch (IOException e) {
            //catch the program if theres an error
            e.printStackTrace();
        }
    }

    void createFile() throws IOException {
        File udata = new File("udata.txt"); //new txt file record the u
        udata.createNewFile();
        File x1data = new File("x1data.txt"); //new txt file record the x1
        x1data.createNewFile();
        File x2data = new File("x2data.txt"); //new txt file record the x2
        x2data.createNewFile();
    }

    void readFile() throws IOException {
        //object to read from the file "udata.txt"
        FileReader fru = new FileReader("udata.txt");
        //br to read u data
        BufferedReader bru = new BufferedReader(fru);
        //read line of data
        String temp = bru.readLine();
        while (temp != null) {
            //add data to x2 list
            u.add(Double.parseDouble(temp));
            //read next line
            temp = bru.readLine();
        }
        //object to read from the file "x1data.txt"
        FileReader frx1 = new FileReader("x1data.txt");
        // br to read x1 data
        BufferedReader brx1 = new BufferedReader(frx1);
        // read line of data
        temp = brx1.readLine();
        while (temp != null) {
            //add data to x2 list
            x1.add(Double.parseDouble(temp));
            // read next line
            temp = brx1.readLine();
        }
        //object to read from the file "x2data.txt"
        FileReader frx2 = new FileReader("x2data.txt");
        //br to read x2 data
        BufferedReader brx2 = new BufferedReader(frx2);
        //read line of data
        temp = brx2.readLine();
        while (temp != null) {
            //add data to x2 list
            x2.add(Double.parseDouble(temp));
            //read next line
            temp = brx2.readLine();
        }
    }

    //return length of array
    public static int getLength() {
        if (u.size() <= x1.size() && u.size() <= x2.size()) {
            return u.size();
        } else if (x1.size() <= u.size() && x1.size() <= x2.size()) {
            return x1.size();
        } else {
            return x2.size();
        }
    }

    //return u
    public static Double getu(int i) {
        return u.get(i);
    }

    //return x1
    public static Double getx1(int i) {
        return x1.get(i);
    }

    //return x2
    public static Double getx2(int i) {
        return x2.get(i);
    }

//    public static void writeData() throws IOException {
//        FileWriter fwa = new FileWriter("adata.txt");
//        PrintWriter fileOuta = new PrintWriter(fwa);
//        for (int i = 0; i < Calculator.aCalList.size(); i++) {
//            fileOuta.println(Calculator.aCalList.get(i));//adds to adata.txt
//        }
//        FileWriter fwb = new FileWriter("bdata.txt");
//        PrintWriter fileOutb = new PrintWriter(fwb);
//        for (int i = 0; i < Calculator.aCalList.size(); i++) {
//            fileOutb.println(Calculator.bCalList.get(i));//adds to bdata.txt
//        }
//    }

}
