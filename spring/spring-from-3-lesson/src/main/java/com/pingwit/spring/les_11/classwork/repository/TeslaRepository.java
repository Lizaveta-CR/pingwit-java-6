package com.pingwit.spring.les_11.classwork.repository;

import com.pingwit.spring.les_11.classwork.Tesla;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Component;

@Component
public class TeslaRepository {

    private final Map<Long, Tesla> dataStore = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public Tesla save(Tesla tesla) {
        long id = idGenerator.getAndIncrement();
        Tesla saved = new Tesla(id, tesla.model(), tesla.motor(), tesla.vin());
        dataStore.put(id, saved);
        return saved;
    }

    public boolean existsByVIN(String vin) {
        return dataStore.values().stream()
            .anyMatch(tesla -> tesla.vin().equals(vin));
    }
}
