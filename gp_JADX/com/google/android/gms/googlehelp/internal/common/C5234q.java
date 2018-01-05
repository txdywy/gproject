package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.C5212c;
import com.google.android.gms.googlehelp.C5213d;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.ek;
import java.io.File;

public final class C5234q implements C5213d {
    public static final Status f26319a = new Status(13);
    public boolean f26320b;

    static String m24050a(Activity activity) {
        String charSequence = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier != 0) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(identifier);
            if (viewGroup != null) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        return ((TextView) childAt).getText().toString();
                    }
                }
            }
        }
        return charSequence;
    }

    static void m24051a(C5223f c5223f, Activity activity, Intent intent, GoogleHelp googleHelp) {
        intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        activity.startActivityForResult(intent, 123);
        c5223f.m23071a(Status.f25625a);
    }

    static void m24052a(Runnable runnable) {
        Thread b = C5234q.m24054b(runnable);
        b.setPriority(4);
        b.start();
    }

    static ek m24053b() {
        return new ek();
    }

    static Thread m24054b(Runnable runnable) {
        return new Thread(runnable, "GoogleHelpApiImpl");
    }

    public final C4954s mo4661a(C5058o c5058o, Activity activity, Intent intent, File file) {
        return c5058o.mo4544a(new C5239v(this, c5058o, intent, C5212c.f26296a ? C5226i.m24040a(activity) : null, file, activity));
    }

    public final C4954s mo4662a(C5058o c5058o, GoogleHelp googleHelp, Bundle bundle, long j) {
        return c5058o.mo4544a(new C5243z(c5058o, bundle, j, googleHelp));
    }

    public final C4954s mo4663a(C5058o c5058o, GoogleHelp googleHelp, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        return c5058o.mo4544a(new C5237t(c5058o, feedbackOptions, bundle, j, googleHelp));
    }

    final synchronized boolean m24058a() {
        boolean z = true;
        synchronized (this) {
            if (this.f26320b) {
                z = false;
            } else {
                this.f26320b = true;
            }
        }
        return z;
    }

    public final C4954s mo4664b(C5058o c5058o, GoogleHelp googleHelp, Bundle bundle, long j) {
        return c5058o.mo4544a(new C5235r(c5058o, bundle, j, googleHelp));
    }
}
