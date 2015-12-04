package com.josemorenoesteban.etcd;

import java.util.prefs.Preferences;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class EtcdPreferencesTest {
    
    @BeforeClass
    public static void setPreferencesFactory() {
        System.setProperty("java.util.prefs.PreferencesFactory",        "com.josemorenoesteban.etcd.EtcdPreferencesFactory");
        System.setProperty("com.josemorenoesteban.etcd.client.factory", "com.josemorenoesteban.etcd.client.MockEtcdClientFactory");
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
        assertEquals("key", keyValue);  // TODO fix this test. Now get the default, because is getSpi is not implemented :$
    }
}
