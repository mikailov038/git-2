package GitKataAcademy;

import java.util.*;

public class ConvertRoman {
    public int romanToInt(String input) {
        int result = 0;
        switch (input) {
            case "I": result = 1;
                break;
            case "II": result = 2;
                break;
            case "III": result = 3;
                break;
            case "IV": result = 4;
                break;
            case "V": result = 5;
                break;
            case "VI": result = 6;
                break;
            case "VII": result = 7;
                break;
            case "VIII": result = 8;
                break;
            case "IX": result = 9;
                break;
            case "X": result = 10;
                break;
        }
        return result;
    }
    public String intToRoman(int input) {
        String result = "";
        switch (input) {
            case 1: result = "I";
                break;
            case 2: result = "II";
                break;
            case 3: result = "III";
                break;
            case 4: result = "IV";
                break;
            case 5: result = "V";
                break;
            case 6: result = "VI";
                break;
            case 7: result = "VII";
                break;
            case 8: result = "VIII";
                break;
            case 9: result = "IX";
                break;
            case 10: result = "X";
                break;
            case 11: result = "XI";
                break;
            case 12: result = "XII";
                break;
            case 13: result = "XIII";
                break;
            case 14: result = "XIV";
                break;
            case 15: result = "XV";
                break;
            case 16: result = "XVI";
                break;
            case 17: result = "XVII";
                break;
            case 18: result = "XVIII";
                break;
            case 19: result = "XIX";
                break;
            case 20: result = "XX";
                break;
        }
        return result;
    }
    public static String IntegerToRomanNumeral(int input) {
        if (input < 1)
            return "в римской системе нет отрицательных чисел";
        String s = "";

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}

