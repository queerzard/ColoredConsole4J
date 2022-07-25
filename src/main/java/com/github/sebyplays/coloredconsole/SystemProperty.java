package com.github.sebyplays.coloredconsole;

/**
 * If the operating system name contains the string "win", return WINDOWS, otherwise return OTHER
 */
public class SystemProperty {

    /**
     * If the operating system name contains the string "win", return WINDOWS, otherwise return OTHER
     *
     * @return The operating system of the computer.
     */
    private OperatingSystem getOS() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) return OperatingSystem.WINDOWS;
        return OperatingSystem.OTHER;
    }

    /**
     * If the operating system is Windows, install Jansi
     *
     * @return The operating system of the computer.
     */
    public boolean installJansi() {
        return (getOS() == OperatingSystem.WINDOWS);
    }

    // An enum.
    public enum OperatingSystem {
        WINDOWS,
        OTHER
    }
}
