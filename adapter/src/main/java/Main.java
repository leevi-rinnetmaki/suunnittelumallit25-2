public class Main {
    public static void main(String[] args) {
        NewDateInterface newCalendar = new CalendarToNewDateAdapter();
        System.out.println(newCalendar);
        System.out.println(newCalendar.getDay());

        newCalendar.setDay(5);
        System.out.println(newCalendar.getDay());

        newCalendar.advanceDays(7);
        System.out.println(newCalendar.getDay());

        newCalendar.setMonth(5);
        System.out.println(newCalendar.getMonth());

        System.out.println(newCalendar.getYear());

        newCalendar.setYear(1999);
        System.out.println(newCalendar.getYear());
    }
}
