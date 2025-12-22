package practice;

import java.util.HashMap;
import java.util.Map;

public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // Return an empty string if either list is empty
        if (lstOfArt == null || lstOfArt.length == 0 || lstOf1stLetter == null || lstOf1stLetter.length == 0) {
            return "";
        }

        // Create a map to store the total quantities for each category
        Map<String, Integer> categoryTotals = new HashMap<>();

        // Initialize the map with the categories and set their totals to 0
        for (String category : lstOf1stLetter) {
            categoryTotals.put(category, 0);
        }

        // Iterate through the stocklist and update the totals for the matching categories
        for (String book : lstOfArt) {
            String category = book.substring(0, 1); // Get the first letter (category)
            int quantity = Integer.parseInt(book.split(" ")[1]); // Get the quantity

            // If the category is in the list of categories, update its total
            if (categoryTotals.containsKey(category)) {
                categoryTotals.put(category, categoryTotals.get(category) + quantity);
            }
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append("(").append(category).append(" : ").append(categoryTotals.get(category)).append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String[] stocklist = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] categories = {"A", "B", "C", "W"};

        System.out.println(stockSummary(stocklist, categories)); // Output: (A : 20) - (B : 114) - (C : 50) - (W : 0)
    }
}