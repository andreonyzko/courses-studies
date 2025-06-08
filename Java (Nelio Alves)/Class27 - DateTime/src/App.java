import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciação: com data-hora atual
        System.out.println("\n===================================");
        System.out.println("    DATE-TIME NOW INSTANTIATION    ");
        System.out.println("===================================");

        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("\nLocal Date now: \n" + localDateNow);
        System.out.println("\nLocal Date Time now: \n" + localDateTimeNow);

        Instant globalDateTimeNow = Instant.now();
        System.out.println("\nGlobal Date Time now: \n" + globalDateTimeNow);

        // Instanciação: com formato ISO 8601
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

        // Instanciação: com texto formatado customizado
        System.out.println("\n===================================");
        System.out.println("         CUSTOM TO DATE-TIME         ");
        System.out.println("===================================");
        
        DateTimeFormatter formatDayMonthYear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customLocalDate = LocalDate.parse("26/02/2005", formatDayMonthYear);
        System.out.println("\nCustom pattern to Local Date: \n" + customLocalDate);

        DateTimeFormatter formatDayMonthYearHourMinutes = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime customLocalDateTime = LocalDateTime.parse("26/02/2005 12:39", formatDayMonthYearHourMinutes);
        System.out.println("\nCustom pattern to Local Date Time: \n" + customLocalDateTime);

        // Instanciação: com dia, mes, ano, [horario] -> data-hora local
        System.out.println("\n===================================");
        System.out.println("     OF DAY, MONTH, YEAR, HOUR     ");
        System.out.println("===================================");

        LocalDate localDateOf = LocalDate.of(2005, 02, 26);
        System.out.println("\nLocal Date Of 2005, 02, 26: \n" + localDateOf);

        LocalDateTime localDateTimeOf = LocalDateTime.of(2005, 2, 26, 12, 39, 50);
        System.out.println("\nLocal Date Time Of 2005, 02, 26, 12, 39, 50:\n" + localDateTimeOf);

        // Data-hora para texto
        System.out.println("\n===================================");
        System.out.println("     DATE-TIME TO CUSTOM FORMAT     ");
        System.out.println("===================================");
        
        System.out.println("\nLocal Date to formart dd/MM/yyyy: \n" + localDateNow.format(formatDayMonthYear));
        System.out.println(formatDayMonthYear.format(localDateNow));

        System.out.println("\nLocal Date Time to formart dd/MM/yyyy HH:mm: \n" + localDateTimeNow.format(formatDayMonthYearHourMinutes));
        System.out.println(formatDayMonthYearHourMinutes.format(localDateTimeNow));

        DateTimeFormatter formatDayMothYearHourMinutesZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("\nGlobal Date Time to formart dd/MM/yyyy HH:mm: \n" + formatDayMothYearHourMinutesZone.format(globalDateTimeNow));

        // Transformação: data-hora global para local
        System.out.println("\n===================================");
        System.out.println("        GLOBAL TO LOCAL DATE        ");
        System.out.println("===================================");
        LocalDate localDateFromGlobal = LocalDate.ofInstant(globalDateTime, ZoneId.systemDefault()); // ZoneId.getAvailableZoneIds()
        System.out.println("\nLocal Date from Global Date: \n" + localDateFromGlobal);

        LocalDateTime localDateTimeFromGlobal = LocalDateTime.ofInstant(globalDateTime, ZoneId.systemDefault());
        System.out.println("\nLocal Date Time from Global Date: \n" + localDateTimeFromGlobal);

        // Coleta: dados de uma data
        System.out.println("\n===================================");
        System.out.println("       COLLET DATA FROM DATE       ");
        System.out.println("===================================");
        System.out.println("\nDay: " + localDate.getDayOfMonth());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Year: " + localDate.getYear());

        // Calculos com data-hora
        System.out.println("\n===================================");
        System.out.println("     CALCULATION WITH DATE-TIME     ");
        System.out.println("===================================");
        LocalDateTime pastWeekLocalDate = localDateTime.minusDays(7);
        LocalDateTime nextWeekLocalDate = localDateTime.plusDays(7);
        System.out.println("\nMinus 7 days: \n" + pastWeekLocalDate);
        System.out.println("\nMore 7 days: \n" + nextWeekLocalDate);

        Instant pastWeekInstant = globalDateTime.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = globalDateTime.plus(7, ChronoUnit.DAYS);
        System.out.println("\nMinus 7 days: \n" + pastWeekInstant);
        System.out.println("\nMore 7 days: \n" + nextWeekInstant);

        Duration duration = Duration.between(pastWeekInstant, nextWeekInstant);
        System.out.println("\nDuration: \n" + duration.toDays() + " days");
        System.out.println(duration.toHours() + " hours");
    }
}
