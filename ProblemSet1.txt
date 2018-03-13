public class ProblemSet1 {

    class question1 {
        /*
        Which of the following Java variable declarations has an error?

        A. int x = 5;
        B. double temperature = 75.6;
        C. char grade = ’A’;
        D. String name = ’Adam’
        */

        String name ="Adam";
    }

    class question2 {
        /*
        What value for register will be printed at the end of this block of Java code?
        double register = 10.0;
        register = register + 5; //Customer pays $5.
        register = register - 2.5; //Customer receives $2.50 as change.
        register = register + 10; //Customer pays $10.
        register = register - 3; //Customer receives $3 as change.
        System.out.println(register);

        A. 19.0
        B. 19.5
        C. 22.5
        D. 25.5
        */

        double register = 19.5;
    }

    class question3 {
        /*
        Define an integer variable called bankBalance.  Initialize it to a value of 500.  Then add 250 to it.  Then subtract 100 from it.  Finally, print the resulting value.
        */

        int bankBalance = 500;

        bankBalance = bankBalance + 250;
        bankBalance = bankBalance -100;
        System.out.println(bankBalance);
    }

    class question4 {
        /*
        What value will be printed by this line of Java code?
        System.out.println(2.0 * (5 / 2));

        A. 4
        B. 4.0
        C. 5
        D. 5.0
        E.  This line of code will give an error.
        */

        //4.0
    }

    class question5 {
        /*
        Write Java code to define an integer variable called day, and a String variable called month.
        Give month and day appropriate values for your birthday.
        */

        int day = 19;
        String month = "June";
    }

    class question6 {
        /*
        Write Java code to create a String variable called firstName, define it to be your first name as a String.  Then define a variable called lastName and define it to be your last name as a String.  Then define a variable called fullName and set it to be your first name followed by a space followed by your last name.  Use the existing variables for your first and last name and String concatenation to define fullName.  Finally, write code to print this text:

        Hello, my name is [full name].
        There are [number] letters in my name.

        Use String concatenation to create the first String to print using the fullName variable, and use the .length() command on firstName and lastName to calculate the number of letters.

        Note:  you can concatenate an integer and a String and the integer will be converted to a String.  For example, this expression:

        "There are "+ 7 + "days in a week."

        will be evaluated as the String:

        "There are 7 days in a week."
         */

        String firstName = "Damarie";
        String lastName = "Underhill";
        String fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is " fullName);
        System.out.println("There are " + (firstName.length() + lastName.length()) + " letters in my name.");
    }

    class question7 {
        /*
        Write Java code to define a double variable called fahrenheit and set it to an initial value between 0 and 100.  Then, create a double variable called celsius and calculate its value based on the value of fahrenheit. (To convert from Fahrenheit to Celsius,  subtract 32, then multiply by 5, then divide by 9.)  Finally, print the final value of celsius.
        */

        double fahrenheit = 50;
        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(celsius);
    }
}
