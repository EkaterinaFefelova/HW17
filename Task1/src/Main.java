import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine("Salmon Club Sauvignon Blanc", Brand.EHRMANNS_WINES, Country.NEW_ZEALAND, LocalDate.of(2020, 6, 23), "Освежающий, приятный с фруктово-цитрусовыми акцентами и утонченной кислинкой в сухом послевкусии");
        System.out.print(wine.getAgeInYears(LocalDate.now()));
    }
}