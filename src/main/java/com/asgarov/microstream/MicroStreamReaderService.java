package com.asgarov.microstream;

import one.microstream.storage.types.EmbeddedStorageManager;
import org.springframework.stereotype.Service;

import static com.asgarov.util.DataSourceUtil.getEmbeddedStorageManager;

public class MicroStreamReaderService {
    public static void main(String[] args) {
        final EmbeddedStorageManager storageManager = getEmbeddedStorageManager();

        long startTime = System.currentTimeMillis();
        Object root = storageManager.root();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");

        System.out.println(root);
    }
}
