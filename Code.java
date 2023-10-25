
package com.mycompany.guicoursework;

import java.util.Scanner;

import java.util.*;
/**
 *
 * @author supun
 */
public class Code extends Orders{

    public Code() {
        super(null);
    }

 

  public static String[] withOutDuplicatePhoneNum(int x ,ArrayList y ) {
        String[] temPhoneArr = new String[x];
        int newLength = 0;
        for (int i = 0; i < x; i++) {
            Orders tempary = (Orders) y.get(i);
            boolean isDuplicate = false;

            for (int j = 0; j < newLength; j++) {
                if (tempary.getPhoneNumber().equals(temPhoneArr[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temPhoneArr[newLength] = tempary.getPhoneNumber();
                newLength++;
            }
        }
        String[] newPhoneArr = new String[newLength];
        for (int i = 0; i < newLength; i++) {
            newPhoneArr[i] = temPhoneArr[i];
        }
        return newPhoneArr;
    }
   public static int[] duplicatePhoneIndex(String phoneNumber , ArrayList x) {

        String number = phoneNumber;
        boolean found = false;
        int j = 0;
        int[] tem = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            Orders tempary = (Orders) x.get(i);
            // thawa kalikawa array ekata save kirima
            if (tempary.getPhoneNumber().equalsIgnoreCase(number)) {
                j++;
                tem[j - 1] = i;
                found = true;
            }
        }
        int[] tem2 = new int[j];
        for (int i = 0; i < j; i++) {
            tem2[i] = tem[i];
        }
        return tem2;
    }

    public Code(String idNumber) {
        super(idNumber);
    }
   public static int[] qtyTableFore(int[] intArray , ArrayList x) {
        int xsCount = 0, sCount = 0, mCount = 0, lCount = 0, xlCount = 0, xxlCount = 0;
        for (int i : intArray) {
            Orders tempary = (Orders) x.get(i);
            String size = tempary.getSize();
            int qty = tempary.getQty();
            switch (size) {
                case "XS" ->
                    xsCount += qty;
                case "S" ->
                    sCount += qty;
                case "M" ->
                    mCount += qty;
                case "L" ->
                    lCount += qty;
                case "XL" ->
                    xlCount += qty;
                case "XXL" ->
                    xxlCount += qty;
            }
        }
        int[] qtyTable1 = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};
        return qtyTable1;
    }
     public static int[] qtyTableForLoop( ArrayList x) {
        int xsCount = 0, sCount = 0, mCount = 0, lCount = 0, xlCount = 0, xxlCount = 0;
        for (int i = 0; i < x.size(); i++) {
            Orders tempary = (Orders) x.get(i);
            String size = tempary.getSize();
            int qty = tempary.getQty();
            switch (size) {
                case "XS" ->
                    xsCount += qty;
                case "S" ->
                    sCount += qty;
                case "M" ->
                    mCount += qty;
                case "L" ->
                    lCount += qty;
                case "XL" ->
                    xlCount += qty;
                case "XXL" ->
                    xxlCount += qty;
            }
        }
        int[] qtyTable1 = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};
        return qtyTable1;
    }



}
