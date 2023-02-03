package Random;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        String uId = "416";
        String clientId = "6327b58ce4fd4f72bc7d3af42bab5e45";
        String dateNow = new SimpleDateFormat("yyyyMMddhhmmssSSSS").format(date);
        String masterRandom = uId + clientId + dateNow;
        char[] masterRandomChar = masterRandom.toCharArray();

        StringBuilder sb = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = masterRandomChar[random.nextInt(masterRandom.length())];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
    }
}
