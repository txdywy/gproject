package com.squareup.leakcanary;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import com.squareup.leakcanary.Retryable.Result;

public final class AndroidWatchExecutor implements WatchExecutor {
    public static final String LEAK_CANARY_THREAD_NAME = "LeakCanary-Heap-Dump";
    public final Handler backgroundHandler;
    public final long initialDelayMillis;
    public final Handler mainHandler = new Handler(Looper.getMainLooper());
    public final long maxBackoffFactor;

    public AndroidWatchExecutor(long j) {
        HandlerThread handlerThread = new HandlerThread(LEAK_CANARY_THREAD_NAME);
        handlerThread.start();
        this.backgroundHandler = new Handler(handlerThread.getLooper());
        this.initialDelayMillis = j;
        this.maxBackoffFactor = Long.MAX_VALUE / j;
    }

    public final void execute(Retryable retryable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            waitForIdle(retryable, 0);
        } else {
            postWaitForIdle(retryable, 0);
        }
    }

    final void postWaitForIdle(final Retryable retryable, final int i) {
        this.mainHandler.post(new Runnable() {
            public void run() {
                AndroidWatchExecutor.this.waitForIdle(retryable, i);
            }
        });
    }

    final void waitForIdle(final Retryable retryable, final int i) {
        Looper.myQueue().addIdleHandler(new IdleHandler() {
            public boolean queueIdle() {
                AndroidWatchExecutor.this.postToBackgroundWithDelay(retryable, i);
                return false;
            }
        });
    }

    final void postToBackgroundWithDelay(final Retryable retryable, final int i) {
        this.backgroundHandler.postDelayed(new Runnable() {
            public void run() {
                if (retryable.run() == Result.RETRY) {
                    AndroidWatchExecutor.this.postWaitForIdle(retryable, i + 1);
                }
            }
        }, ((long) Math.min(Math.pow(2.0d, (double) i), (double) this.maxBackoffFactor)) * this.initialDelayMillis);
    }
}
