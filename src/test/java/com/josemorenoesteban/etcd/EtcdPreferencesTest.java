package com.josemorenoesteban.etcd;

import java.util.prefs.Preferences;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class EtcdPreferencesTest {
    
    @BeforeClass
    public static void setPreferencesFactory() {
        System.setProperty("java.util.prefs.PreferencesFactory", "com.josemorenoesteban.etcd.EtcdPreferencesFactory");
    }

    @Test public void getSystemPrefsRoot(){
        Preferences systemPrefs = Preferences.systemRoot();
        assertNotNull(systemPrefs);
    }
    
    @Test public void getUserPrefsRoot(){
        Preferences userPrefs = Preferences.userRoot();
        assertNotNull(userPrefs);
    }

    @Test public void getUserPreference(){
        Preferences userPrefs = Preferences.userRoot();
        String keyValue = userPrefs.get("key", "default");
        assertEquals("default", keyValue);  // TODO fix this test. Now get the default, because is getSpi is not implemented :$
    }

    @Test public void getInexistentUserPreference(){
        Preferences userPrefs = Preferences.userRoot();
        String keyValue = userPrefs.get("xxxx", "default");
        assertEquals("default", keyValue);
    }
}
