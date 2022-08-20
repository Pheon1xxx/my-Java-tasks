package Studies;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
//локализация - конвертирование текса согласно стандартов волюты и написание определенной странны
public class Test28 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();
        double currencyAmount = Double.parseDouble(Input);
    Locale usa = new Locale("en", "US");
    Currency dollars = Currency.getInstance(usa);
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
    System.out.println("US: "+ dollarFormat.format(currencyAmount));
    }
}