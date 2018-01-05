package com.google.android.finsky.installqueue.p141a;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.installer.p208b.p209a.C3315e;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.utils.C4680k;
import com.google.protobuf.nano.C0757i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public final class C3327a extends C1198a {
    public static final C1201d f17174e;
    public final C1202e f17175f;

    public C3327a(Context context, C1203f c1203f, C4817d c4817d) {
        super(context, c4817d.mo4399a(Executors.newSingleThreadExecutor()), "install_queue.db", new C1201d[]{f17174e});
        this.f17175f = c1203f.mo1517a(this, f17174e.f7309a, C3331b.f17188a, C3332c.f17189a, C3333d.f17190a, ((Integer) C0955b.iK.m28964b()).intValue(), C3334e.f17191a);
    }

    static final /* synthetic */ ContentValues m16707a(C3369m c3369m) {
        ContentValues contentValues = new ContentValues();
        InstallRequest installRequest = c3369m.f17274d;
        contentValues.put("reason", installRequest.f17171a.f17147q);
        contentValues.put("state", Integer.valueOf(c3369m.f17273c.f17153d));
        List arrayList = new ArrayList();
        for (InstallConstraint a : installRequest.f17172b) {
            arrayList.add(a.m16701a());
        }
        Collections.sort(arrayList);
        contentValues.put("constraints", C4680k.m21815a(arrayList));
        return contentValues;
    }

    static final /* synthetic */ C3369m m16708a(byte[] bArr) {
        try {
            return new C3369m((C3315e) C0757i.m4905a(new C3315e(), bArr));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static {
        Map hashMap = new HashMap();
        hashMap.put("reason", "TEXT");
        hashMap.put("state", "INTEGER");
        hashMap.put("constraints", "TEXT");
        f17174e = new C1201d("install_requests", "TEXT", hashMap);
    }
}
