public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
     int game = 60;
     double discount = .20;
     double newprice = game -(game*discount);
        System.out.println("Discount Price Is:$" + newprice);
    }

    }

