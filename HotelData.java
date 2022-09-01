public class HotelData {
    private String name;
    private int weekRate;
    private int weekendRate;
    private int rating;

    public HotelData(String name, int weekRate, int weekendRate, int rating){
        this.name = name;
        this.weekRate = weekRate;
        this.weekendRate = weekendRate;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekRate() {
        return weekRate;
    }

    public void setWeekRate(int weekRate) {
        this.weekRate = weekRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        weekendRate = weekendRate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
