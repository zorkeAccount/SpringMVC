package converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoke on 2017/4/4.
 */
public class StringToDateConverter implements Converter<String, Date> {
    private String datePattern;

    public StringToDateConverter(String datePattern) {
        this.datePattern = datePattern;
        System.out.println("instantiating ... converter with pattern:*" + datePattern);
    }

    public Date convert(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
            dateFormat.setLenient(false);
            return dateFormat.parse(s);
        }catch (ParseException e){
            throw new IllegalArgumentException("invalid date format. Please use this pattern \"" + datePattern + "\"");
        }
    }
}
