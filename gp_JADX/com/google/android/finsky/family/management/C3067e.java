package com.google.android.finsky.family.management;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.contentfilterui.C2346j;
import com.google.android.finsky.contentfilterui.C2350n;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.p;
import com.google.wireless.android.finsky.dfe.h.a.q;
import com.google.wireless.android.finsky.dfe.h.a.w;
import com.google.wireless.android.finsky.dfe.h.a.y;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.squareup.leakcanary.C7582R;

public final class C3067e extends C1045b implements OnClickListener, C0657w, C0660x {
    public w f15963a;
    public String ag;
    public View ah;
    public C3068f ai;
    public C3068f aj;
    public C3069g f15964c;
    public C2350n f15965f;
    public int f15966h;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        s_();
        this.f740L = true;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        if (this.f15964c == null) {
            C2744a c2744a = new C2744a();
            this.f15964c = new C3069g();
            if (!this.f15964c.m15779a(m603h())) {
                this.bm.mo1244m();
                return;
            }
        }
        this.bm.mo1241c(m592c((int) C7582R.string.family_member_settings_title));
        if (aj()) {
            cg_();
        } else {
            aa();
        }
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        Object obj = 1;
        if (!(i == 1 && (i2 == 6 || i2 == 9))) {
            obj = null;
        }
        if (obj != null) {
            m603h().setResult(i2, intent);
            this.bm.mo1244m();
        } else if (i == 2 && i2 == -1) {
            this.f15966h = intent.getIntExtra("SelectedOptionData", this.f15966h);
            this.ag = intent.getStringExtra("ConsistencyTokenResult");
        } else {
            super.mo2342a(i, i2, intent);
        }
    }

    public final void mo2865a(Menu menu, MenuInflater menuInflater) {
        super.mo2865a(menu, menuInflater);
        if (aj()) {
            int i = this.f15963a.g;
            if (this.f15964c.f15972b == null) {
                return;
            }
            if (i == 2 || i == 1) {
                menu.clear();
                menuInflater.inflate(C7582R.menu.family_member_settings_menu, menu);
                if (i == 2) {
                    menu.findItem(C7582R.id.remove_member_menu).setTitle(C7582R.string.leave_family);
                }
            }
        }
    }

    public final boolean mo2866a(MenuItem menuItem) {
        if (menuItem.getItemId() != C7582R.id.remove_member_menu) {
            return super.mo2866a(menuItem);
        }
        int i;
        if (this.f15963a.g == 2) {
            i = 5223;
        } else {
            i = 5222;
        }
        C1473m.f7980a.dc().m13325a(i, null, (ad) this);
        startActivityForResult(this.f15964c.f15972b, 1);
        return true;
    }

    public final ce getPlayStoreUiElement() {
        return C2482j.m13283a(5221);
    }

    protected final int mo1298Z() {
        return C7582R.layout.family_member_settings;
    }

    private final boolean aj() {
        return this.f15963a != null;
    }

    protected final void aa() {
        this.bs.m16127a(0, null);
        this.bo.mo1658k(this.f15964c.f15971a, this, this);
    }

    protected final void cg_() {
        String str;
        OnClickListener onClickListener = null;
        this.ai = new C3068f(this.bt, C7582R.id.purchase_approval_view, C7582R.id.purchase_approval_title, C7582R.id.purchase_approval_subtitle, C7582R.id.purchase_approval_icon);
        this.aj = new C3068f(this.bt, C7582R.id.content_filter_setting, C7582R.id.content_filter_title, C7582R.id.content_filter_subtitle, C7582R.id.content_filter_icon);
        this.ah = this.bt.findViewById(C7582R.id.family_member_settings_header);
        y yVar = this.f15963a.b;
        if (yVar.c != null) {
            q[] qVarArr = yVar.h;
            if (yVar.h.length == 0) {
                str = yVar.e;
            } else {
                for (q qVar : qVarArr) {
                    if (qVar.c == this.f15966h) {
                        str = qVar.h;
                        break;
                    }
                }
                str = null;
            }
            this.ai.m15777a(yVar.d, str, C7582R.raw.ic_purchase_approvals_24dp, this);
        } else {
            this.ai.m15776a();
        }
        if (this.f15963a.c != null) {
            this.f15965f = ao();
            ContentFilterSettingsResponse contentFilterSettingsResponse = this.f15963a.c;
            if (this.f15965f.m11963a()) {
                str = contentFilterSettingsResponse.k;
            } else {
                str = contentFilterSettingsResponse.l;
            }
            if (!this.f15963a.f) {
                Object obj = this;
            }
            this.aj.m15777a(m603h().getString(C7582R.string.content_filtering_label), str, C7582R.raw.ic_parental_controls_24dp, onClickListener);
        } else {
            this.aj.m15776a();
        }
        C3069g.m15778a(this.ah, this.f15963a.d, this.f15963a.e);
    }

    public final void onClick(View view) {
        Fragment a;
        if (view == this.ai.f15967a) {
            a = C3070h.m15780a(this.bu, this.f15963a, this.f15966h, this.ag);
            a.m581a((Fragment) this, 2);
        } else if (view == this.aj.f15967a) {
            C2350n ao = ao();
            a = new C2346j();
            a.ah = ao;
        } else {
            a = null;
        }
        this.f730B.mo284a().mo331b(16908290, a).mo330a(null).mo334c();
    }

    public final void mo138d() {
        super.mo138d();
        this.ah = null;
        this.ai = null;
        this.aj = null;
    }

    private final C2350n ao() {
        if (this.f15965f == null) {
            this.f15965f = new C2350n(this.f15963a.c, this.f15964c.f15971a, C1473m.f7980a.mo2040T(), C1473m.f7980a.aK(), C1473m.f7980a.bk());
        }
        return this.f15965f;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f15963a = (w) obj;
        p pVar = this.f15963a.b.c;
        if (pVar != null) {
            this.f15966h = pVar.d;
            this.ag = pVar.c;
        }
        m603h().invalidateOptionsMenu();
        m_();
    }
}
