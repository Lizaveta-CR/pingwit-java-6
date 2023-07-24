package com.pingwit.core.les_21.classwork.point_0;

import java.util.UUID;

public class StringIdResolver implements IdResolver<String> {

    @Override
    public String buildId() {
        return UUID.randomUUID().toString();
    }
}
