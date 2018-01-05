package com.google.android.finsky.wear;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.bn.C2132f;
import com.google.android.finsky.utils.FinskyLog;

final class C4783d extends AsyncTask {
    public final /* synthetic */ Context f24965a;
    public final /* synthetic */ String[] f24966b;
    public final /* synthetic */ Runnable f24967c;

    C4783d(Context context, String[] strArr, Runnable runnable) {
        this.f24965a = context;
        this.f24966b = strArr;
        this.f24967c = runnable;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f24967c.run();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] databaseNodes = C2132f.getDatabaseNodes(this.f24965a);
        for (int length = databaseNodes.length - 1; length >= 0; length--) {
            int length2;
            for (length2 = this.f24966b.length - 1; length2 >= 0; length2--) {
                if (databaseNodes[length].equals(this.f24966b[length2])) {
                    length2 = 1;
                    break;
                }
            }
            length2 = 0;
            if (length2 == 0) {
                FinskyLog.m21659a("Deleting out-of-date node %s", databaseNodes[length]);
                C2132f.m11164a(this.f24965a, databaseNodes[length]);
            }
        }
        return null;
    }
}
