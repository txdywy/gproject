package com.google.android.finsky.download;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.Set;

public final class C2841d {
    public static final Set f15258a = C2842e.f15259a;

    public static C2839b m15020a(Context context, String str, boolean z) {
        String string = context.getResources().getString(C7582R.string.app_name);
        boolean z2 = C1503a.m8831b(context) && C2968a.m15380a(context).m15384c();
        return new C2842e(str, string, null, null, 1, null, -1, -1, z2, z, f15258a);
    }

    public static C2839b m15022a(String str, String str2, String str3, Uri uri, long j, long j2, boolean z, boolean z2, Set set) {
        if (TextUtils.isEmpty(str3)) {
            FinskyLog.m21667d("Empty packageName passed to newInstall.", new Object[0]);
        }
        return new C2842e(str, str2, str3, null, 2, uri, j, j2, z, z2, set);
    }

    public static C2839b m15021a(String str, String str2, String str3, Uri uri, long j, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str3)) {
            FinskyLog.m21667d("Empty packageName passed to newInstall.", new Object[0]);
        }
        return new C2862y(str, str2, str3, uri, j, j2, z, z2);
    }

    public static C2839b m15023a(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str3)) {
            FinskyLog.m21667d("Empty packageName passed to newWearableInstall.", new Object[0]);
        }
        if (TextUtils.isEmpty(str4)) {
            FinskyLog.m21667d("Empty nodeId passed to newWearableInstall.", new Object[0]);
        }
        return new C2842e(str, str2, str3, str4, 3, null, j, j2, z, z2, f15258a);
    }
}
