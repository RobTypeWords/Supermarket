import items.fruits.Apple;
import items.fruits.Banana;

// Complete all steps in this Main class.
// Everything else is completed for you.
// Do not worry about filling in code outside of this class, because you
// don't need to.
// You can look at the code outside of this class to better understand what is going on.
public class Main {

    public static void main(String[] args) {
        // 1) Timmy went to the produce market and decided to grab the following...
        // Do not worry about the pricing, as each produce item is defined with
        // their pricing in their respective class.
        //
        // 6 apples (0.11 cents per apple)
        // 4 bananas (0.12 cents per banana)
        // 7 oranges (0.09 cents per orange)
        // 5 carrots (0.18 cents per carrot)
        // 4 potatoes (0.15 cents per potato)
        // 8 spinach (0.13 cents per spinach)
        //
        // I've done it for apples and bananas, now I want you to complete the rest.
        Apple apples = new Apple(6); // 6 apples
        Banana bananas = new Banana(4); // 4 bananas
        // 7 oranges
        // 5 carrots
        // 4 potatoes
        // 8 spinach


        // 2) Timmy grabbed all the produce he needed and decided to "STORE" the
        // produce in his shopping cart
        // How would you translate this to code? Where will you "store" these different
        // produce items? HINT: Look at each of the produce item class and check
        // what they all share in common. You will be using that Data type
        // with a certain data structure to "store" your produce items.

        // After storing all the produce items in his shopping cart, Timmy decided
        // its finally time to checkout.
        // Call on the "checkout" method here, and print out the total price.
        // Expected output:
        // The total price is $4.31

        // uncomment line 48
        //System.out.println("The total price is " + checkout());

    }

    // Write a method called "checkout" that takes in all the produce
    // items from above and calculates the total price of all items.
    //
    // NOTE: This method must take in an argument. I left it empty but I want you
    // guys to think what you will need in order to get the total of all the items.
    //
//    Uncomment lines 62-64 and fill out code
//    public static [returnType] checkout([parameter]) {
//        // code
//    }
}