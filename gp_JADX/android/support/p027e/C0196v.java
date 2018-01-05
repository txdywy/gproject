package android.support.p027e;

import android.graphics.Rect;
import android.support.v4.app.bi;
import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class C0196v extends bi {
    public final boolean mo258a(Object obj) {
        return obj instanceof an;
    }

    public final Object mo259b(Object obj) {
        if (obj != null) {
            return (an) ((an) obj).clone();
        }
        return null;
    }

    public final Object mo264c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object azVar = new az();
        azVar.m890a((an) obj);
        return azVar;
    }

    public final void mo254a(Object obj, View view, ArrayList arrayList) {
        obj = (az) obj;
        List list = obj.f1050s;
        list.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bi.m1012a(list, (View) arrayList.get(i));
        }
        list.add(view);
        arrayList.add(view);
        mo256a(obj, arrayList);
    }

    public final void mo253a(Object obj, View view) {
        if (view != null) {
            an anVar = (an) obj;
            bi.m1010a(view, new Rect());
            anVar.mo209a(new C0197w());
        }
    }

    public final void mo256a(Object obj, ArrayList arrayList) {
        int i = 0;
        an anVar = (an) obj;
        if (anVar != null) {
            int size;
            if (anVar instanceof az) {
                az azVar = (az) anVar;
                size = azVar.f1075a.size();
                while (i < size) {
                    mo256a(azVar.m895b(i), arrayList);
                    i++;
                }
            } else if (!C0196v.m1033a(anVar) && bi.m1013a(anVar.f1050s)) {
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    anVar.mo214b((View) arrayList.get(size));
                }
            }
        }
    }

    private static boolean m1033a(an anVar) {
        return (bi.m1013a(anVar.f1049r) && bi.m1013a(anVar.f1051t) && bi.m1013a(anVar.f1052u)) ? false : true;
    }

    public final Object mo250a(Object obj, Object obj2, Object obj3) {
        az azVar = new az();
        if (obj != null) {
            azVar.m890a((an) obj);
        }
        if (obj2 != null) {
            azVar.m890a((an) obj2);
        }
        if (obj3 != null) {
            azVar.m890a((an) obj3);
        }
        return azVar;
    }

    public final void mo262b(Object obj, View view, ArrayList arrayList) {
        ((an) obj).mo206a(new C0198x(view, arrayList));
    }

    public final Object mo260b(Object obj, Object obj2, Object obj3) {
        an anVar = null;
        an anVar2 = (an) obj;
        an anVar3 = (an) obj2;
        an anVar4 = (an) obj3;
        if (anVar2 != null && anVar3 != null) {
            anVar = new az().m890a(anVar2).m890a(anVar3).m889a(1);
        } else if (anVar2 != null) {
            anVar = anVar2;
        } else if (anVar3 != null) {
            anVar = anVar3;
        }
        if (anVar4 == null) {
            return anVar;
        }
        az azVar = new az();
        if (anVar != null) {
            azVar.m890a(anVar);
        }
        azVar.m890a(anVar4);
        return azVar;
    }

    public final void mo251a(ViewGroup viewGroup, Object obj) {
        obj = (an) obj;
        if (!av.f1068e.contains(viewGroup) && ai.f1848a.mo409s(viewGroup)) {
            av.f1068e.add(viewGroup);
            if (obj == null) {
                obj = av.f1066a;
            }
            an anVar = (an) obj.clone();
            av.m878b(viewGroup, anVar);
            am.m829a(viewGroup, null);
            av.m877a(viewGroup, anVar);
        }
    }

    public final void mo255a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((an) obj).mo206a(new C0199y(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void mo257a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        obj = (az) obj;
        if (obj != null) {
            obj.f1050s.clear();
            obj.f1050s.addAll(arrayList2);
            mo263b(obj, arrayList, arrayList2);
        }
    }

    public final void mo263b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        an anVar = (an) obj;
        int size;
        if (anVar instanceof az) {
            az azVar = (az) anVar;
            size = azVar.f1075a.size();
            while (i < size) {
                mo263b(azVar.m895b(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C0196v.m1033a(anVar)) {
            List list = anVar.f1050s;
            if (list.size() == arrayList.size() && list.containsAll(arrayList)) {
                size = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    anVar.mo214b((View) arrayList2.get(i2));
                }
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    anVar.mo219c((View) arrayList.get(size));
                }
            }
        }
    }

    public final void mo261b(Object obj, View view) {
        if (obj != null) {
            ((an) obj).mo214b(view);
        }
    }

    public final void mo265c(Object obj, View view) {
        if (obj != null) {
            ((an) obj).mo219c(view);
        }
    }

    public final void mo252a(Object obj, Rect rect) {
        if (obj != null) {
            ((an) obj).mo209a(new C0200z());
        }
    }
}
