package com.squareup.leakcanary;

import android.content.Context;
import com.squareup.leakcanary.HeapDump.Listener;
import com.squareup.leakcanary.internal.HeapAnalyzerService;
import com.squareup.leakcanary.internal.LeakCanaryInternals;

public final class ServiceHeapDumpListener implements Listener {
    public final Context context;
    public final Class listenerServiceClass;

    public ServiceHeapDumpListener(Context context, Class cls) {
        LeakCanaryInternals.setEnabled(context, cls, true);
        LeakCanaryInternals.setEnabled(context, HeapAnalyzerService.class, true);
        this.listenerServiceClass = (Class) Preconditions.checkNotNull(cls, "listenerServiceClass");
        this.context = ((Context) Preconditions.checkNotNull(context, "context")).getApplicationContext();
    }

    public final void analyze(HeapDump heapDump) {
        Preconditions.checkNotNull(heapDump, "heapDump");
        HeapAnalyzerService.runAnalysis(this.context, heapDump, this.listenerServiceClass);
    }
}
