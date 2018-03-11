public class ProblemSet3 {
    class question1 {
        /*
        In the function signature below, what is the return type?

        public float squareRoot(int x)

        A. public
        B. float
        C. squareRoot
        D. int
         */

        //B. float
    }

    class question2 {
        /*
        Write the signature of a function called isPrime().  The access modifier should be public, the return type should be boolean, and it should take a single integer parameter.
         */

        //public boolean isPrime(int n)
    }

    class question3 {
        /*
        Which of the following function signatures has an error?

        A. public getAccountBalanace(long accountNumber)
        B. public void displayInTextBox(String string)
        C. public int roundToNearestInt(double x)
        D. public double getTemperature()
         */

        //A. public getAccountBalance(long accountNumber)
    }

    class question4 {
        /*
        Write a Java function called absoluteValue(). The access modifier should be public, it should have a return type of double, and it should take one double parameter as input.  If the double parameter is less than 0, it should return that number negated. Otherwise, it should return the parameter unchanged.
         */

        public double absoluteValue(double roundNumber) {
            if (roundNumber < 0) {
                return -roundNumber;
            } else {
                return roundNumber;
            }
        }
    }

    class question5 {
        /*
        Write  a  Java  function  named calculateTip(). The access modifier should be public, it should have a return type of double, and it should take as input a double parameter representing the cost of a meal at a restaurant.  And finally, it should return a double equal to 15% of the cost parameter.
         */

        public double calculateTip(double mealCost) {
            double tip = mealCost * .15;
            return tip;
        }
    }

    class question6 {
        /*
        Write a Java function called nametagText(). The access modifier should be public, the return type should be String, and it should take a String parameter called name. In the body of the function, return the String “Hello, my name is ” with the name parameter added to the end. (Hint: use String concatenation.)
         */

        public String nametagText(String name) {
            String nametagText "Hello, my name is " + name;
            return nametagText;
        }
    }

    class question7 {
        /*
        Define two functions.  The first should be called fahrenheitToCelsius().  It should be a public function with return type double that takes a double argument that represents a temperature in Fahrenheit degrees.  It should return the equivalent temperature in Celsius degrees.  (To convert from Fahrenheit to Celsius, use the formula C = (F − 32) × 5 / 9.)

        Next, define a function called printTemperature().  It should be public, it should have a return type of void, and it should take a double parameter that represents a temperature in Fahrenheit degrees.  This function should print “F: ” followed by the Fahrenheit parameter, then “C: ” followed by the equivalent value in Celsius degrees.  Use the first function you defined to calculate the appropriate Celsius value inside the second function.

        Bonus challenge:  write javadoc comments for both functions.
         */

        /**
         * Converts from F to C degrees.
         * @param temperatureF Temperature in degrees Farenheit.
         * @return Equivalent temperature in degrees Celsius.
         */
        public double fahrenheitToCelsius(double temperatureF) {
            double temperatureC = (temperatureF - 32) * 5 / 9;
            return temperatureC;
        }

        /**
         * Prints a temperature in F and C if degrees Farenheit is known.
         * @param temperatureF Temperature in F
         */
        public void printTemperature(double temperatureF) {
            System.out.println("F: " + temperatureF);
            System.out.println("C: " + fahrenheitToCelsius(temperatureF));
        }
    }

    class question8 {
        /*
        Define a function called monopolyRoll().  This function provides a random result based on the dice-rolling rules for the board game Monopoly.  In Monopoly, players roll two six-sided dice to determine their move.  If they roll the same value on both dice, this is called “rolling doubles,” and it means they go again.  In our simplified version, the dice-roll function should behave like this:

        1.  Generate two random integers in the 1 to 6 range.
        2.  If the numbers are not the same, return the sum.
        3.  If the numbers are the same, generate two more random integers in the 1 to 6 range, and return the sum of all 4 numbers.

        Hint:  to make your code neater, you can define a second function that generates a random         integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not need to keep repeating that code.
         */

        public int monopolyRoll () {
            int rollOne = rolld6();
            int rollTwo = rolld6();

            if (rollOne != rollTwo) {
                return rollOne + rollTwo;
            } else {
                rollThree = rolld6();
                rollFour = rolld6();
                return rollOne + rollTwo + rollThree + rollFour;
            }
        }

        public int rolld6() {
            double randomNumber = Math.random();
            randomNumber = randomNumber * 6;
            randomNumber = randomNumber + 1;
            int randomInt = (int) randomNumber;
            return randomInt;
        }
    }
}
