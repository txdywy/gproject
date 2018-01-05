package com.google.android.libraries.play.entertainment.story;

import android.os.Bundle;
import android.support.v7.app.C0404a;
import android.support.v7.app.aa;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p347g.C6088a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6120f;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.dfe.g.a.ai;

public class bd extends C6088a {
    public static final C6090b al = C6090b.m28050a();
    public byte[] am;
    public boolean an;
    public ai ao;
    public C2980a ap;
    public boolean aq;

    protected static Bundle m28185a(ai aiVar, byte[] bArr, C2980a c2980a) {
        C6116b.m28100a((Object) aiVar);
        Bundle bundle = new Bundle();
        bundle.putByteArray("dcIdBlob", C0757i.m4909a((C0757i) aiVar));
        if (bArr != null) {
            bundle.putByteArray("panelServerLogsCookie", bArr);
        }
        if (c2980a != null) {
            Bundle c = C2998a.m15496l().m15515r().mo3232c(c2980a);
            if (c != null) {
                bundle.putBundle("causeNode", c);
            }
        }
        return bundle;
    }

    protected boolean mo5347X() {
        return false;
    }

    protected final ai m28190Y() {
        return (ai) C6116b.m28100a(ab());
    }

    private final ai ab() {
        if (this.ao == null) {
            Bundle bundle = (Bundle) C6116b.m28100a(this.f760q);
            if (!bundle.containsKey("dcIdBlob")) {
                return null;
            }
            this.ao = new ai();
            try {
                C0757i.m4905a(this.ao, bundle.getByteArray("dcIdBlob"));
            } catch (InvalidProtocolBufferNanoException e) {
                al.m28058b(null, "Could not parse ResourceData from args: %s", e.getMessage());
            }
        }
        return this.ao;
    }

    protected final C2980a m28191Z() {
        if (this.ap == null) {
            C2980a a;
            ai ab;
            C2993b r = C2998a.m15496l().m15515r();
            C2980a c2980a = (C2980a) C6116b.m28100a(((al) this.f734F).f30382d);
            if (this.f760q != null) {
                Bundle bundle = this.f760q.getBundle("causeNode");
                if (bundle != null) {
                    a = r.mo3223a(bundle);
                    if (!this.an) {
                        this.am = ((Bundle) C6116b.m28100a(this.f760q)).getByteArray("panelServerLogsCookie");
                        this.an = true;
                    }
                    c2980a = r.mo3224a(this.am, c2980a, a);
                    ab = ab();
                    if (ab != null) {
                        this.ap = c2980a;
                    } else {
                        this.ap = r.mo3229b(ab.f, c2980a);
                    }
                    r.mo3226a(this.ap);
                }
            }
            a = null;
            if (this.an) {
                this.am = ((Bundle) C6116b.m28100a(this.f760q)).getByteArray("panelServerLogsCookie");
                this.an = true;
            }
            c2980a = r.mo3224a(this.am, c2980a, a);
            ab = ab();
            if (ab != null) {
                this.ap = r.mo3229b(ab.f, c2980a);
            } else {
                this.ap = c2980a;
            }
            r.mo3226a(this.ap);
        }
        return this.ap;
    }

    protected static void m28186a(TextView textView, String str, Bundle bundle) {
        C6116b.m28100a((Object) textView);
        if (!bundle.containsKey(str) || TextUtils.isEmpty(bundle.getString(str))) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(bundle.getString(str));
        textView.setVisibility(0);
    }

    protected static void m28188b(TextView textView, String str, Bundle bundle) {
        C6116b.m28100a((Object) textView);
        if (!bundle.containsKey(str) || TextUtils.isEmpty(bundle.getString(str))) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(C6120f.m28114a(Html.fromHtml(bundle.getString(str))));
        textView.setVisibility(0);
    }

    protected static void m28187a(PEImageView pEImageView, boolean z, String str, String str2, float f, C6032d... c6032dArr) {
        if (z) {
            pEImageView.m27924a(new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("=").append(str2).toString(), 3, f, c6032dArr);
        } else {
            pEImageView.m27924a(str, 0, f, new C6032d[0]);
        }
    }

    protected final void aa() {
        Toolbar toolbar = (Toolbar) ((View) C6116b.m28100a(this.f746R)).findViewById(C6089g.toolbar);
        if (toolbar != null) {
            aa aaVar = (aa) m603h();
            aaVar.m2347a(toolbar);
            C0404a c0404a = (C0404a) C6116b.m28100a(aaVar.G_().mo500a());
            c0404a.mo559a();
            c0404a.mo566a(true);
        }
    }

    public void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        View findViewById = ((View) C6116b.m28100a(this.f746R)).findViewById(C6089g.padding);
        if (findViewById != null) {
            findViewById.setVisibility(this.aq ? 0 : 8);
        }
    }
}
