package com.google.android.finsky.bq;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.util.Log;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.instantapps.InstantAppIntentData;

protected final class com.google.android.finsky.bq.b extends AsyncTask
{

    public final Context a;
    public final String b;
    public final com.google.android.finsky.bq.e c;
    public final com.google.android.finsky.bq.d d;
    public final com.google.android.finsky.d.w e;

    b(Context p0, String p1, com.google.android.finsky.bq.e p2, com.google.android.finsky.bq.d p3, com.google.android.finsky.d.w p4) {
        AsyncTask();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4.a();
    }

    protected final Object doInBackground(Object[] p0) {
        return this.d.a(this.a, this.b);
    }

    protected final void onPostExecute(Object p0) {
        switch (((InstantAppIntentData)p0).c) {
            case 0:
                Log.d("InstantAppsLauncher", "launch: RESULT_LAUNCH_OK");
                this.c.a(((InstantAppIntentData)p0).b);
                break;
            case 1:
                if (Build$VERSION.SDK_INT >= 26) {
                    Log.d("InstantAppsLauncher", "received no-launch from GMSCore, falling back to querying intent");
                    com.google.android.finsky.utils.bb.a(new com.google.android.finsky.bq.f(this.a, this.b, this.c, this.e), new Void[0]);
                }
                else {
                    Log.d("InstantAppsLauncher", "no launch: RESULT_NO_LAUNCH");
                    this.e.a(new com.google.android.finsky.d.c(2904));
                    this.c.a(0);
                }
                break;
            case 2:
                Log.d("InstantAppsLauncher", "no launch: RESULT_NO_LAUNCH_HOLDBACK");
                this.e.a(new com.google.android.finsky.d.c(2903));
                this.c.a(0);
                break;
            case 3:
                Log.d("InstantAppsLauncher", "no launch: RESULT_USER_PREFERS_BROWSER");
                this.e.a(new com.google.android.finsky.d.c(2902));
                this.c.a(0);
                break;
            default:
                Log.e("InstantAppsLauncher", 41 + "no launch: unexpected result: " + ((InstantAppIntentData)p0).c);
                this.e.a(new com.google.android.finsky.d.c(2904));
                this.c.a(0);
                break;
        }
    }

}
