public class TryTime {
    public static void main(String[] args) {
        System.out.println(Time.test);
        Time t = new Time(10, 30, 0, "AM");

        System.out.println(t.toString());

        t.addMinutes(41);

        System.out.println(t.toString());

        t.addMinutes(50);

        System.out.println(t.toString());

    }
}