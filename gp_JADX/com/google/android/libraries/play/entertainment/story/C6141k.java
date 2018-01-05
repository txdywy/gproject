package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.cs;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6087f;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6095j;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.g;
import com.google.wireless.android.finsky.dfe.g.a.j;
import com.google.wireless.android.finsky.dfe.g.a.k;
import com.google.wireless.android.finsky.dfe.g.a.s;
import com.google.wireless.android.finsky.dfe.g.a.u;
import java.util.Collections;
import java.util.List;

public class C6141k implements OnClickListener, Runnable {
    public static final AccessibilityDelegate f30500a = new C6142l();
    public final C3006a f30501b;
    public final C2993b f30502c;
    public final View f30503d;
    public final View f30504e;
    public final View f30505f;
    public final TextView f30506g;
    public final TextView f30507h;
    public final int[] f30508i;
    public final C0722q[] f30509j;
    public final Drawable[] f30510k;
    public final String[] f30511l;
    public final String[] f30512m;
    public final boolean f30513n;
    public s f30514o;
    public ai f30515p;
    public ai f30516q;
    public boolean f30517r;
    public List f30518s = Collections.emptyList();
    public C2980a f30519t;
    public C2980a f30520u;

    public C6141k(C3006a c3006a, C2993b c2993b, View view) {
        this.f30501b = (C3006a) C6116b.m28100a((Object) c3006a);
        this.f30502c = (C2993b) C6116b.m28100a((Object) c2993b);
        this.f30503d = (View) C6116b.m28100a(view.findViewById(C6089g.dc_action_wishlist));
        this.f30504e = (View) C6116b.m28100a(this.f30503d.findViewById(C6089g.dc_action_wishlist_icon));
        this.f30506g = (TextView) C6116b.m28100a(this.f30503d.findViewById(C6089g.dc_action_wishlist_text));
        this.f30507h = (TextView) C6116b.m28100a((TextView) view.findViewById(C6089g.dc_primary_action));
        this.f30505f = (View) C6116b.m28100a(view.findViewById(C6089g.center));
        Context context = view.getContext();
        this.f30508i = new int[5];
        this.f30508i[0] = C0216d.m1116c(context, C6071d.play_movies_primary);
        this.f30508i[1] = C0216d.m1116c(context, C6071d.play_music_primary);
        this.f30508i[2] = C0216d.m1116c(context, C6071d.play_books_primary);
        this.f30508i[3] = -1;
        this.f30508i[4] = C0216d.m1116c(context, C6071d.play_apps_primary);
        this.f30509j = new C0722q[2];
        this.f30509j[0] = C0722q.m4784a(context, C6095j.ic_wishlist_add_24dp);
        this.f30509j[1] = C0722q.m4784a(context, C6095j.ic_wishlist_added_24dp);
        this.f30510k = new Drawable[10];
        this.f30512m = new String[2];
        this.f30512m[0] = context.getString(C6098k.pe__wishlist);
        this.f30512m[1] = context.getString(C6098k.pe__wishlist_youtube);
        this.f30511l = new String[2];
        this.f30511l[0] = context.getString(C6098k.label_wishlist_add_action);
        this.f30511l[1] = context.getString(C6098k.label_wishlist_remove_action);
        this.f30503d.setOnClickListener(this);
        this.f30507h.setOnClickListener(this);
        this.f30503d.setAccessibilityDelegate(f30500a);
        this.f30507h.setAccessibilityDelegate(f30500a);
        this.f30513n = true;
    }

