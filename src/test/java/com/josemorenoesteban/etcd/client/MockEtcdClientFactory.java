package com.josemorenoesteban.etcd.client;

import java.util.List;

public class MockEtcdClientFactory implements EtcdClientFactory {

    @Override
    public EtcdClient client() {
        return new EtcdClient() {
            @Override public EtcdNode get(String key) {
                return new EtcdNode.EtcdNodeBuilder(key).value(key).build();
            }

            @Override public EtcdNode delete(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode set(String key, String value) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode set(String key, String oldValue, String value) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode set(String key, Integer value) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode listChildren(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode createDirectory(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public List<EtcdNode> listDirectory(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public EtcdNode deleteDirectory(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override public String getVersion() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}
