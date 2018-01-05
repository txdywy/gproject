package com.google.android.finsky.billing.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.payments.InstrumentManagerActivity;
import com.google.android.finsky.cv.p177a.ak;
import com.google.android.finsky.cv.p177a.al;
import com.google.android.finsky.cv.p177a.am;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.protobuf.nano.C0757i;
import com.squareup.leakcanary.C7582R;

public class CatchAbandonmentActivity extends C1647h implements OnClickListener {
    public C1797m f10524n;
    public C1801q f10525o;
    public C1612l f10526p;
    public final ad f10527q = new C2473o(700);
    public am f10528r;
    public PurchaseFlowConfig f10529s;
    public int f10530t;

    @Deprecated
    public static Intent m10756a(Context context, am amVar, int i, String str, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w) {
        if (amVar == null) {
            throw new IllegalArgumentException("CatchAbandonmentDialog is required");
        } else if (str == null) {
            throw new IllegalArgumentException("account name is required");
        } else {
            Intent intent = new Intent(context, CatchAbandonmentActivity.class);
            C1647h.m9344a(intent, str);
            intent.putExtra("LoggingFragmentActivity.serverLogsCookie", amVar.f11819j);
            intent.putExtra("CatchAbandonmentActivity.catchAbandonmentDialogData", ParcelableProto.m21671a((C0757i) amVar));
            intent.putExtra("CatchAbandonmentActivity.backendId", i);
            C1797m.m9776a(intent, purchaseFlowConfig);
            c2495w.m13380b(str).m13376a(intent);
            return intent;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1358l) C3947d.m18649a(C1358l.class)).mo1769a(this);
        setContentView((int) C7582R.layout.catch_abandonment_activity);
        Intent intent = getIntent();
        this.f10528r = (am) ParcelableProto.m21672a(intent, "CatchAbandonmentActivity.catchAbandonmentDialogData");
        int intExtra = intent.getIntExtra("CatchAbandonmentActivity.backendId", 0);
        this.f10530t = intExtra;
        this.f10529s = C1797m.m9773a(intent);
        Bundle bundle2 = new Bundle();
        this.f10524n.m9785b(bundle2, this.f10529s);
        TextView textView = (TextView) findViewById(C7582R.id.title);
        textView.setText(this.f10528r.f11811b);
        C1601a.m9199a(this, textView.getText(), textView, false);
        TextView textView2 = (TextView) findViewById(C7582R.id.description);
        ae.m9217a(textView2, this.f10528r.f11812c);
        ((PlayActionButtonV2) findViewById(C7582R.id.continue_button)).mo2588a(intExtra, this.f10528r.f11813d, (OnClickListener) this);
        if (!TextUtils.isEmpty(this.f10528r.f11814e)) {
            PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
            playActionButtonV2.mo2588a(intExtra, this.f10528r.f11814e, (OnClickListener) this);
            playActionButtonV2.setVisibility(0);
        }
        if (this.f10528r.f11817h != null) {
            FifeImageView fifeImageView = (FifeImageView) findViewById(C7582R.id.illustration);
            fifeImageView.setContentDescription(this.f10528r.f11818i);
            this.f10526p.m9287a(fifeImageView, this.f10528r.f11817h, -1);
        }
        this.f10524n.m9782a(bundle2, findViewById(C7582R.id.dialog), textView, textView2, null, null, null, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.E.m13379b(new C2475d(this).m13256a(601).m13258a(this.C));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final void m10757a(al alVar) {
        if (alVar == null) {
            finish();
            return;
        }
        if ((alVar.f11807a == 0 ? 1 : 0) != 0) {
            String str;
            if (alVar.f11807a == 0) {
                str = alVar.f11808b;
            } else {
                str = "";
            }
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else if (alVar.f11807a == 1) {
            ak aE_ = alVar.aE_();
            startActivityForResult(InstrumentManagerActivity.m10735a(this, this.B, aE_.f11804b, aE_.f11805c, Bundle.EMPTY, this.E, this.f10530t), 1);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            String str = this.f10528r.f11815f.aE_().f11806d;
            if (i == 1) {
                setResult(-1);
                this.E.m13367a(new C2474c(328).m13248d(8).m13240a(this.f10528r.f11819j));
                if (TextUtils.isEmpty(str)) {
                    finish();
                } else {
                    startActivity(this.f10525o.mo2637a(this.B, 10, str, this.E));
                    finish();
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    protected final int mo2368f() {
        return 1360;
    }

    public ad getParentNode() {
        return this.f10527q;
    }

    public void onClick(View view) {
        if (view == findViewById(C7582R.id.continue_button)) {
            this.E.m13379b(new C2475d(this).m13256a(1361).m13258a(this.C));
            m10757a(this.f10528r.f11815f);
        } else if (view == findViewById(C7582R.id.secondary_button)) {
            this.E.m13379b(new C2475d(this).m13256a(1362).m13258a(this.C));
            m10757a(this.f10528r.f11816g);
        }
    }
}
