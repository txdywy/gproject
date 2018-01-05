package com.google.android.wallet.nfc.p398a;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.SystemClock;
import com.google.android.wallet.a.a;
import com.google.android.wallet.common.util.C6593e;
import com.google.android.wallet.nfc.C6690a;
import com.google.android.wallet.nfc.exceptions.TagReadException;
import com.google.android.wallet.nfc.exceptions.TagReadTimeoutException;
import com.google.android.wallet.nfc.exceptions.UnsupportedTagException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C6684e {
    public static final int f32988a = ((Integer) a.l.a()).intValue();

    public static C6690a m30312a(Intent intent) {
        int i = 0;
        IsoDep isoDep = IsoDep.get((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
        if (isoDep == null) {
            throw new UnsupportedTagException();
        }
        try {
            C6690a a;
            isoDep.connect();
            isoDep.setTimeout(f32988a);
            for (String a2 : C6681b.f32978b) {
                C6685f c6685f = new C6685f(C6684e.m30315a(isoDep, C6681b.m30306a(a2).f32979a));
                if (C6681b.m30308a(c6685f, C6685f.f32989a)) {
                    C6687h a3 = C6689j.m30320a(C6688i.m30316a(c6685f), C6689j.f33006i);
                    if (a3 != null) {
                        a = C6684e.m30314a(isoDep, C6689j.m30321a(a3));
                        if (a != null) {
                            break;
                        }
                    }
                }
                a = null;
                if (a != null) {
                    break;
                }
            }
            String[] strArr = C6681b.f32977a;
            int length = strArr.length;
            while (i < length) {
                a = C6684e.m30314a(isoDep, strArr[i]);
                if (a != null) {
                    isoDep.close();
                    return a;
                }
                i++;
            }
            isoDep.close();
            throw new TagReadException();
        } finally {
            isoDep.close();
        }
    }

    private static C6690a m30314a(IsoDep isoDep, String str) {
        C6685f c6685f = new C6685f(C6684e.m30315a(isoDep, C6681b.m30306a(str).f32979a));
        if (C6681b.m30308a(c6685f, C6685f.f32989a)) {
            byte b;
            C6690a c6690a;
            C6687h a = C6688i.m30316a(c6685f);
            byte[] a2 = C6689j.m30323a(new C6685f(C6684e.m30315a(isoDep, C6681b.m30307a(C6689j.m30324b(C6689j.m30320a(a, C6689j.f33007j)), C6689j.m30321a(C6689j.m30320a(a, C6689j.f33005h)).toLowerCase(Locale.US).startsWith("visacard")).f32979a)));
            List arrayList = new ArrayList();
            int length = a2.length;
            for (int i = 0; i < length; i += 4) {
                arrayList.add(new C6680a(a2[i + 1], a2[i + 2], (byte) (C6593e.m29917a(a2[i]) >> 3)));
            }
            int size = arrayList.size();
            loop1:
            for (int i2 = 0; i2 < size; i2++) {
                C6680a c6680a = (C6680a) arrayList.get(i2);
                for (b = c6680a.f32974a; b <= c6680a.f32975b; b = (byte) (b + 1)) {
                    C6690a a3 = C6684e.m30313a(isoDep, b, c6680a.f32976c);
                    if (a3 != null) {
                        c6690a = a3;
                        break loop1;
                    }
                }
            }
            c6690a = null;
            if (c6690a != null) {
                return c6690a;
            }
            byte b2;
            C6687h a4 = C6689j.m30320a(a, C6689j.f33008k);
            if (a4 != null) {
                b2 = (byte) (a4.f32996b[0] >> 3);
                for (b = (byte) 1; b <= (byte) 16; b = (byte) (b + 1)) {
                    c6690a = C6684e.m30313a(isoDep, b, b2);
                    if (c6690a != null) {
                        return c6690a;
                    }
                }
            }
            for (b2 = (byte) 1; b2 <= (byte) 31; b2 = (byte) (b2 + 1)) {
                for (b = (byte) 1; b <= (byte) 16; b = (byte) (b + 1)) {
                    c6690a = C6684e.m30313a(isoDep, b, b2);
                    if (c6690a != null) {
                        return c6690a;
                    }
                }
            }
        }
        return null;
    }

    private static C6690a m30313a(IsoDep isoDep, byte b, byte b2) {
        C6685f c6685f = new C6685f(C6684e.m30315a(isoDep, C6681b.m30304a(b, b2).f32979a));
        if (C6681b.m30308a(c6685f, C6685f.f32990b)) {
            c6685f = new C6685f(C6684e.m30315a(isoDep, C6681b.m30305a(b, b2, c6685f.f32993e).f32979a));
        }
        if (C6681b.m30308a(c6685f, C6685f.f32989a)) {
            C6690a c = C6689j.m30325c(C6688i.m30316a(c6685f));
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    private static byte[] m30315a(IsoDep isoDep, byte[] bArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            return isoDep.transceive(bArr);
        } catch (Exception e) {
            if (SystemClock.elapsedRealtime() - elapsedRealtime >= ((long) f32988a)) {
                throw new TagReadTimeoutException(e);
            }
            throw e;
        }
    }
}
