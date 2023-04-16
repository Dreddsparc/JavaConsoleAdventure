package net.forevercoding.consolefun;

import java.util.concurrent.TimeUnit;

public class Ansi {
    //region ANSI Control
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CLS = "\u001B[2J";
    public static final String ANSI_HOME = "\u001B[H";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_ITALIC = "\u001B[3m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String ANSI_BLINK = "\u001B[5m";
    public static final String ANSI_REVERSE = "\u001B[7m";

    //endregion

    //region ANSI Positioning Codes
    private static final String CURSOR_UP = "\033[%dA";
    private static final String CURSOR_DOWN = "\033[%dB";
    private static final String CURSOR_FORWARD = "\033[%dC";
    private static final String CURSOR_BACKWARD = "\033[%dD";
    private static final String CURSOR_POSITION = "\033[%d;%dH";
    //endregion

    //region Foreground Colours
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE = "\u001B[97m";
    //endregion

    //region Background Colours
    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    public static final String ANSI_BRIGHT_BG_BLACK = "\u001B[100m";
    public static final String ANSI_BRIGHT_BG_RED = "\u001B[101m";
    public static final String ANSI_BRIGHT_BG_GREEN = "\u001B[102m";
    public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String ANSI_BRIGHT_BG_BLUE = "\u001B[104m";
    public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String ANSI_BRIGHT_BG_CYAN = "\u001B[106m";
    public static final String ANSI_BRIGHT_BG_WHITE = "\u001B[107m";
    //endregion

    //region Foreground and Background String Arrays
    public static final String[] FOREGROUNDS = {
            ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW,
            ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE,
            ANSI_BRIGHT_BLACK, ANSI_BRIGHT_RED, ANSI_BRIGHT_GREEN, ANSI_BRIGHT_YELLOW,
            ANSI_BRIGHT_BLUE, ANSI_BRIGHT_PURPLE, ANSI_BRIGHT_CYAN, ANSI_BRIGHT_WHITE
    };

    public static final String[] BACKGROUNDS = {
            ANSI_BG_BLACK, ANSI_BG_RED, ANSI_BG_GREEN, ANSI_BG_YELLOW,
            ANSI_BG_BLUE, ANSI_BG_PURPLE, ANSI_BG_CYAN, ANSI_BG_WHITE,
            ANSI_BRIGHT_BG_BLACK, ANSI_BRIGHT_BG_RED, ANSI_BRIGHT_BG_GREEN, ANSI_BRIGHT_BG_YELLOW,
            ANSI_BRIGHT_BG_BLUE, ANSI_BRIGHT_BG_PURPLE, ANSI_BRIGHT_BG_CYAN, ANSI_BRIGHT_BG_WHITE};
    //endregion

    //region Special Strings
    private static final String SPINNER_FRAMES = "|/-\\";
    //endregion

    //region Methods

    // Set the text to a given color
    public static void setColor(String color) {
        System.out.print(color);
    }

    // Reset the test back to the default color
    public static void resetColor() {
        System.out.print(ANSI_RESET);
    }
    // Move the cursor up n lines
    public static void cursorUp(int n) {
        System.out.printf(CURSOR_UP, n);
    }

    // Move the cursor down n lines
    public static void cursorDown(int n) {
        System.out.printf(CURSOR_DOWN, n);
    }

    // Move the cursor forward n columns
    public static void cursorForward(int n) {
        System.out.printf(CURSOR_FORWARD, n);
    }

    // Move the cursor backward n columns
    public static void cursorBackward(int n) {
        System.out.printf(CURSOR_BACKWARD, n);
    }

    public static void positionCursor(int x, int y) {
        System.out.print("\u001b[" + x + ";" + y + "H");
    }

    public static void setTerminalSize(int x, int y) {
        System.out.print("\u001b[8;" + x + ";" + y + "t");
    }

    //endregion

    // NOTE: for cursor positioning to work, we need to run this from an actual console window rather than an IDE.
    // from the directory where the class resides
    // run : java -classpath ../../../ net.forevercoding.consolefun.ColouredSystemOutPrintln

    // Print a spinner animation to the console
    public static void spinner(long duration) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (System.currentTimeMillis() - startTime < duration) {
            System.out.print(SPINNER_FRAMES.charAt(i++ % SPINNER_FRAMES.length()));
            System.out.flush();
            TimeUnit.MILLISECONDS.sleep(100);
            cursorBackward(1);
        }
    }

    public boolean clearScreen() {
        System.out.println(ANSI_CLS + ANSI_RESET);
        return true;
    }
}

