package com.asgarov.util;

import lombok.experimental.UtilityClass;

import java.util.concurrent.atomic.AtomicLong;

@UtilityClass
public class IdGenerator {

    private static final AtomicLong id = new AtomicLong(1);

    public static Long next() {
        return id.getAndIncrement();
    }
}
