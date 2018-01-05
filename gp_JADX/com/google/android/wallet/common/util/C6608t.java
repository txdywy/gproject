package com.google.android.wallet.common.util;

import android.util.Log;
import com.google.android.wallet.a.a;
import com.google.protobuf.nano.i;
import java.io.IOException;

public final class C6608t {
    public static final boolean f32777a = Log.isLoggable("ImProto", 2);

    public static i m29984a(byte[] bArr, Class cls) {
        String str;
        String valueOf;
        try {
            return i.a((i) cls.newInstance(), bArr);
        } catch (InstantiationException e) {
            str = "Failed to parse a known parcelable proto ";
            valueOf = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException e2) {
            str = "Failed to parse a known parcelable proto ";
            valueOf = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IOException e3) {
            str = "Failed to parse a known parcelable proto ";
            valueOf = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static i m29983a(i iVar) {
        return C6608t.m29984a(i.a(iVar), iVar.getClass());
    }

    public static void m29985a(i iVar, String str) {
        if (!f32777a) {
            return;
        }
        if (((Boolean) a.i.a()).booleanValue()) {
            synchronized (C6608t.class) {
                Log.v("ImProto", str);
                for (Object valueOf : iVar.toString().split("\n")) {
                    String str2 = "ImProto";
                    String str3 = "| ";
                    String valueOf2 = String.valueOf(valueOf);
                    Log.v(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
            }
            return;
        }
        Log.v("ImProto", "allowPiiLogging needs to be enabled for proto logging");
    }

    public static void m29986b(i iVar, String str) {
        String str2 = "Response for ";
        String valueOf = String.valueOf(str);
        C6608t.m29985a(iVar, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private C6608t() {
    }
}
