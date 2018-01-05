package android.support.p027e;

import android.support.v4.p037h.C0304u;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class aw implements OnAttachStateChangeListener, OnPreDrawListener {
    public an f1071a;
    public ViewGroup f1072b;

    aw(an anVar, ViewGroup viewGroup) {
        this.f1071a = anVar;
        this.f1072b = viewGroup;
    }

    private final void m880a() {
        this.f1072b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f1072b.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m880a();
        av.f1068e.remove(this.f1072b);
        ArrayList arrayList = (ArrayList) av.m876a().get(this.f1072b);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((an) obj).mo224e(this.f1072b);
            }
        }
        this.f1071a.m848a(true);
    }

    public final boolean onPreDraw() {
        int i = 0;
        m880a();
        if (av.f1068e.remove(this.f1072b)) {
            ArrayList arrayList;
            C0304u a = av.m876a();
            ArrayList arrayList2 = (ArrayList) a.get(this.f1072b);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                a.put(this.f1072b, arrayList2);
                arrayList = arrayList2;
                arrayList2 = null;
            } else if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList = arrayList2;
                arrayList2 = arrayList3;
            } else {
                arrayList = arrayList2;
                arrayList2 = null;
            }
            arrayList.add(this.f1071a);
            this.f1071a.mo206a(new ax(this, a));
            this.f1071a.m847a(this.f1072b, false);
            if (arrayList2 != null) {
                arrayList2 = arrayList2;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((an) obj).mo224e(this.f1072b);
                }
            }
            this.f1071a.m845a(this.f1072b);
        }
        return true;
    }
}
