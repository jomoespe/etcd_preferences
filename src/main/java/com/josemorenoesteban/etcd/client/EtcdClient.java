package com.josemorenoesteban.etcd.client;

import java.util.List;

public abstract class EtcdClient {
    
    public static final String ETCD_CLIENT_FACTORY_PROPERTY = "com.josemorenoesteban.etcd.client.factory";
    
    private static final EtcdClientFactory factory = factory();
    
    private static EtcdClientFactory factory() {
        try {
            return (EtcdClientFactory) Class.forName(System.getProperty(ETCD_CLIENT_FACTORY_PROPERTY)).newInstance();
        } catch (ClassNotFoundException  | 
                 InstantiationException  | 
                 IllegalAccessException ex) {
            throw new RuntimeException("Can't instantiate etcd client factory");
        }
    }
    
    public static EtcdClient client() {
         return factory.client();
    }
    
    public abstract EtcdNode get(String key);
    public abstract EtcdNode delete(String key);
    public abstract EtcdNode set(String key, String value);
    public abstract EtcdNode set(String key, String oldValue, String value);
    public abstract EtcdNode set(String key, Integer value);
    public abstract EtcdNode listChildren(String key);

    public abstract EtcdNode createDirectory(String key); 
    public abstract List<EtcdNode> listDirectory(String key); 
    public abstract EtcdNode deleteDirectory(String key); 

    public abstract String getVersion();
}
