package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class av {
    public final aa f8906a;
    public final Map f8907b;

    public av(aa aaVar) {
        this(aaVar, (byte) 0);
    }

    private av(aa aaVar, byte b) {
        this.f8906a = aaVar;
        this.f8907b = ay.f8912a;
    }

    protected static void m9571a() {
    }

    protected final boolean m9572a(ao aoVar, aa aaVar, C1709d c1709d, String str, C1711f c1711f) {
        List list = (List) this.f8907b.get(c1709d);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (C1710e c1710e : r0) {
            Object obj;
            Object obj2 = null;
            CharSequence c = az.m9581c(str);
            switch (c1710e.ordinal()) {
                case 0:
                    if (!(c == null || aaVar.f8797c.contains(c1709d))) {
                        obj2 = 1;
                        break;
                    }
                case 1:
                    if (aaVar.f8798d.contains(c1709d) && c == null) {
                        obj2 = 1;
                        break;
                    }
                case 2:
                    if (c != null) {
                        boolean z;
                        Object c2 = az.m9581c(c);
                        az.m9577a(c2);
                        if (aoVar != null) {
                            String[] strArr = aoVar == ao.LATIN ? aaVar.f8801g : aaVar.f8802h;
                            Set hashSet = new HashSet();
                            if (strArr != null) {
                                for (String toLowerCase : strArr) {
                                    hashSet.add(toLowerCase.toLowerCase());
                                }
                            }
                            if (aaVar.f8800f != null) {
                                for (String toLowerCase2 : aaVar.f8800f) {
                                    hashSet.add(toLowerCase2.toLowerCase());
                                }
                            }
                            if (hashSet.size() == 0 || c2 == null) {
                                z = true;
                            } else {
                                z = hashSet.contains(c.toLowerCase());
                            }
                        } else if (aaVar.f8799e == null || aaVar.f8799e.containsKey(c2.toLowerCase())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            obj2 = 1;
                            break;
                        }
                        obj2 = null;
                        break;
                    }
                    break;
                case 3:
                    if (!(c == null || aaVar.f8803i == null || aaVar.f8803i.matcher(c).matches())) {
                        obj2 = 1;
                        break;
                    }
                case 4:
                    if (!(c == null || aaVar.f8804j == null || aaVar.f8804j.matcher(c).lookingAt())) {
                        obj2 = 1;
                        break;
                    }
                default:
                    String valueOf = String.valueOf(c1710e);
                    throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Unknown problem: ").append(valueOf).toString());
            }
            if (obj2 != null) {
                c1711f.f8953a.put(c1709d, c1710e);
            }
            if (obj2 == null) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    static {
        ax axVar = new ax();
    }
}
