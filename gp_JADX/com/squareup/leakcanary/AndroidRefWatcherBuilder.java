package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;
import com.squareup.leakcanary.HeapDump.Listener;
import java.util.concurrent.TimeUnit;

public final class AndroidRefWatcherBuilder extends RefWatcherBuilder {
    public static final long DEFAULT_WATCH_DELAY_MILLIS = TimeUnit.SECONDS.toMillis(5);
    public final Context context;

    AndroidRefWatcherBuilder(Context context) {
        this.context = context.getApplicationContext();
    }

    public final AndroidRefWatcherBuilder listenerServiceClass(Class cls) {
        return (AndroidRefWatcherBuilder) heapDumpListener(new ServiceHeapDumpListener(this.context, cls));
    }

    public final AndroidRefWatcherBuilder watchDelay(long j, TimeUnit timeUnit) {
        return (AndroidRefWatcherBuilder) watchExecutor(new AndroidWatchExecutor(timeUnit.toMillis(j)));
    }

    public final AndroidRefWatcherBuilder maxStoredHeapDumps(int i) {
        LeakDirectoryProvider defaultLeakDirectoryProvider = new DefaultLeakDirectoryProvider(this.context, i);
        LeakCanary.setDisplayLeakActivityDirectoryProvider(defaultLeakDirectoryProvider);
        return (AndroidRefWatcherBuilder) heapDumper(new AndroidHeapDumper(this.context, defaultLeakDirectoryProvider));
    }

    public final RefWatcher buildAndInstall() {
        RefWatcher build = build();
        if (build != RefWatcher.DISABLED) {
            LeakCanary.enableDisplayLeakActivity(this.context);
            ActivityRefWatcher.install((Application) this.context, build);
        }
        return build;
    }

    protected final boolean isDisabled() {
        return LeakCanary.isInAnalyzerProcess(this.context);
    }

    protected final HeapDumper defaultHeapDumper() {
        return new AndroidHeapDumper(this.context, new DefaultLeakDirectoryProvider(this.context));
    }

    protected final DebuggerControl defaultDebuggerControl() {
        return new AndroidDebuggerControl();
    }

    protected final Listener defaultHeapDumpListener() {
        return new ServiceHeapDumpListener(this.context, DisplayLeakService.class);
    }

    protected final ExcludedRefs defaultExcludedRefs() {
        return AndroidExcludedRefs.createAppDefaults().build();
    }

    protected final WatchExecutor defaultWatchExecutor() {
        return new AndroidWatchExecutor(DEFAULT_WATCH_DELAY_MILLIS);
    }
}
