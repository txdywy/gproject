package com.squareup.leakcanary;

public interface WatchExecutor {
    public static final WatchExecutor NONE = new C75851();

    class C75851 implements WatchExecutor {
        C75851() {
        }

        public void execute(Retryable retryable) {
        }
    }

    void execute(Retryable retryable);
}
