package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.finsky.zapp.p267a.C4841j;
import com.google.android.finsky.zapp.p267a.C4842k;
import com.google.android.finsky.zapp.utils.C4863a;
import com.google.android.finsky.zapp.utils.C4864b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class C4862u extends C4850h {
    public static final Intent f25169a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");
    public static final ReentrantLock f25170b = new ReentrantLock();
    public static C4870v f25171c = null;

    public final C4851i mo4423a(Context context, List list) {
        C4870v c4870v;
        Throwable th;
        boolean z = true;
        C4870v c4870v2 = null;
        ServiceConnection c4864b = new C4864b();
        if (context.bindService(f25169a, c4864b, 1)) {
            try {
                C4841j c4841j;
                IBinder a = c4864b.m22749a();
                if (a == null || a == null) {
                    c4841j = null;
                } else {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.finsky.zapp.protocol.IWearPlayModuleService");
                    if (queryLocalInterface instanceof C4841j) {
                        c4841j = (C4841j) queryLocalInterface;
                    } else {
                        Object c4842k = new C4842k(a);
                    }
                }
                if (c4841j == null) {
                    boolean z2;
                    Log.e("ZappWearConn", "Unable to connect to Wearsky");
                    f25170b.lock();
                    if (f25171c == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C4863a.m22748a(z2);
                    try {
                        f25171c = null;
                        try {
                            context.unbindService(c4864b);
                        } catch (IllegalStateException e) {
                        }
                        return null;
                    } finally {
                        f25170b.unlock();
                    }
                } else {
                    f25170b.lock();
                    try {
                        C4863a.m22748a(f25171c == null);
                        if (c4841j.mo4413a(context.getPackageName(), list) == null) {
                            Log.e("ZappWearConn", "Failed to start remote module fetch");
                            f25170b.unlock();
                            f25170b.lock();
                            if (f25171c != null) {
                                z = false;
                            }
                            C4863a.m22748a(z);
                            try {
                                f25171c = null;
                                try {
                                    context.unbindService(c4864b);
                                } catch (IllegalStateException e2) {
                                }
                                return null;
                            } finally {
                                f25170b.unlock();
                            }
                        } else {
                            c4870v = new C4870v();
                            try {
                                f25171c = c4870v;
                                f25170b.unlock();
                                C4851i c4851i = (C4851i) c4870v.f25179a.poll(3, TimeUnit.MINUTES);
                                if (c4851i == null) {
                                    Log.w("ZappWearConn", "Timed out waiting for zapp response");
                                }
                                f25170b.lock();
                                if (f25171c != c4870v) {
                                    z = false;
                                }
                                C4863a.m22748a(z);
                                try {
                                    f25171c = null;
                                    try {
                                        context.unbindService(c4864b);
                                        return c4851i;
                                    } catch (IllegalStateException e3) {
                                        return c4851i;
                                    }
                                } finally {
                                    f25170b.unlock();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    f25170b.unlock();
                                    throw th;
                                } catch (InterruptedException e4) {
                                    try {
                                        Thread.currentThread();
                                        Thread.interrupted();
                                        f25170b.lock();
                                        if (f25171c != c4870v) {
                                            z = false;
                                        }
                                        C4863a.m22748a(z);
                                        try {
                                            f25171c = null;
                                            try {
                                                context.unbindService(c4864b);
                                            } catch (IllegalStateException e5) {
                                            }
                                            return null;
                                        } finally {
                                            f25170b.unlock();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c4870v2 = c4870v;
                                        f25170b.lock();
                                        if (f25171c != c4870v2) {
                                            z = false;
                                        }
                                        C4863a.m22748a(z);
                                        try {
                                            f25171c = null;
                                            try {
                                                context.unbindService(c4864b);
                                            } catch (IllegalStateException e6) {
                                            }
                                            throw th;
                                        } finally {
                                            f25170b.unlock();
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e7) {
                        String str = "ZappWearConn";
                        String str2 = "Zapp request failed: ";
                        String valueOf = String.valueOf(e7.getMessage());
                        if (valueOf.length() != 0) {
                            valueOf = str2.concat(valueOf);
                        } else {
                            valueOf = new String(str2);
                        }
                        Log.e(str, valueOf);
                        f25170b.unlock();
                        f25170b.lock();
                        if (f25171c != null) {
                            z = false;
                        }
                        C4863a.m22748a(z);
                        f25171c = null;
                        f25170b.unlock();
                        try {
                            context.unbindService(c4864b);
                        } catch (IllegalStateException e8) {
                        }
                        return null;
                    } catch (Throwable th4) {
                        f25170b.unlock();
                    }
                }
            } catch (InterruptedException e9) {
                c4870v = null;
                Thread.currentThread();
                Thread.interrupted();
                f25170b.lock();
                if (f25171c != c4870v) {
                    z = false;
                }
                C4863a.m22748a(z);
                f25171c = null;
                context.unbindService(c4864b);
                return null;
            } catch (Throwable th5) {
                th = th5;
                f25170b.lock();
                if (f25171c != c4870v2) {
                    z = false;
                }
                C4863a.m22748a(z);
                f25171c = null;
                context.unbindService(c4864b);
                throw th;
            }
        }
        Log.e("ZappWearConn", "Unable to bind to Wearsky");
        return null;
    }
}
