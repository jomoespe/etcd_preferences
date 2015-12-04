package com.josemorenoesteban.etcd.client;

import java.util.List;

public interface EtcdClient {
    EtcdNode get(String key);
    EtcdNode delete(String key);
    EtcdNode set(String key, String value);
    EtcdNode set(String key, String oldValue, String value);
    EtcdNode set(String key, Integer value);
    EtcdNode listChildren(String key);

    EtcdNode createDirectory(String key); 
    List<EtcdNode> listDirectory(String key); 
    EtcdNode deleteDirectory(String key); 

    String getVersion();
}
