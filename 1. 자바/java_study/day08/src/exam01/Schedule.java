package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year2) {
        year = year2;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month2) {
        month = month2;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day2) {
        if(month==2 && day2>28){
            day2=28;
        }
        day = day2;
    }

    void showInfo() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
