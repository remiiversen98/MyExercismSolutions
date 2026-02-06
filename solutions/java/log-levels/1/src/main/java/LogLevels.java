public class LogLevels {
    private static final String INFO = "[INFO]: ";
    private static final String WARNING = "[WARNING]: ";
    private static final String ERROR = "[ERROR]: ";
    public static String message(String logLine) {
        if (logLine.contains(INFO)) logLine = logLine.replace(INFO, "");
        if (logLine.contains(WARNING)) logLine = logLine.replace(WARNING, "");
        if (logLine.contains(ERROR)) logLine = logLine.replace(ERROR, "");
        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains(INFO)) {
            logLine = logLine.substring(1, 5);
            logLine = logLine.toLowerCase();
        }
        if (logLine.contains(WARNING)) {
            logLine = logLine.substring(1, 8);
            logLine = logLine.toLowerCase();
        }
        if (logLine.contains(ERROR)){
            logLine = logLine.substring(1, 6);
            logLine = logLine.toLowerCase();
        }
        return logLine.trim();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";

    }
}
