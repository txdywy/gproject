package com.google.android.finsky.family.remoteescalation;

import android.support.v4.app.Fragment;
import android.support.v7.p045f.C0443j;
import android.support.v7.p045f.C0445b;
import android.support.v7.p045f.C0447d;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.family.p199a.C3031a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C3087j extends C3031a implements OnClickListener, C3086g {
    public final C3091h f16011c;
    public final C3748a f16012d;
    public final C2495w f16013e;
    public final ad f16014f;
    public com.google.wireless.android.finsky.dfe.h.a.ad f16015g;
    public List f16016h = Collections.emptyList();
    public boolean f16017i;

    public C3087j(C3091h c3091h, C3748a c3748a, C2495w c2495w, ad adVar) {
        super(c3091h.m605i());
        this.f16011c = c3091h;
        this.f16012d = c3748a;
        this.f16013e = c2495w;
        this.f16014f = adVar;
    }

    public int mo1508a() {
        if (this.f16016h.isEmpty()) {
            return 0;
        }
        if (this.f16016h.size() <= 3) {
            return this.f16016h.size() + 1;
        }
        if (this.f16017i) {
            return (this.f16016h.size() + 1) + 1;
        }
        return 5;
    }

    public int mo1509a(int i) {
        int a = mo1508a();
        if ((i == 0 ? 1 : null) != null) {
            return C7582R.layout.family_list_text;
        }
        if (C3087j.m15817a(a, this.f16016h.size(), i)) {
            return C7582R.layout.family_button_row;
        }
        return C7582R.layout.family_remote_escalation_flat_card_view;
    }

    public void mo1510a(View view, int i) {
        super.mo1510a(view, i);
        int a = mo1508a();
        if ((i == 0 ? 1 : null) != null) {
            ((TextView) view.findViewById(C7582R.id.text)).setText(this.f16015g.c);
        } else if (C3087j.m15817a(a, this.f16016h.size(), i)) {
            m15816a(view);
        } else {
            ((RemoteEscalationFlatCard) view).m15794a((ac) this.f16016h.get(i - 1), this);
        }
    }

    private final void m15816a(View view) {
        TextView textView = (TextView) view.findViewById(C7582R.id.text);
        if (this.f16017i) {
            textView.setText(this.f16015g.f);
        } else {
            CharSequence charSequence = this.f16015g.e;
            if (charSequence.contains("%d")) {
                charSequence = String.format(charSequence, new Object[]{Integer.valueOf(this.f16016h.size())});
            }
            textView.setText(charSequence);
        }
        view.setOnClickListener(this);
    }

    public final void mo1511b(View view, int i) {
    }

    public void mo3306a(com.google.wireless.android.finsky.dfe.h.a.ad adVar) {
        C0447d c3095m = new C3095m(this, this.f16016h, mo1508a());
        this.f16015g = adVar;
        this.f16016h = new ArrayList(Arrays.asList(adVar.d));
        C0445b.m2665a(c3095m).m2678a((C0443j) this);
    }

    public void onClick(View view) {
        this.f16017i = !this.f16017i;
        m15816a(view);
        int size = this.f16016h.size() - 3;
        if (this.f16017i) {
            this.C.mo4086a(this, 4, size);
        } else {
            this.C.mo4088b(this, 4, size);
        }
    }

    boolean mo3307a(ac acVar) {
        int i = 0;
        while (i < this.f16016h.size()) {
            ac acVar2 = (ac) this.f16016h.get(i);
            if (acVar2.l.equals(acVar.l) && acVar2.k.equals(acVar.k)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i < 0) {
            return false;
        }
        C0447d c3095m = new C3095m(this, this.f16016h, mo1508a());
        this.f16016h.remove(i);
        Fragment fragment = this.f16011c;
        if (fragment.m610k()) {
            ((C3096n) fragment.f.get(1)).m15859b(true);
            ((C3096n) fragment.f.get(0)).m15648b();
        }
        C0445b.m2665a(c3095m).m2678a((C0443j) this);
        return true;
    }

    public final void mo3305a(RemoteEscalationFlatCard remoteEscalationFlatCard, ac acVar, int i) {
        boolean z = true;
        switch (i) {
            case 0:
                if (TextUtils.isEmpty(acVar.g)) {
                    View findViewById;
                    if (C3760e.m17903a()) {
                        findViewById = remoteEscalationFlatCard.findViewById(C7582R.id.thumbnail);
                    } else {
                        findViewById = null;
                    }
                    this.f16012d.mo3654a(new Document(acVar.m), null, findViewById, this.f16013e);
                    return;
                }
                this.f16011c.m15845a(acVar);
                return;
            case 1:
            case 2:
                int i2;
                if (i != 1) {
                    z = false;
                }
                C2495w c2495w = this.f16013e;
                C2475d c2475d = new C2475d(this.f16014f);
                if (z) {
                    i2 = 5245;
                } else {
                    i2 = 5246;
                }
                c2495w.m13379b(c2475d.m13256a(i2));
                C3098p.m15867a(C1473m.f7980a.ap(), acVar, z, new C3093k(this, acVar), new C3094l());
                return;
            default:
                return;
        }
    }

    static boolean m15817a(int i, int i2, int i3) {
        return i2 > 3 && i3 == i - 1;
    }
}
