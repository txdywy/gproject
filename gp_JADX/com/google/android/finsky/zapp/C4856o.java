package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.finsky.zapp.p267a.C4832a;
import com.google.android.finsky.zapp.p267a.C4834c;
import com.google.android.finsky.zapp.utils.C4867e;
import java.util.ArrayList;

final class C4856o {
    public static C4832a f25156a;
    public static boolean f25157b = false;

    static synchronized C4832a m22697a(Context context, C4850h c4850h) {
        C4832a a;
        Object obj = null;
        synchronized (C4856o.class) {
            if (f25156a == null && !f25157b) {
                if (C4856o.m22699b(context, c4850h)) {
                    Signature[] a2 = C4861t.m22742a(context, "com.android.vending");
                    Signature[] a3 = C4861t.m22741a(context);
                    if (a2 == null || a2.length == 0) {
                        Log.w("DynamicModuleDownloader", "Phonesky package is not signed -- possibly self-built package. Could not verify ...");
                        C4856o.m22698a(context, 12, -2002, c4850h);
                    } else if (a2.length > 1) {
                        Log.w("DynamicModuleDownloader", "Phonesky package has more than one signature. Could not verify...");
                        C4856o.m22698a(context, 12, -2002, c4850h);
                    } else {
                        String a4 = C4867e.m22755a(a2[0].toByteArray());
                        int i;
                        if (a4.equals("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M")) {
                            Log.i("DynamicModuleDownloader", "Phonesky signed with prod certificate. The dynamite downloader request is accepted.");
                            C4856o.m22698a(context, 11, 0, c4850h);
                            i = 1;
                        } else if (!a4.equals("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA")) {
                            Log.w("DynamicModuleDownloader", "Phonesky is not signed with test or prod key. Rejecting the dynamite downloader request.");
                            C4856o.m22698a(context, 12, -2002, c4850h);
                        } else if (a3 == null || a3.length == 0) {
                            Log.w("DynamicModuleDownloader", "Phonesky signed with test certificate. However, the calling app is not signed. Dynamite downloader request is rejected.");
                            C4856o.m22698a(context, 12, -2003, c4850h);
                        } else if (a3.length == 1 && C4867e.m22755a(a3[0].toByteArray()).equals("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA")) {
                            Log.i("DynamicModuleDownloader", "Phonesky signed with test certificate and the calling app is signed only with this certificate too. Dynamite downloader request is accepted.");
                            C4856o.m22698a(context, 11, 0, c4850h);
                            i = 1;
                        } else {
                            Log.w("DynamicModuleDownloader", "Phonesky signed with test certificate. However, the calling app is not signed with same key. Dynamite downloader request is rejected.");
                            C4856o.m22698a(context, 12, -2003, c4850h);
                        }
                    }
                    if (obj != null) {
                        a = C4856o.m22696a(context);
                        f25156a = a;
                        if (a == null) {
                            f25157b = true;
                        }
                    }
                }
                Log.w("DynamicModuleDownloader", "Phonesky signature could not be verified.");
                f25157b = true;
            }
            a = f25156a;
        }
        return a;
    }

    private static boolean m22699b(Context context, C4850h c4850h) {
        try {
            long j = (long) context.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
            Log.i("DynamicModuleDownloader", "Client lib fetch - min is 80830000but have " + j);
            boolean z = j >= 80830000;
            if (z) {
                return z;
            }
            C4856o.m22698a(context, 12, -2004, c4850h);
            return z;
        } catch (Throwable e) {
            Log.e("DynamicModuleDownloader", "Phonesky not found.", e);
            return false;
        }
    }

    private static C4832a m22696a(Context context) {
        try {
            IBinder iBinder = (IBinder) context.createPackageContext("com.android.vending", 3).getClassLoader().loadClass("com.google.android.finsky.zapp.DynamicModulesProvider").getMethod("downloader", new Class[]{Context.class}).invoke(null, new Object[]{context});
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.zapp.protocol.IDynamicModuleDownloader");
            if (queryLocalInterface instanceof C4832a) {
                return (C4832a) queryLocalInterface;
            }
            return new C4834c(iBinder);
        } catch (Exception e) {
            String str = "DynamicModuleDownloader";
            String str2 = "Dynamite class loading failed. ";
            String valueOf = String.valueOf(e.toString());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    private static synchronized void m22698a(Context context, int i, int i2, C4850h c4850h) {
        synchronized (C4856o.class) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            bundle.putInt("error_code", i2);
            bundle.putString("module_name", "");
            bundle.putString("module_version_code", "-1");
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundle);
            c4850h.mo4424a(context, arrayList);
        }
    }
}
