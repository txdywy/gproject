package com.squareup.leakcanary.internal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.squareup.leakcanary.AbstractAnalysisResultService;
import com.squareup.leakcanary.CanaryLog;
import com.squareup.leakcanary.HeapAnalyzer;
import com.squareup.leakcanary.HeapDump;

public final class HeapAnalyzerService extends IntentService {
    public static final String HEAPDUMP_EXTRA = "heapdump_extra";
    public static final String LISTENER_CLASS_EXTRA = "listener_class_extra";

    public static void runAnalysis(Context context, HeapDump heapDump, Class cls) {
        Intent intent = new Intent(context, HeapAnalyzerService.class);
        intent.putExtra(LISTENER_CLASS_EXTRA, cls.getName());
        intent.putExtra(HEAPDUMP_EXTRA, heapDump);
        context.startService(intent);
    }

    public final Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new e(super.createConfigurationContext(configuration)) : null;
    }

    public final AssetManager getAssets() {
        return c.b(this);
    }

    public final Resources getResources() {
        return c.a(this);
    }

    public final Theme getTheme() {
        return c.c(this);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        c.a(this, i);
    }

    public HeapAnalyzerService() {
        super(HeapAnalyzerService.class.getSimpleName());
    }

    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            CanaryLog.m36611d("HeapAnalyzerService received a null intent, ignoring.", new Object[0]);
            return;
        }
        HeapDump heapDump = (HeapDump) intent.getSerializableExtra(HEAPDUMP_EXTRA);
        AbstractAnalysisResultService.sendResultToListener(this, intent.getStringExtra(LISTENER_CLASS_EXTRA), heapDump, new HeapAnalyzer(heapDump.excludedRefs).checkForLeak(heapDump.heapDumpFile, heapDump.referenceKey));
    }
}
