package elfa;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String day;

    DaysOfWeek(String day) {
        this.day = day;
    }

    public String getDay() {
        return switch (this) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> this.day;
            default -> "Weekend";
        };
    }
}
