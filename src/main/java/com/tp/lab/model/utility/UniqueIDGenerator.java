package com.tp.lab.model.utility;

public final class UniqueIDGenerator {
    private long currentID = 1;
    public long getUniqueId() {
        return currentID++;
    }
}
