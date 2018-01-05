package android.support.p027e;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0310e;
import android.support.v4.p037h.C0313h;
import android.support.v4.view.ai;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public abstract class an implements Cloneable {
    public static ThreadLocal f1024I = new ThreadLocal();
    public static final int[] f1025l = new int[]{2, 1, 3, 4};
    public static final ae f1026m = new ao();
    public ArrayList f1027A = null;
    public ArrayList f1028B = null;
    public bd f1029C = new bd();
    public bd f1030D = new bd();
    public az f1031E = null;
    public int[] f1032F = f1025l;
    public ArrayList f1033G;
    public ArrayList f1034H;
    public boolean f1035J = false;
    public ArrayList f1036K = new ArrayList();
    public int f1037L = 0;
    public boolean f1038M = false;
    public boolean f1039N = false;
    public ArrayList f1040O = null;
    public ArrayList f1041P = new ArrayList();
    public ay f1042Q;
    public C0305a f1043R;
    public ae f1044S = f1026m;
    public String f1045n = getClass().getName();
    public long f1046o = -1;
    public long f1047p = -1;
    public TimeInterpolator f1048q = null;
    public ArrayList f1049r = new ArrayList();
    public ArrayList f1050s = new ArrayList();
    public ArrayList f1051t = null;
    public ArrayList f1052u = null;
    public ArrayList f1053v = null;
    public ArrayList f1054w = null;
    public ArrayList f1055x = null;
    public ArrayList f1056y = null;
    public ArrayList f1057z = null;

    public abstract void mo210a(bc bcVar);

    public abstract void mo217b(bc bcVar);

    public an mo204a(long j) {
        this.f1047p = j;
        return this;
    }

    public an mo212b(long j) {
        this.f1046o = j;
        return this;
    }

    public an mo205a(TimeInterpolator timeInterpolator) {
        this.f1048q = timeInterpolator;
        return this;
    }

    public String[] mo245a() {
        return null;
    }

    public Animator mo243a(ViewGroup viewGroup, bc bcVar, bc bcVar2) {
        return null;
    }

    private final void m831a(bd bdVar, bd bdVar2) {
        bc bcVar;
        C0304u c0305a = new C0305a(bdVar.f1084a);
        C0304u c0305a2 = new C0305a(bdVar2.f1084a);
        for (int i : this.f1032F) {
            int a;
            View view;
            int size;
            int i2;
            View view2;
            bc bcVar2;
            bc bcVar3;
            switch (i) {
                case 1:
                    for (int size2 = c0305a.size() - 1; size2 >= 0; size2--) {
                        view = (View) c0305a.m1629b(size2);
                        if (view != null && m850a(view)) {
                            bcVar = (bc) c0305a2.remove(view);
                            if (!(bcVar == null || bcVar.f1082b == null || !m850a(bcVar.f1082b))) {
                                this.f1033G.add((bc) c0305a.m1631d(size2));
                                this.f1034H.add(bcVar);
                            }
                        }
                    }
                    break;
                case 2:
                    C0304u c0304u = bdVar.f1087d;
                    C0304u c0304u2 = bdVar2.f1087d;
                    size = c0304u.size();
                    for (i2 = 0; i2 < size; i2++) {
                        view = (View) c0304u.m1630c(i2);
                        if (view != null && m850a(view)) {
                            view2 = (View) c0304u2.get(c0304u.m1629b(i2));
                            if (view2 != null && m850a(view2)) {
                                bcVar2 = (bc) c0305a.get(view);
                                bcVar3 = (bc) c0305a2.get(view2);
                                if (!(bcVar2 == null || bcVar3 == null)) {
                                    this.f1033G.add(bcVar2);
                                    this.f1034H.add(bcVar3);
                                    c0305a.remove(view);
                                    c0305a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray sparseArray = bdVar.f1085b;
                    SparseArray sparseArray2 = bdVar2.f1085b;
                    size = sparseArray.size();
                    for (i2 = 0; i2 < size; i2++) {
                        view = (View) sparseArray.valueAt(i2);
                        if (view != null && m850a(view)) {
                            view2 = (View) sparseArray2.get(sparseArray.keyAt(i2));
                            if (view2 != null && m850a(view2)) {
                                bcVar2 = (bc) c0305a.get(view);
                                bcVar3 = (bc) c0305a2.get(view2);
                                if (!(bcVar2 == null || bcVar3 == null)) {
                                    this.f1033G.add(bcVar2);
                                    this.f1034H.add(bcVar3);
                                    c0305a.remove(view);
                                    c0305a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    C0313h c0313h = bdVar.f1086c;
                    C0313h c0313h2 = bdVar2.f1086c;
                    size = c0313h.m1681a();
                    for (i2 = 0; i2 < size; i2++) {
                        view = (View) c0313h.m1686b(i2);
                        if (view != null && m850a(view)) {
                            Object obj;
                            a = C0310e.m1673a(c0313h2.f1740c, c0313h2.f1742e, c0313h.m1683a(i2));
                            if (a < 0 || c0313h2.f1741d[a] == C0313h.f1738a) {
                                obj = null;
                            } else {
                                obj = c0313h2.f1741d[a];
                            }
                            view2 = (View) obj;
                            if (view2 != null && m850a(view2)) {
                                bcVar2 = (bc) c0305a.get(view);
                                bcVar3 = (bc) c0305a2.get(view2);
                                if (!(bcVar2 == null || bcVar3 == null)) {
                                    this.f1033G.add(bcVar2);
                                    this.f1034H.add(bcVar3);
                                    c0305a.remove(view);
                                    c0305a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        for (a = 0; a < c0305a.size(); a++) {
            bcVar = (bc) c0305a.m1630c(a);
            if (m850a(bcVar.f1082b)) {
                this.f1033G.add(bcVar);
                this.f1034H.add(null);
            }
        }
        for (a = 0; a < c0305a2.size(); a++) {
            bcVar = (bc) c0305a2.m1630c(a);
            if (m850a(bcVar.f1082b)) {
                this.f1034H.add(bcVar);
                this.f1033G.add(null);
            }
        }
    }

    protected void mo211a(ViewGroup viewGroup, bd bdVar, bd bdVar2, ArrayList arrayList, ArrayList arrayList2) {
        C0304u f = an.m835f();
        long j = Long.MAX_VALUE;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bc bcVar;
            int i2;
            bc bcVar2 = (bc) arrayList.get(i);
            bc bcVar3 = (bc) arrayList2.get(i);
            if (bcVar2 == null || bcVar2.f1083c.contains(this)) {
                bcVar = bcVar2;
            } else {
                bcVar = null;
            }
            if (!(bcVar3 == null || bcVar3.f1083c.contains(this))) {
                bcVar3 = null;
            }
            if (bcVar != null || bcVar3 != null) {
                Object obj = (bcVar == null || bcVar3 == null || mo244a(bcVar, bcVar3)) ? 1 : null;
                if (obj != null) {
                    Animator a = mo243a(viewGroup, bcVar, bcVar3);
                    if (a != null) {
                        bc bcVar4;
                        View view;
                        Object obj2;
                        bcVar2 = null;
                        Animator animator;
                        if (bcVar3 != null) {
                            View view2 = bcVar3.f1082b;
                            String[] a2 = mo245a();
                            if (!(view2 == null || a2 == null || a2.length <= 0)) {
                                bcVar = new bc();
                                bcVar.f1082b = view2;
                                bcVar2 = (bc) bdVar2.f1084a.get(view2);
                                if (bcVar2 != null) {
                                    for (i2 = 0; i2 < a2.length; i2++) {
                                        bcVar.f1081a.put(a2[i2], bcVar2.f1081a.get(a2[i2]));
                                    }
                                }
                                int size2 = f.size();
                                for (i2 = 0; i2 < size2; i2++) {
                                    ar arVar = (ar) f.get((Animator) f.m1629b(i2));
                                    if (arVar.f1063c != null && arVar.f1061a == view2 && arVar.f1062b.equals(this.f1045n) && arVar.f1063c.equals(bcVar)) {
                                        bcVar4 = bcVar;
                                        view = view2;
                                        obj2 = null;
                                        break;
                                    }
                                }
                                bcVar2 = bcVar;
                            }
                            bcVar4 = bcVar2;
                            view = view2;
                            animator = a;
                        } else {
                            view = bcVar.f1082b;
                            bcVar4 = null;
                            animator = a;
                        }
                        if (obj2 != null) {
                            if (this.f1042Q != null) {
                                long a3 = this.f1042Q.m882a();
                                sparseIntArray.put(this.f1041P.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            f.put(obj2, new ar(view, this.f1045n, this, bq.m945b(viewGroup), bcVar4));
                            this.f1041P.add(obj2);
                        }
                    }
                }
            }
        }
        if (j != 0) {
            for (i2 = 0; i2 < sparseIntArray.size(); i2++) {
                Animator animator2 = (Animator) this.f1041P.get(sparseIntArray.keyAt(i2));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i2)) - j) + animator2.getStartDelay());
            }
        }
    }

    final boolean m850a(View view) {
        int id = view.getId();
        if (this.f1053v != null && this.f1053v.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f1054w != null && this.f1054w.contains(view)) {
            return false;
        }
        int i;
        if (this.f1055x != null) {
            int size = this.f1055x.size();
            for (i = 0; i < size; i++) {
                if (((Class) this.f1055x.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f1056y != null && ai.f1848a.mo422u(view) != null && this.f1056y.contains(ai.f1848a.mo422u(view))) {
            return false;
        }
        if (this.f1049r.size() == 0 && this.f1050s.size() == 0 && ((this.f1052u == null || this.f1052u.isEmpty()) && (this.f1051t == null || this.f1051t.isEmpty()))) {
            return true;
        }
        if (this.f1049r.contains(Integer.valueOf(id)) || this.f1050s.contains(view)) {
            return true;
        }
        if (this.f1051t != null && this.f1051t.contains(ai.f1848a.mo422u(view))) {
            return true;
        }
        if (this.f1052u == null) {
            return false;
        }
        for (i = 0; i < this.f1052u.size(); i++) {
            if (((Class) this.f1052u.get(i)).isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    private static C0305a m835f() {
        C0305a c0305a = (C0305a) f1024I.get();
        if (c0305a != null) {
            return c0305a;
        }
        c0305a = new C0305a();
        f1024I.set(c0305a);
        return c0305a;
    }

    protected void mo216b() {
        m861c();
        C0304u f = an.m835f();
        ArrayList arrayList = this.f1041P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (f.containsKey(animator)) {
                m861c();
                if (animator != null) {
                    animator.addListener(new ap(this, f));
                    if (animator == null) {
                        m863d();
                    } else {
                        if (this.f1047p >= 0) {
                            animator.setDuration(this.f1047p);
                        }
                        if (this.f1046o >= 0) {
                            animator.setStartDelay(this.f1046o);
                        }
                        if (this.f1048q != null) {
                            animator.setInterpolator(this.f1048q);
                        }
                        animator.addListener(new aq(this));
                        animator.start();
                    }
                }
            }
        }
        this.f1041P.clear();
        m863d();
    }

    public an mo214b(View view) {
        this.f1050s.add(view);
        return this;
    }

    public an mo219c(View view) {
        this.f1050s.remove(view);
        return this;
    }

    public an mo207a(String str, boolean z) {
        ArrayList arrayList = this.f1056y;
        if (str != null) {
            if (z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            } else if (arrayList != null) {
                arrayList.remove(str);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
        }
        this.f1056y = arrayList;
        return this;
    }

    final void m847a(ViewGroup viewGroup, boolean z) {
        int i;
        View findViewById;
        int i2 = 0;
        m848a(z);
        if ((this.f1049r.size() > 0 || this.f1050s.size() > 0) && ((this.f1051t == null || this.f1051t.isEmpty()) && (this.f1052u == null || this.f1052u.isEmpty()))) {
            bc bcVar;
            for (i = 0; i < this.f1049r.size(); i++) {
                findViewById = viewGroup.findViewById(((Integer) this.f1049r.get(i)).intValue());
                if (findViewById != null) {
                    bcVar = new bc();
                    bcVar.f1082b = findViewById;
                    if (z) {
                        mo210a(bcVar);
                    } else {
                        mo217b(bcVar);
                    }
                    bcVar.f1083c.add(this);
                    mo220c(bcVar);
                    if (z) {
                        an.m832a(this.f1029C, findViewById, bcVar);
                    } else {
                        an.m832a(this.f1030D, findViewById, bcVar);
                    }
                }
            }
            for (i = 0; i < this.f1050s.size(); i++) {
                findViewById = (View) this.f1050s.get(i);
                bcVar = new bc();
                bcVar.f1082b = findViewById;
                if (z) {
                    mo210a(bcVar);
                } else {
                    mo217b(bcVar);
                }
                bcVar.f1083c.add(this);
                mo220c(bcVar);
                if (z) {
                    an.m832a(this.f1029C, findViewById, bcVar);
                } else {
                    an.m832a(this.f1030D, findViewById, bcVar);
                }
            }
        } else {
            m834c(viewGroup, z);
        }
        if (!z && this.f1043R != null) {
            int size = this.f1043R.size();
            ArrayList arrayList = new ArrayList(size);
            for (i = 0; i < size; i++) {
                arrayList.add(this.f1029C.f1087d.remove((String) this.f1043R.m1629b(i)));
            }
            while (i2 < size) {
                findViewById = (View) arrayList.get(i2);
                if (findViewById != null) {
                    this.f1029C.f1087d.put((String) this.f1043R.m1630c(i2), findViewById);
                }
                i2++;
            }
        }
    }

    private static void m832a(bd bdVar, View view, bc bcVar) {
        bdVar.f1084a.put(view, bcVar);
        int id = view.getId();
        if (id >= 0) {
            if (bdVar.f1085b.indexOfKey(id) >= 0) {
                bdVar.f1085b.put(id, null);
            } else {
                bdVar.f1085b.put(id, view);
            }
        }
        String u = ai.f1848a.mo422u(view);
        if (u != null) {
            if (bdVar.f1087d.containsKey(u)) {
                bdVar.f1087d.put(u, null);
            } else {
                bdVar.f1087d.put(u, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (bdVar.f1086c.m1690c(itemIdAtPosition) >= 0) {
                    Object obj;
                    C0313h c0313h = bdVar.f1086c;
                    int a = C0310e.m1673a(c0313h.f1740c, c0313h.f1742e, itemIdAtPosition);
                    if (a < 0 || c0313h.f1741d[a] == C0313h.f1738a) {
                        obj = null;
                    } else {
                        obj = c0313h.f1741d[a];
                    }
                    View view2 = (View) obj;
                    if (view2 != null) {
                        ai.m1833a(view2, false);
                        bdVar.f1086c.m1685a(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ai.m1833a(view, true);
                bdVar.f1086c.m1685a(itemIdAtPosition, view);
            }
        }
    }

    final void m848a(boolean z) {
        if (z) {
            this.f1029C.f1084a.clear();
            this.f1029C.f1085b.clear();
            this.f1029C.f1086c.m1687b();
            return;
        }
        this.f1030D.f1084a.clear();
        this.f1030D.f1085b.clear();
        this.f1030D.f1086c.m1687b();
    }

    private final void m834c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f1053v != null && this.f1053v.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f1054w == null || !this.f1054w.contains(view)) {
                int i;
                if (this.f1055x != null) {
                    int size = this.f1055x.size();
                    i = 0;
                    while (i < size) {
                        if (!((Class) this.f1055x.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    bc bcVar = new bc();
                    bcVar.f1082b = view;
                    if (z) {
                        mo210a(bcVar);
                    } else {
                        mo217b(bcVar);
                    }
                    bcVar.f1083c.add(this);
                    mo220c(bcVar);
                    if (z) {
                        an.m832a(this.f1029C, view, bcVar);
                    } else {
                        an.m832a(this.f1030D, view, bcVar);
                    }
                }
                if (!(view instanceof ViewGroup)) {
                    return;
                }
                if (this.f1057z != null && this.f1057z.contains(Integer.valueOf(id))) {
                    return;
                }
                if (this.f1027A == null || !this.f1027A.contains(view)) {
                    if (this.f1028B != null) {
                        id = this.f1028B.size();
                        i = 0;
                        while (i < id) {
                            if (!((Class) this.f1028B.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        m834c(viewGroup.getChildAt(i2), z);
                    }
                }
            }
        }
    }

    public final bc m841a(View view, boolean z) {
        while (this.f1031E != null) {
            this = this.f1031E;
        }
        return (bc) (z ? this.f1029C : this.f1030D).f1084a.get(view);
    }

    final bc m856b(View view, boolean z) {
        while (this.f1031E != null) {
            this = this.f1031E;
        }
        ArrayList arrayList = z ? this.f1033G : this.f1034H;
        if (arrayList == null) {
            return null;
        }
        bc bcVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bcVar = (bc) arrayList.get(i);
            if (bcVar == null) {
                return null;
            }
            if (bcVar.f1082b == view) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            bcVar = (bc) (z ? this.f1034H : this.f1033G).get(i);
        } else {
            bcVar = null;
        }
        return bcVar;
    }

    public void mo222d(View view) {
        if (!this.f1039N) {
            C0304u f = an.m835f();
            int size = f.size();
            cf b = bq.m945b(view);
            for (int i = size - 1; i >= 0; i--) {
                ar arVar = (ar) f.m1630c(i);
                if (arVar.f1061a != null && b.equals(arVar.f1064d)) {
                    C0175a.f1008a.mo225a((Animator) f.m1629b(i));
                }
            }
            if (this.f1040O != null && this.f1040O.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f1040O.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((at) arrayList.get(i2)).mo200a();
                }
            }
            this.f1038M = true;
        }
    }

    public void mo224e(View view) {
        if (this.f1038M) {
            if (!this.f1039N) {
                C0304u f = an.m835f();
                int size = f.size();
                cf b = bq.m945b(view);
                for (int i = size - 1; i >= 0; i--) {
                    ar arVar = (ar) f.m1630c(i);
                    if (arVar.f1061a != null && b.equals(arVar.f1064d)) {
                        C0175a.f1008a.mo227b((Animator) f.m1629b(i));
                    }
                }
                if (this.f1040O != null && this.f1040O.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f1040O.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((at) arrayList.get(i2)).mo202b();
                    }
                }
            }
            this.f1038M = false;
        }
    }

    final void m845a(ViewGroup viewGroup) {
        this.f1033G = new ArrayList();
        this.f1034H = new ArrayList();
        m831a(this.f1029C, this.f1030D);
        C0304u f = an.m835f();
        int size = f.size();
        cf b = bq.m945b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) f.m1629b(i);
            if (animator != null) {
                ar arVar = (ar) f.get(animator);
                if (!(arVar == null || arVar.f1061a == null || !b.equals(arVar.f1064d))) {
                    bc bcVar = arVar.f1063c;
                    View view = arVar.f1061a;
                    bc a = m841a(view, true);
                    bc b2 = m856b(view, true);
                    boolean z = !(a == null && b2 == null) && arVar.f1065e.mo244a(bcVar, b2);
                    if (z) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            f.remove(animator);
                        }
                    }
                }
            }
        }
        mo211a(viewGroup, this.f1029C, this.f1030D, this.f1033G, this.f1034H);
        mo216b();
    }

    public boolean mo244a(bc bcVar, bc bcVar2) {
        if (!(bcVar == null || bcVar2 == null)) {
            String[] a = mo245a();
            if (a != null) {
                for (String a2 : a) {
                    if (an.m833a(bcVar, bcVar2, a2)) {
                        return true;
                    }
                }
                return false;
            }
            for (String a3 : bcVar.f1081a.keySet()) {
                if (an.m833a(bcVar, bcVar2, a3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean m833a(bc bcVar, bc bcVar2, String str) {
        Object obj = bcVar.f1081a.get(str);
        Object obj2 = bcVar2.f1081a.get(str);
        if ((obj != null || obj2 != null) && (obj == null || obj2 == null || !obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    protected final void m861c() {
        if (this.f1037L == 0) {
            if (this.f1040O != null && this.f1040O.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f1040O.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((at) arrayList.get(i)).mo203c();
                }
            }
            this.f1039N = false;
        }
        this.f1037L++;
    }

    protected final void m863d() {
        this.f1037L--;
        if (this.f1037L == 0) {
            int i;
            View view;
            if (this.f1040O != null && this.f1040O.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f1040O.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((at) arrayList.get(i2)).mo201a(this);
                }
            }
            for (i = 0; i < this.f1029C.f1086c.m1681a(); i++) {
                view = (View) this.f1029C.f1086c.m1686b(i);
                if (view != null) {
                    ai.m1833a(view, false);
                }
            }
            for (i = 0; i < this.f1030D.f1086c.m1681a(); i++) {
                view = (View) this.f1030D.f1086c.m1686b(i);
                if (view != null) {
                    ai.m1833a(view, false);
                }
            }
            this.f1039N = true;
        }
    }

    public an mo206a(at atVar) {
        if (this.f1040O == null) {
            this.f1040O = new ArrayList();
        }
        this.f1040O.add(atVar);
        return this;
    }

    public an mo213b(at atVar) {
        if (this.f1040O != null) {
            this.f1040O.remove(atVar);
            if (this.f1040O.size() == 0) {
                this.f1040O = null;
            }
        }
        return this;
    }

    public void mo209a(as asVar) {
    }

    void mo220c(bc bcVar) {
        Object obj = null;
        if (this.f1042Q != null && !bcVar.f1081a.isEmpty()) {
            String[] c = this.f1042Q.m884c();
            if (c != null) {
                for (Object containsKey : c) {
                    if (!bcVar.f1081a.containsKey(containsKey)) {
                        break;
                    }
                }
                int i = 1;
                if (obj == null) {
                    this.f1042Q.m883b();
                }
            }
        }
    }

    public an mo215b(ViewGroup viewGroup) {
        return this;
    }

    public void mo218b(boolean z) {
        this.f1035J = z;
    }

    public String toString() {
        return mo208a("");
    }

    public an mo223e() {
        try {
            an anVar = (an) super.clone();
            anVar.f1041P = new ArrayList();
            anVar.f1029C = new bd();
            anVar.f1030D = new bd();
            anVar.f1033G = null;
            anVar.f1034H = null;
            return anVar;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    String mo208a(String str) {
        int i = 0;
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1047p != -1) {
            str2 = str2 + "dur(" + this.f1047p + ") ";
        }
        if (this.f1046o != -1) {
            str2 = str2 + "dly(" + this.f1046o + ") ";
        }
        if (this.f1048q != null) {
            str2 = str2 + "interp(" + this.f1048q + ") ";
        }
        if (this.f1049r.size() <= 0 && this.f1050s.size() <= 0) {
            return str2;
        }
        String str3;
        str2 = str2 + "tgts(";
        if (this.f1049r.size() > 0) {
            str3 = str2;
            for (int i2 = 0; i2 < this.f1049r.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1049r.get(i2);
            }
        } else {
            str3 = str2;
        }
        if (this.f1050s.size() > 0) {
            while (i < this.f1050s.size()) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1050s.get(i);
                i++;
            }
        }
        return str3 + ")";
    }

    public /* synthetic */ Object clone() {
        return mo223e();
    }
}
