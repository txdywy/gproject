package com.squareup.leakcanary;

public interface Retryable {

    public enum Result {
        DONE,
        RETRY
    }

    Result run();
}
