package com.github.sebyplays.coloredconsole;

import org.fusesource.jansi.AnsiConsole;

/**
 * It's a wrapper for the System.out.println() method that allows you to print colored text to the console
 */
public class ColoredConsole {


    private static final DateUtil util = new DateUtil();
    private static final Colorizer colorizer = new Colorizer();
    private static boolean started = false;

    /**
     * If the system property `jansi.passthrough` is set to `true`, then the Jansi library will be installed
     */
    public static void start() {
        if (started) return;

        started = true;
        if (new SystemProperty().installJansi() && (System.console() != null)) {
            AnsiConsole.systemInstall();
            Runtime.getRuntime().addShutdownHook(new Thread(ColoredConsole::stop));
        }
    }

    /**
     * Stop the ANSI console and restore the original console.
     */
    private static void stop() {
        AnsiConsole.systemUninstall();
    }

    /**
     * It prints a string to the console
     *
     * @param text    The text you want to print.
     * @param colored If true, the text will be colored.
     * @param date    If true, the date will be printed.
     * @param time    If true, the time will be printed.
     */
    public static void print(String text, boolean colored, boolean date, boolean time) {
        System.out.println(getString(text, colored, date, time));
    }

    /**
     * It returns a string with the date, time, and/or colorized text
     *
     * @param text     The text you want to be printed.
     * @param colorize Whether or not to colorize the text.
     * @param date     If true, the date will be added to the beginning of the string.
     * @param time     If true, the time will be added to the string.
     * @return A string
     */
    public static String getString(String text, boolean colorize, boolean date, boolean time) {
        start();

        if (colorize) return colorizer.colorize((date ? util.getDate() : "") + (time ? util.getTime() : "") + text);
        else return (date ? util.getDate() : "") + (time ? util.getTime() : "") + text;
    }

}
