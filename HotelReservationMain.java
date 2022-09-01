import java.util.ArrayList;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        findCheapHotel();
        HotelReservationMain Lakewood = new HotelReservationMain();
        HotelReservationMain Bridgewood = new
        addWeekAndWeekendRate();

    }

    public ArrayList<HotelData> hotelList = new ArrayList<>();

    public void addDetails(){
        hotelList.add(new HotelData("Lakewood", 110, 90, 3));
        hotelList.add(new HotelData("Bridgewood", 160, 60, 4));
        hotelList.add(new HotelData("Ridgewood", 220, 150, 5));
    }

    public static void findCheapHotel(){
        int lakewood = 110;
        int bridgewood = 160;
        int ridgewood = 220;

        int lakewoodRate = lakewood * 2;
        int bridgewoodRate = bridgewood * 2;
        int ridgewoodRate = ridgewood * 2;

        if(lakewoodRate < bridgewoodRate && lakewoodRate < ridgewoodRate){
            System.out.println("Lakewood is cheapest and the price is : "+lakewoodRate);
        }
        if(bridgewoodRate < lakewoodRate && bridgewoodRate < ridgewoodRate){
            System.out.println("Bridgewood is cheapest and the price is : "+bridgewood);
        }
        if(ridgewoodRate < lakewoodRate && ridgewoodRate < bridgewoodRate){
            System.out.println("Ridgewood is the cheapest and the price is : "+ridgewoodRate);
        }
    }

    public void addWeekAndWeekendRate(){
        String hotel = null;
        if(hotel == "Lakewood"){
            int weekdayRate = 110;
            int weekendRate = 90;
            System.out.println("Rate on Weekdays is : "+weekdayRate);
            System.out.println("Rate on Weekend is : "+weekendRate);
        }
        if(hotel == "Bridgewood"){
            int weekdayRate = 150;
            int weekendRate = 50;
            System.out.println("Rate on Weekdays is : "+weekdayRate);
            System.out.println("Rate on Weekend is : "+weekendRate);
        }
        if(hotel == "Ridgeewood"){
            int weekdayRate = 220;
            int weekendRate = 150;
            System.out.println("Rate on Weekdays is : "+weekdayRate);
            System.out.println("Rate on Weekend is : "+weekendRate);
        }
    }
}
