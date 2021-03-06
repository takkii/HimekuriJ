import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

// HimekuriJ
public class HimekuriJ {
    public static void main(String[] args) {
        final String reiwa_kanji = "令和";
        // Delete when "0" becomes "10".
        final String reiwa_alpha = "R0";
        final Date date = new Date();
        final SimpleDateFormat sdf_koyomi = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒 ： EEEE");
        final Calendar cal = Calendar.getInstance();
        final String reiwa_year = String.valueOf(cal.get(Calendar.YEAR) - 2018);
        final String reiwa_beta = (reiwa_kanji + (reiwa_year) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
        final String reiwa_delta = (reiwa_alpha + (reiwa_year) + "." + (cal.get(Calendar.MONTH) + 1) + "." + cal.get(Calendar.DAY_OF_MONTH));
        final String comma = " : ";
        final String reiwa = reiwa_beta + comma + reiwa_delta;
        final int nen_nichi = cal.get(Calendar.DAY_OF_YEAR);
        final int nen_getsu = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        final String koyomi = sdf_koyomi.format(cal.getTime());
        int int_year = (nen_getsu - nen_nichi);
        final String string_year = Integer.toString(int_year);

        // himekuri function
        System.out.println(koyomi);
        System.out.println("来年の1月1日まであと" + comma + string_year + "日です");
        cal.setTime(date);
        System.out.println(reiwa);

        // major version number set.
        final double TopNumber = 1.1;
        // use, fix change update version number.
        final int lastNumber = 0;
        // use number layout control.
        final String zero_comma = ".";

        // version number set.
        final String string_number = String.valueOf(TopNumber);
        final String version_lastnumber = Integer.toString(lastNumber);
        final String version_number = string_number + zero_comma + version_lastnumber;

        final String himekuriVersion = "日めくりの数え番号";
        final String version = himekuriVersion + comma + version_number;

        // System out println call
        System.out.println(version);

    }
}
