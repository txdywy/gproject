package com.google.android.finsky.zapp;

import android.net.Uri;

final class C4843a {
    public final String f25120a;
    public final String f25121b;
    public final String f25122c;
    public final long f25123d;
    public final String f25124e;
    public final boolean f25125f;
    public Integer f25126g;
    public Uri f25127h;
    public Long f25128i;
    public Integer f25129j;
    public Uri f25130k;
    public Long f25131l;
    public Integer f25132m;
    public String f25133n;
    public String f25134o;
    public String f25135p;
    public final int f25136q;
    public Long f25137r;
    public int f25138s;
    public Uri f25139t;

    public C4843a(String str, String str2, Uri uri, long j, String str3, int i, boolean z, int i2) {
        this(str, str2, uri.toString(), j, str3, i, z, Integer.valueOf(i2));
        this.f25139t = uri;
    }

    private C4843a(String str, String str2, String str3, long j, String str4, int i, boolean z, Integer num) {
        this.f25137r = null;
        this.f25138s = 0;
        this.f25120a = str;
        this.f25121b = str2;
        this.f25122c = str3;
        this.f25123d = j;
        this.f25124e = str4;
        this.f25136q = i;
        this.f25125f = z;
        this.f25126g = num;
        m22651a();
        m22654b();
    }

    public final void m22652a(Uri uri, long j, int i) {
        this.f25127h = uri;
        this.f25128i = Long.valueOf(j);
        this.f25129j = Integer.valueOf(i);
    }

    public final void m22653a(Uri uri, long j, int i, String str, String str2, String str3) {
        this.f25130k = uri;
        this.f25131l = Long.valueOf(j);
        this.f25132m = Integer.valueOf(i);
        this.f25133n = str;
        this.f25134o = str2;
        this.f25135p = str3;
    }

    public final void m22651a() {
        this.f25127h = null;
        this.f25128i = null;
        this.f25129j = null;
    }

    public final void m22654b() {
        this.f25130k = null;
        this.f25131l = null;
        this.f25132m = null;
        this.f25133n = null;
        this.f25134o = null;
        this.f25135p = null;
    }

    public static C4843a m22649a(String str) {
        String[] split = str.split("@");
        if (split.length < 16) {
            return null;
        }
        try {
            Long l;
            Integer num;
            Long l2;
            Uri uri;
            Long l3;
            Uri uri2;
            String str2;
            Integer num2;
            String str3;
            String str4;
            Integer valueOf;
            if (split[0].equals("null")) {
                l = null;
            } else {
                l = Long.valueOf(split[0]);
            }
            String str5 = split[1];
            String str6 = split[2];
            String str7 = split[3];
            long parseLong = Long.parseLong(split[4]);
            String str8 = split[5];
            int parseInt = Integer.parseInt(split[6]);
            boolean parseBoolean = Boolean.parseBoolean(split[7]);
            if (split[8].equals("null")) {
                num = null;
                l2 = null;
                uri = null;
            } else {
                Uri parse = Uri.parse(split[8]);
                Long valueOf2 = Long.valueOf(Long.parseLong(split[9]));
                num = Integer.valueOf(Integer.parseInt(split[10]));
                l2 = valueOf2;
                uri = parse;
            }
            if (split[11].equals("null")) {
                l3 = null;
                uri2 = null;
                str2 = null;
                num2 = null;
                str3 = null;
                str4 = null;
            } else {
                Uri parse2 = Uri.parse(split[11]);
                Long valueOf3 = Long.valueOf(Long.parseLong(split[12]));
                Integer valueOf4 = Integer.valueOf(Integer.parseInt(split[13]));
                str3 = split[14];
                String str9 = split[15];
                if (split.length < 18 || split[17].equals("null")) {
                    l3 = valueOf3;
                    uri2 = parse2;
                    str2 = str3;
                    num2 = valueOf4;
                    str3 = null;
                    str4 = str9;
                } else {
                    l3 = valueOf3;
                    uri2 = parse2;
                    str2 = str3;
                    num2 = valueOf4;
                    str3 = split[17];
                    str4 = str9;
                }
            }
            try {
                valueOf = split.length >= 17 ? Integer.valueOf(Integer.parseInt(split[16])) : null;
            } catch (NumberFormatException e) {
                valueOf = null;
            }
            C4843a c4843a = new C4843a(str5, str7, str6, parseLong, str8, parseInt, parseBoolean, valueOf);
            if (uri != null) {
                c4843a.m22652a(uri, l2.longValue(), num.intValue());
            }
            if (uri2 != null) {
                c4843a.m22653a(uri2, l3.longValue(), num2.intValue(), str2, str4, str3);
            }
            c4843a.f25137r = l;
            return c4843a;
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public final Uri m22655c() {
        if (this.f25130k != null) {
            return this.f25130k;
        }
        if (this.f25127h != null) {
            return this.f25127h;
        }
        if (this.f25139t == null) {
            this.f25139t = Uri.parse(this.f25122c);
        }
        return this.f25139t;
    }

    public final String m22656d() {
        if (this.f25137r != null) {
            return Long.toString(this.f25137r.longValue());
        }
        return C4843a.m22650b(this.f25120a);
    }

    public final String m22657e() {
        String str = this.f25120a;
        String str2 = this.f25121b;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    static String m22650b(String str) {
        String str2 = "_";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public final String toString() {
        String str;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String str2;
        String str3;
        if (this.f25127h == null) {
            str = "null@null@null";
        } else {
            str = String.valueOf(this.f25127h);
            valueOf = String.valueOf(this.f25128i);
            valueOf2 = String.valueOf(this.f25129j);
            str = new StringBuilder(((String.valueOf(str).length() + 2) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append("@").append(valueOf).append("@").append(valueOf2).toString();
        }
        if (this.f25130k == null) {
            valueOf = "null@null@null@null@null";
        } else {
            valueOf = String.valueOf(this.f25130k);
            valueOf2 = String.valueOf(this.f25131l);
            valueOf3 = String.valueOf(this.f25132m);
            str2 = this.f25133n;
            str3 = this.f25134o;
            valueOf = new StringBuilder(((((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(valueOf).append("@").append(valueOf2).append("@").append(valueOf3).append("@").append(str2).append("@").append(str3).toString();
        }
        valueOf3 = String.valueOf(this.f25137r);
        str2 = this.f25120a;
        str3 = this.f25122c;
        String str4 = this.f25121b;
        long j = this.f25123d;
        String str5 = this.f25124e;
        int i = this.f25136q;
        boolean z = this.f25125f;
        String valueOf4 = String.valueOf(this.f25126g == null ? "null" : this.f25126g);
        valueOf2 = this.f25135p == null ? "null" : this.f25135p;
        return new StringBuilder(((((((((String.valueOf(valueOf3).length() + 48) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf2).length()).append(valueOf3).append("@").append(str2).append("@").append(str3).append("@").append(str4).append("@").append(j).append("@").append(str5).append("@").append(i).append("@").append(z).append("@").append(str).append("@").append(valueOf).append("@").append(valueOf4).append("@").append(valueOf2).append("@").toString();
    }
}
