package com.google.android.finsky.datasync;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gms.gcm.C0946b;
import com.google.android.gms.gcm.C5205l;

public class BrowseDataSyncTaskService extends C0946b {
    public Context f13463a;

    public void onCreate() {
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1797a(this);
        super.onCreate();
    }

    public final int mo1162a(C5205l c5205l) {
        Context context = this.f13463a;
        Intent intent = new Intent(context, BrowseDataSyncService.class);
        intent.setData(Uri.parse("browsedatasyncservice://sync"));
        context.startService(intent);
        return 0;
    }
}
