package com.google.android.finsky.zapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ZappDownloadReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        Log.i("DynamicModuleDownloader", "Received download complete broadcast for " + longExtra);
        context.startService(new Intent(context, ZappDownloadIntentService.class).putExtra("extra_download_id", longExtra));
    }
}
