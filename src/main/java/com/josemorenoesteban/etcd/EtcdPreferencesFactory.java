 package com.josemorenoesteban.etcd;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

public class EtcdPreferencesFactory implements PreferencesFactory {

    private final Preferences systemRoot, userRoot;
    
    public EtcdPreferencesFactory() {
        this.systemRoot = new EtdcPreferences(null, "");
        this.userRoot   = new EtdcPreferences(null, "");
    }
    
    @Override
    public Preferences systemRoot() {
        return systemRoot;
    }

    @Override
    public Preferences userRoot() {
        return userRoot;
    }
    
}
