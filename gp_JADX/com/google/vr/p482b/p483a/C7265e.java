package com.google.vr.p482b.p483a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import com.google.vr.p479a.p480a.C7250m;
import com.google.vr.p482b.p483a.p484a.C7251b;
import com.google.vr.p482b.p483a.p484a.C7257g;
import com.google.vr.p482b.p483a.p484a.C7258h;
import com.google.vr.p482b.p483a.p484a.C7259i;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class C7265e {
    public static final String f35532a = C7265e.class.getSimpleName();
    public static final Pattern f35533b = Pattern.compile("\\D+");
    public static final ComponentName f35534c = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
    public static Context f35535d;
    public static C7257g f35536e;

    @TargetApi(24)
    public static void m34033a(Activity activity) {
        if (VERSION.SDK_INT >= 24) {
            if (activity.getPackageManager().hasSystemFeature("android.software.vr.mode")) {
                try {
                    activity.setVrModeEnabled(true, f35534c);
                    return;
                } catch (Throwable e) {
                    Log.w(f35532a, "No VR service component found", e);
                    return;
                }
            }
            Log.w(f35532a, "VR mode requested but device does not support FEATURE_VR_MODE.");
        }
    }

    public static synchronized int m34029a(Context context) {
        int i;
        synchronized (C7265e.class) {
            try {
                if (f35536e != null) {
                    i = 0;
                } else {
                    int b = C7265e.m34035b(context);
                    if (b == 0) {
                        C7257g c7257g;
                        IBinder a = C7265e.m34030a(C7265e.m34036c(context).getClassLoader(), "com.google.vr.vrcore.payments.VrPaymentsApiProviderImpl");
                        if (a == null) {
                            c7257g = null;
                        } else {
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.vr.libraries.payments.api.IVrPaymentsApiProvider");
                            if (queryLocalInterface instanceof C7257g) {
                                c7257g = (C7257g) queryLocalInterface;
                            } else {
                                c7257g = new C7258h(a);
                            }
                        }
                        f35536e = c7257g;
                    }
                    i = b;
                }
            } catch (Throwable th) {
                Log.e(f35532a, "Exception when loading remote api provider", th);
                i = 4;
            }
        }
        return i;
    }

    public static C7263c m34031a(Activity activity, C7251b c7251b, C7259i c7259i) {
        if (C7265e.m34029a((Context) activity) != 0) {
            throw new IllegalStateException("Failed to load VR payments");
        }
        try {
            Object hashMap = new HashMap();
            hashMap.put("disableFallbackHtmlLinkHandling", Boolean.valueOf(true));
            hashMap.put("disableFallbackPremultAlphaTextShader", Boolean.valueOf(true));
            return new C7263c(f35536e.mo6359a(C7250m.m33871a(C7265e.m34036c(activity)), C7250m.m33871a((Object) activity), c7251b, c7259i, C7250m.m33871a(hashMap)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static int m34035b(Context context) {
        int a = VrCoreUtils.m34037a(context);
        String str = f35532a;
        String str2 = "VrCore availability: ";
        String valueOf = String.valueOf(VrCoreUtils.m34038a(a));
        Log.v(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        switch (a) {
            case 0:
                try {
                    if (C7265e.m34034a(C7265e.m34032a(context, context.getPackageName(), "com.google.vr.vrcore.PaymentsClientVersion"), C7265e.m34032a(context, "com.google.vr.vrcore", "com.google.vr.vrcore.PaymentsVersion"))) {
                        return 0;
                    }
                    return 5;
                } catch (Throwable e) {
                    Log.e(f35532a, "Cannot find package", e);
                    return 4;
                }
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 5;
            case 9:
                return 6;
            default:
                return 4;
        }
    }

    private static boolean m34034a(List list, List list2) {
        Iterator it = list2.iterator();
        Iterator it2 = list.iterator();
        while (it2.hasNext() && it.hasNext()) {
            if (((Long) it2.next()).longValue() > ((Long) it.next()).longValue()) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    private static List m34032a(Context context, String str, String str2) {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        CharSequence string = applicationInfo.metaData.getString(str2);
        if (string == null) {
            String str3 = applicationInfo.processName;
            throw new IllegalStateException(new StringBuilder((String.valueOf(str2).length() + 29) + String.valueOf(str3).length()).append("Unable to find ").append(str2).append(" meta-data in ").append(str3).toString());
        }
        List arrayList = new ArrayList();
        for (Object obj : f35533b.split(string)) {
            if (!TextUtils.isEmpty(obj)) {
                arrayList.add(Long.valueOf(Long.parseLong(obj)));
            }
        }
        return arrayList;
    }

    private static synchronized Context m34036c(Context context) {
        Context context2;
        synchronized (C7265e.class) {
            if (f35535d == null) {
                try {
                    f35535d = new C7266f(context.createPackageContext("com.google.vr.vrcore", 3));
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            context2 = f35535d;
        }
        return context2;
    }

    private static IBinder m34030a(ClassLoader classLoader, String str) {
        String str2;
        String valueOf;
        try {
            return (IBinder) classLoader.loadClass(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            str2 = "Unable to find dynamic class ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (InstantiationException e2) {
            str2 = "Unable to instantiate the remote class ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (IllegalAccessException e3) {
            str2 = "Unable to call the default constructor of ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (NoSuchMethodException e4) {
            str2 = "Unable to find constructor of class ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (InvocationTargetException e5) {
            str2 = "Exception when calling constructor of ";
            valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
