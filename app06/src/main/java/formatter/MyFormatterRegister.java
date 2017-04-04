package formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created by zhaoke on 2017/4/4.
 */
public class MyFormatterRegister implements FormatterRegistrar {
    private String datePatter;

    public MyFormatterRegister(String datePatter) {
        this.datePatter = datePatter;
    }

    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new DateFormatter(datePatter));
    }
}
