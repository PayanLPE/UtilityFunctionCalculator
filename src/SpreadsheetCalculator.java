/**
 * Description: This is main class of reading data from txt and calculate the a and b from utility
 *
 * @author Peien Liu
 * @version April 21th 2021
 */

public class SpreadsheetCalculator {
    public static void main(String[] args) {
        //read data
        new SpreadsheetReader(1);
        //calculate data
        new Calculator();
    }
}
