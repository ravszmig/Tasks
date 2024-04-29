package task8;

public class ShoppingOptions {
    public static int getNumberOfOptions(
            int[] priceOfJeans,
            int[] priceOfShoes,
            int[] priceOfSkirts,
            int[] priceOfTops,
            int dollars
    ) {
        int numberOfOptions = 0;

        for (int jeanPrice : priceOfJeans) {
            for (int shoePrice : priceOfShoes) {
                for (int skirtPrice : priceOfSkirts) {
                    for (int topPrice : priceOfTops) {
                        int totalCost = jeanPrice + shoePrice + skirtPrice + topPrice;
                        if (totalCost <= dollars) {
                            numberOfOptions++;
                        }
                    }
                }
            }
        }

        return numberOfOptions;
    }
}
