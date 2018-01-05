package com.google.android.finsky.activities;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dt.C2887a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p198f.C3029d;
import com.google.android.finsky.uninstall.az;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class MultiInstallActivity extends aa implements OnClickListener {
    public C0986a f6392A;
    public View f6393B;
    public View f6394C;
    public final C2471a f6395q = C1473m.f7980a.aR();
    public ArrayList f6396r;
    public int f6397s;
    public int f6398t;
    public C3300k f6399u;
    public int f6400v;
    public String f6401w;
    public C2495w f6402x;
    public boolean f6403y;
    public ei f6404z;

    public class InstallDetails implements Parcelable {
        public static final Creator CREATOR = new ez();
        public final String f6386a;
        public final String[] f6387b;
        public final Document f6388c;
        public boolean f6389d;
        public boolean f6390e;
        public boolean f6391f;

        public InstallDetails(Document document, C3029d c3029d, String str) {
            this.f6389d = c3029d.f15859c;
            this.f6390e = c3029d.f15857a;
            this.f6391f = c3029d.f15858b;
            this.f6388c = document;
            this.f6386a = str;
            if (this.f6391f) {
                this.f6387b = document.m14625N().f13167g;
            } else {
                this.f6387b = null;
            }
        }

        public final boolean m6215a() {
            return (this.f6390e || this.f6391f || this.f6389d) ? false : true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            int i3 = 1;
            parcel.writeByte((byte) (this.f6390e ? 1 : 0));
            if (this.f6391f) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            if (!this.f6389d) {
                i3 = 0;
            }
            parcel.writeByte((byte) i3);
            parcel.writeString(this.f6386a);
            this.f6388c.writeToParcel(parcel, i);
            if (this.f6391f) {
                parcel.writeInt(this.f6387b.length);
                parcel.writeStringArray(this.f6387b);
            }
        }

        protected InstallDetails(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            this.f6390e = parcel.readByte() > (byte) 0;
            if (parcel.readByte() > (byte) 0) {
                z = true;
            } else {
                z = false;
            }
            this.f6391f = z;
            if (parcel.readByte() <= (byte) 0) {
                z2 = false;
            }
            this.f6389d = z2;
            this.f6386a = parcel.readString();
            this.f6388c = (Document) Document.CREATOR.createFromParcel(parcel);
            if (this.f6391f) {
                this.f6387b = new String[parcel.readInt()];
                parcel.readStringArray(this.f6387b);
                return;
            }
            this.f6387b = null;
        }
    }

    private static void m6218a(List list, int i, ArrayList arrayList, ArrayList arrayList2) {
        String str;
        if (!(arrayList.isEmpty() && arrayList2.isEmpty())) {
            FinskyLog.m21669e("The output lists are not initially empty.", new Object[0]);
        }
        C3028c bu = C1473m.f7980a.bu();
        if (i == 2) {
            str = "bulk_update";
        } else {
            str = "bulk_install";
        }
        boolean a = C1473m.f7980a.mo2265x().m18668a();
        for (Document document : list) {
            C3029d a2;
            if (i == 2) {
                a2 = bu.m15631a(document, a);
            } else {
                a2 = bu.m15631a(document, false);
            }
            InstallDetails installDetails = new InstallDetails(document, a2, str);
            if (installDetails.m6215a()) {
                arrayList.add(installDetails);
            } else {
                arrayList2.add(installDetails);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.update_all_activity);
        this.f6399u = C1473m.f7980a.mo2256o();
        this.f6393B = findViewById(C7582R.id.positive_button);
        this.f6394C = findViewById(C7582R.id.negative_button);
        ((PlayActionButtonV2) this.f6393B).m6000a(3, (int) C7582R.string.ok, (OnClickListener) this);
        ((PlayActionButtonV2) this.f6394C).m6000a(3, (int) C7582R.string.cancel, (OnClickListener) this);
        this.f6400v = getIntent().getIntExtra("MultiInstallActivity.mode", 1);
        this.f6401w = getIntent().getStringExtra("MultiInstallActivity.install-account-name");
        this.f6403y = getIntent().getBooleanExtra("MultiInstallActivity.acquire-system-apps", false);
        this.f6392A = C1473m.f7980a.mo2041U();
        this.f6402x = this.f6395q.m13180a(bundle, getIntent());
        if (bundle == null) {
            this.f6397s = 0;
            this.f6398t = 0;
            List parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("MultiInstallActivity.installs");
            int size = parcelableArrayListExtra.size();
            while (i < size) {
                C1473m.f7980a.mo2223d().m8959a((Document) parcelableArrayListExtra.get(i));
                i++;
            }
            List arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m6218a(parcelableArrayListExtra, this.f6400v, arrayList, arrayList2);
            C2887a a = az.m21336a();
            if (a != null) {
                a.mo4282b();
            }
            m6217a(arrayList);
            this.f6396r = arrayList2;
            m6219b(true);
            return;
        }
        this.f6396r = bundle.getParcelableArrayList("MultiInstallActivity.installs-for-approval");
        this.f6397s = bundle.getInt("MultiInstallActivity.current-install-index", 0);
        this.f6398t = bundle.getInt("MultiInstallActivity.current-page-type", 0);
        m6220c(this.f6398t);
        this.f6404z = (ei) H_().mo281a((int) C7582R.id.main_layout);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("MultiInstallActivity.installs-for-approval", this.f6396r);
        bundle.putInt("MultiInstallActivity.current-install-index", this.f6397s);
        bundle.putInt("MultiInstallActivity.current-page-type", this.f6398t);
        this.f6402x.m13377a(bundle);
    }

    private final void m6220c(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = C7582R.string.install_approval_auto_update_disabled_yes;
                break;
            case 2:
                i2 = C7582R.string.install_approval_large_size_yes;
                break;
            case 3:
                i2 = C7582R.string.install_approval_permissions_yes;
                break;
            default:
                FinskyLog.m21669e("Invalid current page type: %d", Integer.valueOf(i));
                i2 = C7582R.string.install_approval_permissions_yes;
                break;
        }
        ((PlayActionButtonV2) this.f6393B).setText(getResources().getString(i2).toUpperCase());
        ((PlayActionButtonV2) this.f6394C).setText(getResources().getString(C7582R.string.install_approval_no).toUpperCase());
    }

    private final void m6219b(boolean z) {
        int i = 3;
        if (this.f6397s >= this.f6396r.size()) {
            finish();
            return;
        }
        InstallDetails installDetails = (InstallDetails) this.f6396r.get(this.f6397s);
        if (installDetails.f6389d) {
            this.f6398t = 1;
        } else if (installDetails.f6390e) {
            this.f6398t = 2;
        } else if (installDetails.f6391f) {
            this.f6398t = 3;
        } else {
            FinskyLog.m21669e("Failed to determine the next page type when updating %s.", installDetails.f6388c.f14885a.f12096c);
            finish();
            return;
        }
        int i2 = this.f6397s;
        m6220c(this.f6398t);
        installDetails = (InstallDetails) this.f6396r.get(i2);
        switch (this.f6398t) {
            case 1:
                i = 1;
                break;
            case 2:
                break;
            case 3:
                i = 2;
                break;
            default:
                FinskyLog.m21669e("Invalid current page type: %d", Integer.valueOf(this.f6398t));
                i = 2;
                break;
        }
        String str = installDetails.f6388c.f14885a.f12096c;
        String str2 = installDetails.f6388c.f14885a.f12100g;
        i2++;
        int size = this.f6396r.size();
        String[] strArr = installDetails.f6387b;
        Fragment eiVar = new ei();
        Bundle bundle = new Bundle();
        bundle.putString("InstallApprovalFragment.packageName", str);
        bundle.putString("InstallApprovalFragment.packageTitle", str2);
        bundle.putInt("InstallApprovalFragment.installNumber", i2);
        bundle.putInt("InstallApprovalFragment.totalInstalls", size);
        bundle.putInt("InstallApprovalFragment.approvalType", i);
        bundle.putStringArray("InstallApprovalFragment.permissions", strArr);
        eiVar.m600f(bundle);
        aw a = H_().mo284a();
        if (z) {
            a.mo323a((int) C7582R.anim.play_fade_in, (int) C7582R.anim.fade_out);
        } else {
            a.mo323a((int) C7582R.anim.slide_in_right, (int) C7582R.anim.slide_out_left);
        }
        if (this.f6404z != null) {
            a.mo327a(this.f6404z);
        }
        a.mo325a((int) C7582R.id.main_layout, eiVar);
        a.mo334c();
        this.f6404z = eiVar;
        this.f6393B.setEnabled(true);
        this.f6394C.setEnabled(true);
    }

    private final void m6217a(List list) {
        for (InstallDetails a : list) {
            m6216a(a);
        }
    }

    private final void m6216a(InstallDetails installDetails) {
        if (this.f6400v == 2) {
            C2887a a = az.m21336a();
            if (a != null) {
                a.mo4280a(installDetails.f6388c.f14885a.f12096c);
            }
        }
        Account b;
        C2196e a2;
        if (this.f6403y) {
            String str;
            String str2 = installDetails.f6388c.f14885a.f12096c;
            if (this.f6400v == 2) {
                CharSequence a3 = C1473m.f7980a.bt().m15626a(str2).m15620a(C1473m.f7980a.cZ());
                if (TextUtils.isEmpty(a3)) {
                    FinskyLog.m21659a("Cannot update %s because cannot determine update account.", str2);
                    return;
                }
                CharSequence charSequence = a3;
            } else {
                str = this.f6401w;
            }
            Document document = installDetails.f6388c;
            C2206c ah = C1473m.f7980a.ah();
            getApplicationContext();
            b = this.f6392A.mo1183b(str);
            a2 = ah.mo2811a(b);
            if (a2 == null) {
                FinskyLog.m21659a("Cannot perform install because cannot find library for %s.", FinskyLog.m21655a(str));
                return;
            } else if (C1473m.f7980a.mo2045Y().m11647a(document, a2)) {
                if (this.f6400v == 2) {
                    this.f6399u.mo3453g(str2);
                }
                this.f6399u.mo3439a(str2, document.bV());
                C2495w a4 = this.f6402x.m13375a(installDetails.f6386a);
                this.f6399u.mo3432a(str2, installDetails.f6388c.m14653h(), str, installDetails.f6388c.f14885a.f12100g, 3, document.m14671z(), a4);
                return;
            } else if (this.f6400v == 1) {
                ar.m10196a(b, document, null, true, false, this.f6402x);
                return;
            } else {
                return;
            }
        }
        String str3 = installDetails.f6388c.f14885a.f12096c;
        if (this.f6400v == 2) {
            charSequence = C1473m.f7980a.bt().m15626a(str3).m15620a(C1473m.f7980a.cZ());
            if (TextUtils.isEmpty(charSequence)) {
                FinskyLog.m21659a("Cannot update %s because cannot determine update account.", str3);
                return;
            }
            this.f6399u.mo3453g(str3);
            this.f6399u.mo3439a(str3, installDetails.f6388c.bV());
            a4 = this.f6402x.m13375a(installDetails.f6386a);
            this.f6399u.mo3432a(str3, installDetails.f6388c.m14653h(), charSequence, installDetails.f6388c.f14885a.f12100g, 3, installDetails.f6388c.m14671z(), a4);
            return;
        }
        ah = C1473m.f7980a.ah();
        getApplicationContext();
        b = this.f6392A.mo1183b(this.f6401w);
        a2 = ah.mo2811a(b);
        if (a2 == null) {
            FinskyLog.m21659a("Cannot perform install because cannot find library for %s.", FinskyLog.m21655a(this.f6401w));
            return;
        }
        Document document2 = installDetails.f6388c;
        if (C1473m.f7980a.mo2045Y().m11647a(document2, a2)) {
            this.f6399u.mo3439a(str3, document2.bV());
            this.f6399u.mo3432a(str3, installDetails.f6388c.m14653h(), this.f6401w, installDetails.f6388c.f14885a.f12100g, 3, document2.m14671z(), this.f6402x.m13375a(installDetails.f6386a));
            return;
        }
        ar.m10196a(b, document2, null, true, false, this.f6402x);
    }

    public void onClick(View view) {
        if (this.f6398t == 0) {
            FinskyLog.m21669e("Unexpected click for page type: %d", Integer.valueOf(0));
            return;
        }
        if (view == this.f6393B || view == this.f6394C) {
            this.f6393B.setEnabled(false);
            this.f6394C.setEnabled(false);
        }
        if (view == this.f6393B) {
            InstallDetails installDetails = (InstallDetails) this.f6396r.get(this.f6397s);
            switch (this.f6398t) {
                case 1:
                    installDetails.f6389d = false;
                    break;
                case 2:
                    installDetails.f6390e = false;
                    this.f6399u.mo3431a(installDetails.f6388c.f14885a.f12096c);
                    break;
                case 3:
                    installDetails.f6391f = false;
                    C1473m.f7980a.aV();
                    C2363d.m11989a(C1473m.f7980a.mo2169c(), installDetails.f6388c.f14885a.f12096c);
                    break;
            }
            if (installDetails.m6215a()) {
                m6216a(installDetails);
                this.f6397s++;
                m6219b(false);
                return;
            }
            m6219b(true);
        } else if (view == this.f6394C) {
            this.f6397s++;
            m6219b(false);
        }
    }
}
