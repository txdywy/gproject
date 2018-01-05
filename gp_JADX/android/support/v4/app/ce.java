package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class ce {
    public final int f1472a;
    public final CharSequence f1473b;
    public final PendingIntent f1474c;
    public boolean f1475d;
    public final Bundle f1476e;
    public ArrayList f1477f;

    public ce(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private ce(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f1475d = true;
        this.f1472a = i;
        this.f1473b = cg.m1413d(charSequence);
        this.f1474c = pendingIntent;
        this.f1476e = bundle;
        this.f1477f = null;
        this.f1475d = true;
    }

    public final cd m1408a() {
        co[] coVarArr;
        co[] coVarArr2;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        if (this.f1477f != null) {
            ArrayList arrayList3 = this.f1477f;
            if (arrayList3.size() > 0) {
                arrayList3.get(0);
                throw new NoSuchMethodError();
            }
        }
        if (arrayList.isEmpty()) {
            coVarArr = null;
        } else {
            coVarArr = (co[]) arrayList.toArray(new co[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            coVarArr2 = null;
        } else {
            coVarArr2 = (co[]) arrayList2.toArray(new co[arrayList2.size()]);
        }
        return new cd(this.f1472a, this.f1473b, this.f1474c, this.f1476e, coVarArr2, coVarArr, this.f1475d);
    }
}
