package me.leolin.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.p566a.C7866a;
import me.leolin.shortcutbadger.p566a.C7867b;
import me.leolin.shortcutbadger.p566a.C7868c;
import me.leolin.shortcutbadger.p566a.C7869d;
import me.leolin.shortcutbadger.p566a.C7870e;
import me.leolin.shortcutbadger.p566a.C7871f;
import me.leolin.shortcutbadger.p566a.C7872g;
import me.leolin.shortcutbadger.p566a.C7873h;
import me.leolin.shortcutbadger.p566a.C7874i;
import me.leolin.shortcutbadger.p566a.C7875j;
import me.leolin.shortcutbadger.p566a.C7877l;
import me.leolin.shortcutbadger.p566a.C7878m;
import me.leolin.shortcutbadger.p566a.C7879n;
import me.leolin.shortcutbadger.p566a.C7880o;

public final class C7883b {
    public static final List f40474a = new LinkedList();
    public static volatile Boolean f40475b;
    public static Object f40476c = new Object();
    public static C7865a f40477d;
    public static ComponentName f40478e;

    public static boolean m37780a(Context context, int i) {
        try {
            if (f40477d != null || C7883b.m37781b(context)) {
                f40477d.mo6569a(context, f40478e, i);
                return true;
            }
            throw new ShortcutBadgeException("No default launcher available");
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        } catch (Throwable e2) {
            if (Log.isLoggable("ShortcutBadger", 3)) {
                Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
            return false;
        }
    }

    public static boolean m37779a(Context context) {
        if (f40475b == null) {
            synchronized (f40476c) {
                if (f40475b == null) {
                    String str;
                    String valueOf;
                    Object obj = null;
                    int i = 0;
                    while (i < 3) {
                        try {
                            str = "ShortcutBadger";
                            String str2 = "Checking if platform supports badge counters, attempt ";
                            valueOf = String.valueOf(String.format("%d/%d.", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(3)}));
                            Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            if (C7883b.m37781b(context)) {
                                f40477d.mo6569a(context, f40478e, 0);
                                f40475b = Boolean.valueOf(true);
                                Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                                break;
                            }
                            valueOf = "Failed to initialize the badge counter.";
                            i++;
                            String str3 = valueOf;
                        } catch (Exception e) {
                            valueOf = e.getMessage();
                        }
                    }
                    if (f40475b == null) {
                        String str4 = "ShortcutBadger";
                        str = "Badge counter seems not supported in this platform: ";
                        valueOf = String.valueOf(obj);
                        Log.w(str4, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        f40475b = Boolean.valueOf(false);
                    }
                }
            }
        }
        return f40475b.booleanValue();
    }

    private static boolean m37781b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            String str = "ShortcutBadger";
            String str2 = "Unable to find launch intent for package ";
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            Log.e(str, valueOf);
            return false;
        }
        f40478e = launchIntentForPackage.getComponent();
        launchIntentForPackage = new Intent("android.intent.action.MAIN");
        launchIntentForPackage.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(launchIntentForPackage, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        str = resolveActivity.activityInfo.packageName;
        for (Class newInstance : f40474a) {
            C7865a c7865a;
            try {
                c7865a = (C7865a) newInstance.newInstance();
            } catch (Exception e) {
                c7865a = null;
            }
            if (c7865a != null && c7865a.mo6568a().contains(str)) {
                f40477d = c7865a;
                break;
            }
        }
        if (f40477d == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                f40477d = new C7878m();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                f40477d = new C7880o();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                f40477d = new C7873h();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                f40477d = new C7877l();
            } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                f40477d = new C7879n();
            } else {
                f40477d = new C7869d();
            }
        }
        return true;
    }

    static {
        f40474a.add(C7866a.class);
        f40474a.add(C7867b.class);
        f40474a.add(C7871f.class);
        f40474a.add(C7872g.class);
        f40474a.add(C7875j.class);
        f40474a.add(C7878m.class);
        f40474a.add(C7868c.class);
        f40474a.add(C7870e.class);
        f40474a.add(C7873h.class);
        f40474a.add(C7874i.class);
        f40474a.add(C7880o.class);
        f40474a.add(C7877l.class);
        f40474a.add(C7879n.class);
    }
}
