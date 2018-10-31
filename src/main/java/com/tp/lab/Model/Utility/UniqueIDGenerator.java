package com.tp.lab.Model.Utility;

public final class UniqueIDGenerator {
    private long currentID = 1;
    public long getUniqueId() {
        return currentID++;
    }
}
