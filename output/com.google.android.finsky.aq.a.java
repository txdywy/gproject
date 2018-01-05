package com.google.android.finsky.aq;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build$VERSION;
import android.provider.Settings$Global;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dx.a;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.f.a.b;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class com.google.android.finsky.aq.a
{

    public static final Pattern a;
    public static final ComponentName b;
    public final com.google.android.finsky.dx.a c;
    public final com.google.android.finsky.accounts.c d;
    public final com.google.android.finsky.ba.c e;
    public final DevicePolicyManager f;
    public final ContentResolver g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;

    static {
        com.google.android.finsky.aq.a.a = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
        com.google.android.finsky.aq.a.b = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
    }

    a(Context p0, com.google.android.finsky.dx.a p1, com.google.android.finsky.accounts.c p2, com.google.android.finsky.ba.c p3) {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.f = (DevicePolicyManager)p0.getSystemService("device_policy");
        this.g = p0.getContentResolver();
        this.c = p1;
        this.d = p2;
        this.e = p3;
    }

    public static long a(com.google.wireless.android.finsky.dfe.f.a.b p0) {
        v0 = Calendar.getInstance();
        v1 = new GregorianCalendar();
        v1.setTimeInMillis(v0.getTimeInMillis());
        v2 = p0.b - TimeUnit.DAYS.toMillis(TimeUnit.MILLISECONDS.toDays(p0.b));
        v4 = TimeUnit.MILLISECONDS.toHours(v2);
        v2 = v2 - TimeUnit.HOURS.toMillis(v4);
        v6 = TimeUnit.MILLISECONDS.toMinutes(v2);
        v2 = v2 - TimeUnit.MINUTES.toMillis(v6);
        v1.set(11, (int)v4);
        v1.set(12, (int)v6);
        v1.set(13, (int)TimeUnit.MILLISECONDS.toSeconds(v2));
        v1.set(14, (int)(v2 - TimeUnit.MILLISECONDS.toSeconds(v2)));
        v0 = v0.getTimeInMillis() - v1.getTimeInMillis();
        if (v0 <= 0)
            v0 = v0 + TimeUnit.DAYS.toMillis(1);
        return v0;
    }

    public static boolean c(Account p0) {
        if (p0 != 0 && "com.google.work".equals(p0.type) && com.google.android.finsky.aq.a.a.matcher(p0.name).matches())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final synchronized void h() {
  2:    enter this;
  5:    if (this.h == 0) goto 9;
  7:    exit this;
  8:    return;
 11:    if (this.f != 0) goto 121;
 13:    v0 = 0;
 14:    if (v0 != 0) {
 29:        if (!this.e.dj().a(12620121)) {
 33:            v3 = this.f.getProfileOwner();
 37:            if (v3 != 0 && !com.google.android.finsky.aq.a.b.equals(v3)) {
 48:                this.j = 1;
 54:                this.k = v3.getPackageName();
                }
            }
 56:        v3 = v0.iterator();
 60:        while (v3.hasNext()) {
 72:            v0 = ((ComponentName)v3.next()).getPackageName();
 89:            if (this.e.dj().a(12620121)) {
100:                this.j = this.j | this.f.isProfileOwnerApp(v0);
102:                this.k = v0;
                }
110:            if (!this.f.isDeviceOwnerApp(v0))
110:                continue;
113:            this.i = 1;
115:            this.k = v0;
            }
        }
117:    goto 128;
119:    exit this;
120:    throw ex;
123:    v0 = this.f.getActiveAdmins();
127:    goto 14;
130:    if (this.j != 0 || Settings$Global.getInt(this.g, "device_provisioned", 0) != 0)
143:        v0 = 1;
        else
148:        v0 = 0;
144:    this.h = v0;
146:    goto 7;
150:    try
            run 121...146
        catch (Throwable ex) {
121:        goto 118;
        }
151:    try
            run 9...117
        catch (Throwable ex) {
  9:        goto 118;
        }
152:    try
            run 3...5
        catch (Throwable ex) {
  3:        goto 118;
        }
    }

    public final boolean a() {
        if (!((Boolean)com.google.android.finsky.aa.b.fk.b()).booleanValue())
            v0 = 0;
        else if (Build$VERSION.SDK_INT < 21)
            v0 = 0;
        else {
            this.h();
            if (this.i != 0 || this.j != 0)
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    public final boolean a(Account p0) {
        v0 = 0;
        if (p0 != 0) {
            v3 = this.b(p0);
            if (v3 != 0) {
                if (v3.a & 1)
                    v2 = 1;
                else
                    v2 = 0;
                if (v2 != 0 && v3.b != 0)
                    v0 = 1;
            }
        }
        return v0;
    }

    public final boolean a(String p0) {
        if (this.d() && TextUtils.equals(p0, this.k))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.f.a.a b(Account p0) {
        v0 = 0;
        if (p0 != 0 && !this.e.j(p0.name).a(12609603)) {
            v1 = this.c.b(p0.name);
            if (v1 != 0)
                v0 = v1.f;
        }
        return v0;
    }

    public final boolean b() {
        if (this.a() && this.j != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean c() {
        if (Build$VERSION.SDK_INT < 21)
            v0 = 0;
        else
            v0 = com.google.android.finsky.aq.a.b.equals(this.f.getProfileOwner());
        return v0;
    }

    public final boolean d() {
        if (this.a() && this.i != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final Account e() {
        v1 = this.d.cX().iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = (Account)v1.next();
            if (this.a(v0))
                return v0;
        }
    }

    public final com.google.wireless.android.finsky.dfe.f.a.a f() {
        return this.b(this.e());
    }

    public final com.google.wireless.android.finsky.dfe.f.a.b g() {
        v0 = 0;
        if (this.d()) {
            v1 = this.f();
            if (v1 != 0 && v1.d != 0)
                v0 = v1.d;
        }
        return v0;
    }

}