    public final void m28343a(ai aiVar, List list, boolean z, ai aiVar2, C2980a c2980a, C2980a c2980a2) {
        C2980a c2980a3 = null;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = !aiVar.equals(this.f30516q);
        if (aiVar2 != null) {
            if (aiVar2.equals(this.f30515p)) {
                z2 = false;
            }
            z3 = z2;
        } else {
            if (this.f30515p != null) {
                z2 = false;
            }
            C6116b.m28104a(z2, "wishlistDcId parameter is null but was previously non-null");
        }
        if (z4) {
            C2980a c2980a4;
            C6116b.m28100a(aiVar.b);
            this.f30516q = aiVar;
            this.f30517r = z;
            if (this.f30513n) {
                C6116b.m28100a((Object) list);
                this.f30518s = list;
            }
            if (c2980a == null) {
                c2980a4 = null;
            } else {
                c2980a4 = this.f30502c.mo3234c(aiVar.f, c2980a, c2980a2);
            }
            this.f30520u = c2980a4;
        }
        if (z3) {
            C6116b.m28100a(aiVar2.b);
            this.f30515p = aiVar2;
            if (c2980a != null) {
                c2980a3 = this.f30502c.mo3230b(aiVar2.f, c2980a, c2980a2);
            }
            this.f30519t = c2980a3;
        }
        m28340a();
        run();
        if (c2980a != null) {
            if (z4 && this.f30507h.getVisibility() == 0) {
                this.f30502c.mo3226a(this.f30520u);
            }
            if (z3 && this.f30503d.getVisibility() == 0) {
                this.f30502c.mo3226a(this.f30519t);
            }
        }
    }

    public final void m28340a() {
        if (this.f30515p != null || (this.f30516q != null && this.f30516q.b.f11835d == 3)) {
            C3006a c3006a = this.f30501b;
            boolean isEmpty = c3006a.f15732m.isEmpty();
            c3006a.f15732m.add((Runnable) C6116b.m28100a((Object) this));
            if (isEmpty) {
                c3006a.mo3268c();
            }
        }
    }

    public final void m28344b() {
        C3006a c3006a = this.f30501b;
        if (c3006a.f15732m.remove(C6116b.m28100a((Object) this)) && c3006a.f15732m.isEmpty()) {
            c3006a.mo3271d();
        }
    }

    public final void m28345c() {
        m28344b();
        this.f30515p = null;
        this.f30516q = null;
        this.f30519t = null;
        this.f30520u = null;
    }

    public void run() {
        List<s> list = this.f30518s;
        Context context = this.f30507h.getContext();
        ai aiVar = this.f30516q;
        C3006a c3006a = this.f30501b;
        for (s sVar : list) {
            int i;
            if (c3006a.mo3262a(sVar.e, aiVar)) {
                int i2;
                u uVar = sVar.d;
                if (uVar.a == 0) {
                    i2 = uVar.c;
                } else {
                    i2 = 0;
                }
                switch (i2) {
                    case 1:
                        break;
                    case 2:
                        if (c3006a.mo3260a() && c3006a.mo3266b()) {
                            break;
                        }
                    case 3:
                        if (c3006a.mo3260a() && !c3006a.mo3266b()) {
                            break;
                        }
                    case 4:
                        if (c3006a.mo3267b(aiVar)) {
                            break;
                        }
                        continue;
                    case 5:
                        if (!c3006a.mo3267b(aiVar)) {
                            break;
                        }
                        continue;
                    default:
                        continue;
                }
                this.f30514o = sVar;
                if (this.f30515p != null || this.f30501b.mo3261a(this.f30515p)) {
                    this.f30503d.setVisibility(8);
                    this.f30505f.setVisibility(8);
                } else {
                    CharSequence charSequence;
                    Drawable csVar;
                    i2 = C6141k.m28338a(this.f30515p.b.f11835d);
                    this.f30503d.setVisibility(0);
                    this.f30506g.setTextColor(m28339b(i2));
                    TextView textView = this.f30506g;
                    if (this.f30515p.b.f11835d == 4) {
                        charSequence = this.f30512m[1];
                    } else {
                        charSequence = this.f30512m[0];
                    }
                    textView.setText(charSequence);
                    if (this.f30501b.mo3270c(this.f30515p)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    View view = this.f30504e;
                    if (i2 == -1) {
                        csVar = new cs(this.f30509j[i]);
                    } else {
                        int i3 = (i * 5) + i2;
                        csVar = this.f30510k[i3];
                        if (csVar == null) {
                            as asVar = new as();
                            asVar.m4593b(this.f30508i[i2]);
                            asVar.m4592a(this.f30508i[i2]);
                            csVar = new cs(this.f30509j[i], asVar);
                            this.f30510k[i3] = csVar;
                        }
                    }
                    C6122h.m28132a(view, csVar);
                    this.f30503d.setContentDescription(this.f30511l[i]);
                    this.f30505f.setVisibility(0);
                }
                if (this.f30516q != null) {
                    C6116b.m28100a(this.f30514o);
                    TextView textView2 = this.f30507h;
                    if (this.f30517r) {
                        i = -1;
                    } else {
                        i = m28339b(C6141k.m28338a(this.f30516q.b.f11835d));
                    }
                    textView2.setTextColor(i);
                    this.f30507h.setText(this.f30514o.c);
                    this.f30507h.setContentDescription(this.f30514o.c);
                }
            }
        }
        String b = c3006a.mo3263b(aiVar, context);
        s sVar2 = new s();
        if (b == null) {
            throw new NullPointerException();
        }
        sVar2.b |= 1;
        sVar2.c = b;
        k kVar = new k();
        g gVar = new g();
        kVar.a = -1;
        kVar.a = 0;
        kVar.b = gVar;
        sVar2.e = kVar;
        this.f30514o = sVar2;
        if (this.f30515p != null) {
        }
        this.f30503d.setVisibility(8);
        this.f30505f.setVisibility(8);
        if (this.f30516q != null) {
            C6116b.m28100a(this.f30514o);
            TextView textView22 = this.f30507h;
            if (this.f30517r) {
                i = -1;
            } else {
                i = m28339b(C6141k.m28338a(this.f30516q.b.f11835d));
            }
            textView22.setTextColor(i);
            this.f30507h.setText(this.f30514o.c);
            this.f30507h.setContentDescription(this.f30514o.c);
        }
    }

    private static int m28338a(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 0;
            default:
                return -1;
        }
    }

