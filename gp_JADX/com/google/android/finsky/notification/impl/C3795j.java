package com.google.android.finsky.notification.impl;

import android.os.AsyncTask;
import com.google.android.finsky.cd.C2263f;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bb;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.tensorflow.lite.b;

final class C3795j extends AsyncTask {
    public final /* synthetic */ C3794i f19075a;

    C3795j(C3794i c3794i) {
        this.f19075a = c3794i;
    }

    private final Void m18147a() {
        Closeable closeable;
        Closeable open;
        Closeable fileOutputStream;
        IOException e;
        Boolean a;
        Throwable th;
        int i = -1;
        int size;
        try {
            List<C2263f> list = (List) this.f19075a.f19070a.m18077a().get();
            size = list.size();
            try {
                Object obj;
                C3788c c3788c = this.f19075a.f19072d;
                long a2 = C4678i.m21812a();
                ArrayList arrayList = new ArrayList();
                for (C2263f c2263f : list) {
                    if (isCancelled()) {
                        break;
                    }
                    bb bbVar = new bb();
                    if (a2 <= c2263f.f11242f + c3788c.f19055j) {
                        int i2 = c2263f.f11243g;
                        if (c3788c.f19054i == 1) {
                            obj = 1;
                        } else {
                            if (c3788c.f19054i != 2 && C3788c.m18128d()) {
                                C3798m c3798m;
                                Map hashMap;
                                long j;
                                ArrayList arrayList2;
                                Object[] toArray;
                                float f;
                                if (c3788c.f19052g == null) {
                                    File e2 = c3788c.m18138e();
                                    if (!e2.exists()) {
                                        closeable = null;
                                        try {
                                            open = c3788c.f19047b.getAssets().open("models/notification_delay.tflite");
                                            try {
                                                fileOutputStream = new FileOutputStream(c3788c.m18138e(), false);
                                            } catch (IOException e3) {
                                                e = e3;
                                                fileOutputStream = null;
                                                closeable = open;
                                                try {
                                                    FinskyLog.m21667d("Failed when copying model: %s", e);
                                                    C4679j.m21814a(closeable);
                                                    C4679j.m21814a(fileOutputStream);
                                                    if (e2.exists()) {
                                                        c3788c.f19052g = new b(e2);
                                                    }
                                                    if (c3788c.f19052g != null) {
                                                        c3798m = c3788c.f19050e;
                                                        hashMap = new HashMap();
                                                        C3798m.m18152a(i2, hashMap);
                                                        C3798m.m18155a(hashMap);
                                                        C3798m.m18157b(hashMap);
                                                        C3798m.m18154a("country_", C3798m.f19082f, c3798m.f19088b.getSimCountryIso().toLowerCase(Locale.US), hashMap);
                                                        C3798m.m18158c(hashMap);
                                                        C3798m.m18154a("has_mcc_mnc_", C3798m.f19083g, Integer.valueOf(c3798m.f19088b.getSimState() != 5 ? 0 : 1), hashMap);
                                                        a = c3798m.f19087a.m21696a();
                                                        if (a == null) {
                                                        }
                                                        C3798m.m18153a("battery_charging_", C3798m.f19085i, (float) j, hashMap);
                                                        C3798m.m18153a("battery_level_", C3798m.f19086j, (float) c3798m.f19087a.m21697b(), hashMap);
                                                        arrayList2 = new ArrayList();
                                                        C3798m.m18156a(hashMap, "notification_type_", C3798m.f19079c.length + 1, arrayList2);
                                                        C3798m.m18156a(hashMap, "day_of_week_", C3798m.f19080d.length + 1, arrayList2);
                                                        C3798m.m18156a(hashMap, "hour_of_day_", C3798m.f19081e.length + 1, arrayList2);
                                                        C3798m.m18156a(hashMap, "country_", C3798m.f19082f.length + 1, arrayList2);
                                                        C3798m.m18156a(hashMap, "sdk_version_", C3798m.f19084h.length + 1, arrayList2);
                                                        C3798m.m18156a(hashMap, "has_mcc_mnc_", C3798m.f19083g.length, arrayList2);
                                                        toArray = arrayList2.toArray(new Object[arrayList2.size()]);
                                                        if (c3788c.f19053h == null) {
                                                            c3788c.f19053h = new HashMap();
                                                            c3788c.f19053h.put(Integer.valueOf(0), (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 2}));
                                                        }
                                                        c3788c.f19052g.a(toArray, c3788c.f19053h);
                                                        f = ((float[][]) c3788c.f19053h.get(Integer.valueOf(0)))[0][1];
                                                        bbVar.a |= 8;
                                                        bbVar.e = f;
                                                        if (f > 0.4f) {
                                                            obj = 1;
                                                            if (obj != null) {
                                                                c3788c.m18131a(3052, c2263f, bbVar);
                                                            }
                                                            c3788c.m18131a(3051, c2263f, bbVar);
                                                            arrayList.add(c2263f);
                                                        }
                                                    }
                                                    obj = null;
                                                    if (obj != null) {
                                                        c3788c.m18131a(3052, c2263f, bbVar);
                                                    }
                                                    c3788c.m18131a(3051, c2263f, bbVar);
                                                    arrayList.add(c2263f);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    open = closeable;
                                                    closeable = fileOutputStream;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                            try {
                                                C4692x.m21843a(open, fileOutputStream);
                                                C4679j.m21814a(open);
                                                C4679j.m21814a(fileOutputStream);
                                            } catch (IOException e4) {
                                                e = e4;
                                                closeable = open;
                                                FinskyLog.m21667d("Failed when copying model: %s", e);
                                                C4679j.m21814a(closeable);
                                                C4679j.m21814a(fileOutputStream);
                                                if (e2.exists()) {
                                                    c3788c.f19052g = new b(e2);
                                                }
                                                if (c3788c.f19052g != null) {
                                                    c3798m = c3788c.f19050e;
                                                    hashMap = new HashMap();
                                                    C3798m.m18152a(i2, hashMap);
                                                    C3798m.m18155a(hashMap);
                                                    C3798m.m18157b(hashMap);
                                                    C3798m.m18154a("country_", C3798m.f19082f, c3798m.f19088b.getSimCountryIso().toLowerCase(Locale.US), hashMap);
                                                    C3798m.m18158c(hashMap);
                                                    if (c3798m.f19088b.getSimState() != 5) {
                                                    }
                                                    C3798m.m18154a("has_mcc_mnc_", C3798m.f19083g, Integer.valueOf(c3798m.f19088b.getSimState() != 5 ? 0 : 1), hashMap);
                                                    a = c3798m.f19087a.m21696a();
                                                    if (a == null) {
                                                    }
                                                    C3798m.m18153a("battery_charging_", C3798m.f19085i, (float) j, hashMap);
                                                    C3798m.m18153a("battery_level_", C3798m.f19086j, (float) c3798m.f19087a.m21697b(), hashMap);
                                                    arrayList2 = new ArrayList();
                                                    C3798m.m18156a(hashMap, "notification_type_", C3798m.f19079c.length + 1, arrayList2);
                                                    C3798m.m18156a(hashMap, "day_of_week_", C3798m.f19080d.length + 1, arrayList2);
                                                    C3798m.m18156a(hashMap, "hour_of_day_", C3798m.f19081e.length + 1, arrayList2);
                                                    C3798m.m18156a(hashMap, "country_", C3798m.f19082f.length + 1, arrayList2);
                                                    C3798m.m18156a(hashMap, "sdk_version_", C3798m.f19084h.length + 1, arrayList2);
                                                    C3798m.m18156a(hashMap, "has_mcc_mnc_", C3798m.f19083g.length, arrayList2);
                                                    toArray = arrayList2.toArray(new Object[arrayList2.size()]);
                                                    if (c3788c.f19053h == null) {
                                                        c3788c.f19053h = new HashMap();
                                                        c3788c.f19053h.put(Integer.valueOf(0), (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 2}));
                                                    }
                                                    c3788c.f19052g.a(toArray, c3788c.f19053h);
                                                    f = ((float[][]) c3788c.f19053h.get(Integer.valueOf(0)))[0][1];
                                                    bbVar.a |= 8;
                                                    bbVar.e = f;
                                                    if (f > 0.4f) {
                                                        obj = 1;
                                                        if (obj != null) {
                                                            c3788c.m18131a(3052, c2263f, bbVar);
                                                        }
                                                        c3788c.m18131a(3051, c2263f, bbVar);
                                                        arrayList.add(c2263f);
                                                    }
                                                }
                                                obj = null;
                                                if (obj != null) {
                                                    c3788c.m18131a(3052, c2263f, bbVar);
                                                }
                                                c3788c.m18131a(3051, c2263f, bbVar);
                                                arrayList.add(c2263f);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                closeable = fileOutputStream;
                                            }
                                        } catch (IOException e5) {
                                            e = e5;
                                            closeable = null;
                                            fileOutputStream = null;
                                            FinskyLog.m21667d("Failed when copying model: %s", e);
                                            C4679j.m21814a(closeable);
                                            C4679j.m21814a(fileOutputStream);
                                            if (e2.exists()) {
                                                c3788c.f19052g = new b(e2);
                                            }
                                            if (c3788c.f19052g != null) {
                                                c3798m = c3788c.f19050e;
                                                hashMap = new HashMap();
                                                C3798m.m18152a(i2, hashMap);
                                                C3798m.m18155a(hashMap);
                                                C3798m.m18157b(hashMap);
                                                C3798m.m18154a("country_", C3798m.f19082f, c3798m.f19088b.getSimCountryIso().toLowerCase(Locale.US), hashMap);
                                                C3798m.m18158c(hashMap);
                                                if (c3798m.f19088b.getSimState() != 5) {
                                                }
                                                C3798m.m18154a("has_mcc_mnc_", C3798m.f19083g, Integer.valueOf(c3798m.f19088b.getSimState() != 5 ? 0 : 1), hashMap);
                                                a = c3798m.f19087a.m21696a();
                                                if (a == null) {
                                                }
                                                C3798m.m18153a("battery_charging_", C3798m.f19085i, (float) j, hashMap);
                                                C3798m.m18153a("battery_level_", C3798m.f19086j, (float) c3798m.f19087a.m21697b(), hashMap);
                                                arrayList2 = new ArrayList();
                                                C3798m.m18156a(hashMap, "notification_type_", C3798m.f19079c.length + 1, arrayList2);
                                                C3798m.m18156a(hashMap, "day_of_week_", C3798m.f19080d.length + 1, arrayList2);
                                                C3798m.m18156a(hashMap, "hour_of_day_", C3798m.f19081e.length + 1, arrayList2);
                                                C3798m.m18156a(hashMap, "country_", C3798m.f19082f.length + 1, arrayList2);
                                                C3798m.m18156a(hashMap, "sdk_version_", C3798m.f19084h.length + 1, arrayList2);
                                                C3798m.m18156a(hashMap, "has_mcc_mnc_", C3798m.f19083g.length, arrayList2);
                                                toArray = arrayList2.toArray(new Object[arrayList2.size()]);
                                                if (c3788c.f19053h == null) {
                                                    c3788c.f19053h = new HashMap();
                                                    c3788c.f19053h.put(Integer.valueOf(0), (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 2}));
                                                }
                                                c3788c.f19052g.a(toArray, c3788c.f19053h);
                                                f = ((float[][]) c3788c.f19053h.get(Integer.valueOf(0)))[0][1];
                                                bbVar.a |= 8;
                                                bbVar.e = f;
                                                if (f > 0.4f) {
                                                    obj = 1;
                                                    if (obj != null) {
                                                        c3788c.m18131a(3052, c2263f, bbVar);
                                                    }
                                                    c3788c.m18131a(3051, c2263f, bbVar);
                                                    arrayList.add(c2263f);
                                                }
                                            }
                                            obj = null;
                                            if (obj != null) {
                                                c3788c.m18131a(3052, c2263f, bbVar);
                                            }
                                            c3788c.m18131a(3051, c2263f, bbVar);
                                            arrayList.add(c2263f);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            open = null;
                                        }
                                    }
                                    if (e2.exists()) {
                                        c3788c.f19052g = new b(e2);
                                    }
                                }
                                if (c3788c.f19052g != null) {
                                    c3798m = c3788c.f19050e;
                                    hashMap = new HashMap();
                                    C3798m.m18152a(i2, hashMap);
                                    C3798m.m18155a(hashMap);
                                    C3798m.m18157b(hashMap);
                                    C3798m.m18154a("country_", C3798m.f19082f, c3798m.f19088b.getSimCountryIso().toLowerCase(Locale.US), hashMap);
                                    C3798m.m18158c(hashMap);
                                    if (c3798m.f19088b.getSimState() != 5) {
                                    }
                                    C3798m.m18154a("has_mcc_mnc_", C3798m.f19083g, Integer.valueOf(c3798m.f19088b.getSimState() != 5 ? 0 : 1), hashMap);
                                    a = c3798m.f19087a.m21696a();
                                    j = (a == null && a.booleanValue()) ? 1 : 0;
                                    C3798m.m18153a("battery_charging_", C3798m.f19085i, (float) j, hashMap);
                                    C3798m.m18153a("battery_level_", C3798m.f19086j, (float) c3798m.f19087a.m21697b(), hashMap);
                                    arrayList2 = new ArrayList();
                                    C3798m.m18156a(hashMap, "notification_type_", C3798m.f19079c.length + 1, arrayList2);
                                    C3798m.m18156a(hashMap, "day_of_week_", C3798m.f19080d.length + 1, arrayList2);
                                    C3798m.m18156a(hashMap, "hour_of_day_", C3798m.f19081e.length + 1, arrayList2);
                                    C3798m.m18156a(hashMap, "country_", C3798m.f19082f.length + 1, arrayList2);
                                    C3798m.m18156a(hashMap, "sdk_version_", C3798m.f19084h.length + 1, arrayList2);
                                    C3798m.m18156a(hashMap, "has_mcc_mnc_", C3798m.f19083g.length, arrayList2);
                                    toArray = arrayList2.toArray(new Object[arrayList2.size()]);
                                    if (c3788c.f19053h == null) {
                                        c3788c.f19053h = new HashMap();
                                        c3788c.f19053h.put(Integer.valueOf(0), (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 2}));
                                    }
                                    c3788c.f19052g.a(toArray, c3788c.f19053h);
                                    f = ((float[][]) c3788c.f19053h.get(Integer.valueOf(0)))[0][1];
                                    bbVar.a |= 8;
                                    bbVar.e = f;
                                    if (f > 0.4f) {
                                        obj = 1;
                                    }
                                }
                            }
                            obj = null;
                        }
                        if (obj != null) {
                            c3788c.m18131a(3052, c2263f, bbVar);
                        }
                    }
                    c3788c.m18131a(3051, c2263f, bbVar);
                    arrayList.add(c2263f);
                }
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i3 = 0;
                int i4 = size;
                while (i3 < size2) {
                    try {
                        int i5 = i3 + 1;
                        obj = (C2263f) arrayList3.get(i3);
                        if (isCancelled()) {
                            break;
                        }
                        if (((Boolean) this.f19075a.f19070a.f19011b.mo1526c(obj).get()).booleanValue()) {
                            i4--;
                        } else {
                            FinskyLog.m21667d("Failed to delete a notification proxy.", new Object[0]);
                        }
                        if (obj.f11239c.equals("updates")) {
                            if (this.f19075a.f19072d.f19057l) {
                                this.f19075a.f19073e.m18148a(obj);
                            }
                            if (!this.f19075a.f19072d.f19057l || obj.ao_().f11246b.length > 0) {
                                this.f19075a.f19073e.m18149a((C3803r) this.f19075a.f19071c, obj);
                                i3 = i5;
                            } else {
                                this.f19075a.f19072d.m18131a(3053, obj, new bb());
                                i3 = i5;
                            }
                        } else {
                            FinskyLog.m21669e("Unsupported notification was delayed.", new Object[0]);
                            i3 = i5;
                        }
                    } catch (ExecutionException e6) {
                        th = e6;
                        i = i4;
                    } catch (InterruptedException e7) {
                        th = e7;
                        size = i4;
                    } catch (Throwable th6) {
                        th = th6;
                        size = i4;
                    }
                }
                if (i4 != 0) {
                    this.f19075a.m5802b(new C4030h(false, C3792g.m18143a(3600000, this.f19075a.f19072d.f19056k), null));
                } else {
                    this.f19075a.m5802b(null);
                }
            } catch (ExecutionException e8) {
                th = e8;
                i = size;
            } catch (InterruptedException e9) {
                th = e9;
            }
        } catch (ExecutionException e10) {
            th = e10;
            size = i;
            try {
                FinskyLog.m21663b(th, "Could not retrieve notifications for delivery. ", new Object[0]);
                if (size == 0) {
                    this.f19075a.m5802b(new C4030h(false, C3792g.m18143a(3600000, this.f19075a.f19072d.f19056k), null));
                } else {
                    this.f19075a.m5802b(null);
                }
                return null;
            } catch (Throwable th7) {
                th = th7;
                if (size == 0) {
                    this.f19075a.m5802b(new C4030h(false, C3792g.m18143a(3600000, this.f19075a.f19072d.f19056k), null));
                } else {
                    this.f19075a.m5802b(null);
                }
                throw th;
            }
        } catch (InterruptedException e11) {
            th = e11;
            size = -1;
            FinskyLog.m21663b(th, "Could not retrieve notifications for delivery. ", new Object[0]);
            if (size == 0) {
                this.f19075a.m5802b(null);
            } else {
                this.f19075a.m5802b(new C4030h(false, C3792g.m18143a(3600000, this.f19075a.f19072d.f19056k), null));
            }
            return null;
        } catch (Throwable th8) {
            th = th8;
            size = -1;
            if (size == 0) {
                this.f19075a.m5802b(null);
            } else {
                this.f19075a.m5802b(new C4030h(false, C3792g.m18143a(3600000, this.f19075a.f19072d.f19056k), null));
            }
            throw th;
        }
        return null;
        C4679j.m21814a(open);
        C4679j.m21814a(closeable);
        throw th;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18147a();
    }
}
