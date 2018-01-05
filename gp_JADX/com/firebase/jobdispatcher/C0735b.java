package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class C0735b implements ak {
    public final Context f4674a;

    public C0735b(Context context) {
        this.f4674a = context;
    }

    private static List m4832a(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        list.addAll(list2);
        return list;
    }

    private static List m4831a(List list, String str) {
        if (str == null) {
            return list;
        }
        if (list == null) {
            return C0735b.m4830a(str);
        }
        Collections.addAll(list, new String[]{str});
        return list;
    }

    private static List m4833a(boolean z, List list, String str) {
        if (z) {
            return C0735b.m4831a(list, str);
        }
        return list;
    }

    public final List mo1109a(C0751z c0751z) {
        List list;
        List a;
        Bundle b;
        Object obj;
        String str;
        String e;
        List a2;
        String i;
        List list2 = null;
        ag f = c0751z.mo1123f();
        if (f == ao.f4673a || (f instanceof ai) || (f instanceof ah)) {
            list = null;
        } else {
            list = C0735b.m4830a("Unknown trigger provided");
        }
        List a3 = C0735b.m4832a(null, list);
        am c = c0751z.mo1120c();
        int i2 = c.f4670b;
        int i3 = c.f4671c;
        int i4 = c.f4672d;
        boolean z = (i2 == 1 || i2 == 2) ? false : true;
        List a4 = C0735b.m4833a(z, null, "Unknown retry policy provided");
        if (i4 < i3) {
            z = true;
        } else {
            z = false;
        }
        a4 = C0735b.m4833a(z, a4, "Maximum backoff must be greater than or equal to initial backoff");
        if (300 > i4) {
            z = true;
        } else {
            z = false;
        }
        a4 = C0735b.m4833a(z, a4, "Maximum backoff must be greater than 300s (5 minutes)");
        if (i3 < 30) {
            z = true;
        } else {
            z = false;
        }
        list = C0735b.m4832a(a3, C0735b.m4833a(z, a4, "Initial backoff must be at least 30s"));
        if (c0751z.mo1125h() && c0751z.mo1123f() == ao.f4673a) {
            list = C0735b.m4831a(list, "ImmediateTriggers can't be used with recurring jobs");
        }
        Bundle b2 = c0751z.mo1119b();
        if (b2 != null) {
            Parcel obtain = Parcel.obtain();
            b2.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                a3 = C0735b.m4830a(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", new Object[]{Integer.valueOf(dataSize), Integer.valueOf(10240)}));
                a = C0735b.m4832a(list, a3);
                if (c0751z.mo1124g() <= 1) {
                    b = c0751z.mo1119b();
                    if (b == null) {
                        a3 = null;
                        for (String str2 : b.keySet()) {
                            obj = b.get(str2);
                            if (obj != null || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean)) {
                                str2 = null;
                            } else {
                                Locale locale = Locale.US;
                                String str3 = "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean";
                                Object[] objArr = new Object[2];
                                objArr[0] = obj == null ? null : obj.getClass();
                                objArr[1] = str2;
                                str2 = String.format(locale, str3, objArr);
                            }
                            a3 = C0735b.m4831a(a3, str2);
                        }
                    } else {
                        a3 = null;
                    }
                    list = C0735b.m4832a(a, a3);
                } else {
                    list = a;
                }
                e = c0751z.mo1122e();
                a2 = e != null ? C0735b.m4830a("Tag can't be null") : e.length() <= 100 ? C0735b.m4830a("Tag must be shorter than 100") : null;
                a2 = C0735b.m4832a(list, a2);
                i = c0751z.mo1126i();
                if (i != null || i.isEmpty()) {
                    list2 = C0735b.m4830a("Service can't be empty");
                } else if (this.f4674a == null) {
                    list2 = C0735b.m4830a("Context is null, can't query PackageManager");
                } else {
                    PackageManager packageManager = this.f4674a.getPackageManager();
                    if (packageManager == null) {
                        list2 = C0735b.m4830a("PackageManager is null, can't validate service");
                    } else {
                        Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
                        intent.setClassName(this.f4674a, i);
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            Log.e("FJD.GooglePlayReceiver", new StringBuilder(String.valueOf(i).length() + 145).append("Couldn't find a registered service with the name ").append(i).append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.").toString());
                        } else {
                            for (ResolveInfo resolveInfo : queryIntentServices) {
                                if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                                    break;
                                }
                            }
                            list2 = C0735b.m4830a(String.valueOf(i).concat(" is disabled."));
                        }
                    }
                }
                return C0735b.m4832a(a2, list2);
            }
        }
        a3 = null;
        a = C0735b.m4832a(list, a3);
        if (c0751z.mo1124g() <= 1) {
            list = a;
        } else {
            b = c0751z.mo1119b();
            if (b == null) {
                a3 = null;
            } else {
                a3 = null;
                for (String str22 : b.keySet()) {
                    obj = b.get(str22);
                    if (obj != null) {
                    }
                    str22 = null;
                    a3 = C0735b.m4831a(a3, str22);
                }
            }
            list = C0735b.m4832a(a, a3);
        }
        e = c0751z.mo1122e();
        if (e != null) {
            if (e.length() <= 100) {
            }
        }
        a2 = C0735b.m4832a(list, a2);
        i = c0751z.mo1126i();
        if (i != null) {
        }
        list2 = C0735b.m4830a("Service can't be empty");
        return C0735b.m4832a(a2, list2);
    }

    private static List m4830a(String str) {
        List arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }
}
