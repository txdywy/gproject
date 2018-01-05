package com.google.android.finsky.bj;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1503a;
import com.google.android.gms.feedback.C5189b;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

public final class C2104b {
    public static final Uri f10707a = Uri.parse((String) C0955b.aa.m28964b());
    public final C0988c f10708b;

    public C2104b(C0988c c0988c) {
        C2103a c2103a = new C2103a();
        this(c0988c, (byte) 0);
    }

    private C2104b(C0988c c0988c, byte b) {
        this.f10708b = c0988c;
    }

    public final void m10992a(Activity activity, String str, boolean z) {
        Runnable c2105c = new C2105c(this, str, activity);
        if (z) {
            new Handler().postDelayed(c2105c, (long) ((Integer) C0955b.ge.m28964b()).intValue());
        } else {
            c2105c.run();
        }
    }

    static FeedbackOptions m10991a(Activity activity) {
        String str;
        C5189b c5189b = new C5189b();
        c5189b.f26203a = GoogleHelp.m23989a(activity);
        if (C1503a.m8830a(activity)) {
            str = "TV";
        } else if (C1503a.m8831b(activity)) {
            str = "Wear";
        } else if (C1503a.m8832c(activity)) {
            str = "Chromebook";
        } else {
            str = null;
            c5189b.f26207e = str;
            return c5189b.m23962a();
        }
        String packageName = activity.getPackageName();
        str = new StringBuilder((String.valueOf(packageName).length() + 18) + String.valueOf(str).length()).append(packageName).append(".").append(str).append(".ConsumerFeedback").toString();
        c5189b.f26207e = str;
        return c5189b.m23962a();
    }
}
