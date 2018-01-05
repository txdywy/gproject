package com.google.android.finsky.ch;

import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.nfc.NfcEvent;
import android.text.TextUtils;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.common.a.c;
import com.google.common.a.j;

public final class C2280a implements CreateNdefMessageCallback {
    public final C1045b f11288a;
    public final String f11289b;
    public final j f11290c = j.c(NfcAdapter.getDefaultAdapter(this.f11288a.m603h()));
    public boolean f11291d = true;

    public C2280a(C1045b c1045b, String str) {
        this.f11288a = c1045b;
        this.f11289b = str;
        if (this.f11290c.a()) {
            ((NfcAdapter) this.f11290c.b()).setNdefPushMessageCallback(this, this.f11288a.m603h(), new Activity[0]);
        }
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        if (!m11750d()) {
            return null;
        }
        Object bytes = this.f11289b.getBytes(c.b);
        Object obj = new byte[(bytes.length + 1)];
        System.arraycopy(bytes, 0, obj, 1, bytes.length);
        NdefRecord ndefRecord = new NdefRecord((short) 1, new byte[]{(byte) 85}, new byte[0], obj);
        return new NdefMessage(new NdefRecord[]{ndefRecord});
    }

    public final synchronized void m11751a() {
        this.f11291d = false;
    }

    public final synchronized void m11752b() {
        this.f11291d = true;
    }

    public final synchronized void m11753c() {
        this.f11291d = true;
    }

    private final synchronized boolean m11750d() {
        boolean z;
        z = this.f11291d && this.f11288a.at() && this.f11290c.a() && !TextUtils.isEmpty(this.f11289b);
        return z;
    }
}
