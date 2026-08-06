import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, parser);
        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour>=12 && hour<18;
    }

    //TODO the formatting is currently wrong, need to change from all uppercase to lower case expect first char.
    //TODO When collecting the minute it gets a range from 0 - 59. This causes 00 to show as 0. Need to change this behavior.
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,");
        String formattedDay = appointmentDate.format(formatter);

        formatter = DateTimeFormatter.ofPattern("h:mm a.");
        String formattedHour = appointmentDate.format(formatter);
        /*
        Month month = appointmentDate.getMonth();
        int day = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();
        int hour = appointmentDate.getHour();

        formatter = DateTimeFormatter.ofPattern("mm");
        String formattedMinute = appointmentDate.format(formatter);

        String timeOfDay;
        if (hour>=12) timeOfDay = "PM";
        else timeOfDay = "AM";
        */

        //String desc = "You have an appointment on " + formattedDay + ", " + month + " " + day + ", " + year + ", at " + hour + ":" + formattedMinute + " " + timeOfDay;
        String desc2 = "You have an appointment on " + formattedDay + " at " + formattedHour;
        return desc2;
    }

    public LocalDate getAnniversaryDate() {
        int thisYear = LocalDate.now().getYear();
        LocalDate anniversary = LocalDate.of(thisYear, 9, 15);
        return anniversary;


    }
}
