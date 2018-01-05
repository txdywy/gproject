package com.google.android.wallet.ui.p395g;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.c.b.a.ah;
import com.google.a.a.a.a.b.a.a.c.b.a.ai;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.common.util.C6606r;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.co;
import com.google.android.wallet.ui.common.cp;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;

public class C6672a extends au implements TextWatcher, OnClickListener {
    public FormEditText f32939a;
    public String af = "";
    public int ag = 0;
    public final ArrayList ah = new ArrayList();
    public final C6506n ai = new C6506n(1680);
    public C6494b aj;
    public FormEditText f32940b;
    public LinearLayout f32941c;
    public View[] f32942d;
    public TextView f32943e;
    public FormHeaderView f32944f;
    public InfoMessageView f32945g;
    public ArrayList f32946h = new ArrayList();
    public boolean f32947i = false;

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicUsernamePasswordRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            throw new IllegalArgumentException("Attribute internalUicUsernamePasswordRootLayout must be defined.");
        } else if (((ah) this.aD).b == 3 && ((ah) this.aD).j == null) {
            throw new NullPointerException("Gaia parameters are not specified for gaia form.");
        } else {
            ArrayList arrayList;
            long j;
            FormEditText formEditText;
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(resourceId, null, false);
            this.f32944f = (FormHeaderView) viewGroup2.findViewById(C6622f.username_password_header);
            this.f32944f.m30620a(((ah) this.aD).a, layoutInflater, ap(), this, this.ah);
            this.f32939a = (FormEditText) viewGroup2.findViewById(C6622f.username);
            this.f32939a.setLogContext(as());
            if (((ah) this.aD).e != null) {
                cp.m30904a(((ah) this.aD).e, this.f32939a, null);
                this.f32939a.addTextChangedListener(this);
                arrayList = this.f32946h;
                j = ((ah) this.aD).e.d;
                formEditText = this.f32939a;
                cp.m30910b(((ah) this.aD).e);
                arrayList.add(new C6749z(j, formEditText));
            }
            this.f32939a.setVisibility(((ah) this.aD).e != null ? 0 : 8);
            this.f32940b = (FormEditText) viewGroup2.findViewById(C6622f.password);
            this.f32940b.setLogContext(as());
            cp.m30904a(((ah) this.aD).f, this.f32940b, null);
            if (((ah) this.aD).b == 3) {
                this.f32940b.mo5622a(new C6819b(this));
            }
            this.f32940b.addTextChangedListener(this);
            arrayList = this.f32946h;
            j = ((ah) this.aD).f.d;
            formEditText = this.f32940b;
            cp.m30910b(((ah) this.aD).f);
            arrayList.add(new C6749z(j, formEditText));
            this.f32941c = (LinearLayout) viewGroup2.findViewById(C6622f.ui_fields_container);
            this.f32942d = new View[((ah) this.aD).i.length];
            m30228a(layoutInflater, ((ah) this.aD).i);
            this.f32943e = (TextView) viewGroup2.findViewById(C6622f.login_help_text);
            if (TextUtils.isEmpty(((ah) this.aD).g)) {
                this.f32943e.setVisibility(8);
            } else {
                this.f32943e.setText(Html.fromHtml(((ah) this.aD).g));
                this.f32943e.setMovementMethod(LinkMovementMethod.getInstance());
                this.f32943e.setOnClickListener(this);
            }
            this.f32945g = (InfoMessageView) viewGroup2.findViewById(C6622f.legal_message_text);
            this.f32945g.setParentUiNode(this);
            this.f32945g.setUrlClickListener(ap());
            if (((ah) this.aD).h != null) {
                this.f32945g.setInfoMessage(((ah) this.aD).h.c);
                this.ah.add(this.f32945g);
            } else {
                this.f32945g.setVisibility(8);
            }
            return viewGroup2;
        }
    }

    public final void m30235i(Bundle bundle) {
        super.i(bundle);
        mo5469a(6, Bundle.EMPTY);
        if (bundle != null) {
            this.f32947i = bundle.getBoolean("hasCompletedPasswordVerification");
            this.af = bundle.getString("reauthToken");
            this.ag = bundle.getInt("reauthResponseCode");
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putBoolean("hasCompletedPasswordVerification", this.f32947i);
        bundle.putString("reauthToken", this.af);
        bundle.putInt("reauthResponseCode", this.ag);
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((ah) this.aD).a.a)) {
            return false;
        }
        switch (gVar.b.c) {
            case 1:
                this.f32939a.mo5578a(gVar.c, true);
                break;
            case 2:
                this.f32940b.mo5578a(gVar.c, true);
                break;
            default:
                throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gVar.b.c);
        }
        return true;
    }

    public final void mo5533W() {
        if (this.f32939a != null) {
            boolean z = this.aH;
            this.f32944f.setEnabled(z);
            this.f32939a.setEnabled(z);
            this.f32940b.setEnabled(z);
            for (View enabled : this.f32942d) {
                enabled.setEnabled(z);
            }
            this.f32945g.setEnabled(z);
            this.f32943e.setEnabled(z);
        }
    }

    public final boolean mo5534X() {
        ao();
        return ((((ah) this.aD).e != null && (this.f32939a == null || TextUtils.isEmpty(this.f32939a.getText()))) || this.f32940b == null || TextUtils.isEmpty(this.f32940b.getText())) ? false : true;
    }

    public final ArrayList aa() {
        return this.f32946h;
    }

    public C6506n getUiElement() {
        return this.ai;
    }

    public List getChildren() {
        return this.ah;
    }

    protected final h mo5521Z() {
        ao();
        return ((ah) this.aD).a;
    }

    public final boolean ae() {
        return (this.f32945g.f32901c || this.f32945g.f32902d) ? false : true;
    }

    public final void af() {
        this.f32945g.m30180a(true);
    }

    public final String ag() {
        return this.f32945g.getExpandLabel();
    }

    public void onClick(View view) {
        if (view == this.f32943e && this.aj != null) {
            this.aj.mo5561a(this, 1681);
        }
    }

    private final void m30228a(LayoutInflater layoutInflater, al[] alVarArr) {
        for (int i = 0; i < alVarArr.length; i++) {
            this.f32942d[i] = new co(alVarArr[i], layoutInflater, au(), this.f32941c).m30899a();
            this.f32941c.addView(this.f32942d[i]);
            ArrayList arrayList = this.f32946h;
            long j = alVarArr[i].d;
            Object obj = this.f32942d[i];
            cp.m30910b(((ah) this.aD).i[i]);
            arrayList.add(new C6749z(j, obj));
        }
    }

    public final ai ac() {
        ai aiVar = new ai();
        if (((ah) this.aD).a != null) {
            aiVar.g = ((ah) this.aD).a.c;
        }
        if (((ah) this.aD).e != null) {
            aiVar.a = cp.m30901a(this.f32939a, ((ah) this.aD).e);
        }
        aiVar.c = new at[((ah) this.aD).i.length];
        for (int i = 0; i < ((ah) this.aD).i.length; i++) {
            aiVar.c[i] = cp.m30901a(this.f32942d[i], ((ah) this.aD).i[i]);
        }
        aiVar.b = new at();
        aiVar.b.c = ((ah) this.aD).f.c;
        switch (((ah) this.aD).b) {
            case 1:
                aiVar.b.a(this.f32940b.getText().toString());
                break;
            case 2:
                C6606r c6606r = new C6606r(h(), ((ah) this.aD).d);
                try {
                    byte[] bArr;
                    at atVar = aiVar.b;
                    byte[] bArr2 = ((ah) this.aD).c;
                    String obj = this.f32940b.getText().toString();
                    String str = c6606r.f32775a;
                    long currentTimeMillis = System.currentTimeMillis();
                    Certificate certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr2));
                    Object toByteArray = certificate.getSerialNumber().toByteArray();
                    if (toByteArray.length < 8) {
                        bArr = new byte[8];
                        System.arraycopy(toByteArray, 0, bArr, 8 - toByteArray.length, toByteArray.length);
                    } else if (toByteArray.length == 8) {
                        Object obj2 = toByteArray;
                    } else {
                        bArr = new byte[8];
                        System.arraycopy(toByteArray, toByteArray.length - 8, bArr, 0, 8);
                    }
                    SecretKey a = C6606r.m29973a();
                    bArr2 = C6606r.m29976a(certificate, a);
                    byte[] a2 = C6606r.m29977a(a, C6606r.m29975a(currentTimeMillis, str, obj));
                    int length = bArr2.length + a2.length;
                    if (length <= 65535) {
                        ByteBuffer allocate = ByteBuffer.allocate(((bArr.length + 2) + 2) + length);
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        allocate.putShort((short) 5);
                        allocate.put(bArr);
                        allocate.putChar((char) length);
                        allocate.put(bArr2);
                        allocate.put(a2);
                        atVar.a(Base64.encodeToString(allocate.array(), 2));
                        aiVar.d = c6606r.f32775a;
                        break;
                    }
                    throw new IllegalStateException("Encrypted message is too long: " + length);
                } catch (Throwable e) {
                    throw new IllegalStateException("Unable to encrypt user PayPal credentials", e);
                }
            case 3:
                aiVar.b.a(this.af);
                break;
            default:
                throw new IllegalArgumentException("Unsupported encryption type: " + ((ah) this.aD).b);
        }
        aiVar.e = ((ah) this.aD).b;
        if (((ah) this.aD).h != null) {
            aiVar.f = ((ah) this.aD).h.g;
        }
        return aiVar;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        mo5469a(1, Bundle.EMPTY);
        this.f32947i = false;
        this.af = "";
    }
}
