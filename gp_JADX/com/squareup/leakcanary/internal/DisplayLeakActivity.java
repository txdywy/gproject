package com.squareup.leakcanary.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.squareup.leakcanary.AnalysisResult;
import com.squareup.leakcanary.C7582R;
import com.squareup.leakcanary.CanaryLog;
import com.squareup.leakcanary.DefaultLeakDirectoryProvider;
import com.squareup.leakcanary.HeapDump;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.LeakDirectoryProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

public final class DisplayLeakActivity extends Activity {
    public static final String SHOW_LEAK_EXTRA = "show_latest";
    public static LeakDirectoryProvider leakDirectoryProvider = null;
    public Button actionButton;
    public TextView failureView;
    public List leaks;
    public ListView listView;
    public String visibleLeakRefKey;

    class C75861 implements OnMenuItemClickListener {
        C75861() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            DisplayLeakActivity.this.shareLeak();
            return true;
        }
    }

    class C75872 implements OnMenuItemClickListener {
        C75872() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            DisplayLeakActivity.this.shareHeapDump();
            return true;
        }
    }

    class C75883 implements OnClickListener {
        C75883() {
        }

        public void onClick(View view) {
            DisplayLeakActivity.this.deleteVisibleLeak();
        }
    }

    class C75905 implements OnClickListener {
        C75905() {
        }

        public void onClick(View view) {
            DisplayLeakActivity.this.deleteVisibleLeak();
        }
    }

    class C75916 implements OnItemClickListener {
        C75916() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            DisplayLeakActivity.this.visibleLeakRefKey = ((Leak) DisplayLeakActivity.this.leaks.get(i)).heapDump.referenceKey;
            DisplayLeakActivity.this.updateUi();
        }
    }

    class C75937 implements OnClickListener {

        class C75921 implements DialogInterface.OnClickListener {
            C75921() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DisplayLeakActivity.this.deleteAllLeaks();
            }
        }

        C75937() {
        }

        public void onClick(View view) {
            new Builder(DisplayLeakActivity.this).setIcon(17301543).setTitle(C7582R.string.leak_canary_delete_all).setMessage(C7582R.string.leak_canary_delete_all_leaks_title).setPositiveButton(17039370, new C75921()).setNegativeButton(17039360, null).show();
        }
    }

    class Leak {
        public final HeapDump heapDump;
        public final AnalysisResult result;
        public final File resultFile;

        Leak(HeapDump heapDump, AnalysisResult analysisResult, File file) {
            this.heapDump = heapDump;
            this.result = analysisResult;
            this.resultFile = file;
        }
    }

    class LeakListAdapter extends BaseAdapter {
        LeakListAdapter() {
        }

        public int getCount() {
            return DisplayLeakActivity.this.leaks.size();
        }

        public Leak getItem(int i) {
            return (Leak) DisplayLeakActivity.this.leaks.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CharSequence concat;
            if (view == null) {
                view = LayoutInflater.from(DisplayLeakActivity.this).inflate(C7582R.layout.leak_canary_leak_row, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(C7582R.id.leak_canary_row_text);
            TextView textView2 = (TextView) view.findViewById(C7582R.id.leak_canary_row_time);
            Leak leak = (Leak) getItem(i);
            String str = (DisplayLeakActivity.this.leaks.size() - i) + ". ";
            String classSimpleName;
            String formatShortFileSize;
            if (leak.result.failure == null) {
                classSimpleName = DisplayLeakActivity.classSimpleName(leak.result.className);
                formatShortFileSize = Formatter.formatShortFileSize(DisplayLeakActivity.this, leak.result.retainedHeapSize);
                Object string = DisplayLeakActivity.this.getString(C7582R.string.leak_canary_class_has_leaked, new Object[]{classSimpleName, formatShortFileSize});
                if (leak.result.excludedLeak) {
                    string = DisplayLeakActivity.this.getString(C7582R.string.leak_canary_excluded_row, new Object[]{string});
                }
                str = String.valueOf(str);
                classSimpleName = String.valueOf(string);
                concat = classSimpleName.length() != 0 ? str.concat(classSimpleName) : new String(str);
            } else {
                classSimpleName = leak.result.failure.getClass().getSimpleName();
                formatShortFileSize = leak.result.failure.getMessage();
                concat = new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(classSimpleName).length()) + String.valueOf(formatShortFileSize).length()).append(str).append(classSimpleName).append(" ").append(formatShortFileSize).toString();
            }
            textView.setText(concat);
            textView2.setText(DateUtils.formatDateTime(DisplayLeakActivity.this, leak.resultFile.lastModified(), 17));
            return view;
        }
    }

    class LoadLeaks implements Runnable {
        public static final Executor backgroundExecutor = LeakCanaryInternals.newSingleThreadExecutor("LoadLeaks");
        public static final List inFlight = new ArrayList();
        public DisplayLeakActivity activityOrNull;
        public final LeakDirectoryProvider leakDirectoryProvider;
        public final Handler mainHandler = new Handler(Looper.getMainLooper());

        class C75941 implements FilenameFilter {
            C75941(LoadLeaks loadLeaks) {
            }

            public boolean accept(File file, String str) {
                return str.endsWith(".result");
            }
        }

        class C75952 implements Comparator {
            C75952(LoadLeaks loadLeaks) {
            }

            public int compare(Leak leak, Leak leak2) {
                return Long.valueOf(leak2.resultFile.lastModified()).compareTo(Long.valueOf(leak.resultFile.lastModified()));
            }
        }

        static void load(DisplayLeakActivity displayLeakActivity, LeakDirectoryProvider leakDirectoryProvider) {
            Runnable loadLeaks = new LoadLeaks(displayLeakActivity, leakDirectoryProvider);
            inFlight.add(loadLeaks);
            backgroundExecutor.execute(loadLeaks);
        }

        static void forgetActivity() {
            for (LoadLeaks loadLeaks : inFlight) {
                loadLeaks.activityOrNull = null;
            }
            inFlight.clear();
        }

        LoadLeaks(DisplayLeakActivity displayLeakActivity, LeakDirectoryProvider leakDirectoryProvider) {
            this.activityOrNull = displayLeakActivity;
            this.leakDirectoryProvider = leakDirectoryProvider;
        }

        public void run() {
            Throwable e;
            Throwable th;
            final List arrayList = new ArrayList();
            for (File file : this.leakDirectoryProvider.listFiles(new C75941(this))) {
                FileInputStream fileInputStream;
                FileInputStream fileInputStream2 = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        arrayList.add(new Leak((HeapDump) objectInputStream.readObject(), (AnalysisResult) objectInputStream.readObject(), file));
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        fileInputStream = fileInputStream2;
                        if (file.delete()) {
                            try {
                                CanaryLog.m36612d(e, "Could not read result file %s, could not delete it either.", file);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            CanaryLog.m36612d(e, "Could not read result file %s, deleted it.", file);
                        }
                        if (fileInputStream == null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        if (file.delete()) {
                            CanaryLog.m36612d(e, "Could not read result file %s, could not delete it either.", file);
                        } else {
                            CanaryLog.m36612d(e, "Could not read result file %s, deleted it.", file);
                        }
                        if (fileInputStream == null) {
                            fileInputStream.close();
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                    fileInputStream = fileInputStream2;
                    if (file.delete()) {
                        CanaryLog.m36612d(e, "Could not read result file %s, deleted it.", file);
                    } else {
                        CanaryLog.m36612d(e, "Could not read result file %s, could not delete it either.", file);
                    }
                    if (fileInputStream == null) {
                        fileInputStream.close();
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    fileInputStream = null;
                    if (file.delete()) {
                        CanaryLog.m36612d(e, "Could not read result file %s, could not delete it either.", file);
                    } else {
                        CanaryLog.m36612d(e, "Could not read result file %s, deleted it.", file);
                    }
                    if (fileInputStream == null) {
                        fileInputStream.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            }
            Collections.sort(arrayList, new C75952(this));
            this.mainHandler.post(new Runnable() {
                public void run() {
                    LoadLeaks.inFlight.remove(LoadLeaks.this);
                    if (LoadLeaks.this.activityOrNull != null) {
                        LoadLeaks.this.activityOrNull.leaks = arrayList;
                        LoadLeaks.this.activityOrNull.updateUi();
                    }
                }
            });
            return;
            throw th;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e8) {
                }
            }
            throw th;
        }
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

    public static PendingIntent createPendingIntent(Context context) {
        return createPendingIntent(context, null);
    }

    public static PendingIntent createPendingIntent(Context context, String str) {
        Intent intent = new Intent(context, DisplayLeakActivity.class);
        intent.putExtra(SHOW_LEAK_EXTRA, str);
        intent.setFlags(335544320);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }

    public static void setLeakDirectoryProvider(LeakDirectoryProvider leakDirectoryProvider) {
        leakDirectoryProvider = leakDirectoryProvider;
    }

    private static LeakDirectoryProvider leakDirectoryProvider(Context context) {
        LeakDirectoryProvider leakDirectoryProvider = leakDirectoryProvider;
        if (leakDirectoryProvider == null) {
            return new DefaultLeakDirectoryProvider(context);
        }
        return leakDirectoryProvider;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.visibleLeakRefKey = bundle.getString("visibleLeakRefKey");
        } else {
            Intent intent = getIntent();
            if (intent.hasExtra(SHOW_LEAK_EXTRA)) {
                this.visibleLeakRefKey = intent.getStringExtra(SHOW_LEAK_EXTRA);
            }
        }
        this.leaks = (List) getLastNonConfigurationInstance();
        setContentView(C7582R.layout.leak_canary_display_leak);
        this.listView = (ListView) findViewById(C7582R.id.leak_canary_display_leak_list);
        this.failureView = (TextView) findViewById(C7582R.id.leak_canary_display_leak_failure);
        this.actionButton = (Button) findViewById(C7582R.id.leak_canary_action);
        updateUi();
    }

    public final Object onRetainNonConfigurationInstance() {
        return this.leaks;
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("visibleLeakRefKey", this.visibleLeakRefKey);
    }

    protected final void onResume() {
        super.onResume();
        LoadLeaks.load(this, leakDirectoryProvider(this));
    }

    public final void setTheme(int i) {
        if (i == C7582R.style.leak_canary_LeakCanary_Base) {
            c.a(this, i);
            super.setTheme(i);
        }
    }

    protected final void onDestroy() {
        super.onDestroy();
        LoadLeaks.forgetActivity();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        Leak visibleLeak = getVisibleLeak();
        if (visibleLeak == null) {
            return false;
        }
        menu.add(C7582R.string.leak_canary_share_leak).setOnMenuItemClickListener(new C75861());
        if (visibleLeak.heapDump.heapDumpFile.exists()) {
            menu.add(C7582R.string.leak_canary_share_heap_dump).setOnMenuItemClickListener(new C75872());
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.visibleLeakRefKey = null;
            updateUi();
        }
        return true;
    }

    public final void onBackPressed() {
        if (this.visibleLeakRefKey != null) {
            this.visibleLeakRefKey = null;
            updateUi();
            return;
        }
        super.onBackPressed();
    }

    final void shareLeak() {
        Leak visibleLeak = getVisibleLeak();
        String leakInfo = LeakCanary.leakInfo(this, visibleLeak.heapDump, visibleLeak.result, true);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", leakInfo);
        startActivity(Intent.createChooser(intent, getString(C7582R.string.leak_canary_share_with)));
    }

    final void shareHeapDump() {
        File file = getVisibleLeak().heapDump.heapDumpFile;
        file.setReadable(true, false);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/octet-stream");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        startActivity(Intent.createChooser(intent, getString(C7582R.string.leak_canary_share_with)));
    }

    final void deleteVisibleLeak() {
        Leak visibleLeak = getVisibleLeak();
        File file = visibleLeak.heapDump.heapDumpFile;
        if (!visibleLeak.resultFile.delete()) {
            CanaryLog.m36611d("Could not delete result file %s", visibleLeak.resultFile.getPath());
        }
        if (!file.delete()) {
            CanaryLog.m36611d("Could not delete heap dump file %s", file.getPath());
        }
        this.visibleLeakRefKey = null;
        this.leaks.remove(visibleLeak);
        updateUi();
    }

    final void deleteAllLeaks() {
        leakDirectoryProvider(this).clearLeakDirectory();
        this.leaks = Collections.emptyList();
        updateUi();
    }

    final void updateUi() {
        if (this.leaks == null) {
            setTitle("Loading leaks...");
            return;
        }
        if (this.leaks.isEmpty()) {
            this.visibleLeakRefKey = null;
        }
        Leak visibleLeak = getVisibleLeak();
        if (visibleLeak == null) {
            this.visibleLeakRefKey = null;
        }
        ListAdapter adapter = this.listView.getAdapter();
        this.listView.setVisibility(0);
        this.failureView.setVisibility(8);
        if (visibleLeak != null) {
            AnalysisResult analysisResult = visibleLeak.result;
            String valueOf;
            String valueOf2;
            if (analysisResult.failure != null) {
                this.listView.setVisibility(8);
                this.failureView.setVisibility(0);
                valueOf = String.valueOf(getString(C7582R.string.leak_canary_failure_report));
                valueOf2 = String.valueOf(Log.getStackTraceString(analysisResult.failure));
                this.failureView.setText(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                setTitle(C7582R.string.leak_canary_analysis_failed);
                invalidateOptionsMenu();
                getActionBar().setDisplayHomeAsUpEnabled(true);
                this.actionButton.setVisibility(0);
                this.actionButton.setText(C7582R.string.leak_canary_delete);
                this.actionButton.setOnClickListener(new C75883());
                this.listView.setAdapter(null);
                return;
            }
            DisplayLeakAdapter displayLeakAdapter;
            if (adapter instanceof DisplayLeakAdapter) {
                displayLeakAdapter = (DisplayLeakAdapter) adapter;
            } else {
                displayLeakAdapter = new DisplayLeakAdapter();
                this.listView.setAdapter(displayLeakAdapter);
                this.listView.setOnItemClickListener(new OnItemClickListener(this) {
                    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        displayLeakAdapter.toggleRow(i);
                    }
                });
                invalidateOptionsMenu();
                getActionBar().setDisplayHomeAsUpEnabled(true);
                this.actionButton.setVisibility(0);
                this.actionButton.setText(C7582R.string.leak_canary_delete);
                this.actionButton.setOnClickListener(new C75905());
            }
            HeapDump heapDump = visibleLeak.heapDump;
            displayLeakAdapter.update(analysisResult.leakTrace, heapDump.referenceKey, heapDump.referenceName);
            valueOf2 = Formatter.formatShortFileSize(this, analysisResult.retainedHeapSize);
            valueOf = classSimpleName(analysisResult.className);
            setTitle(getString(C7582R.string.leak_canary_class_has_leaked, new Object[]{valueOf, valueOf2}));
            return;
        }
        int i;
        if (adapter instanceof LeakListAdapter) {
            ((LeakListAdapter) adapter).notifyDataSetChanged();
        } else {
            this.listView.setAdapter(new LeakListAdapter());
            this.listView.setOnItemClickListener(new C75916());
            invalidateOptionsMenu();
            setTitle(getString(C7582R.string.leak_canary_leak_list_title, new Object[]{getPackageName()}));
            getActionBar().setDisplayHomeAsUpEnabled(false);
            this.actionButton.setText(C7582R.string.leak_canary_delete_all);
            this.actionButton.setOnClickListener(new C75937());
        }
        Button button = this.actionButton;
        if (this.leaks.size() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        button.setVisibility(i);
    }

    final Leak getVisibleLeak() {
        if (this.leaks == null) {
            return null;
        }
        for (Leak leak : this.leaks) {
            if (leak.heapDump.referenceKey.equals(this.visibleLeakRefKey)) {
                return leak;
            }
        }
        return null;
    }

    static String classSimpleName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
