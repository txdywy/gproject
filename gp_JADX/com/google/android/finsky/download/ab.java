package com.google.android.finsky.download;

import android.net.Uri;
import android.os.StrictMode;
import com.google.android.finsky.utils.FinskyLog;

final class ab implements Runnable {
    public final /* synthetic */ Uri f15253a;
    public final /* synthetic */ C2863z f15254b;

    ab(C2863z c2863z, Uri uri) {
        this.f15254b = c2863z;
        this.f15253a = uri;
    }

    public final void run() {
        C2863z c2863z = this.f15254b;
        Uri uri = this.f15253a;
        StrictMode.noteSlowCall("SystemDownloadManager.synchronousRemove");
        if (uri != null) {
            try {
                if (uri.toString() != null && !uri.equals(Uri.EMPTY)) {
                    c2863z.f15318f.delete(uri, null, null);
                }
            } catch (Exception e) {
                FinskyLog.m21665c("Exception while deleting %s: %s", uri, e);
            }
        }
    }
}
