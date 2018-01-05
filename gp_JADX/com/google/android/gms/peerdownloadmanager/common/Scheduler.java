package com.google.android.gms.peerdownloadmanager.common;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.p282a.C5050a;
import com.google.android.gms.common.util.C5146a;
import com.google.android.gms.peerdownloadmanager.service.PdmTransferIntentReceiver;
import com.google.common.b.bw;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Scheduler implements Parcelable {
    public static final Creator CREATOR = new C5391v();
    public static final int f27913a = ((int) TimeUnit.MINUTES.toSeconds(1));
    public static final int f27914b = ((int) TimeUnit.HOURS.toSeconds(1));
    public static final int f27915c = ((int) TimeUnit.DAYS.toSeconds(1));
    public final boolean f27916d;
    public final C5394y f27917e;
    public final C5395z f27918f;
    public final boolean f27919g;
    public final boolean f27920h;
    public final boolean f27921i;
    public final int f27922j;
    public final int f27923k;
    public final int f27924l;
    public final int f27925m;
    public final int f27926n;
    public final int f27927o;
    public final boolean f27928p;
    public final int f27929q;
    public final int f27930r;
    public final int f27931s;
    public final int f27932t;
    public final ArrayList f27933u;
    public final Notification f27934v;

    public Scheduler(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        this.f27916d = parcel.readInt() != 0;
        this.f27917e = C5394y.values()[parcel.readInt()];
        this.f27918f = C5395z.values()[parcel.readInt()];
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f27919g = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f27920h = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f27921i = z;
        this.f27922j = parcel.readInt();
        this.f27923k = parcel.readInt();
        this.f27924l = parcel.readInt();
        this.f27925m = parcel.readInt();
        this.f27926n = parcel.readInt();
        this.f27927o = parcel.readInt();
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.f27928p = z2;
        this.f27929q = parcel.readInt();
        this.f27930r = parcel.readInt();
        this.f27932t = parcel.readInt();
        this.f27931s = parcel.readInt();
        this.f27933u = new ArrayList();
        int readInt = parcel.readInt();
        while (i < readInt) {
            this.f27933u.add(bw.a(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt())));
            i++;
        }
        if (parcel.readInt() == 0) {
            this.f27934v = null;
        } else {
            this.f27934v = new Notification(parcel);
        }
    }

    public final long m26132a() {
        C5393x a = m26127a(Calendar.getInstance());
        int i = this.f27929q;
        int i2 = this.f27930r;
        int i3 = this.f27932t;
        int i4 = this.f27931s;
        ArrayList arrayList = this.f27933u;
        String valueOf = String.valueOf(a);
        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 41).append(valueOf).append(": getNextWakeupTime: interval=").append(i).toString());
        int i5 = a.f28010b / i;
        int i6 = i5 * i;
        int i7 = i6 + i;
        String valueOf2 = String.valueOf(a);
        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf2).length() + 30).append(valueOf2).append(": curIntervalIndex=").append(i5).toString());
        String valueOf3 = String.valueOf(a);
        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf3).length() + 34).append(valueOf3).append(": curIntervalStartTime=").append(i6).toString());
        String valueOf4 = String.valueOf(a);
        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf4).length() + 35).append(valueOf4).append(": nextIntervalStartTime=").append(i7).toString());
        Random random = new Random((long) (a.f28009a + i7));
        i6 = i7;
        while (true) {
            int nextInt = i6 + random.nextInt(i);
            int i8 = a.f28009a + nextInt;
            valueOf = String.valueOf(a);
            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 55).append(valueOf).append(": attempting wakeOffset ").append(nextInt).append(", %3600= ").append(nextInt % f27914b).toString());
            if (!m26129a(nextInt, C5392w.HOUR, i2)) {
                if (!m26129a(nextInt, C5392w.HALF_HOUR, i3)) {
                    if (!m26129a(nextInt, C5392w.QUARTER_HOUR, i4)) {
                        boolean z;
                        valueOf = String.valueOf(a);
                        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 54).append(valueOf).append(": ").append(nextInt).append(" is not in the exclusion zones, moving on").toString());
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        boolean z2 = false;
                        int i9 = 0;
                        while (i9 < size) {
                            int i10 = i9 + 1;
                            bw bwVar = (bw) arrayList2.get(i9);
                            int i11 = nextInt % f27915c;
                            boolean a2 = bwVar.a(Integer.valueOf(nextInt));
                            valueOf = String.valueOf(bwVar);
                            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 69).append("checking if ").append(nextInt).append(", relative time ").append(i11).append(", is within ").append(valueOf).append(": ").append(a2).toString());
                            String valueOf5 = String.valueOf(a);
                            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf5).length() + 38).append(valueOf5).append(": ").append(nextInt).append(" inRestrictedRange: ").append(a2).toString());
                            if (a2) {
                                z = a2;
                                break;
                            }
                            z2 = a2;
                            i9 = i10;
                        }
                        z = z2;
                        if (z) {
                            valueOf = String.valueOf(a);
                            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 49).append(valueOf).append(": ").append(nextInt).append(" is restricted, trying next interval").toString());
                            i6 += i;
                        } else {
                            String valueOf6 = String.valueOf(a);
                            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf6).length() + 40).append(valueOf6).append(": ").append(nextInt).append(" is a valid time, returning").toString());
                            return ((long) i8) * 1000;
                        }
                    }
                }
            }
            valueOf = String.valueOf(a);
            Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 53).append(valueOf).append(": ").append(nextInt).append(" is in the exclusion zones, trying again").toString());
        }
    }

    private static C5393x m26127a(Calendar calendar) {
        int i = (calendar.get(13) + (f27913a * calendar.get(12))) + (f27914b * calendar.get(11));
        return new C5393x(((int) (calendar.getTimeInMillis() / 1000)) - i, i);
    }

    private static boolean m26129a(int i, C5392w c5392w, int i2) {
        String valueOf = String.valueOf(c5392w);
        Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 61).append("isInExclusionZone: type ").append(valueOf).append(", size ").append(i2).append(", value ").append(i).toString());
        if (i2 <= 0) {
            return false;
        }
        int i3 = i % f27914b;
        switch (c5392w.ordinal()) {
            case 0:
                if (i3 > f27914b / 2) {
                    i3 = f27914b - i3;
                    break;
                }
                break;
            case 1:
                int abs;
                if (i3 <= f27914b / 2) {
                    abs = Math.abs((f27914b / 4) - i3);
                    Log.d("PdmScheduler", "isInExclusionZone: quarter, first half: " + i3 + ", distance " + abs);
                    i3 = abs;
                    break;
                }
                abs = Math.abs(((f27914b * 3) / 4) - i3);
                Log.d("PdmScheduler", "isInExclusionZone: quarter, second half: " + i3 + ", distance " + abs);
                i3 = abs;
                break;
            case 2:
                i3 = Math.abs((f27914b / 2) - i3);
                break;
            default:
                String valueOf2 = String.valueOf(c5392w);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 14).append("bad zoneType: ").append(valueOf2).toString());
        }
        if (i3 <= i2) {
            return true;
        }
        return false;
    }

    public static PendingIntent m26125a(Context context, Scheduler scheduler) {
        Intent intent = new Intent(context, PdmTransferIntentReceiver.class);
        if (scheduler != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("extraScheduler", scheduler);
            intent.putExtra("extraScheduler", bundle);
        }
        intent.setAction("TRANSFER");
        return PendingIntent.getBroadcast(context, 0, intent, 134217728);
    }

    public final boolean m26133a(Context context) {
        int i;
        C5393x a = m26127a(Calendar.getInstance());
        int i2 = a.f28010b;
        ArrayList arrayList = this.f27933u;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((bw) obj).a(Integer.valueOf(i2))) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i != 0) {
            Log.d("PdmScheduler", "Not starting PDM due since the current time is in an excluded range");
            return false;
        }
        i = a.f28010b;
        if (m26129a(i, C5392w.HOUR, this.f27930r) || m26129a(i, C5392w.QUARTER_HOUR, this.f27931s) || m26129a(i, C5392w.HALF_HOUR, this.f27932t)) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            Log.d("PdmScheduler", "Not starting PDM due since the current time is in an exclusion zone");
            return false;
        }
        NetworkInfo a2 = m26126a(context, 1);
        switch (this.f27918f.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                if (!a2.isAvailable()) {
                    i = 1;
                    break;
                }
                i = 0;
                break;
            case 2:
                if (a2.isAvailable() && !a2.isConnected()) {
                    i = 1;
                    break;
                }
                i = 0;
                break;
                break;
            case 3:
                if (!a2.isAvailable() || !a2.isConnected()) {
                    i = 0;
                    break;
                }
                i = 1;
                break;
                break;
            default:
                Log.e("PdmScheduler", "Unknown WiFi state found.");
                i = 0;
                break;
        }
        if (i == 0) {
            Log.d("PdmScheduler", "Not starting PDM due to WiFi state constraint.");
            return false;
        }
        i = !this.f27919g ? 1 : !m26126a(context, 7).isAvailable() ? 1 : 0;
        if (i == 0) {
            Log.d("PdmScheduler", "Not starting PDM due to Bluetooth state constraint.");
            return false;
        } else if (m26131c(context)) {
            if (this.f27921i && ((PowerManager) context.getSystemService("power")).isInteractive()) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 0) {
                Log.d("PdmScheduler", "Not starting PDM due to the screen being on.");
                return false;
            }
            if (this.f27923k == 0) {
                i = 1;
            } else {
                C5372b a3 = C5372b.m26136a(context);
                i = a3.f27938b ? 1 : a3.f27937a >= ((float) this.f27923k) ? 1 : 0;
            }
            if (i == 0) {
                Log.d("PdmScheduler", "Not starting PDM due to minimum battery constraint.");
                return false;
            }
            if (this.f27924l == 0) {
                i = 1;
            } else if (C5372b.m26136a(context).f27938b) {
                i = 1;
            } else {
                float a4 = m26124a(context.getSharedPreferences("pdmscheduler.xml", 0));
                Log.d("PdmScheduler", "checkMaximumBatteryUsage: usedBattery=" + a4 + ", maximumBatteryUsage=" + this.f27924l);
                i = a4 < ((float) this.f27924l) ? 1 : 0;
            }
            if (i == 0) {
                Log.d("PdmScheduler", "Not starting PDM due to battery usage constraint.");
                return false;
            }
            if (C5146a.m23876a(context)) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                return true;
            }
            Log.d("PdmScheduler", "Not starting PDM due to airplane mode enabled.");
            return false;
        } else {
            Log.d("PdmScheduler", "Not starting PDM due to Hotspot state constraint.");
            return false;
        }
    }

    private static NetworkInfo m26126a(Context context, int i) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(i);
    }

    private static boolean m26131c(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (((Boolean) wifiManager.getClass().getMethod("isWifiApEnabled", new Class[0]).invoke(wifiManager, new Object[0])).booleanValue()) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            Log.e("PdmScheduler", "Couldn't call isWifiApEnabled.", e);
            return false;
        }
    }

    private static float m26124a(SharedPreferences sharedPreferences) {
        Map all = sharedPreferences.getAll();
        Long l = (Long) all.get("timestamp");
        Float f = (Float) all.get("level");
        if (!(l == null || f == null)) {
            long longValue = l.longValue();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(longValue);
            boolean z = m26127a(Calendar.getInstance()).f28009a == m26127a(instance).f28009a;
            Log.d("PdmScheduler", "when=" + longValue + ", isSameDay=" + z);
            if (z) {
                String valueOf = String.valueOf(f);
                Log.d("PdmScheduler", new StringBuilder(String.valueOf(valueOf).length() + 16).append("getUsedBattery: ").append(valueOf).toString());
                return f.floatValue();
            }
        }
        Log.d("PdmScheduler", "getUsedBattery: 0");
        return 0.0f;
    }

    public static void m26128a(Context context, C5372b c5372b, C5372b c5372b2) {
        float f = c5372b.f27937a - c5372b2.f27937a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pdmscheduler.xml", 0);
        float a = m26124a(sharedPreferences) + f;
        float f2 = c5372b.f27937a;
        Log.d("PdmScheduler", "updateBatteryUsage: begin=" + f2 + ", end=" + c5372b2.f27937a + ", usage this session: " + f + ", total today: " + a);
        sharedPreferences.edit().putLong("timestamp", System.currentTimeMillis()).putFloat("level", a).apply();
    }

    public static void m26130b(Context context) {
        Log.d("PdmScheduler", "Cancelling upcoming alarms.");
        new C5050a(context).m23266a(m26125a(context, null));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f27916d ? 1 : 0);
        parcel.writeInt(this.f27917e.ordinal());
        parcel.writeInt(this.f27918f.ordinal());
        if (this.f27919g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f27920h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f27921i) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f27922j);
        parcel.writeInt(this.f27923k);
        parcel.writeInt(this.f27924l);
        parcel.writeInt(this.f27925m);
        parcel.writeInt(this.f27926n);
        parcel.writeInt(this.f27927o);
        if (this.f27928p) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f27929q);
        parcel.writeInt(this.f27930r);
        parcel.writeInt(this.f27932t);
        parcel.writeInt(this.f27931s);
        parcel.writeInt(this.f27933u.size());
        ArrayList arrayList = this.f27933u;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            bw bwVar = (bw) arrayList.get(i3);
            parcel.writeInt(((Integer) bwVar.a.a()).intValue());
            parcel.writeInt(((Integer) bwVar.b.a()).intValue());
            i3 = i4;
        }
        if (this.f27934v == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        this.f27934v.writeToParcel(parcel, i);
    }
}
