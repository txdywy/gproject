package com.google.android.wallet.common.pub;

import android.content.Intent;
import com.google.android.wallet.nfc.C6525b;

public final class C6584e {
    public static void m29883a(C6525b c6525b, Intent intent) {
        if (c6525b != null) {
            Object obj;
            if (intent != null) {
                String action = intent.getAction();
                if (action.equals("android.nfc.action.TAG_DISCOVERED") || action.equals("android.nfc.action.TECH_DISCOVERED") || action.equals("android.nfc.action.NDEF_DISCOVERED")) {
                    obj = 1;
                    if (obj != null) {
                        c6525b.mo5476b(intent);
                    }
                }
            }
            obj = null;
            if (obj != null) {
                c6525b.mo5476b(intent);
            }
        }
    }
}
