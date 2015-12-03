package com.josemorenoesteban.etcd;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

public class EtcdPreferencesFactory implements PreferencesFactory {

    @Override
    public Preferences systemRoot() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Preferences userRoot() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
