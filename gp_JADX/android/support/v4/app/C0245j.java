package android.support.v4.app;

import android.support.v4.p037h.C0312g;
import android.support.v4.view.ai;
import android.util.Log;
import android.view.View;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class C0245j extends aw implements ac, aq {
    public final ae f1557a;
    public ArrayList f1558b = new ArrayList();
    public int f1559c;
    public int f1560d;
    public int f1561e;
    public int f1562f;
    public int f1563g;
    public int f1564h;
    public boolean f1565i;
    public boolean f1566j = true;
    public String f1567k;
    public boolean f1568l;
    public int f1569m = -1;
    public int f1570n;
    public CharSequence f1571o;
    public int f1572p;
    public CharSequence f1573q;
    public ArrayList f1574r;
    public ArrayList f1575s;
    public boolean f1576t = false;
    public ArrayList f1577u;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1569m >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f1569m);
        }
        if (this.f1567k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f1567k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m1470a(String str, PrintWriter printWriter) {
        m1471a(str, printWriter, true);
    }

    public final void m1471a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1567k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1569m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1568l);
            if (this.f1563g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1563g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1564h));
            }
            if (!(this.f1559c == 0 && this.f1560d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1559c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1560d));
            }
            if (!(this.f1561e == 0 && this.f1562f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1561e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1562f));
            }
            if (!(this.f1570n == 0 && this.f1571o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1570n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1571o);
            }
            if (!(this.f1572p == 0 && this.f1573q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1572p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1573q);
            }
        }
        if (!this.f1558b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            new StringBuilder().append(str).append("    ");
            int size = this.f1558b.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C0246k c0246k = (C0246k) this.f1558b.get(i);
                switch (c0246k.f1578a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + c0246k.f1578a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0246k.f1579b);
                if (z) {
                    if (!(c0246k.f1580c == 0 && c0246k.f1581d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0246k.f1580c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0246k.f1581d));
                    }
                    if (c0246k.f1582e != 0 || c0246k.f1583f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0246k.f1582e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0246k.f1583f));
                    }
                }
            }
        }
    }

    public C0245j(ae aeVar) {
        this.f1557a = aeVar;
    }

    final void m1468a(C0246k c0246k) {
        this.f1558b.add(c0246k);
        c0246k.f1580c = this.f1559c;
        c0246k.f1581d = this.f1560d;
        c0246k.f1582e = this.f1561e;
        c0246k.f1583f = this.f1562f;
    }

    public final aw mo328a(Fragment fragment, String str) {
        m1454a(0, fragment, str, 1);
        return this;
    }

    public final aw mo325a(int i, Fragment fragment) {
        m1454a(i, fragment, null, 1);
        return this;
    }

    public final aw mo326a(int i, Fragment fragment, String str) {
        m1454a(i, fragment, str, 1);
        return this;
    }

    private final void m1454a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.f730B = this.f1557a;
        if (str != null) {
            if (fragment.f737I == null || str.equals(fragment.f737I)) {
                fragment.f737I = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f737I + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            } else if (fragment.f735G == 0 || fragment.f735G == i) {
                fragment.f735G = i;
                fragment.f736H = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f735G + " now " + i);
            }
        }
        m1468a(new C0246k(i2, fragment));
    }

    public final aw mo331b(int i, Fragment fragment) {
        return mo332b(i, fragment, null);
    }

    public final aw mo332b(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m1454a(i, fragment, str, 2);
        return this;
    }

    public final aw mo327a(Fragment fragment) {
        m1468a(new C0246k(3, fragment));
        return this;
    }

    public final aw mo333b(Fragment fragment) {
        m1468a(new C0246k(4, fragment));
        return this;
    }

    public final aw mo335c(Fragment fragment) {
        m1468a(new C0246k(5, fragment));
        return this;
    }

    public final aw mo337d(Fragment fragment) {
        m1468a(new C0246k(6, fragment));
        return this;
    }

    public final aw mo338e(Fragment fragment) {
        m1468a(new C0246k(7, fragment));
        return this;
    }

    public final aw mo323a(int i, int i2) {
        return mo324a(i, i2, 0, 0);
    }

    public final aw mo324a(int i, int i2, int i3, int i4) {
        this.f1559c = i;
        this.f1560d = i2;
        this.f1561e = i3;
        this.f1562f = i4;
        return this;
    }

    public final aw mo322a() {
        this.f1563g = 4099;
        return this;
    }

    public final aw mo329a(View view, String str) {
        Object obj = (ax.f1357b == null && ax.f1358c == null) ? null : 1;
        if (obj != null) {
            String u = ai.f1848a.mo422u(view);
            if (u == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f1574r == null) {
                this.f1574r = new ArrayList();
                this.f1575s = new ArrayList();
            } else if (this.f1575s.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            } else if (this.f1574r.contains(u)) {
                throw new IllegalArgumentException("A shared element with the source name '" + u + " has already been added to the transaction.");
            }
            this.f1574r.add(u);
            this.f1575s.add(str);
        }
        return this;
    }

    public final aw mo330a(String str) {
        if (this.f1566j) {
            this.f1565i = true;
            this.f1567k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    final void m1467a(int i) {
        if (this.f1565i) {
            if (ae.f1296a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1558b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0246k c0246k = (C0246k) this.f1558b.get(i2);
                if (c0246k.f1579b != null) {
                    Fragment fragment = c0246k.f1579b;
                    fragment.f729A += i;
                    if (ae.f1296a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0246k.f1579b + " to " + c0246k.f1579b.f729A);
                    }
                }
            }
        }
    }

    public final void m1479b() {
        if (this.f1577u != null) {
            int size = this.f1577u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f1577u.get(i)).run();
            }
            this.f1577u = null;
        }
    }

    public final int mo334c() {
        return m1455b(false);
    }

    public final int mo336d() {
        return m1455b(true);
    }

    public final void mo339e() {
        if (this.f1565i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1566j = false;
        ae aeVar = this.f1557a;
        aeVar.m1238a(false);
        if (mo300a(aeVar.f1324x, aeVar.f1325y)) {
            aeVar.f1304c = true;
            try {
                aeVar.m1237a(aeVar.f1324x, aeVar.f1325y);
            } finally {
                aeVar.m1266l();
            }
        }
        aeVar.m1268n();
        aeVar.m1270p();
    }

    private final int m1455b(boolean z) {
        if (this.f1568l) {
            throw new IllegalStateException("commit already called");
        }
        if (ae.f1296a) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0312g("FragmentManager"));
            m1470a("  ", printWriter);
            printWriter.close();
        }
        this.f1568l = true;
        if (this.f1565i) {
            this.f1569m = this.f1557a.m1220a(this);
        } else {
            this.f1569m = -1;
        }
        this.f1557a.m1234a((aq) this, z);
        return this.f1569m;
    }

    public final boolean mo300a(ArrayList arrayList, ArrayList arrayList2) {
        if (ae.f1296a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f1565i) {
            ae aeVar = this.f1557a;
            if (aeVar.f1308g == null) {
                aeVar.f1308g = new ArrayList();
            }
            aeVar.f1308g.add(this);
        }
        return true;
    }

    final boolean m1480b(int i) {
        int size = this.f1558b.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3;
            C0246k c0246k = (C0246k) this.f1558b.get(i2);
            if (c0246k.f1579b != null) {
                i3 = c0246k.f1579b.f736H;
            } else {
                i3 = 0;
            }
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    final boolean m1473a(ArrayList arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1558b.size();
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            int i5;
            C0246k c0246k = (C0246k) this.f1558b.get(i4);
            int i6 = c0246k.f1579b != null ? c0246k.f1579b.f736H : 0;
            if (i6 == 0 || i6 == i3) {
                i5 = i3;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    C0245j c0245j = (C0245j) arrayList.get(i7);
                    int size2 = c0245j.f1558b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        C0246k c0246k2 = (C0246k) c0245j.f1558b.get(i8);
                        if (c0246k2.f1579b != null) {
                            i3 = c0246k2.f1579b.f736H;
                        } else {
                            i3 = 0;
                        }
                        if (i3 == i6) {
                            return true;
                        }
                    }
                }
                i5 = i6;
            }
            i4++;
            i3 = i5;
        }
        return false;
    }

    final void m1487f() {
        int size = this.f1558b.size();
        for (int i = 0; i < size; i++) {
            C0246k c0246k = (C0246k) this.f1558b.get(i);
            Fragment fragment = c0246k.f1579b;
            if (fragment != null) {
                fragment.m574a(this.f1563g, this.f1564h);
            }
            switch (c0246k.f1578a) {
                case 1:
                    fragment.m595d(c0246k.f1580c);
                    this.f1557a.m1231a(fragment, false);
                    break;
                case 3:
                    fragment.m595d(c0246k.f1581d);
                    this.f1557a.m1253c(fragment);
                    break;
                case 4:
                    fragment.m595d(c0246k.f1581d);
                    ae.m1208d(fragment);
                    break;
                case 5:
                    fragment.m595d(c0246k.f1580c);
                    ae.m1211e(fragment);
                    break;
                case 6:
                    fragment.m595d(c0246k.f1581d);
                    this.f1557a.m1258f(fragment);
                    break;
                case 7:
                    fragment.m595d(c0246k.f1580c);
                    this.f1557a.m1260g(fragment);
                    break;
                case 8:
                    this.f1557a.m1261h(fragment);
                    break;
                case 9:
                    this.f1557a.m1261h(null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0246k.f1578a);
            }
            if (!(this.f1576t || c0246k.f1578a == 1 || fragment == null)) {
                this.f1557a.m1229a(fragment);
            }
        }
        if (!this.f1576t) {
            this.f1557a.m1225a(this.f1557a.f1314m, true);
        }
    }

    final void m1472a(boolean z) {
        for (int size = this.f1558b.size() - 1; size >= 0; size--) {
            C0246k c0246k = (C0246k) this.f1558b.get(size);
            Fragment fragment = c0246k.f1579b;
            if (fragment != null) {
                fragment.m574a(ae.m1207d(this.f1563g), this.f1564h);
            }
            switch (c0246k.f1578a) {
                case 1:
                    fragment.m595d(c0246k.f1583f);
                    this.f1557a.m1253c(fragment);
                    break;
                case 3:
                    fragment.m595d(c0246k.f1582e);
                    this.f1557a.m1231a(fragment, false);
                    break;
                case 4:
                    fragment.m595d(c0246k.f1582e);
                    ae.m1211e(fragment);
                    break;
                case 5:
                    fragment.m595d(c0246k.f1583f);
                    ae.m1208d(fragment);
                    break;
                case 6:
                    fragment.m595d(c0246k.f1582e);
                    this.f1557a.m1260g(fragment);
                    break;
                case 7:
                    fragment.m595d(c0246k.f1583f);
                    this.f1557a.m1258f(fragment);
                    break;
                case 8:
                    this.f1557a.m1261h(null);
                    break;
                case 9:
                    this.f1557a.m1261h(fragment);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0246k.f1578a);
            }
            if (!(this.f1576t || c0246k.f1578a == 3 || fragment == null)) {
                this.f1557a.m1229a(fragment);
            }
        }
        if (!this.f1576t && z) {
            this.f1557a.m1225a(this.f1557a.f1314m, true);
        }
    }

    final Fragment m1457a(ArrayList arrayList, Fragment fragment) {
        int i = 0;
        while (i < this.f1558b.size()) {
            C0246k c0246k = (C0246k) this.f1558b.get(i);
            switch (c0246k.f1578a) {
                case 1:
                case 7:
                    arrayList.add(c0246k.f1579b);
                    break;
                case 2:
                    Fragment fragment2 = c0246k.f1579b;
                    int i2 = fragment2.f736H;
                    Object obj = null;
                    int size = arrayList.size() - 1;
                    Fragment fragment3 = fragment;
                    int i3 = i;
                    while (size >= 0) {
                        Object obj2;
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.f736H != i2) {
                            obj2 = obj;
                        } else if (fragment4 == fragment2) {
                            obj2 = 1;
                        } else {
                            if (fragment4 == fragment3) {
                                this.f1558b.add(i3, new C0246k(9, fragment4));
                                i3++;
                                fragment3 = null;
                            }
                            C0246k c0246k2 = new C0246k(3, fragment4);
                            c0246k2.f1580c = c0246k.f1580c;
                            c0246k2.f1582e = c0246k.f1582e;
                            c0246k2.f1581d = c0246k.f1581d;
                            c0246k2.f1583f = c0246k.f1583f;
                            this.f1558b.add(i3, c0246k2);
                            arrayList.remove(fragment4);
                            i3++;
                            obj2 = obj;
                        }
                        size--;
                        obj = obj2;
                    }
                    if (obj == null) {
                        c0246k.f1578a = 1;
                        arrayList.add(fragment2);
                        i = i3;
                        fragment = fragment3;
                        break;
                    }
                    this.f1558b.remove(i3);
                    i = i3 - 1;
                    fragment = fragment3;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0246k.f1579b);
                    if (c0246k.f1579b != fragment) {
                        break;
                    }
                    this.f1558b.add(i, new C0246k(9, c0246k.f1579b));
                    i++;
                    fragment = null;
                    break;
                case 8:
                    this.f1558b.add(i, new C0246k(9, fragment));
                    i++;
                    fragment = c0246k.f1579b;
                    break;
                default:
                    break;
            }
            i++;
        }
        return fragment;
    }

    final Fragment m1475b(ArrayList arrayList, Fragment fragment) {
        for (int i = 0; i < this.f1558b.size(); i++) {
            C0246k c0246k = (C0246k) this.f1558b.get(i);
            switch (c0246k.f1578a) {
                case 1:
                case 7:
                    arrayList.remove(c0246k.f1579b);
                    break;
                case 3:
                case 6:
                    arrayList.add(c0246k.f1579b);
                    break;
                case 8:
                    fragment = null;
                    break;
                case 9:
                    fragment = c0246k.f1579b;
                    break;
                default:
                    break;
            }
        }
        return fragment;
    }

    final void m1469a(C0236t c0236t) {
        for (int i = 0; i < this.f1558b.size(); i++) {
            C0246k c0246k = (C0246k) this.f1558b.get(i);
            if (C0245j.m1456b(c0246k)) {
                c0246k.f1579b.m583a(c0236t);
            }
        }
    }

    static boolean m1456b(C0246k c0246k) {
        Fragment fragment = c0246k.f1579b;
        return (fragment == null || !fragment.f764u || fragment.f746R == null || fragment.f739K || fragment.f738J || !fragment.m569U()) ? false : true;
    }

    public final String mo340g() {
        return this.f1567k;
    }
}
