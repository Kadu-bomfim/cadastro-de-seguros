package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUtils {

    static final String FORMATO_PADRAO_DATA = "ddMMuuuu";

    public DataUtils() {

    }

    protected LocalDate getNow() {
        return LocalDate.now();
    }

    public String hoje() {
        LocalDate hoje = this.getNow();
        return hoje.format(DateTimeFormatter.ofPattern("ddMMuuuu"));
    }

    public String hojeMenosDias(int dias){
        LocalDate hoje = this.getNow().minusDays((long) dias);
        return hoje.format(DateTimeFormatter.ofPattern("ddMMuuuu"));
    }

    public String hojeMenosAnos(int anos, String formato){
        LocalDate hoje = this.getNow().minusYears((long) anos);
        return hoje.format(DateTimeFormatter.ofPattern(formato));
    }

    public String hojeMaisDias(int dias, String formato){
        LocalDate hoje = this.getNow().plusDays((long) dias);
        return hoje.format(DateTimeFormatter.ofPattern(formato));
    }
}
