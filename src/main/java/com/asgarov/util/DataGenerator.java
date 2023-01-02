package com.asgarov.util;

import com.asgarov.model.ChildEntity;
import com.asgarov.model.ParentEntity;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Stream;

@UtilityClass
public class DataGenerator {

    public static List<ParentEntity> getListOfEntities(int numberOfEntities) {
        return Stream.generate(
                        () -> new ParentEntity(
                                List.of(new ChildEntity(), new ChildEntity(), new ChildEntity()))
                )
                .limit(numberOfEntities)
                .toList();
    }
}
