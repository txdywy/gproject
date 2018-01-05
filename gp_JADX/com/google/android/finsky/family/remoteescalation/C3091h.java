package com.google.android.finsky.family.remoteescalation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.cv.p177a.ik;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.family.p199a.C3035e;
import com.google.android.finsky.family.remoteescalation.p202a.C3081d;
import com.google.android.finsky.family.remoteescalation.p202a.C3082e;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class C3091h extends C3035e implements C0660x, C3082e {
    public final C1557b ah = C1473m.f7980a.aY();
    public int ai;
    public ac aj;
    public ik ak;

    public final int ao() {
        return 5243;
    }

    protected final List ap() {
        return new ArrayList(Arrays.asList(new C3096n[]{m15838a(0, C1592a.f8454c.intValue(), 5244, "pending"), m15838a(1, C1592a.f8455d.intValue(), 5247, "history")}));
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        s_();
        this.ak = (ik) ParcelableProto.m21673a(this.f760q, "extra_remote_escalation_info");
        if (this.ak == null) {
            this.ak = new ik();
        }
        C3081d.f16001e.f16005d = this;
        Intent intent = m603h().getIntent();
        if (intent != null) {
            ae aeVar = (ae) ParcelableProto.m21672a(intent, "remote_escalation_item");
            if (!(aeVar == null || C3098p.m15870a(aeVar))) {
                intent.removeExtra("remote_escalation_item");
                ik ikVar = this.ak;
                String str = aeVar.h;
                if (str == null) {
                    throw new NullPointerException();
                }
                ikVar.f12659a |= 2;
                ikVar.f12661c = str;
                ikVar = this.ak;
                String str2 = aeVar.g;
                if (str2 == null) {
                    throw new NullPointerException();
                }
                ikVar.f12659a |= 4;
                ikVar.f12662d = str2;
            }
            C3098p.m15869a(intent.getStringExtra("authAccount"), intent.getStringExtra("consistency_token"));
        }
    }

    public final void cg_() {
        super.cg_();
        m15667f(0);
    }

    public final void mo2865a(Menu menu, MenuInflater menuInflater) {
        super.mo2865a(menu, menuInflater);
        C3096n c3096n = (C3096n) aj();
        menu.clear();
        if (this.ag != null && c3096n != null && c3096n.m15860c() && c3096n.mo3292h() && c3096n.m15865j()) {
            menuInflater.inflate(C1592a.f8459h.intValue(), menu);
        }
    }

    public final boolean mo2866a(MenuItem menuItem) {
        if (menuItem.getItemId() != C1592a.f8460i.intValue()) {
            return super.mo2866a(menuItem);
        }
        List l = aw().m15866l();
        this.ai = 0;
        int size = l.size();
        l.get(this.ai);
        C2495w c2495w = this.bw;
        Bundle bundle = new Bundle();
        bundle.putInt("max", size);
        C1508k c1508k = new C1508k();
        c1508k.m8851a(this, 0, null).m8853a(false).m8850a(bundle).m8855b(C1592a.f8462k.intValue()).m8858c(C1592a.f8461j.intValue()).m8849a(5248, null, -1, -1, c2495w).m8862e((int) C7582R.string.cancel);
        C3083a c3083a = new C3083a();
        c1508k.m8854a((C1128e) c3083a);
        c3083a.m625a(this.f730B, "approve_dialog");
        m15839a(c3083a);
        return true;
    }

    protected final String ar() {
        int intValue;
        Object obj = (this.ah.mo2313c().mo2328i() || (aw() != null && aw().m15865j())) ? 1 : null;
        if (obj != null) {
            intValue = C1592a.f8456e.intValue();
        } else {
            intValue = C7582R.string.remote_escalation_title_kid;
        }
        return m592c(intValue);
    }

    public final void mo180b(int i) {
        super.mo180b(i);
        as();
    }

    protected final int aq() {
        if (this.ak != null && this.ak.f12660b == 2) {
            return 1;
        }
        Intent intent = m603h().getIntent();
        if (intent != null) {
            ae aeVar = (ae) ParcelableProto.m21672a(intent, "remote_escalation_item");
            if (aeVar != null && C3098p.m15870a(aeVar)) {
                return 1;
            }
        }
        return 0;
    }

    final void m15845a(ac acVar) {
        this.aj = acVar;
        Context h = m603h();
        startActivityForResult(new Intent(h, RemoteEscalationApprovalDialog.class).putExtra("doc", new Document(acVar.m)).putExtra("approval", ParcelableProto.m21671a((C0757i) acVar)), 1);
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        if (i == 1) {
            new Handler().post(new C3092i(this, i2, intent));
        } else {
            super.mo2342a(i, i2, intent);
        }
    }

    private final void av() {
        C3083a c3083a = (C3083a) this.f730B.mo283a("approve_dialog");
        if (c3083a != null && m610k() && at()) {
            this.ai++;
            if (this.ai >= aw().m15866l().size()) {
                c3083a.m626a(false);
                m15840a(false);
                return;
            }
            m15839a(c3083a);
        }
    }

    public final void mo1346w() {
        C3081d.f16001e.f16005d = null;
        if (this.f760q.getParcelable("extra_remote_escalation_info") != null) {
            m603h().setResult(-1, new Intent().putExtra("consistency_token", (String) C0954a.aQ.m5777b(C1473m.f7980a.cZ()).m5760a()));
        }
        super.mo1346w();
    }

    private final void m15839a(C3083a c3083a) {
        ac acVar = (ac) aw().m15866l().get(this.ai);
        int i = this.ai;
        Object obj = acVar.c;
        BulkApproveProgressView bulkApproveProgressView = (BulkApproveProgressView) c3083a.al;
        if (bulkApproveProgressView != null) {
            bulkApproveProgressView.f15979a.setProgress(i);
            bulkApproveProgressView.f15980b.setText(obj);
        } else {
            c3083a.af = obj;
        }
        C3098p.m15867a(this.bo, acVar, true, this, this);
    }

    public final void mo1211b(int i, Bundle bundle) {
        super.mo1211b(i, bundle);
        m15840a(false);
    }

    public final void mo1062a(VolleyError volleyError) {
        av();
    }

    private final C3096n aw() {
        return (C3096n) this.f.get(0);
    }

    private final void m15840a(boolean z) {
        for (C3096n b : this.f) {
            b.m15859b(z);
        }
    }

    private final C3096n m15838a(int i, int i2, int i3, String str) {
        Locale locale = m605i().getConfiguration().locale;
        this.bw.m13379b(new C2475d(this).m13256a(i3));
        return new C3096n(i, m592c(i2).toUpperCase(locale), this, this.bp, this.bw, this.bo, this, str, this.ak);
    }

    public final void as() {
        if (m610k()) {
            m603h().invalidateOptionsMenu();
        }
    }

    public final void mo3308a(int i, String str) {
        if (!str.equals(this.bo.mo1636c())) {
            return;
        }
        if (i == 16) {
            m15840a(true);
        } else if (i == 15) {
            aw().m15859b(true);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        av();
    }
}
