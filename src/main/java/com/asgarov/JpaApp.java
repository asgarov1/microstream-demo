package com.asgarov;

import com.asgarov.jpa.repository.ParentEntityRepository;
import com.asgarov.model.ParentEntity;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static com.asgarov.util.DataGenerator.getListOfEntities;

@Slf4j
@SpringBootApplication
public class JpaApp {

    @Autowired
    private ParentEntityRepository parentEntityRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApp.class, args);
    }

    @PostConstruct
    public void save() {
        List<ParentEntity> listOfEntities = getListOfEntities(1000);
        saveAllJpa(listOfEntities);
        saveAllJpa(listOfEntities);
        saveAllJpa(listOfEntities);
    }

    private void saveAllJpa(List<ParentEntity> listOfEntities) {
        long startTime = System.currentTimeMillis();
        parentEntityRepository.saveAll(listOfEntities);
        long endTime = System.currentTimeMillis();
        log.info("===>JPA: Total execution time: " + (endTime - startTime) + "ms");
    }
}
