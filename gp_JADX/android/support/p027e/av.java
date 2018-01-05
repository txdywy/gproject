package android.support.p027e;

import android.support.v4.p037h.C0305a;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class av {
    public static an f1066a = new C0180f();
    public static ThreadLocal f1067d = new ThreadLocal();
    public static ArrayList f1068e = new ArrayList();
    public C0305a f1069b = new C0305a();
    public C0305a f1070c = new C0305a();

    static C0305a m876a() {
        WeakReference weakReference = (WeakReference) f1067d.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference(new C0305a());
            f1067d.set(weakReference);
        }
        return (C0305a) weakReference.get();
    }

    public static void m877a(ViewGroup viewGroup, an anVar) {
        if (anVar != null && viewGroup != null) {
            Object awVar = new aw(anVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(awVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(awVar);
        }
    }

    public static void m878b(ViewGroup viewGroup, an anVar) {
        ArrayList arrayList = (ArrayList) av.m876a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((an) obj).mo222d(viewGroup);
            }
        }
        if (anVar != null) {
            anVar.m847a(viewGroup, true);
        }
        am a = am.m828a(viewGroup);
        if (a != null && am.m828a(a.f1020c) == a && a.f1023f != null) {
            a.f1023f.run();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m879a(android.support.p027e.am r5) {
        /*
        r4 = this;
        r2 = 1;
        r0 = r5.f1020c;
        if (r0 == 0) goto L_0x002d;
    L_0x0005:
        r1 = android.support.p027e.am.m828a(r0);
        if (r1 == 0) goto L_0x002d;
    L_0x000b:
        r0 = r4.f1070c;
        r0 = r0.get(r5);
        r0 = (android.support.v4.p037h.C0305a) r0;
        if (r0 == 0) goto L_0x002d;
    L_0x0015:
        r0 = r0.get(r1);
        r0 = (android.support.p027e.an) r0;
        if (r0 == 0) goto L_0x002d;
    L_0x001d:
        r3 = r5.f1020c;
        r1 = f1068e;
        r1 = r1.contains(r3);
        if (r1 != 0) goto L_0x002c;
    L_0x0027:
        if (r0 != 0) goto L_0x003a;
    L_0x0029:
        r5.m830a();
    L_0x002c:
        return;
    L_0x002d:
        r0 = r4.f1069b;
        r0 = r0.get(r5);
        r0 = (android.support.p027e.an) r0;
        if (r0 != 0) goto L_0x001d;
    L_0x0037:
        r0 = f1066a;
        goto L_0x001d;
    L_0x003a:
        r1 = f1068e;
        r1.add(r3);
        r0 = r0.clone();
        r0 = (android.support.p027e.an) r0;
        r0.mo215b(r3);
        r1 = android.support.p027e.am.m828a(r3);
        if (r1 == 0) goto L_0x0058;
    L_0x004e:
        r1 = r1.f1019b;
        if (r1 <= 0) goto L_0x0062;
    L_0x0052:
        r1 = r2;
    L_0x0053:
        if (r1 == 0) goto L_0x0058;
    L_0x0055:
        r0.mo218b(r2);
    L_0x0058:
        android.support.p027e.av.m878b(r3, r0);
        r5.m830a();
        android.support.p027e.av.m877a(r3, r0);
        goto L_0x002c;
    L_0x0062:
        r1 = 0;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.e.av.a(android.support.e.am):void");
    }
}
