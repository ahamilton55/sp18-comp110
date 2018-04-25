public class Time {
    int hour;
    int minute;
    int second;
    String partOfDay;

    public static int test = 101;

    public Time() {
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
        this.partOfDay = "AM";
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
        this.partOfDay = "AM";
    }

    public Time(int hour, int minute, int second, String partOfDay) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.partOfDay = partOfDay;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d %s", this.hour, this.minute, this.second, this.partOfDay);
    }

    public void addSeconds(int seconds) {
        this.second += seconds;
        if (this.second < 60) {
            return;
        }
        this.addMinutes(this.second / 60);
        this.second %= 60;
    }

    public void addMinutes(int minutes) {
        this.minute += minutes;
        if (this.minute < 60) {
            return;
        }
        this.addHours(this.minute / 60);
        this.minute %= 60;
    }

    public void addHours(int hours) {
        this.hour += hours;
        if (this.hour < 12 && this.hour != 12) {
            return;
        }
        this.swapPartOfDay();
        if (this.hour != 12) {
            this.hour = (this.hour % 12) + 1;
        }
    }

    public void swapPartOfDay() {
        if (partOfDay.equals("AM")) {
            partOfDay = "PM";
        } else {
            partOfDay = "AM";
        }
    }
}