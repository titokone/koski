package fi.hu.cs.titokone;

import java.io.*;

public class __stub_filehandler {
    String settingsreturn = "";

    public void saveSettings(StringBuffer foo, File bar) {
	
    }

    public Binary loadBinary(File foo) {
	return null;
    }

    public StringBuffer loadSettings(File foo) {
	return new StringBuffer(settingsreturn);
    }

    // Tweak functions.
    public void tweakLoadSettings(String newSettings) {
	settingsreturn = newSettings;
    }
}
