package com.google.common.p420f.p421a;

import java.util.concurrent.Executor;

public enum ba implements Executor {
    ;

    private ba(String str) {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
