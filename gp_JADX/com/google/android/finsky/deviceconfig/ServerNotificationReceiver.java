package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.finsky.api.C0947i;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.b.ac;
import com.google.wireless.android.finsky.b.c;

public class ServerNotificationReceiver extends C0989a {
    public static boolean f14825a = false;
    public C0947i f14826b;

    public final void mo1179a() {
        ((C1377d) C3947d.m18649a(C1377d.class)).mo1811a(this);
    }

    public final void mo1180a(Context context, Intent intent) {
        if (f14825a && intent.getCategories().contains("SERVER_NOTIFICATION")) {
            boolean z;
            if (f14825a) {
                int intExtra = intent.getIntExtra("DEBUG_TYPE", -1);
                if (intExtra == -1) {
                    z = false;
                } else {
                    String stringExtra = intent.getStringExtra("DEBUG_PACKAGE");
                    intent.getIntExtra("DEBUG_REASON", -1);
                    String stringExtra2 = intent.getStringExtra("DEBUG_TITLE");
                    boolean booleanExtra = intent.getBooleanExtra("DEBUG_MALICIOUS", false);
                    int intExtra2 = intent.getIntExtra("DEBUG_VERSION", -1);
                    String stringExtra3 = intent.getStringExtra("DEBUG_ACCOUNT");
                    String stringExtra4 = intent.getStringExtra("DEBUG_ID");
                    ab abVar = new ab();
                    String str = "notification.test.id.";
                    stringExtra4 = String.valueOf(stringExtra4);
                    stringExtra4 = stringExtra4.length() != 0 ? str.concat(stringExtra4) : new String(str);
                    if (stringExtra4 == null) {
                        throw new NullPointerException();
                    }
                    abVar.b |= 1;
                    abVar.d = stringExtra4;
                    abVar.c = intExtra;
                    abVar.f = new ax();
                    abVar.f.f11833b = stringExtra;
                    if (stringExtra2 == null) {
                        throw new NullPointerException();
                    }
                    abVar.b |= 4;
                    abVar.g = stringExtra2;
                    abVar.l = new ac();
                    ac acVar = abVar.l;
                    acVar.a |= 1;
                    acVar.b = booleanExtra;
                    abVar.j = new c();
                    c cVar = abVar.j;
                    cVar.a |= 1;
                    cVar.b = intExtra2;
                    abVar.k = new a();
                    a aVar = abVar.k;
                    aVar.a |= 512;
                    aVar.o = true;
                    if (stringExtra3 != null) {
                        if (stringExtra3 == null) {
                            throw new NullPointerException();
                        }
                        abVar.b |= 8;
                        abVar.h = stringExtra3;
                    }
                    this.f14826b.mo1163a(abVar);
                    z = true;
                }
            } else {
                FinskyLog.m21669e("Inconsistent handling of DEBUG_NOTIFICATION_RECEIVER", new Object[0]);
                z = false;
            }
            if (z) {
                return;
            }
        }
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE") && "google.com".equals(intent.getStringExtra("from")) && intent.getCategories().contains("SERVER_NOTIFICATION")) {
            setResultCode(-1);
            Bundle extras = intent.getExtras();
            if (extras.containsKey("NOTIFICATION_PAYLOAD")) {
                byte[] decode = Base64.decode(extras.getString("NOTIFICATION_PAYLOAD"), 11);
                if (decode != null) {
                    ab abVar2;
                    try {
                        abVar2 = (ab) C0757i.m4905a(new ab(), decode);
                    } catch (InvalidProtocolBufferNanoException e) {
                        FinskyLog.m21667d("Received download tickle with malformed notification proto data.", new Object[0]);
                        abVar2 = null;
                    }
                    if (abVar2 != null) {
                        FinskyLog.m21659a("Handling notificationId=[%s]", abVar2.d);
                        this.f14826b.mo1163a(abVar2);
                        return;
                    }
                    return;
                }
                return;
            }
            FinskyLog.m21659a("Ignoring server broadcast due to empty notification string.", new Object[0]);
        }
    }
}
