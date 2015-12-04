java.util.prefs ETCD preferences implementation
===============================================

A [Java Util Preferences](http://docs.oracle.com/javase/8/docs/api/java/util/prefs/package-summary.html) 
[etcd](https://coreos.com/etcd/) backend implementation.

## Why?

**Etcd** is one of the main configuration cloud oriented key/value backends. The java applications will
need to 

With this implementation the java applications will, transparently, use etcd as backend to store and
retrieve application configuration vía java.util.prefs.

A sample, get the application database driver and url from application preferences:

    Preferences applicationPref = Preferences.systemRoot();
    String driver = userPrefs.get("database.driver", "org.postgresql.Driver");
    String url    = userPrefs.get("database.url",    "jdbc:postgresql://localhost:5740/myDb");


This implementation abstracts the application the problems about interact with etcd, use and standard
Java API and does not require to use external libraries.


# Requisites

  - JDK Java 8
  - Maven 3.2.x

# Links

  - [java.util.prefs javadoc](https://docs.oracle.com/javase/8/docs/api/index.html?java/util/prefs/package-summary.html)
  - [Java util prefs file backing store sample](http://www.davidc.net/programming/java/java-preferences-using-file-backing-store)
  - [Etcd libraries](https://github.com/coreos/etcd/blob/master/Documentation/libraries-and-tools.md)
  - [jetcd: Java binding for etcd](https://github.com/justinsb/jetcd)
  