package com.google.android.finsky.download;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.ax.C1533a;
import com.google.android.finsky.utils.FinskyLog;

final class C2840c extends AsyncTask {
    public final /* synthetic */ Uri f15255a;
    public final /* synthetic */ boolean f15256b;
    public final /* synthetic */ boolean f15257c;

    C2840c(Uri uri, boolean z, boolean z2) {
        this.f15255a = uri;
        this.f15256b = z;
        this.f15257c = z2;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        C2839b a = DownloadBroadcastReceiver.f15245a.mo3170a(this.f15255a);
        if (a == null) {
            FinskyLog.m21659a("Did not find download in queue for %s", this.f15255a);
            return;
        }
        if (num.intValue() != -1) {
            a.mo3152b(num.intValue());
        } else {
            FinskyLog.m21667d("DownloadBroadcastReceiver received invalid HTTP status of -1", new Object[0]);
        }
        if (this.f15256b) {
            DownloadBroadcastReceiver.f15245a.mo3181d(a);
        } else if (!this.f15257c) {
            FinskyLog.m21669e("Invalid DownloadBroadcastReceiver intent", new Object[0]);
        } else if (a.mo3165o()) {
            FinskyLog.m21659a("Received ACTION_DOWNLOAD_COMPLETE %s for %s - dropping because already in state %d.", num, a, Integer.valueOf(a.mo3166p()));
        } else if (C1533a.m8963a(num.intValue())) {
            DownloadBroadcastReceiver.f15245a.mo3174a(a, 3);
        } else {
            DownloadBroadcastReceiver.f15245a.mo3174a(a, 5);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C2845h b = DownloadBroadcastReceiver.f15245a.mo3177b(this.f15255a);
        if (b != null) {
            return Integer.valueOf(b.f15279d);
        }
        FinskyLog.m21665c("Unable to find %s in download manager", this.f15255a);
        return Integer.valueOf(-1);
    }
}
