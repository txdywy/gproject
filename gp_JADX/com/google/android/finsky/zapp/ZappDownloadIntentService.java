package com.google.android.finsky.zapp;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p028a.C0221j;
import android.util.Log;
import com.google.android.finsky.zapp.p267a.C4832a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class ZappDownloadIntentService extends IntentService {
    public ZappDownloadIntentService() {
        super("ZappDownloadIntentService");
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected void onHandleIntent(Intent intent) {
        Log.i("DynamicModuleDownloader", "Received download complete intent.");
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        C4850h a = C4852j.m22686a(this);
        C4861t c4861t = new C4861t();
        C4832a a2 = C4856o.m22697a(this, a);
        if (a2 != null) {
            Log.i("DynamicModuleDownloader", "Loaded Zapp Downloader from phonesky.");
        } else {
            Log.i("DynamicModuleDownloader", "Unable to load Zapp Downloader from phonesky, using built-in version.");
            a2 = C4858q.m22736a(this);
        }
        try {
            Bundle a3 = a2.mo4404a(longExtra);
            if (!a3.isEmpty()) {
                Intent intent2 = new Intent("com.google.android.finsky.zapp.ACTION_MODULE_DOWNLOAD_COMPLETE");
                intent2.putExtras(a3);
                C0221j.m1129a((Context) this).m1133a(intent2);
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
