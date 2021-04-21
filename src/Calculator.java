/**
 * Description: This class is for calculating a and b
 *
 * @author Peien Liu
 * @version April 21th 2021
 */

import javax.swing.*;
import java.util.ArrayList;

public class Calculator {
    ArrayList<Double> u = new ArrayList<>();
    ArrayList<Double> x1 = new ArrayList<>();
    ArrayList<Double> x2 = new ArrayList<>();
    ArrayList<Double> aCalList = new ArrayList<>();
    ArrayList<Double> bCalList = new ArrayList<>();
    double a, b;


    Calculator() {
        //call set data to transfer value
        setData();
        //call equation to calculate a and b
        equation();
    }

    void setData() {
        //using loop to get all data
        for (int i = 0; i < SpreadsheetReader.getLength(); i++) {
            u.add(SpreadsheetReader.getu(i));
            x1.add(SpreadsheetReader.getx1(i));
            x2.add(SpreadsheetReader.getx2(i));
        }
    }

    void equation() {
        //using loop to loop each value
        for (int i = 0; i < SpreadsheetReader.getLength(); i++) {
            //ln u = ln x1 * a + ln x2 * b. rearrange it
            b = (Math.log(x1.get(i)) - Math.log(u.get(i))) / (Math.log(x1.get(i)) - Math.log(x2.get(i)));
            //get a
            a = 1 - b;
            //print a and b
            System.out.println(a);
            System.out.println(b);
            //add a and b to the arraylist
            aCalList.add(a);
            bCalList.add(b);
        }
        //pop up the message for result
        JOptionPane.showMessageDialog(null, "a: " + aCalList + "\nb: " + bCalList);
    }

}
