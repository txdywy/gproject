package com.google.android.finsky.bq;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.instantapps.InstantAppIntentData;

public final class C2157b extends AsyncTask {
    public final Context f10912a;
    public final String f10913b;
    public final C2160e f10914c;
    public final C2158d f10915d;
    public final C2495w f10916e;

    public C2157b(Context context, String str, C2160e c2160e, C2158d c2158d, C2495w c2495w) {
        this.f10912a = context;
        this.f10913b = str;
        this.f10914c = c2160e;
        this.f10915d = c2158d;
        this.f10916e = c2495w.m13365a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        InstantAppIntentData instantAppIntentData = (InstantAppIntentData) obj;
        switch (instantAppIntentData.f26382c) {
            case 0:
                Log.d("InstantAppsLauncher", "launch: RESULT_LAUNCH_OK");
                this.f10914c.mo3099a(instantAppIntentData.f26381b);
                return;
            case 1:
                if (VERSION.SDK_INT >= 26) {
                    Log.d("InstantAppsLauncher", "received no-launch from GMSCore, falling back to querying intent");
                    bb.m21792a(new C2161f(this.f10912a, this.f10913b, this.f10914c, this.f10916e), new Void[0]);
                    return;
                }
                Log.d("InstantAppsLauncher", "no launch: RESULT_NO_LAUNCH");
                this.f10916e.m13367a(new C2474c(2904));
                this.f10914c.mo3099a(null);
                return;
            case 2:
                Log.d("InstantAppsLauncher", "no launch: RESULT_NO_LAUNCH_HOLDBACK");
                this.f10916e.m13367a(new C2474c(2903));
                this.f10914c.mo3099a(null);
                return;
            case 3:
                Log.d("InstantAppsLauncher", "no launch: RESULT_USER_PREFERS_BROWSER");
                this.f10916e.m13367a(new C2474c(2902));
                this.f10914c.mo3099a(null);
                return;
            default:
                Log.e("InstantAppsLauncher", "no launch: unexpected result: " + instantAppIntentData.f26382c);
                this.f10916e.m13367a(new C2474c(2904));
                this.f10914c.mo3099a(null);
                return;
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f10915d.mo2682a(this.f10912a, this.f10913b);
    }
}