    private final int m28339b(int i) {
        return i == -1 ? -16777216 : this.f30508i[i];
    }

    public final void m28341a(View view, C2980a c2980a) {
        if (this.f30516q != null) {
            if (c2980a != null) {
                this.f30502c.mo3231b(c2980a);
            }
            if (this.f30514o.e.e() != null) {
                this.f30501b.mo3265b(view, this.f30516q, c2980a);
            } else if (this.f30514o.e.f() != null) {
                this.f30501b.mo3272d(view, this.f30516q);
            } else if (this.f30514o.e.g() != null) {
                this.f30501b.mo3258a(view, this.f30516q);
            } else {
                j jVar;
                k kVar = this.f30514o.e;
                if (kVar.a == 4) {
                    jVar = kVar.f;
                } else {
                    jVar = null;
                }
                if (jVar == null) {
                    this.f30501b.mo3259a(view, this.f30516q, c2980a);
                }
            }
        }
    }

    public final void m28342a(ai aiVar) {
        switch (aiVar.b.f11835d) {
            case 2:
                this.f30507h.setBackgroundResource(C6087f.pe__music_primary_button_bg);
                this.f30503d.setBackgroundResource(C6087f.pe__music_secondary_button_bg);
                return;
            case 3:
                this.f30507h.setBackgroundResource(C6087f.pe__apps_primary_button_bg);
                return;
            case 4:
                this.f30507h.setBackgroundResource(C6087f.pe__movies_primary_button_bg);
                this.f30503d.setBackgroundResource(C6087f.pe__movies_secondary_button_bg);
                return;
            default:
                return;
        }
    }

    public void onClick(View view) {
        if (view == this.f30503d) {
            if (this.f30515p != null) {
                if (this.f30519t != null) {
                    this.f30502c.mo3231b(this.f30519t);
                }
                this.f30501b.mo3264b(view, this.f30515p);
            }
        } else if (view == this.f30507h) {
            m28341a(view, this.f30520u);
        }
    }

    static {
        C6090b.m28050a();
    }
}
