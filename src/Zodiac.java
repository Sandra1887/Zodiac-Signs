import java.util.*;

class Zodiac {
    static void printSign(int day, int month) {
        String sign;
        if (day >=21 && month == 1 || day <=19 && month == 2){
            sign = "Aquarius";
        } else if (day >=20 && month == 2 || day <=20 && month == 3) {
            sign = "Pisces";
        } else if (day >=21 && month == 3 || day <=20 && month == 4) {
            sign = "Aries";
        } else if (day >= 21 && month == 4 || day <=21 && month == 5) {
            sign = "Bull";
        } else if (day >= 22 && month == 5 || day <=21 && month == 6) {
            sign = "Gemini";
        } else if (day >= 22 && month == 6 || day <=22 && month == 7) {
            sign = "Cancer";
        } else if (day >=23 && month == 7 || day <= 22 && month == 8) {
            sign = "Leo";
        } else if (day >= 23 && month == 8 || day <= 22 && month == 9) {
            sign = "Virgo";
        } else if (day >= 23 && month == 9 || day <= 22 && month == 10) {
            sign = "Libra";
        } else if (day >= 23 && month == 10 || day <= 21 && month == 11) {
            sign = "Scorpius";
        } else if (day >= 22 && month == 11 || day <= 21 && month == 12) {
            sign = "Sagittarius";
        } else if (day >= 22 && month == 12 || day <=20 && month == 1) {
            sign = "Capricornus";
        } else {
            throw new IllegalArgumentException("Wrong input! Try again");
        }
        System.out.println("Result: " + sign);
    }
}
