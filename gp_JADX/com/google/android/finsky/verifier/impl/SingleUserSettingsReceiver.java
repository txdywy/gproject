package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public class SingleUserSettingsReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            FinskyLog.m21667d("Action should not be empty", new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra("key");
        boolean z = true;
        switch (action.hashCode()) {
            case -1674901261:
                if (action.equals("com.google.android.finsky.action.REQUEST_UPDATE_SETTINGS_ACTION")) {
                    z = true;
                    break;
                }
                break;
            case 1605446691:
                if (action.equals("com.google.android.finsky.action.UPDATE_SETTINGS_ACTION")) {
                    z = false;
                    break;
                }
                break;
            case 1747212654:
                if (action.equals("com.google.android.finsky.action.UPDATE_TIMESTAMP_ACTION")) {
                    z = true;
                    break;
                }
                break;
        }
        String a;
        av a2;
        switch (z) {
            case false:
                UserHandle userHandle = (UserHandle) intent.getParcelableExtra("android.intent.extra.USER");
                if (userHandle == null) {
                    FinskyLog.m21669e("UserHandle should not be null!", new Object[0]);
                    return;
                } else if (stringExtra == null) {
                    FinskyLog.m21669e("Key should not be null!", new Object[0]);
                    return;
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("enabled", false);
                    a = av.m22087a(context, userHandle);
                    a2 = av.m22086a(context);
                    if (booleanExtra) {
                        a2.m22091a(a, stringExtra);
                    } else {
                        List a3 = a2.m22088a(stringExtra);
                        if (a3.contains(a)) {
                            a3.remove(a);
                            a2.m22092a(stringExtra, a3);
                        }
                    }
                    a2.m22091a(a, "synced_users_key");
                    return;
                }
            case true:
                cq.m22272a(context).m22273a();
                return;
            case true:
                if (stringExtra == null) {
                    FinskyLog.m21669e("Key should not be null!", new Object[0]);
                    return;
                }
                long longExtra = intent.getLongExtra("timestamp", 0);
                a2 = av.m22086a(context);
                a2.m22090a();
                a2.f24408c.edit().putLong(stringExtra, longExtra).apply();
                return;
            default:
                stringExtra = "Unknown action: ";
                a = String.valueOf(action);
                FinskyLog.m21667d(a.length() != 0 ? stringExtra.concat(a) : new String(stringExtra), new Object[0]);
                return;
        }
    }

    public static void m22016a(Context context, String str, boolean z) {
        Intent intent = new Intent("com.google.android.finsky.action.UPDATE_SETTINGS_ACTION");
        intent.setComponent(new ComponentName(context, SingleUserSettingsReceiver.class));
        UserHandle userForSerialNumber = ((UserManager) context.getSystemService("user")).getUserForSerialNumber(0);
        intent.putExtra("android.intent.extra.USER", Process.myUserHandle());
        intent.putExtra("key", str);
        intent.putExtra("enabled", z);
        context.sendBroadcastAsUser(intent, userForSerialNumber);
    }
}
