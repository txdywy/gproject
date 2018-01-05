package com.google.android.finsky.layout.actionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.app.SearchManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0268a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0362s;
import android.support.v4.view.C0367x;
import android.support.v7.app.C0404a;
import android.support.v7.app.aa;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p106a.C0952e;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.search.FinskySearch;
import com.google.android.play.image.x;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchNavigationButton;
import com.google.android.play.search.ah;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.leakcanary.C7582R;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class C3658a {
    public static final Map f18441a = new HashMap();
    public static boolean f18442b = false;
    public int f18443A;
    public C0404a f18444c;
    public FinskySearchToolbar f18445d;
    public Activity f18446e;
    public Stack f18447f;
    public CharSequence f18448g;
    public int f18449h;
    public int f18450i;
    public boolean f18451j;
    public final Drawable f18452k;
    public final Drawable f18453l;
    public Drawable f18454m;
    public C3748a f18455n;
    public C0950c f18456o;
    public boolean f18457p;
    public MenuItem f18458q;
    public MenuItem f18459r;
    public MenuItem f18460s;
    public MenuItem f18461t;
    public MenuItem f18462u;
    public MenuItem f18463v;
    public SearchView f18464w;
    public C0952e f18465x;
    public String f18466y;
    public CharSequence f18467z;

    public C3658a(C3748a c3748a, aa aaVar) {
        this(c3748a, null, aaVar);
    }

    public C3658a(C3748a c3748a, C0950c c0950c, aa aaVar) {
        this.f18466y = "";
        this.f18443A = -1;
        this.f18446e = aaVar;
        this.f18455n = c3748a;
        this.f18456o = c0950c;
        this.f18447f = new Stack();
        this.f18447f.push(new C3663f(0, null));
        this.f18449h = 0;
        this.f18450i = 0;
        m17384a((FinskySearchToolbar) aaVar.findViewById(C7582R.id.action_bar));
        this.f18452k = new ColorDrawable(0);
        int color = this.f18446e.getResources().getColor(C7582R.color.play_white);
        this.f18453l = C0722q.m4782a(this.f18446e.getResources(), (int) C7582R.raw.play_store_154px, new as().m4592a(color).m4593b(color));
        c3748a.mo3637a(new C3659b(this));
    }

    public final void m17384a(FinskySearchToolbar finskySearchToolbar) {
        this.f18444c = ((aa) this.f18446e).G_().mo500a();
        this.f18445d = finskySearchToolbar;
        if (this.f18445d != null) {
            this.f18445d.setCurrentBackendId(this.f18449h);
            this.f18445d.setCurrentSearchBehaviorId(this.f18450i);
            this.f18445d.setNavigationManager(this.f18455n);
            this.f18445d.setActionBarController(this.f18456o);
            this.f18445d.setVisibility(4);
        }
        if (this.f18444c != null) {
            this.f18444c.mo571b(C3658a.m17375b(C1608h.m9243a(this.f18446e, 0)));
        }
    }

    public final void m17381a(int i, boolean z) {
        this.f18449h = i;
        this.f18451j = z;
        if (this.f18445d != null) {
            this.f18445d.setCurrentBackendId(i);
        }
        m17378a();
    }

    public final void m17379a(int i) {
        this.f18450i = i;
        if (this.f18445d != null) {
            this.f18445d.setCurrentSearchBehaviorId(i);
        }
        m17378a();
    }

    public final void m17385a(String str) {
        ((C3663f) this.f18447f.get(0)).f18472b = str;
        m17378a();
    }

    public final void m17383a(C2495w c2495w) {
        if (this.f18445d != null) {
            this.f18445d.setPageLevelLoggingContext(c2495w);
        }
    }

    public final void m17387a(boolean z, int i) {
        if (this.f18445d != null) {
            this.f18445d.a(z, i);
            if (this.f18445d.getVisibility() != 0) {
                this.f18445d.setVisibility(0);
            }
        }
    }

    public final void m17386a(boolean z) {
        if (this.f18445d != null) {
            PlaySearchNavigationButton playSearchNavigationButton = this.f18445d.ad.q.a;
            playSearchNavigationButton.c = z;
            if (playSearchNavigationButton.b == 0) {
                playSearchNavigationButton.a(playSearchNavigationButton.b, z);
            }
        }
    }

    public final boolean m17388a(Integer num) {
        return ((C3663f) this.f18447f.peek()).f18471a == num.intValue();
    }

    public final void m17390b(Integer num) {
        int size = this.f18447f.size();
        for (int i = 0; i < size; i++) {
            if (((C3663f) this.f18447f.get(i)).f18471a == num.intValue()) {
                this.f18447f.remove(i);
                return;
            }
        }
    }

    public final void m17378a() {
        boolean a;
        int a2;
        Drawable drawable;
        CharSequence charSequence = ((C3663f) this.f18447f.peek()).f18472b;
        if (!TextUtils.isEmpty(charSequence)) {
            m17374a(charSequence);
        } else if (m17388a(Integer.valueOf(3))) {
            m17374a((CharSequence) "");
        } else {
            m17374a(this.f18446e.getString(C7582R.string.launcher_name));
            DfeToc dn = C1473m.f7980a.dn();
            if (!(dn == null || this.f18449h == 0)) {
                gj a3 = dn.m14606a(this.f18449h);
                if (a3 != null) {
                    m17374a(a3.d);
                }
            }
        }
        m17376e();
        if (VERSION.SDK_INT >= 21) {
            a = m17388a(Integer.valueOf(3));
            if (this.f18446e instanceof MainActivity) {
                MainActivity mainActivity = (MainActivity) this.f18446e;
                if (a) {
                    a2 = C3658a.m17373a(this.f18446e);
                } else {
                    a2 = C1608h.m9243a(this.f18446e, this.f18449h);
                }
                if (this.f18455n.mo3715r()) {
                    a2 = C0268a.m1543c(a2, 0);
                }
                mainActivity.f6368N.setStatusBarBackgroundColor(a2);
            } else {
                int a4;
                Window window = this.f18446e.getWindow();
                if (a) {
                    a4 = C3658a.m17373a(this.f18446e);
                } else {
                    a4 = C1608h.m9263g(this.f18446e, this.f18449h);
                }
                window.setStatusBarColor(a4);
            }
        }
        if (VERSION.SDK_INT >= 21) {
            charSequence = this.f18448g;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f18446e.getTitle();
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f18446e.getResources().getString(C7582R.string.launcher_name);
            }
            if (this.f18443A == this.f18449h) {
                a2 = 1;
            } else {
                a2 = 0;
            }
            int i;
            if (this.f18467z == null || !this.f18467z.equals(charSequence)) {
                i = 0;
            } else {
                i = 1;
            }
            if (a2 == 0 || r4 == 0) {
                String charSequence2 = charSequence.toString();
                Context context = this.f18446e;
                switch (this.f18449h) {
                    case 1:
                        a2 = C7582R.color.play_books_secondary;
                        break;
                    case 2:
                        a2 = C7582R.color.play_music_secondary;
                        break;
                    case 3:
                        if (!C1608h.f8520b) {
                            a2 = C7582R.color.play_apps_secondary;
                            break;
                        } else {
                            a2 = C7582R.color.play_apps_ent_recents;
                            break;
                        }
                    case 4:
                        a2 = C7582R.color.play_movies_secondary;
                        break;
                    case 6:
                        a2 = C7582R.color.play_newsstand_secondary;
                        break;
                    default:
                        if (!C1608h.f8520b) {
                            a2 = C7582R.color.play_multi_recents;
                            break;
                        } else {
                            a2 = C7582R.color.play_apps_ent_recents;
                            break;
                        }
                }
                this.f18446e.setTaskDescription(new TaskDescription(charSequence2, null, context.getResources().getColor(a2)));
                this.f18443A = this.f18449h;
                this.f18467z = charSequence;
            }
        }
        boolean a5 = m17388a(Integer.valueOf(2));
        a = m17388a(Integer.valueOf(3));
        if (a5 || a) {
            Context context2 = this.f18446e;
            SoftReference softReference = (SoftReference) f18441a.get(Integer.valueOf(C7582R.drawable.action_bar_bg_neutral));
            if (softReference == null || softReference.get() == null) {
                softReference = new SoftReference(new C3661d(new Drawable[]{C0216d.m1112a(context2, (int) C7582R.drawable.action_bar_bg_neutral)}));
                f18441a.put(Integer.valueOf(C7582R.drawable.action_bar_bg_neutral), softReference);
            }
            drawable = (Drawable) softReference.get();
        } else {
            drawable = C3658a.m17375b(C1608h.m9243a(this.f18446e, this.f18449h));
        }
        this.f18454m = drawable;
        if (this.f18445d != null) {
            this.f18445d.setLogo(a ? this.f18453l : null);
        }
        if (this.f18444c != null) {
            this.f18444c.mo571b(this.f18451j ? this.f18452k : this.f18454m);
        }
        m17377f();
    }

    private final void m17376e() {
        if (this.f18460s != null) {
            DfeToc dn = C1473m.f7980a.dn();
            if (dn != null) {
                if ((dn.f14881a.f31758a & 64) != 0) {
                    x a = C1473m.f7980a.be().mo1671a(dn.f14881a.f31769l, this.f18446e.getResources().getDimensionPixelSize(C7582R.dimen.ic_menu_env_height), this.f18446e.getResources().getDimensionPixelSize(C7582R.dimen.ic_menu_env_height), new C3660c(this));
                    if (a.b() != null) {
                        this.f18460s.setIcon(new BitmapDrawable(this.f18446e.getResources(), a.b()));
                        this.f18460s.setVisible(true);
                        return;
                    }
                    return;
                }
            }
            this.f18460s.setVisible(false);
        }
    }

    private final void m17374a(CharSequence charSequence) {
        if (this.f18444c != null) {
            this.f18448g = charSequence;
            this.f18444c.mo565a(this.f18448g);
        }
    }

    private static Drawable m17375b(int i) {
        SoftReference softReference = (SoftReference) f18441a.get(Integer.valueOf(i));
        if (softReference == null || softReference.get() == null) {
            softReference = new SoftReference(new PaintDrawable(i));
            f18441a.put(Integer.valueOf(i), softReference);
        }
        return (Drawable) softReference.get();
    }

    private static int m17373a(Context context) {
        return context.getResources().getColor(C7582R.color.branded_status_bar);
    }

    @SuppressLint({"NewApi"})
    public final void m17382a(Activity activity, Menu menu) {
        this.f18462u = menu.findItem(C7582R.id.search_button);
        C0367x c0367x = this.f18445d;
        MenuItem findItem = menu.findItem(C7582R.id.search_button);
        View a = C0362s.m2055a(findItem);
        if (!(c0367x.ag != null || a == null || (a instanceof PlaySearch))) {
            c0367x.ag = a;
        }
        if (c0367x.ak != null) {
            C0362s.m2053a(c0367x.ak, null);
            C0362s.m2054a(c0367x.ak, null);
        }
        if (findItem != null) {
            if (c0367x.ai == null) {
                c0367x.getContext();
                c0367x.ai = new ah(c0367x);
            }
            C0362s.m2053a(findItem, c0367x.ai);
            C0362s.m2054a(findItem, c0367x);
            if (c0367x.am == C7582R.id.search_button && !c0367x.m3152d()) {
                C0362s.m2062b(findItem);
            }
        }
        c0367x.ak = findItem;
        View a2 = C0362s.m2055a(this.f18462u);
        if (!(a2 instanceof FinskySearch)) {
            this.f18464w = (SearchView) a2;
            this.f18464w.setOnQueryTextFocusChangeListener(new C3662e(this));
            this.f18464w.setSearchableInfo(((SearchManager) activity.getSystemService("search")).getSearchableInfo(activity.getComponentName()));
        }
        this.f18459r = menu.findItem(C7582R.id.translate_button);
        this.f18458q = menu.findItem(C7582R.id.auto_update_button);
        this.f18460s = menu.findItem(C7582R.id.env_button);
        this.f18461t = menu.findItem(C7582R.id.share_button);
        this.f18463v = menu.findItem(C7582R.id.notification_settings_button);
        if (this.f18455n == null) {
            a2.setVisibility(8);
            this.f18459r.setVisible(false);
            this.f18458q.setVisible(false);
            this.f18460s.setVisible(false);
            this.f18462u.setVisible(false);
            this.f18461t.setVisible(false);
            this.f18463v.setVisible(false);
        }
        this.f18457p = true;
        m17376e();
        m17377f();
    }

    @SuppressLint({"NewApi"})
    public final void m17389b() {
        if (this.f18464w != null && this.f18464w != null) {
            this.f18464w.setQuery("", false);
            this.f18464w.setIconified(true);
            if (C0362s.m2064d(this.f18462u)) {
                C0362s.m2063c(this.f18462u);
            }
        }
    }

    public final void m17391b(String str) {
        this.f18466y = str;
        if (this.f18445d != null) {
            this.f18445d.setQuery(this.f18466y);
        }
    }

    public final void m17380a(int i, CharSequence charSequence) {
        if (!m17388a(Integer.valueOf(i))) {
            this.f18447f.push(new C3663f(i, charSequence));
        }
    }

    public final void m17392c() {
        this.f18447f.pop();
    }

    private final void m17377f() {
        boolean z = true;
        boolean a = m17388a(Integer.valueOf(2));
        if (this.f18444c != null) {
            this.f18444c.mo566a(!this.f18455n.mo3722y());
        }
        if (!this.f18457p) {
            return;
        }
        if (a) {
            this.f18462u.setVisible(false);
            this.f18458q.setVisible(false);
            this.f18460s.setVisible(false);
            this.f18463v.setVisible(false);
            if (this.f18465x != null) {
                int i;
                this.f18459r.setVisible(this.f18465x.mo3553a());
                MenuItem menuItem = this.f18459r;
                if (this.f18465x.mo3554b()) {
                    i = C7582R.string.revert_translation;
                } else {
                    i = C7582R.string.translate;
                }
                menuItem.setTitle(i);
                return;
            }
            this.f18459r.setVisible(false);
            return;
        }
        m17393d();
        if (this.f18463v != null) {
            this.f18463v.setVisible(this.f18455n.mo3705g() == 27);
        }
        if (this.f18462u != null) {
            this.f18462u.setVisible(this.f18455n.mo3620A());
        }
        if (C1473m.f7980a.dj().mo2294a(12624205) && this.f18461t != null) {
            MenuItem menuItem2 = this.f18461t;
            if (TextUtils.isEmpty(((C3663f) this.f18447f.get(0)).f18473c)) {
                z = false;
            }
            menuItem2.setVisible(z);
        }
    }

    public final void m17393d() {
        if (this.f18459r != null) {
            this.f18459r.setVisible(false);
        }
        boolean z = this.f18455n.mo3705g() == 5;
        Document u = this.f18455n.mo3718u();
        if (this.f18458q != null) {
            if (u != null && u.f14885a.f12099f == 3) {
                boolean z2;
                String str = u.f14885a.f12096c;
                C2206c ah = C1473m.f7980a.ah();
                C3646a I = C1473m.f7980a.mo2029I();
                C3340g bw = C1473m.f7980a.bw();
                if (C1473m.f7980a.mo2265x().m18670c()) {
                    z2 = false;
                } else if (str == null) {
                    z2 = false;
                } else if ("com.google.android.gms".equals(str)) {
                    z2 = false;
                } else if (ah.mo2812a(str).isEmpty()) {
                    z2 = false;
                } else {
                    C3647b a = I.m17243a(str);
                    if (a == null) {
                        z2 = false;
                    } else {
                        z2 = a.f18028c != null;
                        int b = bw.mo3482b(str);
                        if (!z2) {
                            C1473m.f7980a.bu();
                            if (!C3028c.m15628a(b)) {
                                z2 = false;
                            }
                        }
                        if (z2 && a.f18028c.f11424i) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    boolean a2 = C3664g.m17396a(u.f14885a.f12096c);
                    this.f18458q.setTitle(C7582R.string.allow_auto_updating);
                    this.f18458q.setCheckable(true);
                    this.f18458q.setChecked(a2);
                    this.f18458q.setVisible(z);
                    return;
                }
            }
            this.f18458q.setVisible(false);
        }
    }
}
