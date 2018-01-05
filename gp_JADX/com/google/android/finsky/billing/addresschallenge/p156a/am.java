package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.EnumMap;
import java.util.Map;

public final class am {
    public an f8837a;
    public ao f8838b = ao.LOCAL;
    public Map f8839c = new EnumMap(C1709d.class);
    public String f8840d;

    public am(an anVar) {
        this.f8837a = anVar;
    }

    am(al alVar) {
        this.f8837a = alVar.f8832b;
        this.f8838b = alVar.f8833c;
        this.f8840d = alVar.f8836f;
        C1709d[] c1709dArr = al.f8831a;
        int length = c1709dArr.length;
        int i = 0;
        while (i < length) {
            Object obj = c1709dArr[i];
            if (alVar.f8834d.containsKey(obj)) {
                this.f8839c.put(obj, (String) alVar.f8834d.get(obj));
                i++;
            } else {
                return;
            }
        }
    }

    am(String str) {
        String[] split = str.split("/");
        String valueOf;
        if (!split[0].equals(an.DATA.name().toLowerCase()) && !split[0].equals(an.EXAMPLES.name().toLowerCase())) {
            String str2 = "Wrong key type: ";
            valueOf = String.valueOf(split[0]);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (split.length > al.f8831a.length + 1) {
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 44).append("input key '").append(str).append("' deeper than supported hierarchy").toString());
        } else if (split[0].equals("data")) {
            this.f8837a = an.DATA;
            if (split.length > 1) {
                Object c = az.m9581c(split[1]);
                if (c.contains("--")) {
                    String[] split2 = c.split("--");
                    if (split2.length != 2) {
                        throw new RuntimeException("Wrong format: Substring should be country code--language code");
                    }
                    c = split2[0];
                    this.f8840d = split2[1];
                }
                this.f8839c.put(al.f8831a[0], c);
            }
            if (split.length > 2) {
                int i = 2;
                while (i < split.length) {
                    String c2 = az.m9581c(split[i]);
                    if (c2 != null) {
                        this.f8839c.put(al.f8831a[i - 1], c2);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else if (split[0].equals("examples")) {
            this.f8837a = an.EXAMPLES;
            if (split.length > 1) {
                this.f8839c.put(C1709d.COUNTRY, split[1]);
            }
            if (split.length > 2) {
                valueOf = split[2];
                if (valueOf.equals("local")) {
                    this.f8838b = ao.LOCAL;
                } else if (valueOf.equals("latin")) {
                    this.f8838b = ao.LATIN;
                } else {
                    throw new RuntimeException("Script type has to be either latin or local.");
                }
            }
            if (split.length > 3 && !split[3].equals("_default")) {
                this.f8840d = split[3];
            }
        }
    }

    public final am m9555a(C1704a c1704a) {
        this.f8840d = c1704a.f8794k;
        if (this.f8840d != null && az.m9579a(this.f8840d)) {
            this.f8838b = ao.LATIN;
        }
        if (c1704a.f8784a != null) {
            this.f8839c.put(C1709d.COUNTRY, c1704a.f8784a);
            if (c1704a.f8787d != null) {
                this.f8839c.put(C1709d.ADMIN_AREA, c1704a.f8787d);
                if (c1704a.f8788e != null) {
                    this.f8839c.put(C1709d.LOCALITY, c1704a.f8788e);
                    if (c1704a.f8789f != null) {
                        this.f8839c.put(C1709d.DEPENDENT_LOCALITY, c1704a.f8789f);
                    }
                }
            }
        }
        return this;
    }

    public final al m9554a() {
        return new al(this);
    }
}
