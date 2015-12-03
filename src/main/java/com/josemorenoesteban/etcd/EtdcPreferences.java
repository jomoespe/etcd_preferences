package com.josemorenoesteban.etcd;

import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;

public class EtdcPreferences extends AbstractPreferences {
    
    public EtdcPreferences(AbstractPreferences parent, String name) {
        super(parent, name);
    }    
    
    @Override
    protected void putSpi(String key, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String getSpi(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void removeSpi(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void removeNodeSpi() throws BackingStoreException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String[] keysSpi() throws BackingStoreException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String[] childrenNamesSpi() throws BackingStoreException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected AbstractPreferences childSpi(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void syncSpi() throws BackingStoreException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void flushSpi() throws BackingStoreException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
