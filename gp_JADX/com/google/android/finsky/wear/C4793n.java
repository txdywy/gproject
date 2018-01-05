package com.google.android.finsky.wear;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

final class C4793n extends AsyncTask {
    public final /* synthetic */ Context f25013a;
    public final /* synthetic */ String[] f25014b;
    public final /* synthetic */ Runnable f25015c;

    C4793n(Context context, String[] strArr, Runnable runnable) {
        this.f25013a = context;
        this.f25014b = strArr;
        this.f25015c = runnable;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f25015c.run();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        File[] listFiles = new File(this.f25013a.getCacheDir(), "wear").listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (int length = listFiles.length - 1; length >= 0; length--) {
                int length2;
                String decode = Uri.decode(listFiles[length].getName());
                for (length2 = this.f25014b.length - 1; length2 >= 0; length2--) {
                    if (decode.equals(this.f25014b[length2])) {
                        length2 = 1;
                        break;
                    }
                }
                length2 = 0;
                if (length2 == 0) {
                    FinskyLog.m21659a("Deleting files for out-of-date node %s", decode);
                    File[] listFiles2 = listFiles[length].listFiles();
                    if (listFiles2 != null && listFiles2.length > 0) {
                        for (File delete : listFiles2) {
                            delete.delete();
                        }
                    }
                    listFiles[length].delete();
                }
            }
        }
        return null;
    }
}
