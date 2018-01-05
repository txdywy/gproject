package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.v4.app.C0141p;
import android.support.v4.app.C0254u;
import android.support.v4.app.ab;
import android.support.v4.app.cf;
import android.support.v4.app.cg;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.internal.ax;
import com.google.android.gms.common.api.internal.ay;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bg;
import com.google.android.gms.common.internal.bh;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.common.util.C5154i;
import com.google.android.gms.common.util.C5155j;
import com.google.android.gms.p268a.C4883a;
import com.google.android.gms.p268a.C4884b;

public final class C5096b extends C5095d {
    public static final C5096b f25938a = new C5096b();
    public static final int f25939b = C5095d.f25936c;

    C5096b() {
    }

    public static Dialog m23665a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(bg.m23777c(activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        C5096b.m23668a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static Dialog m23666a(Context context, int i, bh bhVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(bg.m23777c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = bg.m23779e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, bhVar);
        }
        e = bg.m23773a(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    public static boolean m23669a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = C5096b.m23666a((Context) activity, i, new bi(C5095d.m23656a(activity, i, "d"), activity, i2), onCancelListener);
        if (a == null) {
            return false;
        }
        C5096b.m23668a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public static ax m23667a(Context context, ay ayVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        ax axVar = new ax(ayVar);
        context.registerReceiver(axVar, intentFilter);
        axVar.f25740a = context;
        if (C5105f.m23691a(context, "com.google.android.gms")) {
            return axVar;
        }
        ayVar.mo4566a();
        axVar.m23465a();
        return null;
    }

    public static void m23668a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C0254u) {
            ab H_ = ((C0254u) activity).H_();
            C0141p c5108h = new C5108h();
            Dialog dialog2 = (Dialog) am.m23734a((Object) dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            c5108h.f25972f = dialog2;
            if (onCancelListener != null) {
                c5108h.af = onCancelListener;
            }
            c5108h.m625a(H_, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragment c5052a = new C5052a();
        dialog2 = (Dialog) am.m23734a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c5052a.f25620a = dialog2;
        if (onCancelListener != null) {
            c5052a.f25621b = onCancelListener;
        }
        c5052a.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void m23670a(Context context, int i, PendingIntent pendingIntent) {
        if (i == 18) {
            new C5097c(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            Notification build;
            int i2;
            CharSequence b = bg.m23776b(context, i);
            CharSequence d = bg.m23778d(context, i);
            Resources resources = context.getResources();
            if (C5154i.m23886a(context)) {
                am.m23738a(C5155j.m23888a());
                build = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b).setStyle(new BigTextStyle().bigText(d)).addAction(C4883a.common_full_open_on_phone, resources.getString(C4884b.common_open_on_phone), pendingIntent).build();
            } else {
                cg a = new cg(context).m1415a(17301642).m1426c(resources.getString(C4884b.common_google_play_services_notification_ticker)).m1418a(System.currentTimeMillis()).m1423a(true);
                a.f1501e = pendingIntent;
                cg b2 = a.m1422a(b).m1425b(d);
                b2.f1519w = true;
                build = b2.m1421a(new cf().m1412b(d)).m1414a();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    C5105f.f25968d.set(false);
                    i2 = 10436;
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            ((NotificationManager) context.getSystemService("notification")).notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
