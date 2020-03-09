import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static Season enterAndSearchSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku: ");
        String season = scanner.nextLine();
        Season[] seasons = Season.values();
        Season searchedSeason = null;
        for (int i = 0; i < seasons.length; i++) {
            if (season.equals(seasons[i].getDescription())) {
                searchedSeason = seasons[i];
            }
        }
        return searchedSeason;
    }
    public static void showInfoAboutSeason(Season season){
        System.out.println(season.toString() + Arrays.toString(season.getMonths()));
    }
}
