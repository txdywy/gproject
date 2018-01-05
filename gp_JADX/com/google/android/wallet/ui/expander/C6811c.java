package com.google.android.wallet.ui.expander;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.e.am;
import android.support.e.av;
import android.support.e.az;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.wallet.common.C6565a;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.ui.common.C6528w;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormSpinner;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.bo;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class C6811c implements OnEditorActionListener, bo, C6528w, Runnable {
    public C6811c f33765a;
    public final ArrayList f33766b = new ArrayList();
    public boolean f33767c = false;
    public boolean f33768d;
    public boolean f33769e;
    public boolean f33770f;
    public boolean f33771g = true;
    public boolean f33772h = true;
    public av f33773i;
    public int f33774j = 0;
    public az f33775k;
    public am f33776l;
    public Activity f33777m;
    public C6565a f33778n;
    public C6811c f33779o;
    public long[] f33780p;
    public boolean f33781q = false;
    public boolean f33782r = false;
    public C6809b f33783s;
    public HashSet f33784t = new HashSet();
    public final List f33785u = new ArrayList();
    public int f33786v = 0;
    public C6811c f33787w = this;
    public FormEditText f33788x;
    public C6814g f33789y;
    public C6810f f33790z;

    public final Parcelable m31004a() {
        Parcelable bundle = new Bundle();
        bundle.putBoolean("keyIsExpanded", this.f33767c);
        bundle.putBoolean("keyIsAlwaysExpanded", this.f33770f);
        return bundle;
    }

    public final void m31008a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            m30984f(bundle.getBoolean("keyIsExpanded", false));
            m31014a(bundle.getBoolean("keyIsAlwaysExpanded", false));
        }
    }

    public final void m31007a(Activity activity, C6565a c6565a) {
        this.f33777m = activity;
        this.f33778n = c6565a;
        if (this.f33777m != null) {
            this.f33773i = new av();
            View findViewById = this.f33777m.findViewById(16908290);
            if (findViewById instanceof ViewGroup) {
                this.f33776l = new am((ViewGroup) findViewById);
                this.f33776l.e = this;
            }
            this.f33775k = ci.m30844a();
            this.f33775k.a(new C6813e(this));
            if (this.f33776l != null) {
                av avVar = this.f33773i;
                avVar.b.put(this.f33776l, this.f33775k);
            }
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m31007a(activity, c6565a);
        }
    }

    public final void m31015b() {
        this.f33785u.clear();
    }

    public final void m31010a(C6749z c6749z) {
        this.f33785u.add(c6749z);
    }

    public final void m31018c() {
        int size = this.f33785u.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) this.f33785u.get(i)).f33285e;
            if (obj instanceof au) {
                ((au) obj).aF = this;
            }
        }
        if (C6749z.m30565g(this.f33785u)) {
            m30983f();
        }
    }

    public final void m31011a(C6811c c6811c) {
        this.f33766b.add(c6811c);
        c6811c.m31016b(this);
        c6811c.m31007a(this.f33777m, this.f33778n);
        if (c6811c.m30985g()) {
            m30987h();
        }
        if (c6811c.f33769e) {
            m30990j();
        }
    }

    public final void m31013a(C6521h c6521h) {
        m31011a(c6521h.getExpandable());
    }

    public final void m31005a(int i) {
        switch (i) {
            case 0:
                this.f33786v = 0;
                return;
            case 1:
                this.f33786v = 4;
                return;
            case 2:
                if (this.f33765a == null) {
                    this.f33786v = 2;
                    return;
                } else {
                    this.f33786v = 3;
                    return;
                }
            case 3:
                this.f33786v = 8;
                return;
            case 4:
                this.f33786v = 6;
                return;
            case 5:
                this.f33786v = 5;
                return;
            default:
                throw new IllegalArgumentException("Unknown pending event: " + i);
        }
    }

    public final void m31014a(boolean z) {
        if (this.f33770f != z) {
            this.f33770f = z;
            if (z) {
                m30987h();
            }
        }
    }

    public final void m31020d() {
        if (this.f33783s != null) {
            this.f33783s.mo5670f();
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m31020d();
        }
        this.f33768d = false;
        this.f33769e = false;
    }

    public final void m31017b(boolean z) {
        if (this.f33781q) {
            m31005a(1);
        } else if (this.f33787w.f33782r) {
            m31012a(null, z, 4);
        } else {
            this.f33767c = true;
        }
    }

    public final void m31019c(boolean z) {
        if (this.f33781q) {
            m31005a(2);
        } else if (!this.f33787w.f33782r) {
            if (!this.f33770f) {
                this.f33767c = false;
            }
            int size = this.f33766b.size();
            for (int i = 0; i < size; i++) {
                ((C6811c) this.f33766b.get(i)).m31019c(false);
            }
        } else if (this.f33765a == null) {
            m31012a(null, z, 2);
        } else {
            this.f33765a.m31012a(this, z, 3);
        }
    }

    private final void m30983f() {
        if (this.f33790z != null) {
            this.f33790z.mo5672h();
        }
        FormEditText f = C6749z.m30564f(this.f33785u);
        if (this.f33788x != null) {
            this.f33788x.setOnEditorActionListener(null);
            this.f33788x.mo5585b((bo) this);
        }
        if (this.f33766b.isEmpty()) {
            this.f33788x = f;
            if (f != null) {
                f.setOnEditorActionListener(this);
                if ((f.f33217B != null) && f.f33217B != null) {
                    f.f33217B.m30735a(this, true);
                    return;
                }
                return;
            }
            return;
        }
        this.f33788x = null;
    }

    public final void mo5469a(int i, Bundle bundle) {
        if ((i == 4 || i == 12) && C6749z.m30565g(this.f33785u)) {
            m30983f();
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        m31019c(true);
        return true;
    }

    public final void mo5563a(View view) {
        m31019c(true);
    }

    public final void run() {
        boolean z = this.f33769e;
        this.f33787w.m30991k();
        if (this.f33771g && z) {
            m30992l();
        }
    }

    private final boolean m30976a(long[] jArr) {
        return m30981e(jArr) != null;
    }

    private final boolean m30985g() {
        boolean z = this.f33770f;
        int size = this.f33766b.size();
        boolean z2 = z;
        for (int i = 0; i < size && !z2; i++) {
            z2 |= ((C6811c) this.f33766b.get(i)).m30985g();
        }
        return z2;
    }

    private final void m30987h() {
        for (C6811c c6811c = this; c6811c != null; c6811c = c6811c.f33765a) {
            c6811c.m30984f(true);
        }
        this.f33787w.m30991k();
    }

    private final boolean m30977b(long[] jArr) {
        if (!this.f33767c) {
            return true;
        }
        boolean a = C6749z.m30559a(this.f33785u, jArr, true);
        int size = this.f33766b.size();
        int i = 0;
        while (i < size) {
            boolean z;
            if (((C6811c) this.f33766b.get(i)).m30977b(jArr) && a) {
                z = true;
            } else {
                z = false;
            }
            i++;
            a = z;
        }
        return a;
    }

    public final void m31016b(C6811c c6811c) {
        this.f33765a = c6811c;
        m30989i();
    }

    private final void m30989i() {
        if (this.f33765a == null) {
            this.f33787w = this;
        } else {
            this.f33787w = this.f33765a.f33787w;
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m30989i();
        }
    }

    private final void m30982e(boolean z) {
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m30982e(z);
        }
        this.f33781q = z;
    }

    private final void m30984f(boolean z) {
        if (this.f33767c != z) {
            this.f33767c = z;
            if (this.f33783s != null && !this.f33768d) {
                this.f33768d = true;
                m30990j();
            }
        }
    }

    private final void m30990j() {
        this.f33769e = true;
        C6811c c6811c = this.f33765a;
        while (c6811c != null && !c6811c.f33769e) {
            c6811c.f33769e = true;
            c6811c = c6811c.f33765a;
        }
    }

    private final void m30991k() {
        if (this.f33768d && this.f33783s != null) {
            this.f33783s.mo5670f();
        }
        this.f33768d = false;
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            C6811c c6811c = (C6811c) this.f33766b.get(i);
            if (c6811c.f33769e) {
                c6811c.m30991k();
            }
        }
        this.f33769e = false;
    }

    private static void m30978c(C6811c c6811c) {
        c6811c.f33786v = 0;
        int size = c6811c.f33766b.size();
        for (int i = 0; i < size; i++) {
            C6811c.m30978c((C6811c) c6811c.f33766b.get(i));
        }
    }

    private final boolean m30986g(boolean z) {
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            if (((C6811c) this.f33766b.get(i)).m30986g(z)) {
                return true;
            }
        }
        if (this.f33786v == 0) {
            return false;
        }
        int i2 = this.f33786v;
        C6811c.m30978c(this.f33787w);
        if (z) {
            this.f33777m.getWindow().getDecorView().postDelayed(new C6812d(this, i2), 50);
        } else {
            m31012a(null, false, i2);
        }
        return true;
    }

    final void m31012a(C6811c c6811c, boolean z, int i) {
        C6811c c6811c2 = this;
        while (true) {
            boolean z2;
            c6811c2.f33779o = c6811c;
            c6811c2.f33780p = null;
            if (c6811c2.f33765a == null) {
                z2 = true;
            } else {
                switch (i) {
                    case 0:
                        z2 = true;
                        break;
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z2 = false;
                        break;
                    case 2:
                    case 8:
                        z2 = c6811c2.m30976a(null);
                        break;
                    case 3:
                        if (c6811c2.m30998r() == null) {
                            z2 = false;
                            break;
                        } else {
                            z2 = true;
                            break;
                        }
                    default:
                        throw new IllegalArgumentException("Unknown animation state: " + i);
                }
            }
            if (z2) {
                c6811c2.f33787w.m30982e(true);
                c6811c2.f33774j = i;
                c6811c2.m30999s();
                c6811c2.m30988h(z);
                return;
            }
            c6811c = c6811c2;
            c6811c2 = c6811c2.f33765a;
        }
    }

    private final void m30988h(boolean z) {
        switch (this.f33774j) {
            case 0:
                break;
            case 1:
            case 7:
                m30996p();
                break;
            case 2:
                m30994n();
                break;
            case 3:
                if (this.f33779o != null) {
                    this.f33779o.m30994n();
                }
                if (!C6600l.m29963b(this.f33777m)) {
                    boolean z2;
                    C6811c r = m30998r();
                    if (r != null) {
                        m30984f(true);
                        this.f33779o = r;
                        r.m30980d(null);
                    }
                    if (r != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        m30997q();
                        break;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
                m30993m();
                if (!C6600l.m29963b(this.f33777m)) {
                    m30996p();
                    break;
                }
                break;
            case 8:
                m30980d(null);
                break;
            default:
                throw new IllegalArgumentException("Unknown animation state: " + this.f33774j);
        }
        if (!z || (this.f33778n != null && this.f33778n.m29797a(1))) {
            run();
            m31022e();
            m31021d(false);
        } else if (this.f33787w.f33769e) {
            this.f33773i.a(this.f33776l);
        } else {
            m31022e();
            m31021d(true);
        }
    }

    private final boolean m30992l() {
        if (this.f33779o != null && this.f33779o.m30992l()) {
            return true;
        }
        if (this.f33783s != null) {
            this.f33783s.mo5671g();
            return true;
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            if (((C6811c) this.f33766b.get(i)).m30992l()) {
                return true;
            }
        }
        return false;
    }

    private final void m30993m() {
        if (this.f33779o != null) {
            this.f33779o.m30993m();
            int size = this.f33766b.size();
            for (int i = 0; i < size; i++) {
                C6811c c6811c = (C6811c) this.f33766b.get(i);
                if (c6811c != this.f33779o) {
                    c6811c.m30994n();
                }
            }
        }
    }

    private final boolean m30994n() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33766b.size(); i2++) {
            i &= ((C6811c) this.f33766b.get(i2)).m30994n();
        }
        if (!(!this.f33767c || i == 0 || this.f33770f)) {
            if (m30977b(null)) {
                m30984f(false);
            } else {
                m30995o();
            }
        }
        if (this.f33767c) {
            return false;
        }
        return true;
    }

    private final void m30995o() {
        this.f33779o = m30975a(0, null);
        if (this.f33779o != null) {
            this.f33779o.m30996p();
        }
    }

    private final void m30996p() {
        if (this.f33779o != null) {
            this.f33779o.m30996p();
        } else {
            m30995o();
        }
        m30984f(true);
    }

    private final boolean m30979c(long[] jArr) {
        int size = this.f33766b.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            if (((C6811c) this.f33766b.get(i)).m30979c(jArr) || r4) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
            z = z2;
        }
        if (!C6749z.m30558a(this.f33785u, jArr) && !r4) {
            return false;
        }
        m30984f(true);
        m30995o();
        return true;
    }

    private final boolean m30980d(long[] jArr) {
        C6811c e = m30981e(jArr);
        if (e != null) {
            m30984f(true);
            if (e != this) {
                this.f33779o = e;
                e.m30980d(jArr);
            } else {
                m30995o();
            }
        }
        if (e != null) {
            return true;
        }
        return false;
    }

    final void m31021d(boolean z) {
        m31000t();
        if (this.f33774j != 0) {
            m30988h(z);
        } else if (!this.f33787w.m30986g(z)) {
            this.f33787w.m30982e(false);
            m31001u();
        }
    }

    final void m31022e() {
        int i = 0;
        switch (this.f33774j) {
            case 0:
            case 2:
            case 5:
                break;
            case 1:
                m31002v();
                break;
            case 3:
                if (C6600l.m29963b(this.f33777m)) {
                    this.f33779o = m30998r();
                    if (this.f33779o == null) {
                        m30997q();
                    } else {
                        i = 8;
                    }
                } else {
                    if (this.f33779o == null) {
                        m30997q();
                    }
                    m31003w();
                }
                this.f33774j = i;
                return;
            case 4:
                if (C6600l.m29963b(this.f33777m) || !this.f33767c) {
                    i = 1;
                } else {
                    m31002v();
                }
                this.f33774j = i;
                return;
            case 6:
                if (C6600l.m29963b(this.f33777m)) {
                    i = 7;
                } else {
                    m30979c(this.f33780p);
                    this.f33787w.m30991k();
                    m31003w();
                }
                this.f33774j = i;
                return;
            case 7:
                m30979c(this.f33780p);
                this.f33787w.m30991k();
                m31003w();
                this.f33774j = 0;
                return;
            case 8:
                m31003w();
                this.f33774j = 0;
                return;
            default:
                throw new IllegalStateException("Unknown transition state: " + this.f33774j);
        }
        this.f33774j = 0;
    }

    private final void m30997q() {
        if (this.f33789y != null) {
            this.f33789y.m31027a();
        }
    }

    private final C6811c m30975a(int i, long[] jArr) {
        int i2;
        for (i2 = i; i2 < this.f33766b.size(); i2++) {
            if (((C6811c) this.f33766b.get(i2)).m30976a(jArr)) {
                return (C6811c) this.f33766b.get(i2);
            }
        }
        if (this.f33765a == null) {
            for (i2 = 0; i2 < i; i2++) {
                if (((C6811c) this.f33766b.get(i2)).m30976a(jArr)) {
                    return (C6811c) this.f33766b.get(i2);
                }
            }
        }
        return null;
    }

    private final C6811c m30981e(long[] jArr) {
        return (!C6749z.m30559a(this.f33785u, jArr, false) || C6749z.m30558a(this.f33785u, jArr)) ? this : m30975a(0, jArr);
    }

    private final C6811c m30998r() {
        return m30975a(this.f33766b.indexOf(this.f33779o) + 1, null);
    }

    private final void m30999s() {
        Iterator it = this.f33784t.iterator();
        while (it.hasNext()) {
            ((C6808a) it.next()).mo5667c();
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m30999s();
        }
    }

    private final void m31000t() {
        Iterator it = this.f33784t.iterator();
        while (it.hasNext()) {
            ((C6808a) it.next()).mo5669e();
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m31000t();
        }
    }

    private final void m31001u() {
        this.f33779o = null;
        this.f33780p = null;
        Iterator it = this.f33784t.iterator();
        while (it.hasNext()) {
            ((C6808a) it.next()).mo5668d();
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            ((C6811c) this.f33766b.get(i)).m31001u();
        }
    }

    private final boolean m31002v() {
        if (!this.f33787w.f33772h) {
            return true;
        }
        if (this.f33779o != null && this.f33779o.m31002v()) {
            return true;
        }
        int size = this.f33766b.size();
        for (int i = 0; i < size; i++) {
            C6811c c6811c = (C6811c) this.f33766b.get(i);
            if (c6811c.f33767c && c6811c.m31002v()) {
                return true;
            }
        }
        if (!C6749z.m30561c(this.f33785u) && !C6749z.m30557a(this.f33785u)) {
            return false;
        }
        List list = this.f33785u;
        while (list.size() == 1) {
            Object obj = ((C6749z) list.get(0)).f33285e;
            if (obj instanceof au) {
                list = ((au) obj).aa();
            } else {
                if (obj instanceof View) {
                    View c = cp.m30912c((View) obj);
                    if (c instanceof FormSpinner) {
                        c.performClick();
                    } else if (c instanceof RegionCodeView) {
                        RegionCodeView regionCodeView = (RegionCodeView) c;
                        if (!regionCodeView.f33451g) {
                            regionCodeView.f33449e.performClick();
                        }
                    }
                }
                return true;
            }
        }
        return true;
    }

    private final void m31003w() {
        while (this.f33787w.f33772h) {
            if (this.f33779o != null) {
                this = this.f33779o;
            } else {
                C6749z.m30561c(this.f33785u);
                return;
            }
        }
    }
}
