package com.asgarov.microstream;

import one.microstream.storage.types.EmbeddedStorageManager;

import static com.asgarov.util.DataGenerator.getListOfEntities;
import static com.asgarov.util.DataSourceUtil.getEmbeddedStorageManager;


public class MicroStreamWriterService {
    public static void main(String[] args) {
        final EmbeddedStorageManager storageManager = getEmbeddedStorageManager();

        // print the last loaded root instance,
        // replace it with a current version and store it
        storageManager.setRoot(getListOfEntities(1000));
        long startTime = System.currentTimeMillis();

        saveAllMicroStream(storageManager);

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

        // shutdown storage
        storageManager.shutdown();
    }

    private static void saveAllMicroStream(EmbeddedStorageManager storageManager) {
        storageManager.storeRoot();
    }

}
