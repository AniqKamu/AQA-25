package org.example;

public class HM6 {
    public static void main(String[] args) {
        //Task #1
//        You keep a record of the highest daily temperatures. Find the hottest day.
//        Find the second hottest. It's assumed that the temperature varies from day to day.

        double[] temps = {21.5, 35.0, 18.2, 29.7, 36.3, 33.8};

        double max = temps[0];
        double secondMax = temps[0];

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                secondMax = max;
                max = temps[i];
            } else if (temps[i] > secondMax) {
                secondMax = temps[i];
            }
        }

        System.out.println("the hottest day: " + max);
        System.out.println("the second hottest: " + secondMax);

        System.out.println("____________________________________________");
//        Task #2
//
//        You have a list of email addresses.
//        Find all addresses with the domain gmail.com. Ignore addresses from fake websites like myrealgmail.com.
//        Find the shortest and longest addresses.
//        Check for addresses with the username admin.

        String[] emails = {
                "user1@gmail.com",
                "admin@gmail.com",
                "anna@yahoo.com",
                "test@myrealgmail.com",
                "boss@gmail.com",
                "alexander_super_long_email_address@gmail.com",
                "support@company.com"
        };

    }
}
