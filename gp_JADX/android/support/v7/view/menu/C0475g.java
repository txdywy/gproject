package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0397d;
import android.support.v7.p040a.C0400g;
import android.support.v7.widget.C0491do;
import android.support.v7.widget.dy;
import android.support.v7.widget.dz;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class C0475g extends ac implements af, OnKeyListener, OnDismissListener {
    public final Context f2760a;
    public final int f2761b;
    public final int f2762c;
    public final int f2763d;
    public final boolean f2764e;
    public final Handler f2765f;
    public final List f2766g = new LinkedList();
    public final List f2767h = new ArrayList();
    public final OnGlobalLayoutListener f2768i = new C0476h(this);
    public final OnAttachStateChangeListener f2769j = new C0477i(this);
    public final dy f2770k = new C0478j(this);
    public int f2771l = 0;
    public int f2772m = 0;
    public View f2773n;
    public View f2774o;
    public int f2775p;
    public boolean f2776q;
    public boolean f2777r;
    public int f2778s;
    public int f2779t;
    public boolean f2780u;
    public boolean f2781v;
    public ag f2782w;
    public ViewTreeObserver f2783x;
    public OnDismissListener f2784y;
    public boolean f2785z;

    public C0475g(Context context, View view, int i, int i2, boolean z) {
        this.f2760a = context;
        this.f2773n = view;
        this.f2762c = i;
        this.f2763d = i2;
        this.f2764e = z;
        this.f2780u = false;
        this.f2775p = m2871g();
        Resources resources = context.getResources();
        this.f2761b = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0397d.abc_config_prefDialogWidth));
        this.f2765f = new Handler();
    }

    public final void mo673b(boolean z) {
        this.f2780u = z;
    }

    public final void mo671b() {
        if (!mo677d()) {
            for (C0471p c : this.f2766g) {
                m2870c(c);
            }
            this.f2766g.clear();
            this.f2774o = this.f2773n;
            if (this.f2774o != null) {
                Object obj = this.f2783x == null ? 1 : null;
                this.f2783x = this.f2774o.getViewTreeObserver();
                if (obj != null) {
                    this.f2783x.addOnGlobalLayoutListener(this.f2768i);
                }
                this.f2774o.addOnAttachStateChangeListener(this.f2769j);
            }
        }
    }

    public final void mo674c() {
        int size = this.f2767h.size();
        if (size > 0) {
            C0480l[] c0480lArr = (C0480l[]) this.f2767h.toArray(new C0480l[size]);
            for (size--; size >= 0; size--) {
                C0480l c0480l = c0480lArr[size];
                if (c0480l.f2793a.f3153K.isShowing()) {
                    c0480l.f2793a.mo674c();
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo674c();
        return true;
    }

    private final int m2871g() {
        if (ai.f1848a.mo400k(this.f2773n) == 1) {
            return 0;
        }
        return 1;
    }

    public final void mo664a(C0471p c0471p) {
        c0471p.m2822a((af) this, this.f2760a);
        if (mo677d()) {
            m2870c(c0471p);
        } else {
            this.f2766g.add(c0471p);
        }
    }

    private final void m2870c(C0471p c0471p) {
        int i;
        int i2;
        View view;
        C0480l c0480l;
        LayoutInflater from = LayoutInflater.from(this.f2760a);
        ListAdapter c0483o = new C0483o(c0471p, from, this.f2764e);
        if (!mo677d() && this.f2780u) {
            c0483o.f2810d = true;
        } else if (mo677d()) {
            c0483o.f2810d = ac.m2773b(c0471p);
        }
        int a = ac.m2771a(c0483o, null, this.f2760a, this.f2761b);
        C0491do dzVar = new dz(this.f2760a, this.f2762c, this.f2763d);
        dzVar.f3418c = this.f2770k;
        dzVar.f3143A = this;
        dzVar.m3211a((OnDismissListener) this);
        dzVar.f3172y = this.f2773n;
        dzVar.f3165r = this.f2772m;
        dzVar.m3217f();
        dzVar.m3219h();
        dzVar.mo753a(c0483o);
        dzVar.m3213b(a);
        dzVar.f3165r = this.f2772m;
        if (this.f2767h.size() > 0) {
            MenuItem menuItem;
            View view2;
            C0480l c0480l2 = (C0480l) this.f2767h.get(this.f2767h.size() - 1);
            C0471p c0471p2 = c0480l2.f2794b;
            int size = c0471p2.size();
            for (i = 0; i < size; i++) {
                MenuItem item = c0471p2.getItem(i);
                if (item.hasSubMenu() && c0471p == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view2 = null;
            } else {
                int headersCount;
                C0483o c0483o2;
                ListView listView = c0480l2.f2793a.f3156i;
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0483o2 = (C0483o) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0483o2 = (C0483o) adapter;
                }
                int count = c0483o2.getCount();
                for (size = 0; size < count; size++) {
                    if (menuItem == ((C0485t) c0483o2.getItem(size))) {
                        i2 = size;
                        break;
                    }
                }
                i2 = -1;
                if (i2 == -1) {
                    view2 = null;
                } else {
                    i2 = (i2 + headersCount) - listView.getFirstVisiblePosition();
                    if (i2 < 0 || i2 >= listView.getChildCount()) {
                        view2 = null;
                    } else {
                        view2 = listView.getChildAt(i2);
                    }
                }
            }
            view = view2;
            c0480l = c0480l2;
        } else {
            view = null;
            c0480l = null;
        }
        if (view != null) {
            int i3;
            if (dz.f3417a != null) {
                try {
                    dz.f3417a.invoke(dzVar.K, new Object[]{Boolean.valueOf(false)});
                } catch (Exception e) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
            if (VERSION.SDK_INT >= 23) {
                dzVar.K.setEnterTransition(null);
            }
            ListView listView2 = ((C0480l) this.f2767h.get(this.f2767h.size() - 1)).f2793a.f3156i;
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f2774o.getWindowVisibleDisplayFrame(rect);
            if (this.f2775p == 1) {
                if ((listView2.getWidth() + iArr[0]) + a <= rect.right) {
                    i2 = 1;
                }
                i2 = 0;
            } else {
                if (iArr[0] - a < 0) {
                    i2 = 1;
                }
                i2 = 0;
            }
            Object obj = i2 == 1 ? 1 : null;
            this.f2775p = i2;
            if (VERSION.SDK_INT >= 26) {
                dzVar.f3172y = view;
                i = 0;
                i2 = 0;
            } else {
                iArr = new int[2];
                this.f2773n.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2772m & 5) == 5) {
                if (obj != null) {
                    i3 = i + a;
                } else {
                    i3 = i - view.getWidth();
                }
            } else if (obj != null) {
                i3 = view.getWidth() + i;
            } else {
                i3 = i - a;
            }
            dzVar.f3159l = i3;
            dzVar.f3164q = true;
            dzVar.f3163p = true;
            dzVar.m3208a(i2);
        } else {
            if (this.f2776q) {
                dzVar.f3159l = this.f2778s;
            }
            if (this.f2777r) {
                dzVar.m3208a(this.f2779t);
            }
            dzVar.f3151I = this.f2678A;
        }
        this.f2767h.add(new C0480l(dzVar, c0471p, this.f2775p));
        dzVar.mo671b();
        ViewGroup viewGroup = dzVar.f3156i;
        viewGroup.setOnKeyListener(this);
        if (c0480l == null && this.f2781v && c0471p.f2728o != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0400g.abc_popup_menu_header_item_layout, viewGroup, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c0471p.f2728o);
            viewGroup.addHeaderView(frameLayout, null, false);
            dzVar.mo671b();
        }
    }

    public final boolean mo677d() {
        return this.f2767h.size() > 0 && ((C0480l) this.f2767h.get(0)).f2793a.f3153K.isShowing();
    }

    public final void onDismiss() {
        C0480l c0480l;
        int size = this.f2767h.size();
        for (int i = 0; i < size; i++) {
            c0480l = (C0480l) this.f2767h.get(i);
            if (!c0480l.f2793a.f3153K.isShowing()) {
                break;
            }
        }
        c0480l = null;
        if (c0480l != null) {
            c0480l.f2794b.m2824a(false);
        }
    }

    public final void mo668a(boolean z) {
        for (C0480l c0480l : this.f2767h) {
            ac.m2772a(c0480l.f2793a.f3156i.getAdapter()).notifyDataSetChanged();
        }
    }

    public final void mo663a(ag agVar) {
        this.f2782w = agVar;
    }

    public final boolean mo670a(ap apVar) {
        for (C0480l c0480l : this.f2767h) {
            if (apVar == c0480l.f2794b) {
                c0480l.f2793a.f3156i.requestFocus();
                return true;
            }
        }
        if (!apVar.hasVisibleItems()) {
            return false;
        }
        mo664a((C0471p) apVar);
        if (this.f2782w != null) {
            this.f2782w.mo554a(apVar);
        }
        return true;
    }

    public final void mo665a(C0471p c0471p, boolean z) {
        int size = this.f2767h.size();
        int i = 0;
        while (i < size) {
            if (c0471p == ((C0480l) this.f2767h.get(i)).f2794b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f2767h.size()) {
                ((C0480l) this.f2767h.get(i2)).f2794b.m2824a(false);
            }
            C0480l c0480l = (C0480l) this.f2767h.remove(i);
            c0480l.f2794b.m2829b((af) this);
            if (this.f2785z) {
                dz dzVar = c0480l.f2793a;
                if (VERSION.SDK_INT >= 23) {
                    dzVar.K.setExitTransition(null);
                }
                c0480l.f2793a.f3153K.setAnimationStyle(0);
            }
            c0480l.f2793a.mo674c();
            i = this.f2767h.size();
            if (i > 0) {
                this.f2775p = ((C0480l) this.f2767h.get(i - 1)).f2795c;
            } else {
                this.f2775p = m2871g();
            }
            if (i == 0) {
                mo674c();
                if (this.f2782w != null) {
                    this.f2782w.mo553a(c0471p, true);
                }
                if (this.f2783x != null) {
                    if (this.f2783x.isAlive()) {
                        this.f2783x.removeGlobalOnLayoutListener(this.f2768i);
                    }
                    this.f2783x = null;
                }
                this.f2774o.removeOnAttachStateChangeListener(this.f2769j);
                this.f2784y.onDismiss();
            } else if (z) {
                ((C0480l) this.f2767h.get(0)).f2794b.m2824a(false);
            }
        }
    }

    public final boolean mo669a() {
        return false;
    }

    public final void mo662a(int i) {
        if (this.f2771l != i) {
            this.f2771l = i;
            this.f2772m = C0357n.m2043a(i, ai.f1848a.mo400k(this.f2773n));
        }
    }

    public final void mo666a(View view) {
        if (this.f2773n != view) {
            this.f2773n = view;
            this.f2772m = C0357n.m2043a(this.f2771l, ai.f1848a.mo400k(this.f2773n));
        }
    }

    public final void mo667a(OnDismissListener onDismissListener) {
        this.f2784y = onDismissListener;
    }

    public final ListView mo678e() {
        if (this.f2767h.isEmpty()) {
            return null;
        }
        return ((C0480l) this.f2767h.get(this.f2767h.size() - 1)).f2793a.f3156i;
    }

    public final void mo672b(int i) {
        this.f2776q = true;
        this.f2778s = i;
    }

    public final void mo675c(int i) {
        this.f2777r = true;
        this.f2779t = i;
    }

    public final void mo676c(boolean z) {
        this.f2781v = z;
    }

    protected final boolean mo690f() {
        return false;
    }
}
