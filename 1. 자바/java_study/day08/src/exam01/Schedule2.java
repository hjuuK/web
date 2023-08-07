package exam01;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month==2 && day>28){
            day=28;
        }
        this.day = day;
    }

    void showInfo() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }

    public Schedule2() {
        this(2023,5,22); // 생성자 메서드(this)이용
        //year = 2023;
        //month = 5;
        //day = 22;
    }


    public Schedule2(int year, int month, int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public void printThis() {
        System.out.println(this);
    }
}
