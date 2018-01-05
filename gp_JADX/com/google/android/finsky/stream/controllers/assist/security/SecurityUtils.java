package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.support.v4.p013b.p014a.C0259a;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ImageView;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class SecurityUtils {
    public final C3646a f21767a;
    public final PackageManager f21768b;

    public class SelfishUrlSpanNoUnderline extends URLSpan {
        public final ag f21766a;

        public SelfishUrlSpanNoUnderline(String str, ag agVar) {
            super(str);
            this.f21766a = agVar;
        }

        public void onClick(View view) {
            ag agVar = this.f21766a;
            getURL();
            agVar.mo4114a(view);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public SecurityUtils(C3646a c3646a, PackageManager packageManager) {
        this.f21767a = c3646a;
        this.f21768b = packageManager;
    }

    public static void m20042a(ImageView imageView, C0054l c0054l, int i) {
        if (imageView != null) {
            if (c0054l == null) {
                imageView.setVisibility(4);
                return;
            }
            Drawable mutate = C0259a.m1526e(c0054l).mutate();
            C0259a.m1514a(mutate, i);
            imageView.setImageDrawable(mutate);
        }
    }

    final String m20043a(String str) {
        try {
            str = this.f21768b.getApplicationLabel(this.f21768b.getApplicationInfo(str, 0)).toString();
        } catch (NameNotFoundException e) {
            FinskyLog.m21667d("App not found. Should not happen.", new Object[0]);
        }
        return str;
    }

    final boolean m20044b(String str) {
        C3647b a = this.f21767a.m17243a(str);
        if (a == null || a.f18028c == null) {
            FinskyLog.m21659a("Omit harmful app %s: it is not installed.", str);
            return true;
        }
        boolean z = a.f18028c.f11422g;
        boolean z2 = a.f18028c.f11424i;
        if (!z || !z2) {
            return false;
        }
        FinskyLog.m21659a("Omit harmful app %s: it is system and disabled.", str);
        return true;
    }

    public static String m20040a(Context context, long j) {
        af afVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= currentTimeMillis) {
            long j2 = currentTimeMillis - j;
            if (j2 < 691200000) {
                int i;
                int i2 = (int) (j2 / 86400000);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
                if (simpleDateFormat.format(Long.valueOf(currentTimeMillis)).equals(simpleDateFormat.format(Long.valueOf((((long) i2) * 86400000) + j)))) {
                    i = i2;
                } else {
                    i = i2 + 1;
                }
                if (i <= 1) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("h:mm aaa");
                    if (DateFormat.is24HourFormat(context)) {
                        simpleDateFormat2 = new SimpleDateFormat("HH:mm");
                    }
                    afVar = new af(i == 0 ? 1 : 2, simpleDateFormat2.format(new Date(j)));
                } else if (i <= 7) {
                    afVar = new af(i);
                }
                if (afVar != null) {
                    return "";
                }
                switch (afVar.f21790a) {
                    case 1:
                        return context.getString(C7582R.string.myapps_security_last_scanned, new Object[]{afVar.f21791b});
                    case 2:
                        return context.getString(C7582R.string.myapps_security_last_scanned_yesterday, new Object[]{afVar.f21791b});
                    case 3:
                        return context.getResources().getQuantityString(C7582R.plurals.myapps_security_last_scanned_days_ago, afVar.f21792c, new Object[]{Integer.valueOf(afVar.f21792c)});
                    case 4:
                        return context.getString(C7582R.string.myapps_security_last_scanned_date, new Object[]{afVar.f21791b});
                    default:
                        return "";
                }
            }
            if (j2 < 28857600000L) {
                afVar = new af(4, new SimpleDateFormat("MMMM d").format(new Date(j)));
                if (afVar != null) {
                    return "";
                }
                switch (afVar.f21790a) {
                    case 1:
                        return context.getString(C7582R.string.myapps_security_last_scanned, new Object[]{afVar.f21791b});
                    case 2:
                        return context.getString(C7582R.string.myapps_security_last_scanned_yesterday, new Object[]{afVar.f21791b});
                    case 3:
                        return context.getResources().getQuantityString(C7582R.plurals.myapps_security_last_scanned_days_ago, afVar.f21792c, new Object[]{Integer.valueOf(afVar.f21792c)});
                    case 4:
                        return context.getString(C7582R.string.myapps_security_last_scanned_date, new Object[]{afVar.f21791b});
                    default:
                        return "";
                }
            }
        }
        afVar = null;
        if (afVar != null) {
            return "";
        }
        switch (afVar.f21790a) {
            case 1:
                return context.getString(C7582R.string.myapps_security_last_scanned, new Object[]{afVar.f21791b});
            case 2:
                return context.getString(C7582R.string.myapps_security_last_scanned_yesterday, new Object[]{afVar.f21791b});
            case 3:
                return context.getResources().getQuantityString(C7582R.plurals.myapps_security_last_scanned_days_ago, afVar.f21792c, new Object[]{Integer.valueOf(afVar.f21792c)});
            case 4:
                return context.getString(C7582R.string.myapps_security_last_scanned_date, new Object[]{afVar.f21791b});
            default:
                return "";
        }
    }

    static void m20041a(int i) {
        C2495w c2495w = C4323d.m20084a().f21801d;
        if (c2495w == null) {
            FinskyLog.m21669e("Logging context is null.", new Object[0]);
            return;
        }
        ad adVar = C4323d.m20084a().f21802e;
        if (adVar == null) {
            FinskyLog.m21669e("Parent node is null.", new Object[0]);
        } else if (c2495w != null) {
            c2495w.m13379b(new C2475d(adVar).m13256a(i));
        }
    }
}
