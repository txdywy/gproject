package com.google.android.finsky.p167r.p231a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

final class C3958g {
    public final String f19972a;
    public final int f19973b;
    public final int f19974c;
    public final int f19975d;

    private C3958g(String str) {
        String[] a = C4680k.m21818a(str);
        if (a.length != 4) {
            throw new IllegalArgumentException(String.format("Invalid number of items for the Rapid Auto Update data (Expecting 4, got %d). Data: %s", new Object[]{Integer.valueOf(a.length), str}));
        }
        try {
            this.f19972a = a[0];
            this.f19973b = Integer.parseInt(a[1]);
            this.f19974c = Integer.parseInt(a[2]);
            this.f19975d = Integer.parseInt(a[3]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("Invalid format for the Rapid Auto Update data: %s", new Object[]{str}));
        }
    }

    static List m18661a() {
        List arrayList = new ArrayList();
        for (String c3958g : ((String) C0955b.eS.m28964b()).split(";")) {
            try {
                arrayList.add(new C3958g(c3958g));
            } catch (IllegalArgumentException e) {
                FinskyLog.m21665c(e.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }
}
