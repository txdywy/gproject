package com.google.android.wallet.p372d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.android.wallet.analytics.AppValidationResult;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6590b;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class C6616b extends AsyncTask {
    public final Context f32785a;
    public final LogContext f32786b;
    public final /* synthetic */ C6615a f32787c;

    public C6616b(C6615a c6615a, Context context, LogContext logContext) {
        this.f32787c = c6615a;
        this.f32785a = context.getApplicationContext();
        this.f32786b = logContext;
    }

    protected final void onPreExecute() {
        this.f32787c.m29649b(1, 0);
    }

    private static int m29994a(Context context, PackageManager packageManager, c cVar) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(cVar.c, 64);
            if (packageInfo.versionCode < cVar.d) {
                Log.e("AppValidationSidecar", String.format(Locale.US, "Version code (%d) is less than the required minimum=%d", new Object[]{Integer.valueOf(packageInfo.versionCode), Integer.valueOf(cVar.d)}));
                return 51;
            }
            Set hashSet = new HashSet(1);
            hashSet.add(cVar.e);
            if (!C6590b.m29905a(packageInfo, hashSet, "SHA-256")) {
                return 52;
            }
            if (cVar.b == 0) {
                Log.e("AppValidationSidecar", "Native app redirect type must be set.");
                return 54;
            } else if (cVar.b != 2 || C6616b.m29995a(context, cVar)) {
                return 0;
            } else {
                Log.e("AppValidationSidecar", "Native app redirect flows must start with an activity that has android:windowIsTranslucent=\"true\" specified in their manifest theme.");
                return 53;
            }
        } catch (NameNotFoundException e) {
            return 50;
        }
    }

    private static boolean m29995a(Context context, c cVar) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(C6589a.m29892a(cVar), 0);
        if (resolveActivity == null) {
            throw new IllegalStateException("Native app redirect flow activity not found for checking theme translucency.");
        }
        int i = resolveActivity.activityInfo.theme;
        try {
            Theme newTheme = packageManager.getResourcesForApplication(cVar.c).newTheme();
            newTheme.applyStyle(i, true);
            TypedArray obtainStyledAttributes = newTheme.obtainStyledAttributes(new int[]{16842840});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return z;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f32787c.f32784a = (Bundle) obj;
        this.f32787c.m29649b(2, 0);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Bundle bundle = new Bundle(r1);
        PackageManager packageManager = this.f32785a.getPackageManager();
        for (c cVar : (c[]) objArr) {
            TimedEvent b = C6537a.m29697b(this.f32786b, cVar.c);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int a = C6616b.m29994a(this.f32785a, packageManager, cVar);
            bundle.putParcelable(cVar.c, new AppValidationResult(cVar, a, SystemClock.elapsedRealtime() - elapsedRealtime));
            C6537a.m29689a(this.f32786b, b, a);
        }
        return bundle;
    }
}
