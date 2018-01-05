package com.squareup.leakcanary;

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

public abstract class AbstractAnalysisResultService extends IntentService {
    public static final String HEAP_DUMP_EXTRA = "heap_dump_extra";
    public static final String RESULT_EXTRA = "result_extra";

    public static void sendResultToListener(Context context, String str, HeapDump heapDump, AnalysisResult analysisResult) {
        try {
            Intent intent = new Intent(context, Class.forName(str));
            intent.putExtra(HEAP_DUMP_EXTRA, heapDump);
            intent.putExtra(RESULT_EXTRA, analysisResult);
            context.startService(intent);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return c.b(this);
    }

    public Resources getResources() {
        return c.a(this);
    }

    public Theme getTheme() {
        return c.c(this);
    }

    protected abstract void onHeapAnalyzed(HeapDump heapDump, AnalysisResult analysisResult);

    public void setTheme(int i) {
        super.setTheme(i);
        c.a(this, i);
    }

    public AbstractAnalysisResultService() {
        super(AbstractAnalysisResultService.class.getName());
    }

    protected final void onHandleIntent(Intent intent) {
        HeapDump heapDump = (HeapDump) intent.getSerializableExtra(HEAP_DUMP_EXTRA);
        try {
            onHeapAnalyzed(heapDump, (AnalysisResult) intent.getSerializableExtra(RESULT_EXTRA));
        } finally {
            heapDump.heapDumpFile.delete();
        }
    }
}
