import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // OBTER DADOS DE UMA DATA-HORA LOCAL
        // Data-hora local -> dia, mes, ano, horário

        // CONVERTER DATA-HORA GLOBAL PARA LOCAL
        // Data-hora global, timezone (sistema local) -> data-hora local

        // CÁLCULOS COM DATA-HORA
        // Data-hora +/- tempo -> data-hora
        // Data-hora 1, Data-hora 2 -> duração

        // Instanciação com data-hora atual
        System.out.println("\n===================================");
        System.out.println("    DATE-TIME NOW INSTANTIATION    ");
        System.out.println("===================================");

        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("\nLocal Date now: \n" + localDateNow);
        System.out.println("\nLocal Date Time now: \n" + localDateTimeNow);

        Instant globalDateTimeNow = Instant.now();
        System.out.println("\nGlobal Date Time now: \n" + globalDateTimeNow);

        // Instanciação com formato ISO 8601
        System.out.println("\n===================================");
        System.out.println("       ISO 8601 INSTANTIATION       ");
        System.out.println("===================================");

        LocalDate localDate = LocalDate.parse("2005-02-26");
        LocalDateTime localDateTime = LocalDateTime.parse("2005-02-26T12:39");
        System.out.println("\nLocal Date: \n" + localDate);
        System.out.println("\nLocal Date Time: \n" + localDateTime);

        Instant globalDateTime = Instant.parse("2005-02-26T12:39:00Z");
        Instant globalDateTimeSP = Instant.parse("2005-02-26T12:39:00-03:00");
        System.out.println("\nGlobal Date Time now: \n" + globalDateTime);
        System.out.println("\nGlobal Date Time now: \n" + globalDateTimeSP);

        // Texto formatado customizado -> data-hora
        System.out.println("\n===================================");
        System.out.println("         CUSTOM TO DATE-TIME         ");
        System.out.println("===================================");
        
        DateTimeFormatter formatDayMonthYear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customLocalDate = LocalDate.parse("26/02/2005", formatDayMonthYear);
        System.out.println("\nCustom pattern to Local Date: \n" + customLocalDate);

        DateTimeFormatter formatDayMonthYearHourMinutes = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime customLocalDateTime = LocalDateTime.parse("26/02/2005 12:39", formatDayMonthYearHourMinutes);
        System.out.println("\nCustom pattern to Local Date Time: \n" + customLocalDateTime);

        // dia, mes, ano, [horario] -> data-hora local
        System.out.println("\n===================================");
        System.out.println("     OF DAY, MONTH, YEAR, HOUR     ");
        System.out.println("===================================");

        LocalDate localDateOf = LocalDate.of(2005, 02, 26);
        System.out.println("\nLocal Date Of 2005, 02, 26: \n" + localDateOf);

        LocalDateTime localDateTimeOf = LocalDateTime.of(2005, 2, 26, 12, 39, 50);
        System.out.println("\nLocal Date Time Of 2005, 02, 26, 12, 39, 50:\n" + localDateTimeOf);

        // Data-hora -> texto formatado customizado
        System.out.println("\n===================================");
        System.out.println("     DATE-TIME TO CUSTOM FORMAT     ");
        System.out.println("===================================");
        
        System.out.println("\nLocal Date to formart dd/MM/yyyy: \n" + localDateNow.format(formatDayMonthYear));
        System.out.println(formatDayMonthYear.format(localDateNow));

        System.out.println("\nLocal Date Time to formart dd/MM/yyyy HH:mm: \n" + localDateTimeNow.format(formatDayMonthYearHourMinutes));
        System.out.println(formatDayMonthYearHourMinutes.format(localDateTimeNow));

        DateTimeFormatter formatDayMothYearHourMinutesZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("\nGlobal Date Time to formart dd/MM/yyyy HH:mm: \n" + formatDayMothYearHourMinutesZone.format(globalDateTimeNow));
    }
}
