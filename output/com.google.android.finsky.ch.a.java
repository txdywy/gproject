package com.google.android.finsky.ch;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.pagesystem.b;
import com.google.common.a.c;
import com.google.common.a.j;

public final class com.google.android.finsky.ch.a implements NfcAdapter$CreateNdefMessageCallback
{

    public final com.google.android.finsky.pagesystem.b a;
    public final String b;
    public final com.google.common.a.j c;
    public boolean d;

    a(com.google.android.finsky.pagesystem.b p0, String p1) {
        this.a = p0;
        this.b = p1;
        this.d = 1;
        this.c = com.google.common.a.j.c(NfcAdapter.getDefaultAdapter(this.a.h()));
        if (this.c.a())
            ((NfcAdapter)this.c.b()).setNdefPushMessageCallback(this, this.a.h(), new Activity[0]);
    }

    private final synchronized boolean d() {
        enter this;
        try {
            if (this.d != 0 && this.a.at() && this.c.a() && !TextUtils.isEmpty(this.b))
                v0 = 1;
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized void a() {
        enter this;
        try {
            this.d = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b() {
        enter this;
        try {
            this.d = 1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c() {
        enter this;
        try {
            this.d = 1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final NdefMessage createNdefMessage(NfcEvent p0) {
        if (!this.d())
            v0 = 0;
        else {
            v0 = this.b.getBytes(com.google.common.a.c.b);
            v1 = new byte[v0.length + 1];
            System.arraycopy(v0, 0, v1, 1, v0.length);
            v0 = new byte[1];
            v0[0] = 85;
            v2 = new NdefRecord(1, v0, new byte[0], v1);
            v1 = new NdefRecord[1];
            v1[0] = v2;
            v0 = new NdefMessage(v1);
        }
        return v0;
    }

}
