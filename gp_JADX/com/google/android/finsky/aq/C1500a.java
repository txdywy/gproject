package com.google.android.finsky.aq;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dx.C2910a;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.f.a.b;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class C1500a {
    public static final Pattern f8159a = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    public static final ComponentName f8160b = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
    public final C2910a f8161c;
    public final C0988c f8162d;
    public final C1461c f8163e;
    public final DevicePolicyManager f8164f;
    public final ContentResolver f8165g;
    public boolean f8166h = false;
    public boolean f8167i = false;
    public boolean f8168j = false;
    public String f8169k = null;

    public C1500a(Context context, C2910a c2910a, C0988c c0988c, C1461c c1461c) {
        this.f8164f = (DevicePolicyManager) context.getSystemService("device_policy");
        this.f8165g = context.getContentResolver();
        this.f8161c = c2910a;
        this.f8162d = c0988c;
        this.f8163e = c1461c;
    }

    public final boolean m8818a() {
        if (!((Boolean) C0955b.fk.m28964b()).booleanValue()) {
            return false;
        }
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        m8817h();
        return this.f8167i || this.f8168j;
    }

    public final boolean m8822b() {
        return m8818a() && this.f8168j;
    }

    public final boolean m8823c() {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        return f8160b.equals(this.f8164f.getProfileOwner());
    }

    public final boolean m8824d() {
        return m8818a() && this.f8167i;
    }

    public final boolean m8819a(Account account) {
        if (account == null) {
            return false;
        }
        a b = m8821b(account);
        if (b == null) {
            return false;
        }
        boolean z;
        if ((b.a & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && b.b) {
            return true;
        }
        return false;
    }

    public final Account m8825e() {
        for (Account account : this.f8162d.cX()) {
            if (m8819a(account)) {
                return account;
            }
        }
        return null;
    }

    public final a m8821b(Account account) {
        if (account == null || this.f8163e.mo2249j(account.name).mo2294a(12609603)) {
            return null;
        }
        gy b = this.f8161c.m15190b(account.name);
        if (b != null) {
            return b.f;
        }
        return null;
    }

    public final a m8826f() {
        return m8821b(m8825e());
    }

    @TargetApi(21)
    private final synchronized void m8817h() {
        if (!this.f8166h) {
            List list;
            if (this.f8164f == null) {
                list = null;
            } else {
                list = this.f8164f.getActiveAdmins();
            }
            if (r0 != null) {
                if (!this.f8163e.dj().mo2294a(12620121)) {
                    ComponentName profileOwner = this.f8164f.getProfileOwner();
                    if (!(profileOwner == null || f8160b.equals(profileOwner))) {
                        this.f8168j = true;
                        this.f8169k = profileOwner.getPackageName();
                    }
                }
                for (ComponentName packageName : r0) {
                    String packageName2 = packageName.getPackageName();
                    if (this.f8163e.dj().mo2294a(12620121)) {
                        this.f8168j |= this.f8164f.isProfileOwnerApp(packageName2);
                        this.f8169k = packageName2;
                    }
                    if (this.f8164f.isDeviceOwnerApp(packageName2)) {
                        this.f8167i = true;
                        this.f8169k = packageName2;
                    }
                }
            }
            boolean z = this.f8168j || Global.getInt(this.f8165g, "device_provisioned", 0) != 0;
            this.f8166h = z;
        }
    }

    public static boolean m8816c(Account account) {
        return account != null && "com.google.work".equals(account.type) && f8159a.matcher(account.name).matches();
    }

    public final b m8827g() {
        if (!m8824d()) {
            return null;
        }
        a f = m8826f();
        if (f == null || f.d == null) {
            return null;
        }
        return f.d;
    }

    public final boolean m8820a(String str) {
        return m8824d() && TextUtils.equals(str, this.f8169k);
    }

    public static long m8815a(b bVar) {
        Calendar instance = Calendar.getInstance();
        long j = bVar.b;
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(instance.getTimeInMillis());
        j -= TimeUnit.DAYS.toMillis(TimeUnit.MILLISECONDS.toDays(j));
        long toHours = TimeUnit.MILLISECONDS.toHours(j);
        j -= TimeUnit.HOURS.toMillis(toHours);
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes(j);
        j -= TimeUnit.MINUTES.toMillis(toMinutes);
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(j);
        j -= TimeUnit.MILLISECONDS.toSeconds(j);
        gregorianCalendar.set(11, (int) toHours);
        gregorianCalendar.set(12, (int) toMinutes);
        gregorianCalendar.set(13, (int) toSeconds);
        gregorianCalendar.set(14, (int) j);
        long timeInMillis = instance.getTimeInMillis() - gregorianCalendar.getTimeInMillis();
        return timeInMillis > 0 ? timeInMillis : timeInMillis + TimeUnit.DAYS.toMillis(1);
    }
}
