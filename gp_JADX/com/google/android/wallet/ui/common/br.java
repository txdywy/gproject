package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.a.a.a.a.b.a.a.f.i;
import com.google.a.a.a.a.b.a.a.f.j;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6505l;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6607s;
import com.google.android.wallet.common.util.C6609u;
import com.google.android.wallet.common.util.C6610v;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.common.util.aa;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class br extends cv implements OnClickListener, C6610v, aa, bo, C6668c {
    public final C6506n f32921a = new C6506n(1635);
    public C6494b af;
    public final List ag = new ArrayList();
    public at ah;
    public i f32922b;
    public FormEditText f32923c;
    public ButtonComponent f32924d;
    public Pattern f32925e;
    public Pattern f32926f;
    public C6609u f32927g;
    public long f32928h = -1;
    public long f32929i = System.currentTimeMillis();

    public static br m30190b(i iVar, int i, LogContext logContext) {
        Fragment brVar = new br();
        brVar.f(m30191c(iVar, i, logContext));
        return brVar;
    }

    public static Bundle m30191c(i iVar, int i, LogContext logContext) {
        Bundle a = C6522i.m29587a(i, logContext);
        a.putParcelable("fieldProto", ParcelableProto.m29885a((com.google.protobuf.nano.i) iVar));
        return a;
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        this.f32922b = (i) ParcelableProto.m29887a(this.q, "fieldProto");
        if (C6607s.m29980a(h(), "android.permission.READ_SMS") && !TextUtils.isEmpty(this.f32922b.d)) {
            this.f32925e = Pattern.compile(this.f32922b.d);
            if (this.f32925e.matcher("").groupCount() != 1) {
                Log.e("OtpFieldFragment", String.format(Locale.US, "Ignoring OTP Regex: %s should only contain a single group for matching", new Object[]{this.f32925e.pattern()}));
                this.f32925e = null;
            }
        }
        if (!TextUtils.isEmpty(this.f32922b.c)) {
            this.f32926f = Pattern.compile(this.f32922b.c);
        }
        if (bundle != null) {
            this.f32928h = bundle.getLong("lastMatchingSmsReceivedMs");
            this.f32929i = bundle.getLong("lastSmsScanForOtpsMs");
        }
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicOtpFieldRootLayout, C6617a.internalUicOtpFieldMaterialFieldLayoutEnabled});
        int resourceId = obtainStyledAttributes.getResourceId(0, C6623g.fragment_otp_field);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        View inflate = layoutInflater.inflate(resourceId, null, false);
        this.f32923c = (FormEditText) inflate.findViewById(C6622f.otp_field);
        this.f32923c.setLogContext(as());
        cp.m30904a(this.f32922b.a, this.f32923c, null);
        this.f32923c.setMaxLines(Integer.MAX_VALUE);
        this.f32923c.setHorizontallyScrolling(false);
        this.f32923c.mo5583a((bo) this);
        C6516f.m29562a(this.f32923c, this.f32922b.a.d, this.aI, this.aJ);
        this.f32924d = (ButtonComponent) inflate.findViewById(C6622f.otp_button);
        this.f32924d.setUiSpecification(this.f32922b.b);
        this.f32924d.setLogContext(as());
        C6516f.m29562a(this.f32924d, this.f32922b.b.b, this.aI, this.aJ);
        this.f32924d.setOnClickListener(this);
        if (z) {
            ((MaterialFieldLayout) inflate.findViewById(C6622f.otp_field_container)).setLabel(this.f32922b.a.h);
            this.f32924d.getViewTreeObserver().addOnGlobalLayoutListener(new bs(this));
        }
        return inflate;
    }

    public final void g_() {
        super.g_();
        if (this.f32925e != null) {
            if (this.f32927g == null) {
                this.f32927g = new C6609u();
            }
            this.f32927g.f32778a = this;
            BroadcastReceiver broadcastReceiver = this.f32927g;
            Context h = h();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.addAction("android.provider.Telephony.SMS_REJECTED");
            h.registerReceiver(broadcastReceiver, intentFilter);
            ArrayList a = aa.m29903a(h(), Math.max(this.f32928h, this.f32929i), this.f32926f);
            this.f32929i = System.currentTimeMillis();
            int size = a.size();
            int i = 0;
            while (i < size && !m30189a((ContentValues) a.get(i))) {
                i++;
            }
        }
    }

    public final void h_() {
        super.h_();
        if (this.f32927g != null) {
            h().unregisterReceiver(this.f32927g);
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putLong("lastMatchingSmsReceivedMs", this.f32928h);
        bundle.putLong("lastSmsScanForOtpsMs", this.f32929i);
    }

    public void onClick(View view) {
        if (this.af != null) {
            this.af.mo5561a(this, 1634);
        }
    }

    public final void mo5533W() {
        if (this.f32923c != null) {
            boolean z = this.aH;
            this.f32923c.setEnabled(z);
            this.f32924d.setEnabled(z);
        }
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        this.f32923c.mo5578a(charSequence, z);
    }

    public CharSequence getError() {
        return this.f32923c.getError();
    }

    public at getParentFormElement() {
        at av = this.ah != null ? this.ah : av();
        return av instanceof at ? av : null;
    }

    public final String mo5522a(String str) {
        return this.f32923c.mo5522a(null);
    }

    public final void cT_() {
        this.f32923c.cT_();
    }

    public final boolean cQ_() {
        return this.f32923c.cQ_();
    }

    public final boolean mo5581e() {
        return this.f32923c.mo5581e();
    }

    public final j m30194a(Bundle bundle) {
        boolean z;
        j jVar = new j();
        jVar.a = cp.m30901a(this.f32923c, this.f32922b.a);
        ButtonComponent buttonComponent = this.f32924d;
        if (bundle.containsKey("EventListener.EXTRA_TRIGGER_VALUE_REFERENCES")) {
            ArrayList b = ParcelableProto.m29891b(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES");
            int size = b.size();
            int i = 0;
            while (i < size) {
                t tVar = (t) b.get(i);
                if (tVar.c != buttonComponent.f33293d.b) {
                    i++;
                } else if (tVar.d != 2) {
                    throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
                } else {
                    z = true;
                    jVar.b = z;
                    return jVar;
                }
            }
        }
        z = false;
        jVar.b = z;
        return jVar;
    }

    public final void mo5584a(SmsMessage[] smsMessageArr) {
        SmsMessage smsMessage = smsMessageArr[0];
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("address", smsMessage.getDisplayOriginatingAddress());
        contentValues.put("date", Long.valueOf(smsMessage.getTimestampMillis()));
        contentValues.put("body", aa.m29902a(smsMessageArr));
        m30189a(contentValues);
    }

    @TargetApi(19)
    private final boolean m30189a(ContentValues contentValues) {
        CharSequence asString = contentValues.getAsString("address");
        CharSequence asString2 = contentValues.getAsString("body");
        long longValue = contentValues.getAsLong("date").longValue();
        if (this.f32926f != null) {
            int i = 1;
        } else {
            boolean z = false;
        }
        if (i != 0 && !TextUtils.isEmpty(asString) && !this.f32926f.matcher(asString).matches()) {
            m30188a(21);
            return false;
        } else if (this.f32928h > longValue) {
            Log.d("OtpFieldFragment", String.format(Locale.US, "SMS received with time (%d) prior to last matching SMS OTP (%d). Ignoring.", new Object[]{Long.valueOf(longValue), Long.valueOf(this.f32928h)}));
            return false;
        } else if (TextUtils.isEmpty(asString2)) {
            Log.d("OtpFieldFragment", "SMS received without a message body");
            return false;
        } else {
            Matcher matcher = this.f32925e.matcher(asString2);
            if (matcher.find()) {
                asString = matcher.group(1);
                if (!TextUtils.isEmpty(asString)) {
                    this.f32928h = System.currentTimeMillis();
                    this.f32923c.requestFocus();
                    this.f32923c.mo5626a(asString, 7);
                    m30188a(0);
                    return true;
                }
            }
            if (i != 0) {
                m30188a(20);
                return false;
            }
            m30188a(22);
            return false;
        }
    }

    private final void m30188a(int i) {
        C6528w c6528w;
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 773);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        if (this.F != null) {
            c6528w = (C6528w) this.F;
        } else {
            c6528w = (C6528w) h();
        }
        c6528w.mo5469a(7, bundle);
    }

    public final void mo5583a(bo boVar) {
        this.ag.add(boVar);
    }

    public final void mo5585b(bo boVar) {
        this.ag.remove(boVar);
    }

    public final void mo5563a(View view) {
        int size = this.ag.size();
        for (int i = 0; i < size; i++) {
            ((bo) this.ag.get(i)).mo5563a(view);
        }
    }

    public C6506n getUiElement() {
        return this.f32921a;
    }

    public List getChildren() {
        return Collections.singletonList(new C6505l(1634, this));
    }

    public final long mo5520Y() {
        return 0;
    }
}
