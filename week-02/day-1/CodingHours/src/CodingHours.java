public class CodingHours {
    public static void main(String[] args) {
        double dailyHours = 6.0;
        double workdays = 5.0;
        double semester = 17;
        double workHoursSemester = dailyHours * workdays * semester;
        System.out.println(workHoursSemester);
        System.out.println
                ("Percentage of the avarage coding hours (work hours weekly is 52):" + 100 * workHoursSemester / 52 / semester + "%");
    }
}
