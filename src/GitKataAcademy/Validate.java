package GitKataAcademy;

public class Validate {
    // BAJINDATOP
    private boolean isRoman(String inputStr){
        return inputStr.matches("^I$|^II$|^III$|^IV$|^V$|^VI$|^VII$|^VIII$|^IX$|^X$");
    }

    private boolean isStringInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public String validateInput(String input1, String input2, String operator) {
        String result = "";

        if (!operator.matches("[-+*/]{1}")){
            throw new RuntimeException("OPERATOR NE PRAVNILNIYI");
        }

        if (isRoman(input1) ^ isRoman(input2)){
            throw new RuntimeException("ZIFRI RAZNOGO S4ISLENIA");
        }
        if (!isRoman(input1) && !isRoman(input2) && (!isStringInt(input1) || !isStringInt(input1))) {
            throw new RuntimeException("RIMSKIE ZIFRI VNE PREDELOV ili 4ISLA NE ZELIE");
        }

        int op1 = 0;
        int op2 = 0;

        if(isRoman(input1)) {
            ConvertRoman romanOp = new ConvertRoman();
            op1 = romanOp.romanToInt(input1);
            op2 = romanOp.romanToInt(input2);
        }
        else {
            op1 = Integer.parseInt(String.valueOf(input1));
            op2 = Integer.parseInt(String.valueOf(input2));
        }

        if (((op1 < 1) || (op1 > 10)) || ((op2 < 1) || (op2 > 10))) {
            throw new RuntimeException("OPERANDI NE V PREDELAX");
        }

        if (isRoman(input1)) {
            result = "roman";
        }
        else {
            result = "decimal";
        }

        return result;
    }
}