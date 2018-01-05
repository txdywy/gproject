package org.chromium.net.impl;

import org.chromium.net.InlineExecutionProhibitedException;

final class bf implements Runnable {
    public final Runnable f40837a;
    public Thread f40838b;
    public InlineExecutionProhibitedException f40839c = null;

    bf(Runnable runnable, Thread thread) {
        this.f40837a = runnable;
        this.f40838b = thread;
    }

    public final void run() {
        if (Thread.currentThread() == this.f40838b) {
            this.f40839c = new InlineExecutionProhibitedException();
        } else {
            this.f40837a.run();
        }
    }
}
