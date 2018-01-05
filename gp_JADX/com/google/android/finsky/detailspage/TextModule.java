package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityManager;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.utils.m;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public abstract class TextModule extends ck implements OnClickListener, ad, m {
    public ce f14155f;

    public class DetailsExtraCredits implements Parcelable {
        public static final Creator CREATOR = new gf();
        public String f14112a;
        public String f14113b;

        public DetailsExtraCredits(String str, String str2) {
            this.f14112a = str;
            this.f14113b = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14112a);
            parcel.writeString(this.f14113b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DetailsExtraCredits detailsExtraCredits = (DetailsExtraCredits) obj;
            String str = this.f14112a;
            String str2 = detailsExtraCredits.f14112a;
            boolean equals = str == null ? str2 == null : str.equals(str2);
            if (equals) {
                str = this.f14113b;
                str2 = detailsExtraCredits.f14113b;
                equals = str == null ? str2 == null : str.equals(str2);
                if (equals) {
                    return true;
                }
            }
            return false;
        }
    }

    public class DetailsExtraPrimary implements Parcelable {
        public static final Creator CREATOR = new gg();
        public String f14114a;
        public String f14115b;
        public String f14116c;
        public bd f14117d;
        public boolean f14118e;

        public DetailsExtraPrimary(String str, String str2, String str3, bd bdVar, boolean z) {
            this.f14114a = str;
            this.f14115b = str2;
            this.f14116c = str3;
            this.f14117d = bdVar;
            this.f14118e = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 0;
            parcel.writeString(this.f14114a);
            parcel.writeString(this.f14115b);
            parcel.writeString(this.f14116c);
            parcel.writeParcelable(ParcelableProto.m21671a(this.f14117d), 0);
            if (this.f14118e) {
                i2 = 1;
            }
            parcel.writeInt(i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DetailsExtraPrimary detailsExtraPrimary = (DetailsExtraPrimary) obj;
            String str = this.f14114a;
            String str2 = detailsExtraPrimary.f14114a;
            boolean equals = str == null ? str2 == null : str.equals(str2);
            if (equals) {
                str = this.f14115b;
                str2 = detailsExtraPrimary.f14115b;
                equals = str == null ? str2 == null : str.equals(str2);
                if (equals) {
                    str = this.f14116c;
                    str2 = detailsExtraPrimary.f14116c;
                    equals = str == null ? str2 == null : str.equals(str2);
                    if (equals) {
                        bd bdVar = this.f14117d;
                        bd bdVar2 = detailsExtraPrimary.f14117d;
                        equals = bdVar == null ? bdVar2 == null : bdVar.equals(bdVar2);
                        if (equals && this.f14118e == detailsExtraPrimary.f14118e) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public class DetailsExtraSecondary implements Parcelable {
        public static final Creator CREATOR = new gh();
        public String f14119a;
        public String f14120b;

        public DetailsExtraSecondary(String str, String str2) {
            this.f14119a = str;
            this.f14120b = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f14119a);
            parcel.writeString(this.f14120b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DetailsExtraSecondary detailsExtraSecondary = (DetailsExtraSecondary) obj;
            String str = this.f14119a;
            String str2 = detailsExtraSecondary.f14119a;
            boolean equals = str == null ? str2 == null : str.equals(str2);
            if (equals) {
                str = this.f14120b;
                str2 = detailsExtraSecondary.f14120b;
                equals = str == null ? str2 == null : str.equals(str2);
                if (equals) {
                    return true;
                }
            }
            return false;
        }
    }

    public class DetailsIconDescription implements Parcelable {
        public static final Creator CREATOR = new gi();
        public bd f14121a;
        public String f14122b;

        public DetailsIconDescription(bd bdVar, String str) {
            this.f14121a = bdVar;
            this.f14122b = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(ParcelableProto.m21671a(this.f14121a), 0);
            parcel.writeString(this.f14122b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DetailsIconDescription detailsIconDescription = (DetailsIconDescription) obj;
            bd bdVar = this.f14121a;
            bd bdVar2 = detailsIconDescription.f14121a;
            boolean equals = bdVar == null ? bdVar2 == null : bdVar.equals(bdVar2);
            if (equals) {
                String str = this.f14122b;
                String str2 = detailsIconDescription.f14122b;
                equals = str == null ? str2 == null : str.equals(str2);
                if (equals) {
                    return true;
                }
            }
            return false;
        }
    }

    public class ExpandedData implements Parcelable {
        public static final Creator CREATOR = new gj();
        public int f14123a;
        public String f14124b;
        public CharSequence f14125c;
        public int f14126d;
        public String f14127e;
        public CharSequence f14128f;
        public CharSequence f14129g;
        public CharSequence f14130h;
        public CharSequence f14131i;
        public boolean f14132j;
        public String f14133k;
        public List f14134l = new ArrayList();
        public List f14135m = new ArrayList();
        public List f14136n = new ArrayList();
        public String f14137o;

        public final void m13797a(DetailsExtraPrimary detailsExtraPrimary) {
            if (!this.f14135m.contains(detailsExtraPrimary)) {
                this.f14135m.add(detailsExtraPrimary);
            }
        }

        public final void m13798a(DetailsExtraSecondary detailsExtraSecondary) {
            if (!this.f14136n.contains(detailsExtraSecondary)) {
                this.f14136n.add(detailsExtraSecondary);
            }
        }

        public final boolean m13799a() {
            return ((TextUtils.isEmpty(this.f14125c) || this.f14125c.length() < HprofParser.ROOT_REFERENCE_CLEANUP) && TextUtils.isEmpty(this.f14128f) && TextUtils.isEmpty(this.f14129g) && TextUtils.isEmpty(this.f14131i) && TextUtils.isEmpty(this.f14133k) && ((this.f14134l == null || this.f14134l.isEmpty()) && ((this.f14135m == null || this.f14135m.isEmpty()) && ((this.f14136n == null || this.f14136n.isEmpty()) && TextUtils.isEmpty(this.f14137o))))) ? false : true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExpandedData expandedData = (ExpandedData) obj;
            if (this.f14123a != expandedData.f14123a) {
                return false;
            }
            if (this.f14126d != expandedData.f14126d) {
                return false;
            }
            if (this.f14132j != expandedData.f14132j) {
                return false;
            }
            if (this.f14124b == null ? expandedData.f14124b != null : !this.f14124b.equals(expandedData.f14124b)) {
                return false;
            }
            if (!TextUtils.equals(this.f14125c, expandedData.f14125c)) {
                return false;
            }
            if (this.f14127e == null ? expandedData.f14127e != null : !this.f14127e.equals(expandedData.f14127e)) {
                return false;
            }
            if (!TextUtils.equals(this.f14128f, expandedData.f14128f)) {
                return false;
            }
            if (!TextUtils.equals(this.f14129g, expandedData.f14129g)) {
                return false;
            }
            if (!TextUtils.equals(this.f14130h, expandedData.f14130h)) {
                return false;
            }
            if (!TextUtils.equals(this.f14131i, expandedData.f14131i)) {
                return false;
            }
            if (this.f14133k == null ? expandedData.f14133k != null : !this.f14133k.equals(expandedData.f14133k)) {
                return false;
            }
            if (this.f14134l == null ? expandedData.f14134l != null : !this.f14134l.equals(expandedData.f14134l)) {
                return false;
            }
            if (this.f14135m == null ? expandedData.f14135m != null : !this.f14135m.equals(expandedData.f14135m)) {
                return false;
            }
            if (this.f14136n == null ? expandedData.f14136n != null : !this.f14136n.equals(expandedData.f14136n)) {
                return false;
            }
            if (this.f14137o != null) {
                if (this.f14137o.equals(expandedData.f14137o)) {
                    return true;
                }
            } else if (expandedData.f14137o == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i = 0;
            int hashCode2 = ((this.f14124b != null ? this.f14124b.hashCode() : 0) + (this.f14123a * 31)) * 31;
            if (this.f14125c != null) {
                hashCode = this.f14125c.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (((hashCode + hashCode2) * 31) + this.f14126d) * 31;
            if (this.f14127e != null) {
                hashCode = this.f14127e.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14128f != null) {
                hashCode = this.f14128f.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14129g != null) {
                hashCode = this.f14129g.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14130h != null) {
                hashCode = this.f14130h.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14131i != null) {
                hashCode = this.f14131i.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14132j) {
                hashCode = 1;
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14133k != null) {
                hashCode = this.f14133k.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14134l != null) {
                hashCode = this.f14134l.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14135m != null) {
                hashCode = this.f14135m.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode2 = (hashCode + hashCode2) * 31;
            if (this.f14136n != null) {
                hashCode = this.f14136n.hashCode();
            } else {
                hashCode = 0;
            }
            hashCode = (hashCode + hashCode2) * 31;
            if (this.f14137o != null) {
                i = this.f14137o.hashCode();
            }
            return hashCode + i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 0;
            parcel.writeInt(this.f14123a);
            parcel.writeString(this.f14124b);
            TextUtils.writeToParcel(this.f14125c, parcel, 0);
            parcel.writeInt(this.f14126d);
            parcel.writeString(this.f14127e);
            TextUtils.writeToParcel(this.f14128f, parcel, 0);
            TextUtils.writeToParcel(this.f14129g, parcel, 0);
            TextUtils.writeToParcel(this.f14130h, parcel, 0);
            TextUtils.writeToParcel(this.f14131i, parcel, 0);
            if (this.f14132j) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f14133k);
            parcel.writeTypedList(this.f14134l);
            parcel.writeTypedList(this.f14135m);
            parcel.writeTypedList(this.f14136n);
            parcel.writeString(this.f14137o);
        }
    }

    protected abstract ge mo3026a(Document document, boolean z);

    protected abstract int mo3027b();

    protected ExpandedData mo3040a(Document document, boolean z, ge geVar) {
        if (!z) {
            return null;
        }
        ExpandedData expandedData = new ExpandedData();
        expandedData.f14123a = document.f14885a.f12099f;
        expandedData.f14124b = document.f14885a.f12100g;
        expandedData.f14125c = geVar.f14618c;
        expandedData.f14126d = geVar.f14619d;
        expandedData.f14127e = geVar.f14621f;
        expandedData.f14128f = geVar.f14622g;
        expandedData.f14129g = geVar.f14623h;
        expandedData.f14130h = this.t.getResources().getString(C7582R.string.details_whats_new).toUpperCase();
        expandedData.f14131i = geVar.f14624i;
        boolean z2 = (geVar.f14625j || TextUtils.isEmpty(geVar.f14624i)) ? false : true;
        expandedData.f14132j = z2;
        return expandedData;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.text_module;
    }

    public final boolean mo2979f() {
        if (this.b == null) {
            return false;
        }
        Object obj;
        ge geVar = (ge) this.b;
        if (TextUtils.isEmpty(geVar.f14618c) && TextUtils.isEmpty(geVar.f14621f) && TextUtils.isEmpty(geVar.f14622g) && TextUtils.isEmpty(geVar.f14623h) && ((TextUtils.isEmpty(geVar.f14624i) || geVar.f14625j) && geVar.f14626k == null && ((geVar.f14627l == null || geVar.f14627l.isEmpty()) && (geVar.f14628m == null || geVar.f14628m.isEmpty())))) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null || (((ge) this.b).f14630o != null && ((ge) this.b).f14630o.m13799a())) {
            return true;
        }
        return false;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = mo3026a(document, z);
        }
        if (this.b == null) {
            return;
        }
        if (((ge) this.b).f14630o == null || z) {
            ge geVar = (ge) this.b;
            this.b = mo3026a(document, z);
            ((ge) this.b).f14630o = mo3040a(document, z, (ge) this.b);
            if (mo2979f() && !geVar.equals(this.b)) {
                this.u.mo3033a(this, true);
            }
        }
    }

    public final void mo2976b(View view, int i) {
        boolean a;
        TextModuleLayout textModuleLayout = (TextModuleLayout) view;
        if (((ge) this.b).f14630o != null) {
            a = ((ge) this.b).f14630o.m13799a();
        } else {
            a = false;
        }
        int i2 = ((ge) this.b).f14616a;
        int i3 = ((ge) this.b).f14617b;
        CharSequence charSequence = ((ge) this.b).f14618c;
        int i4 = ((ge) this.b).f14619d;
        boolean z = ((ge) this.b).f14620e;
        CharSequence charSequence2 = ((ge) this.b).f14621f;
        CharSequence charSequence3 = ((ge) this.b).f14622g;
        CharSequence charSequence4 = ((ge) this.b).f14624i;
        boolean z2 = ((ge) this.b).f14625j;
        ac acVar = ((ge) this.b).f14626k;
        List list = ((ge) this.b).f14627l;
        Integer num = ((ge) this.b).f14629n;
        textModuleLayout.f14167l = a ? this : null;
        if (textModuleLayout.f14167l == null) {
            textModuleLayout.f14161f.setVisibility(8);
        } else {
            textModuleLayout.f14161f.setVisibility(0);
        }
        textModuleLayout.f14168m = this;
        Resources resources = textModuleLayout.getContext().getResources();
        ((gm) textModuleLayout.f14159d).mo3556a(list);
        textModuleLayout.f14170o = resources.getColor(C1608h.m9241a(i2));
        textModuleLayout.f14161f.setTextColor(textModuleLayout.f14170o);
        Object obj = i3 == 1 ? 1 : null;
        Object obj2 = !TextUtils.isEmpty(charSequence) ? 1 : null;
        if (obj2 != null) {
            textModuleLayout.f14156a.setVisibility(0);
            textModuleLayout.f14156a.setText(textModuleLayout.m13810a(charSequence));
            textModuleLayout.f14156a.setMaxLines(z ? textModuleLayout.f14162g : Integer.MAX_VALUE);
            textModuleLayout.f14156a.setGravity(i4);
        } else {
            textModuleLayout.f14156a.setVisibility(8);
        }
        textModuleLayout.f14157b.setVisibility(8);
        if (num != null) {
            textModuleLayout.setBackgroundColor(num.intValue());
        }
        if (!z2 && !TextUtils.isEmpty(charSequence4)) {
            textModuleLayout.f14158c.m13581a(textModuleLayout.f14165j, textModuleLayout.m13810a(charSequence4), textModuleLayout.f14162g);
            textModuleLayout.f14158c.m13580a(i2, textModuleLayout.f14164i, textModuleLayout.f14164i);
        } else if (obj == null || obj2 == null) {
            textModuleLayout.f14158c.m13581a(charSequence2, textModuleLayout.m13810a(charSequence3), textModuleLayout.f14162g);
            textModuleLayout.f14158c.m13578a();
            if (obj2 == null && TextUtils.isEmpty(charSequence2)) {
                textModuleLayout.f14157b.setVisibility(0);
            }
            if (num != null) {
                int color = resources.getColor(C1607g.m9240a(num.intValue()) ? C7582R.color.play_fg_primary : C7582R.color.play_white);
                textModuleLayout.f14158c.m13579a(num.intValue(), color);
                if (num.intValue() == resources.getColor(C7582R.color.play_white)) {
                    textModuleLayout.f14161f.setTextColor(textModuleLayout.f14170o);
                } else {
                    textModuleLayout.f14161f.setTextColor(color);
                }
            }
        } else {
            textModuleLayout.f14158c.setVisibility(8);
        }
        if (acVar != null) {
            textModuleLayout.f14160e.setText(acVar.f11756c);
            textModuleLayout.f14160e.setTextColor(textModuleLayout.f14163h);
            C1473m.f7980a.ch().m13622a(acVar, textModuleLayout.f14160e);
            textModuleLayout.f14160e.setVisibility(0);
        } else {
            textModuleLayout.f14160e.setVisibility(8);
        }
        OnClickListener gkVar = new gk(textModuleLayout);
        ((AccessibilityManager) textModuleLayout.getContext().getSystemService("accessibility")).isTouchExplorationEnabled();
        textModuleLayout.setOnClickListener(gkVar);
        textModuleLayout.f14156a.setOnClickListener(gkVar);
        textModuleLayout.f14158c.setBodyClickListener(gkVar);
        textModuleLayout.setVisibility(0);
        this.I.mo1219a(this);
    }

    public void onClick(View view) {
        if (((ge) this.b).f14630o != null) {
            this.J.m13379b(new C2475d(this.I).m13256a(2928));
            if (this.z.mo3700d()) {
                this.z.mo3630a(14, null, cd.m14024a(((ge) this.b).f14630o, this.v, this.J), false, new View[0]);
            }
        }
    }

    public final void m13803a(View view, String str) {
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        intent.setData(parse);
        intent.setPackage(context.getPackageName());
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            this.z.mo3635a(parse, null, this.J);
            return;
        }
        intent.setPackage(null);
        context.startActivity(intent);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14155f == null) {
            this.f14155f = C2482j.m13283a(mo3027b());
        }
        return this.f14155f;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
