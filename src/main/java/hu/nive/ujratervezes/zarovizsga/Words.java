package hu.nive.ujratervezes.zarovizsga;

public class Words {

    public boolean hasMoreDigits(String s) {

        int chars = 0;
        int numbers = 0;
        for (char c: s.toCharArray()){
            if (Character.isDigit(c)) {
                chars++;
            }
            else numbers++;
            }
        if (numbers > chars) {


            return true;   }
        else {
            return false;
        }
    }


}
