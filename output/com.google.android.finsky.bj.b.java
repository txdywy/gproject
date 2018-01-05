package com.google.android.finsky.bj;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.as.a;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.b;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.bj.b
{

    public static final Uri a;
    public final com.google.android.finsky.accounts.c b;

    static {
        com.google.android.finsky.bj.b.a = Uri.parse((String)com.google.android.finsky.aa.b.aa.b());
    }

    b(com.google.android.finsky.accounts.c p0) {
        new com.google.android.finsky.bj.a();
        com.google.android.finsky.bj.b(p0, 0);
    }

    b(com.google.android.finsky.accounts.c p0, byte p1) {
        this.b = p0;
    }

    static FeedbackOptions a(Activity p0) {
  2:    v1 = new com.google.android.gms.feedback.b();
  9:    v1.a = GoogleHelp.a(p0);
 15:    if (!com.google.android.finsky.as.a.a(p0)) goto 78;
 17:    v0 = "TV";
 19:    v2 = p0.getPackageName();
 67:    v0 = (String.valueOf(v2).length() + 18 + String.valueOf(v0).length()) + v2 + "." + v0 + ".ConsumerFeedback";
 71:    v1.e = v0;
 77:    return v1.a();
 82:    if (!com.google.android.finsky.as.a.b(p0)) goto 87;
 84:    v0 = "Wear";
 86:    goto 19;
 91:    if (!com.google.android.finsky.as.a.c(p0)) goto 96;
 93:    v0 = "Chromebook";
 95:    goto 19;
 96:    v0 = 0;
 97:    goto 71;
    }

    public final void a(Activity p0, String p1, boolean p2) {
        v1 = new com.google.android.finsky.bj.c(this, p1, p0);
        if (p2 != 0)
            new Handler().postDelayed(v1, (long)((Integer)com.google.android.finsky.aa.b.ge.b()).intValue());
        else
            v1.run();
    }

}
