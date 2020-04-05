package Unit3.Task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CrazyLogger {
    private StringBuilder sb = new StringBuilder();

    public void addRecord(String str) {
        String dt = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH:mm").format(LocalDateTime.now());
        sb.append(dt).append(" - ").append(str).append(";");
    }

    public String findRecordString(String str) {
        String result = "";
        int start = sb.indexOf(str);

        if (start != -1) {
            int stop = sb.lastIndexOf(str);

            if (stop == -1) {
                stop = sb.length();
            }
            result = sb.substring(start, stop);
        }
        return result;
    }

    public List<String> findRecordSList(String str) {
        List<String> result = new ArrayList<>();
        String base[] = sb.toString().split(";");

        for (String s : base) {
            if (s.contains(str)) {
                result.add(s);
            }
        }
        return result;
    }
}
