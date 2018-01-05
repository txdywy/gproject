package me.leolin.shortcutbadger.p566a;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.p567b.C7881a;
import me.leolin.shortcutbadger.p567b.C7882b;

public class C7873h implements C7865a {
    public static int f40468a = -1;

    @TargetApi(11)
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        if (C7881a.m37776a(context, intent)) {
            context.sendBroadcast(intent);
        } else if (m37758b() == 6) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle);
            } catch (Throwable th) {
                String str = "unable to resolve intent: ";
                String valueOf = String.valueOf(intent.toString());
                ShortcutBadgeException shortcutBadgeException = new ShortcutBadgeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    public final List mo6568a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    private final int m37758b() {
        int i = f40468a;
        if (i >= 0) {
            return f40468a;
        }
        try {
            i = ((Integer) C7873h.m37756a(C7873h.m37755a("com.color.os.ColorBuild"), "getColorOSVERSION")).intValue();
        } catch (Exception e) {
            i = 0;
        }
        if (i == 0) {
            try {
                String b = C7873h.m37759b("ro.build.version.opporom");
                if (b.startsWith("V1.4")) {
                    return 3;
                }
                if (b.startsWith("V2.0")) {
                    return 4;
                }
                if (b.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Exception e2) {
            }
        }
        f40468a = i;
        return i;
    }

    private static Object m37756a(Class cls, String str) {
        Object obj = null;
        if (!(cls == null || C7873h.m37757a((Object) str))) {
            Method b = C7873h.m37760b(cls, str);
            if (b != null) {
                b.setAccessible(true);
                try {
                    obj = b.invoke(null, null);
                } catch (Throwable e) {
                    C6918a.f34250a.mo5841a(e);
                } catch (Throwable e2) {
                    C6918a.f34250a.mo5841a(e2);
                }
            }
        }
        return obj;
    }

    private static Method m37760b(Class cls, String str) {
        Method method = null;
        while (cls != null && !C7873h.m37757a((Object) str)) {
            try {
                cls.getMethods();
                cls.getDeclaredMethods();
                method = cls.getDeclaredMethod(str, null);
                break;
            } catch (Exception e) {
                try {
                    method = cls.getMethod(str, null);
                    break;
                } catch (Exception e2) {
                    if (cls.getSuperclass() == null) {
                        break;
                    }
                    cls = cls.getSuperclass();
                }
            }
        }
        return method;
    }

    private static Class m37755a(String str) {
        Class cls = null;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
        }
        return cls;
    }

    private static boolean m37757a(Object obj) {
        return obj == null || obj.toString().equals("") || obj.toString().trim().equals("null");
    }

    private static String m37759b(String str) {
        Closeable closeable;
        Throwable th;
        Closeable closeable2 = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            String str2 = "getprop ";
            String valueOf = String.valueOf(str);
            Closeable bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)).getInputStream()), MemoryMappedFileBuffer.DEFAULT_PADDING);
            try {
                valueOf = bufferedReader.readLine();
                bufferedReader.close();
                C7882b.m37778a(bufferedReader);
                return valueOf;
            } catch (IOException e) {
                closeable = bufferedReader;
                C7882b.m37778a(closeable);
                return null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = bufferedReader;
                C7882b.m37778a(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            closeable = null;
            C7882b.m37778a(closeable);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C7882b.m37778a(closeable2);
            throw th;
        }
    }
}
