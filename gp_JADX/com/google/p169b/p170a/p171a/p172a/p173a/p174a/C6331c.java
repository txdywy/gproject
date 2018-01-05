package com.google.p169b.p170a.p171a.p172a.p173a.p174a;

import android.content.ContentProvider;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.b.a.a.a.a.a.b;
import com.google.b.a.a.a.a.a.d;
import com.google.common.a.a;
import com.google.common.a.j;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class C6331c {
    public static FutureTask f31668a;
    public static final CountDownLatch f31669b = new CountDownLatch(1);
    public static final WeakHashMap f31670c = new WeakHashMap();
    public static C2194a f31671d;
    public static Configuration f31672e;
    public static Resources f31673f;
    public static final Object f31674g = new Object();

    public static synchronized void m28985a(Context context, C2194a c2194a) {
        synchronized (C6331c.class) {
            f31671d = c2194a;
            if (f31668a == null) {
                f31668a = new FutureTask(new d(context, c2194a));
                new Thread(f31668a).start();
                f31669b.countDown();
            }
        }
    }

    public static synchronized void m28983a(ContentProvider contentProvider, C2194a c2194a) {
        synchronized (C6331c.class) {
            Context context = contentProvider.getContext();
            if (context == null) {
                throw new RuntimeException("Can't init resources using null context");
            }
            C6331c.m28985a(context, c2194a);
        }
    }

    public static Resources m28981a(Context context) {
        Resources resources;
        synchronized (f31674g) {
            Configuration configuration = C6331c.m28988d(context).getResources().getConfiguration();
            if (f31672e == null || !f31672e.equals(configuration) || f31673f == null) {
                j a = C6331c.m28982a();
                if (a.a()) {
                    resources = (Resources) ((b) a.b()).a(context).second;
                    f31672e = new Configuration(configuration);
                    f31673f = resources;
                } else {
                    resources = C6331c.m28988d(context).getResources();
                }
            } else {
                resources = f31673f;
            }
        }
        return resources;
    }

    public static AssetManager m28986b(Context context) {
        j a = C6331c.m28982a();
        if (a.a()) {
            return (AssetManager) ((b) a.b()).a(context).first;
        }
        return C6331c.m28988d(context).getAssets();
    }

    private static Context m28988d(Context context) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return context2;
    }

    private static j m28982a() {
        if (Thread.interrupted()) {
            String concat = String.valueOf(Thread.currentThread().getName()).concat(" interrupted; falling back to original resources.");
            Log.w("filteredResources", concat);
            InterruptedException interruptedException = new InterruptedException(concat);
            return a.a;
        }
        try {
            Object obj;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long count = f31669b.getCount();
            f31669b.await();
            if (count > 0 || !f31668a.isDone()) {
                obj = 1;
            } else {
                obj = null;
            }
            j jVar = (j) f31668a.get();
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (obj == null || f31671d == null) {
                return jVar;
            }
            f31671d.mo2778a(elapsedRealtime);
            return jVar;
        } catch (InterruptedException e) {
            Log.w("filteredResources", String.valueOf(Thread.currentThread().getName()).concat(" interrupted during resource loading; falling back to original resources."));
            Thread.currentThread().interrupt();
            return a.a;
        } catch (ExecutionException e2) {
            return a.a;
        }
    }

    public static Theme m28987c(Context context) {
        Theme newTheme;
        synchronized (f31670c) {
            Pair pair = (Pair) f31670c.get(context);
            if (pair == null || pair.second == null) {
                int intValue;
                if (pair != null) {
                    intValue = ((Integer) pair.first).intValue();
                } else {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    intValue = applicationInfo.theme;
                    if (intValue == 0) {
                        intValue = applicationInfo.targetSdkVersion;
                        if (intValue < 11) {
                            intValue = 16973829;
                        } else if (intValue < 14) {
                            intValue = 16973931;
                        } else if (intValue <= 23) {
                            intValue = 16974120;
                        } else {
                            intValue = 16974143;
                        }
                    }
                }
                newTheme = (pair == null || pair.second == null) ? C6331c.m28981a(context).newTheme() : (Theme) pair.second;
                newTheme.applyStyle(intValue, true);
                f31670c.put(context, new Pair(Integer.valueOf(intValue), newTheme));
            } else {
                newTheme = (Theme) pair.second;
            }
        }
        return newTheme;
    }

    public static void m28984a(Context context, int i) {
        synchronized (f31670c) {
            Pair pair = (Pair) f31670c.get(context);
            if (pair == null || ((Integer) pair.first).intValue() != i) {
                f31670c.put(context, new Pair(Integer.valueOf(i), null));
                return;
            }
        }
    }
}
