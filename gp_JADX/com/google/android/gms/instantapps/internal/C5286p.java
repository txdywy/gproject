package com.google.android.gms.instantapps.internal;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.internal.of;
import com.google.android.gms.internal.og;
import com.google.android.gms.internal.wz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C5286p {
    public static Boolean f26469a = null;
    public static ContentProviderClient f26470b;

    @TargetApi(11)
    private static synchronized Bundle m24160a(Context context, String str, String str2) {
        Bundle call;
        synchronized (C5286p.class) {
            call = f26470b == null ? context.getContentResolver().call(ac.f26455a, str, str2, null) : C5286p.m24161a(str, str2);
        }
        return call;
    }

    @TargetApi(17)
    private static synchronized Bundle m24161a(String str, String str2) {
        Bundle call;
        synchronized (C5286p.class) {
            call = f26470b.call(str, str2, null);
        }
        return call;
    }

    @TargetApi(11)
    public static InstantAppIntentData m24162a(Context context, String str, boolean z) {
        Throwable e;
        while (context != null && str != null) {
            og a = ae.m24107a(1401);
            if (!C5286p.m24165b(context)) {
                return InstantAppIntentData.f26380a;
            }
            try {
                Bundle a2 = C5286p.m24160a(context, "method_getInstantAppIntentData", str);
                if (a2 == null) {
                    return InstantAppIntentData.f26380a;
                }
                byte[] byteArray = a2.getByteArray("key_instantAppIntentData");
                if (byteArray == null) {
                    return InstantAppIntentData.f26380a;
                }
                Object obj = InstantAppIntentData.CREATOR;
                am.m23733a(obj);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                SafeParcelable safeParcelable = (SafeParcelable) obj.createFromParcel(obtain);
                obtain.recycle();
                InstantAppIntentData instantAppIntentData = (InstantAppIntentData) safeParcelable;
                if (instantAppIntentData == null || instantAppIntentData.f26381b == null || !instantAppIntentData.f26381b.hasExtra("key_eventListProtoBytes")) {
                    return instantAppIntentData;
                }
                wz ofVar;
                Intent intent = instantAppIntentData.f26381b;
                og a3 = ae.m24107a(1402);
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_eventListProtoBytes");
                wz wzVar = null;
                if (byteArrayExtra != null) {
                    try {
                        wzVar = (of) wz.m24211a(new of(), byteArrayExtra, byteArrayExtra.length);
                    } catch (Throwable e2) {
                        Log.e("EventLogHelper", "Could not read event list proto", e2);
                    }
                }
                if (wzVar == null) {
                    ofVar = new of();
                    ofVar.f27250a = new og[]{a, a3};
                } else {
                    int length = wzVar.f27250a.length + 2;
                    List arrayList = new ArrayList(length);
                    arrayList.add(a);
                    Collections.addAll(arrayList, wzVar.f27250a);
                    arrayList.add(a3);
                    wzVar.f27250a = (og[]) arrayList.toArray(new og[length]);
                    ofVar = wzVar;
                }
                intent.putExtra("key_eventListProtoBytes", wz.m24212a(ofVar));
                return instantAppIntentData;
            } catch (Throwable e3) {
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", new Object[]{ac.f26455a, "method_getInstantAppIntentData"}), e3);
                C5286p.m24163a();
                if (!z) {
                    return InstantAppIntentData.f26380a;
                }
                z = false;
            } catch (IllegalArgumentException e4) {
                e3 = e4;
            } catch (RemoteException e5) {
                e3 = e5;
            }
        }
        throw new IllegalArgumentException("Parameter is null");
        Log.e("InstantAppsApi", String.format("While calling %s %s:\n", new Object[]{ac.f26455a, "method_getInstantAppIntentData"}), e3);
        return InstantAppIntentData.f26380a;
    }

    private static synchronized void m24163a() {
        synchronized (C5286p.class) {
            if (f26470b != null) {
                f26470b.release();
                f26470b = null;
            }
            f26469a = null;
        }
    }

    @TargetApi(17)
    private static synchronized boolean m24164a(Context context) {
        boolean z;
        synchronized (C5286p.class) {
            if (f26470b == null) {
                f26470b = context.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(ac.f26455a);
            }
            z = f26470b != null;
        }
        return z;
    }

    @TargetApi(11)
    private static synchronized boolean m24165b(Context context) {
        boolean booleanValue;
        synchronized (C5286p.class) {
            if (context == null) {
                throw new IllegalArgumentException("Parameter is null");
            }
            if (f26469a != null) {
                booleanValue = f26469a.booleanValue();
            } else {
                Boolean valueOf = Boolean.valueOf(C5286p.m24166c(context));
                f26469a = valueOf;
                booleanValue = valueOf.booleanValue();
            }
        }
        return booleanValue;
    }

    private static synchronized boolean m24166c(Context context) {
        boolean z = false;
        synchronized (C5286p.class) {
            if (C5295y.m24173a(context)) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(ac.f26455a.getAuthority(), 0);
                if (resolveContentProvider != null) {
                    if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                        String str = "InstantAppsApi";
                        String str2 = "Incorrect package name for instant apps content provider: ";
                        String valueOf = String.valueOf(resolveContentProvider.packageName);
                        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    } else if (VERSION.SDK_INT < 17 || C5286p.m24164a(context)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
