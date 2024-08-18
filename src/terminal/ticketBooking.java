package terminal;

public class ticketBooking {

    String passengerDestination;
    boolean isDestinationInternational;
    String passengerDateOfDeparture;
    public FlightInfo[] flightInfo;
    String passengerName;
    String passengerAge;
    String passengerGender;
    private String passengerID;
    private String passengerContactNumber;
    String passengerFlightInput;
    String passengerFlightInputCargo;
    public  static String typeOfGood;
    boolean isSuccessful;
    int i1;
    final static double maxCargoWeight = 100.0;

    public ticketBooking(String passengerInput, String passengerDestination, boolean isDestinationInternational, String passengerDateOfDeparture, String passengerName, String passengerAge, String passengerGender, String passengerID, String passengerContactNumber, String passengerFlightInput, String passengerFlightInputCargo, FlightInfo... flightInfo) {

        this.passengerDestination = passengerDestination;
        this.isDestinationInternational = isDestinationInternational;
        this.passengerDateOfDeparture = passengerDateOfDeparture;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerGender = passengerGender;
        this.passengerID = passengerID;
        this.passengerContactNumber = passengerContactNumber;
        this.flightInfo = flightInfo;
        this.passengerFlightInputCargo = passengerFlightInputCargo;
        this.passengerFlightInput = passengerFlightInput;
        this.isSuccessful = false;
    }

    public void cargoBooking(double cargoWeight, String Good) {

        System.out.println("Welcome to Ticket Booking System." + "\n" + "Please enter your Date Of Departure:");

        System.out.println("Here are the available flights for that day:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Flight ID: " + flightInfo[i].ID() + " Flight time of departure: " + flightInfo[i].getTimeDep() + " Flight time of arrival: "
                    + flightInfo[i].getTimeArrival() + " Flight Cost: " + flightInfo[i].cost() + ".");
        }

        if (cargoWeight <= maxCargoWeight) {
            typeOfGood = Good;
            isSuccessful = true;
        } else {
            isSuccessful = false;
            System.out.println("The weight exceeds allowable weight limit.");
        }

    }

    public void passengerBooking() {

        System.out.println("Welcome to Ticket Booking System \n Please enter your Date Of Departure:");

        System.out.println("Here are the available flights for that day:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Flight ID: " + flightInfo[i].ID() + " Flight time of departure: " + flightInfo[i].getTimeDep() + " Flight time of arrival: "
                    + flightInfo[i].getTimeArrival() + " Flight Cost: " + flightInfo[i].cost());
        }

        if (passengerFlightInput != null) {
            this.isSuccessful = true;
        } else {
            this.isSuccessful = false;
        }

        i1 = Integer.parseInt(passengerFlightInput);
    }

    public String getPassengerContactNumber() {
        return this.passengerContactNumber;
    }

    static class extraService {

        boolean isVeg;
        boolean isNonVeg;
        int choiceOfFood;
        int ChoiceOfSeat;

        extraService(boolean isVeg, boolean isNonVeg, int choiceOfFood, int ChoiceOfSeat) {
            this.isVeg = isVeg;
            this.isNonVeg = isNonVeg;
            this.choiceOfFood = choiceOfFood;
            this.ChoiceOfSeat = ChoiceOfSeat;
        }

        public void meal() {

            System.out.println("Please enter your choice of meal: ");
            if (isVeg) {

                System.out.println("1. North Indian Platter : Aloo Paratha, Curd, Butter, Tea/Coffee, Halwa");
                System.out.println("2. Chinese Platter: Noodles, Manchurian, Halwa");
                System.out.println("3. Continental Platter: Sauted Veggies, Grilled Tomato, Tofu, Halwa");

            }
            if (isNonVeg) {

                System.out.println("5. North Indian Platter : Chicken e Murgh Paratha, Curd, Butter, Tea/Coffee, Halwa");
                System.out.println("6. Chinese Platter: Chicken Noodles, Manchurian, Halwa");
                System.out.println("7. Continental Platter: Grilled Chicken, Grilled Tomato, Tofu, Halwa");

            }
        }

        public void seatType() {
            System.out.println("1. Extra large LegSpace");
            System.out.println("2. Large LegSpace");

        }
    }
}