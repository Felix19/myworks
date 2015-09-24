/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bignumbers;

/**
 *
 * @author Феликс
 */
public class processingNum {
    int[] usrNum;
    public String[][] toPrint;
        
    processingNum(int[] usrNum){
        this.usrNum = usrNum;
        toPrint = new String[usrNum.length][7];
        sortval();
    }
    void sortval() {
        for (int i = 0; i < usrNum.length; i++) {

            int num = usrNum[i];
            switch (num) {
                case 1:
                    String one[] = new String[7];
                    one[0] = "   1   ";
                    one[1] = "  11   ";
                    one[2] = " 1 1   ";
                    one[3] = "   1   ";
                    one[4] = "   1   ";
                    one[5] = "   1   ";
                    one[6] = " 11111 ";
                    System.arraycopy(one, 0, toPrint[i], 0, 7);
                    break;

                case 2:
                    String two[] = new String[7];
                    two[0] = " 222  ";
                    two[1] = "2   2 ";
                    two[2] = "   2  ";
                    two[3] = "  2   ";
                    two[4] = " 2    ";
                    two[5] = "2     ";
                    two[6] = "22222 ";
                    System.arraycopy(two, 0, toPrint[i], 0, 7);
                    break;
                case 3:
                    String three[] = new String[7];
                    three[0] = " 333  ";
                    three[1] = "3   3 ";
                    three[2] = "   3  ";
                    three[3] = " 333  ";
                    three[4] = "    3 ";
                    three[5] = "    3 ";
                    three[6] = "3333  ";
                    System.arraycopy(three, 0, toPrint[i], 0, 7);
                    break;

                case 4:
                    String[] four = new String[7];
                    four[0] = "4   4 ";
                    four[1] = "4   4 ";
                    four[2] = "4   4 ";
                    four[3] = "44444 ";
                    four[4] = "    4 ";
                    four[5] = "    4 ";
                    four[6] = "    4 ";
                    System.arraycopy(four, 0, toPrint[i], 0, 7);
                    break;
                case 5:
                    String[] five = new String[7];
                    five[0] = "55555 ";
                    five[1] = "5     ";
                    five[2] = "5     ";
                    five[3] = "55555 ";
                    five[4] = "    5 ";
                    five[5] = "    5 ";
                    five[6] = "55555 ";
                    System.arraycopy(five, 0, toPrint[i], 0, 7);
                    break;
                case 6:
                    String[] six = new String[7];
                    six[0] = "   6  ";
                    six[1] = "  6   ";
                    six[2] = " 6    ";
                    six[3] = " 6666 ";
                    six[4] = " 6  6 ";
                    six[5] = " 6  6 ";
                    six[6] = " 6666 ";
                    System.arraycopy(six, 0, toPrint[i], 0, 7);
                    break;
                case 7:
                    String[] seven = new String[7];
                    seven[0] = "77777 ";
                    seven[1] = "7   7 ";
                    seven[2] = "   7  ";
                    seven[3] = " 777  ";
                    seven[4] = "  7   ";
                    seven[5] = "  7   ";
                    seven[6] = "  7   ";
            System.arraycopy(seven,0, toPrint[i],0, 7);
                    break;
                case 8:
                    String[] eight = new String[7];
                    eight[0] = " 888  ";
                    eight[1] = "8   8 ";
                    eight[2] = "8   8 ";
                    eight[3] = " 888  ";
                    eight[4] = "8   8 ";
                    eight[5] = "8   8 ";
                    eight[6] = " 888  ";
                    System.arraycopy(eight, 0, toPrint[i], 0, 7);
            break;
                case 9:
                    String[] nine = new String[7];
                    nine[0] = " 999  ";
                    nine[1] = "9   9 ";
                    nine[2] = "9   9 ";
                    nine[3] = " 999  ";
                    nine[4] = "   9  ";
                    nine[5] = "  9   ";
                    nine[6] = " 9    ";
                    System.arraycopy(nine, 0, toPrint[i], 0, 7);
                    break;
                case 0:
                    String [] zero = new String [7];
                    zero[0] = " 000  ";
                    zero[1] = "0   0 ";
                    zero[2] = "0   0 ";
                    zero[3] = "0   0 ";
                    zero[4] = "0   0 ";
                    zero[5] = "0   0 ";
                    zero[6] = " 000  ";
                    System.arraycopy(zero, 0, toPrint[i], 0, 7);
                    break;
            }
        }
    }
}
