package com.pingwit.core.les_30.hw;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CountWords implements Callable<Integer> {
    private String path;

    public CountWords(String path) {
        this.path = path;
    }

    @Override
    public Integer call() {
        File file = new File(path);
        List<String> lines = new ArrayList<>();
        int count = 0;
        for (String line : lines) {
            String[] quatityLine = line.split(" ");
            count += quatityLine.length;
        }
        return lines.size();
    }
}
