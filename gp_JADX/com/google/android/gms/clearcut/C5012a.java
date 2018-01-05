package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.clearcut.internal.C5023a;
import com.google.android.gms.clearcut.internal.C5033k;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5085j;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.common.util.C5153h;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

public final class C5012a {
    public static C5085j f25520a = new C5085j();
    public static C4931e f25521b = new C5047t();
    @Deprecated
    public static final C5053a f25522c = new C5053a("ClearcutLogger.API", f25521b, f25520a);
    public static final ExperimentTokens[] f25523d = new ExperimentTokens[0];
    public static final String[] f25524e = new String[0];
    public static final byte[][] f25525f = new byte[0][];
    public final String f25526g;
    public final int f25527h;
    public String f25528i;
    public int f25529j;
    public String f25530k;
    public String f25531l;
    public final boolean f25532m;
    public int f25533n;
    public final C5018f f25534o;
    public final C5147b f25535p;
    public C5017e f25536q;
    public final C5015c f25537r;

    @Deprecated
    public C5012a(Context context, String str) {
        this(context, str, C5023a.m23221a(context), C5153h.f26089a, new C5033k(context));
    }

    private C5012a(Context context, String str, C5018f c5018f, C5147b c5147b, C5015c c5015c) {
        this.f25529j = -1;
        this.f25533n = 0;
        this.f25526g = context.getPackageName();
        this.f25527h = C5012a.m23178a(context);
        this.f25529j = -1;
        this.f25528i = str;
        this.f25530k = null;
        this.f25531l = null;
        this.f25532m = false;
        this.f25534o = c5018f;
        this.f25535p = c5147b;
        this.f25536q = new C5017e();
        this.f25533n = 0;
        this.f25537r = c5015c;
    }

    private static int m23178a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    public C5012a(Context context, String str, byte b) {
        this(context, str, C5023a.m23221a(context), C5153h.f26089a, new C5033k(context));
    }

    static /* synthetic */ int[] m23180a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int intValue = ((Integer) obj).intValue();
            int i3 = i2 + 1;
            iArr[i2] = intValue;
            i2 = i3;
        }
        return iArr;
    }
}
