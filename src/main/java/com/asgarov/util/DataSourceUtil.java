package com.asgarov.util;

import one.microstream.afs.sql.SqlConnector;
import one.microstream.afs.sql.SqlFileSystem;
import one.microstream.afs.sql.SqlProviderPostgres;
import one.microstream.storage.types.EmbeddedStorage;
import one.microstream.storage.types.EmbeddedStorageManager;
import org.postgresql.ds.PGSimpleDataSource;

public class DataSourceUtil {

    private DataSourceUtil() {
    }

    public static EmbeddedStorageManager getEmbeddedStorageManager() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/mydb");
        dataSource.setUser("admin");
        dataSource.setPassword("admin");

        SqlFileSystem fileSystem = SqlFileSystem.New(
                SqlConnector.Caching(
                        SqlProviderPostgres.New(dataSource)
                )
        );

        return EmbeddedStorage.start(fileSystem.ensureDirectoryPath("microstream_storage"));
    }
}

