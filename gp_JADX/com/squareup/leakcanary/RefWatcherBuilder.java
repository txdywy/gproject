package com.squareup.leakcanary;

import com.squareup.leakcanary.HeapDump.Listener;

public class RefWatcherBuilder {
    public DebuggerControl debuggerControl;
    public ExcludedRefs excludedRefs;
    public GcTrigger gcTrigger;
    public Listener heapDumpListener;
    public HeapDumper heapDumper;
    public WatchExecutor watchExecutor;

    public final RefWatcherBuilder heapDumpListener(Listener listener) {
        this.heapDumpListener = listener;
        return self();
    }

    public final RefWatcherBuilder excludedRefs(ExcludedRefs excludedRefs) {
        this.excludedRefs = excludedRefs;
        return self();
    }

    public final RefWatcherBuilder heapDumper(HeapDumper heapDumper) {
        this.heapDumper = heapDumper;
        return self();
    }

    public final RefWatcherBuilder debuggerControl(DebuggerControl debuggerControl) {
        this.debuggerControl = debuggerControl;
        return self();
    }

    public final RefWatcherBuilder watchExecutor(WatchExecutor watchExecutor) {
        this.watchExecutor = watchExecutor;
        return self();
    }

    public final RefWatcherBuilder gcTrigger(GcTrigger gcTrigger) {
        this.gcTrigger = gcTrigger;
        return self();
    }

    public final RefWatcher build() {
        if (isDisabled()) {
            return RefWatcher.DISABLED;
        }
        ExcludedRefs excludedRefs = this.excludedRefs;
        if (excludedRefs == null) {
            excludedRefs = defaultExcludedRefs();
        }
        Listener listener = this.heapDumpListener;
        if (listener == null) {
            listener = defaultHeapDumpListener();
        }
        DebuggerControl debuggerControl = this.debuggerControl;
        if (debuggerControl == null) {
            debuggerControl = defaultDebuggerControl();
        }
        HeapDumper heapDumper = this.heapDumper;
        if (heapDumper == null) {
            heapDumper = defaultHeapDumper();
        }
        WatchExecutor watchExecutor = this.watchExecutor;
        if (watchExecutor == null) {
            watchExecutor = defaultWatchExecutor();
        }
        GcTrigger gcTrigger = this.gcTrigger;
        if (gcTrigger == null) {
            gcTrigger = defaultGcTrigger();
        }
        return new RefWatcher(watchExecutor, debuggerControl, gcTrigger, heapDumper, listener, excludedRefs);
    }

    protected boolean isDisabled() {
        return false;
    }

    protected GcTrigger defaultGcTrigger() {
        return GcTrigger.DEFAULT;
    }

    protected DebuggerControl defaultDebuggerControl() {
        return DebuggerControl.NONE;
    }

    protected ExcludedRefs defaultExcludedRefs() {
        return ExcludedRefs.builder().build();
    }

    protected HeapDumper defaultHeapDumper() {
        return HeapDumper.NONE;
    }

    protected Listener defaultHeapDumpListener() {
        return Listener.NONE;
    }

    protected WatchExecutor defaultWatchExecutor() {
        return WatchExecutor.NONE;
    }

    protected final RefWatcherBuilder self() {
        return this;
    }
}
