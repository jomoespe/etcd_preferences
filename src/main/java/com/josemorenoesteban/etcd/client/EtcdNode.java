package com.josemorenoesteban.etcd.client;

import java.util.Objects;

public class EtcdNode {
    public final String key;
    public final long   createdIndex;
    public final long   modifiedIndex;
    public final String value;

    // For TTL keys
    public final String  expiration;
    public final Integer ttl;

    // For listings
    //public final boolean  dir;
    //public List<EtcdNode> nodes;


    private EtcdNode(EtcdNodeBuilder builder) {
        this.key           = builder.key;
        this.createdIndex  = builder.createdIndex;
        this.modifiedIndex = builder.modifiedIndex;
        this.value         = builder.value;
        this.expiration    = builder.expiration;
        this.ttl           = builder.ttl;
    }

    @Override
    public String toString() {
        // TODO Basic implementation. other fields must bu added if exist
        return String.format("{\"key\": \"%s\", \"value\": \"%s\"}", key, Objects.toString(value, ""));
    }    

    
    public static class EtcdNodeBuilder {
        private final String key;
        private long    createdIndex;
        private long    modifiedIndex;
        private String  value;
        private String  expiration;
        private Integer ttl;

        public EtcdNodeBuilder(String key) {
            this.key = key;
        }        
        
        public EtcdNodeBuilder createdIndex(long index) {
            this.createdIndex = index;
            return this;
        }

        public EtcdNodeBuilder modifiedIndex(long index) {
            this.modifiedIndex = index;
            return this;
        }

        public EtcdNodeBuilder value(String value) {
            this.value = value;
            return this;
        }
        
        public EtcdNodeBuilder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public EtcdNodeBuilder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        
        public EtcdNode build() {
            return new EtcdNode(this);
        }
    }
}
