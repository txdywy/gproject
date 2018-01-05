package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.af;
import java.net.ProtocolException;

public final class ac {
    public final af f39608a;
    public final int f39609b;
    public final String f39610c;

    private ac(af afVar, int i, String str) {
        this.f39608a = afVar;
        this.f39609b = i;
        this.f39610c = str;
    }

    public static ac m36908a(String str) {
        af afVar;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - 48;
            if (charAt == 0) {
                afVar = af.a;
            } else if (charAt == 1) {
                afVar = af.b;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            afVar = af.a;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        if (str.length() < i + 3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            String str2;
            int parseInt = Integer.parseInt(str.substring(i, i + 3));
            String str3 = "";
            if (str.length() <= i + 3) {
                str2 = str3;
            } else if (str.charAt(i + 3) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            } else {
                str2 = str.substring(i + 4);
            }
            return new ac(afVar, parseInt, str2);
        } catch (NumberFormatException e) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f39608a == af.a ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ').append(this.f39609b);
        if (this.f39610c != null) {
            stringBuilder.append(' ').append(this.f39610c);
        }
        return stringBuilder.toString();
    }
}
