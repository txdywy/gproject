package com.google.android.wallet.instrumentmanager.p386b.p387a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.google.a.a.a.a.b.a.a.c.a.d;
import com.google.a.a.a.a.b.a.a.c.a.e;
import com.google.a.a.a.a.b.a.a.c.b.a.ac;
import com.google.a.a.a.a.b.a.a.c.b.a.ad;
import com.google.a.a.a.a.b.a.a.c.b.a.ae;
import com.google.a.a.a.a.b.a.a.c.b.a.o;
import com.google.a.a.a.a.b.a.a.c.b.a.p;
import com.google.a.a.a.a.b.a.a.c.b.a.q;
import com.google.a.a.a.a.b.a.a.c.b.a.r;
import com.google.a.a.a.a.b.a.a.c.b.a.s;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.a.a.a.a.b.a.a.c.b.a.y;
import com.google.a.a.a.a.b.a.a.c.b.a.z;
import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.a.f.j;
import com.google.a.a.a.a.b.a.a.f.n;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.instrumentmanager.ui.p390a.C6650a;
import com.google.android.wallet.instrumentmanager.ui.p391b.C6657a;
import com.google.android.wallet.instrumentmanager.ui.p394d.C6671a;
import com.google.android.wallet.instrumentmanager.ui.p396e.C6673a;
import com.google.android.wallet.instrumentmanager.ui.redirect.C6676a;
import com.google.android.wallet.instrumentmanager.ui.redirect.C6679b;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.card.C6652j;
import com.google.android.wallet.ui.card.C6750p;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.br;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.p393e.C6670a;
import com.google.android.wallet.ui.p397d.C6675a;
import com.google.android.wallet.ui.p399a.C6709a;
import com.google.p443h.p447b.p448a.p449a.p450a.C7150b;
import com.google.p443h.p451c.p457c.p460b.p467d.C7180d;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.Locale;

public final class C6630a {
    public static au m30007a(d dVar, int i, String str, LogContext logContext, byte[] bArr) {
        i iVar;
        if (dVar.a != null) {
            iVar = dVar.a;
            Fragment c6657a = new C6657a();
            c6657a.f(au.m29850a(i, iVar, logContext));
            return c6657a;
        } else if (dVar.f != null) {
            iVar = dVar.f;
            r0 = new C6650a();
            r0.f(au.m29850a(i, iVar, logContext));
            return r0;
        } else if (dVar.c != null) {
            iVar = dVar.c;
            r0 = new C6673a();
            r0.f(au.m29850a(i, iVar, logContext));
            return r0;
        } else if (dVar.b != null) {
            iVar = dVar.b;
            r0 = new C6709a();
            r0.f(au.m29850a(i, iVar, logContext));
            return r0;
        } else if (dVar.d != null) {
            return C6671a.m30226a(dVar.d, i, logContext);
        } else {
            if (dVar.g != null) {
                iVar = dVar.g;
                r0 = new C6676a();
                Bundle a = au.m29850a(i, iVar, logContext);
                a.putString("title", str);
                a.putByteArray("logToken", bArr);
                r0.f(a);
                return r0;
            }
            throw new IllegalArgumentException("Instrument form did not contain a recognized subform.");
        }
    }

    public static e m30006a(ai aiVar, Bundle bundle) {
        e eVar = new e();
        if (aiVar instanceof C6657a) {
            C6657a c6657a = (C6657a) aiVar;
            String cardNumber = c6657a.an.getCardNumber();
            String a = C6600l.m29944a(c6657a.ar.getText().toString());
            String substring = cardNumber.substring(Math.max(0, cardNumber.length() - 4));
            x cardType = c6657a.an.getCardType();
            z zVar = new z();
            zVar.a = ((y) c6657a.aD).a.a;
            zVar.e = c6657a.aq.getMonth();
            zVar.f = c6657a.aq.getYear();
            if (cardType != null) {
                zVar.j = cardType.e;
            }
            zVar.h = substring;
            zVar.c = cardNumber;
            zVar.d = a;
            zVar.g = c6657a.ay.al();
            if (c6657a.f32857d != null) {
                zVar.k = c6657a.f32857d.g;
            }
            if (!c6657a.f32861h.isEmpty()) {
                zVar.i = (ac[]) c6657a.f32861h.toArray(new ac[c6657a.f32861h.size()]);
            }
            eVar.a = -1;
            eVar.a = 0;
            eVar.b = zVar;
        } else if (aiVar instanceof C6650a) {
            q qVar;
            C6650a c6650a = (C6650a) aiVar;
            q qVar2 = new q();
            qVar2.a = ((p) c6650a.aD).a.a;
            qVar2.b = ((p) c6650a.aD).a.c;
            if (!c6650a.aB.isEmpty()) {
                qVar2.e = (ac[]) c6650a.aB.toArray(new ac[c6650a.aB.size()]);
            }
            qVar2.c = c6650a.f32840e.getCardNumber();
            if (c6650a.am == null) {
                qVar = qVar2;
            } else {
                qVar2.f = c6650a.am.d;
                C6652j c6652j = c6650a.ah;
                int length = c6652j.ao.j.length;
                s[] sVarArr = new s[length];
                for (int i = 0; i < length; i++) {
                    int i2 = c6652j.ao.j[i];
                    r rVar = ((p) c6652j.aD).c[i2];
                    s sVar = new s();
                    sVar.b = rVar.b.a;
                    sVar.c = rVar.b.c;
                    ArrayList arrayList = (ArrayList) c6652j.an.get(i2);
                    int length2 = rVar.d.length;
                    sVar.d = new o[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        C6750p c6750p = (C6750p) arrayList.get(i3);
                        o oVar = new o();
                        switch (c6750p.f33286a) {
                            case 1:
                                at a2 = cp.m30901a((View) c6652j.f32848d.get(c6750p.f33287b), rVar.d[i3].c());
                                if (a2 != null) {
                                    oVar.a = -1;
                                    oVar.a = 0;
                                    oVar.c = a2;
                                    break;
                                }
                                if (oVar.a == 0) {
                                    oVar.a = -1;
                                }
                                oVar.c = null;
                                break;
                            case 2:
                                j a3 = ((br) c6652j.f32850f.get(c6750p.f33287b)).m30194a(bundle);
                                if (a3 != null) {
                                    oVar.a = -1;
                                    oVar.a = 2;
                                    oVar.e = a3;
                                    break;
                                }
                                if (oVar.a == 2) {
                                    oVar.a = -1;
                                }
                                oVar.e = null;
                                break;
                            case 4:
                                c al = ((C6711b) c6652j.f32849e.get(c6750p.f33287b)).al();
                                if (al != null) {
                                    oVar.a = -1;
                                    oVar.a = 1;
                                    oVar.d = al;
                                    break;
                                }
                                if (oVar.a == 1) {
                                    oVar.a = -1;
                                }
                                oVar.d = null;
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type " + c6750p.f33286a + " in SimpleForm.");
                        }
                        sVar.d[i3] = oVar;
                    }
                    if (rVar.g != null) {
                        sVar.e = rVar.g.g;
                    }
                    sVarArr[i] = sVar;
                }
                qVar2.d = sVarArr;
                qVar = qVar2;
            }
            eVar.a = -1;
            eVar.a = 5;
            eVar.g = qVar;
        } else if (aiVar instanceof C6673a) {
            com.google.a.a.a.a.b.a.a.c.b.a.ai ac = ((C6673a) aiVar).ac();
            if (ac == null) {
                if (eVar.a == 2) {
                    eVar.a = -1;
                }
                eVar.d = null;
            } else {
                eVar.a = -1;
                eVar.a = 2;
                eVar.d = ac;
            }
        } else if (aiVar instanceof C6709a) {
            C6709a c6709a = (C6709a) aiVar;
            ae aeVar = new ae();
            if (((ad) c6709a.aD).a != null) {
                aeVar.a = ((ad) c6709a.aD).a.a;
                aeVar.b = ((ad) c6709a.aD).a.c;
            }
            if (((ad) c6709a.aD).j != null) {
                aeVar.c = ((ad) c6709a.aD).j.g;
            }
            eVar.a = -1;
            eVar.a = 1;
            eVar.c = aeVar;
        } else if (aiVar instanceof C6670a) {
            com.google.a.a.a.a.b.a.a.f.q a4 = ((C6670a) aiVar).m30218a(bundle);
            if (a4 == null) {
                if (eVar.a == 4) {
                    eVar.a = -1;
                }
                eVar.f = null;
            } else {
                eVar.a = -1;
                eVar.a = 4;
                eVar.f = a4;
            }
        } else if (aiVar instanceof C6679b) {
            eVar.a(((C6679b) aiVar).ac());
        } else if (aiVar instanceof C6675a) {
            eVar.a(((C6675a) aiVar).ah);
        } else {
            throw new IllegalArgumentException(String.format("The provided form %s is not a recognized instrument form.", new Object[]{aiVar}));
        }
        return eVar;
    }

    public static void m30008a(d dVar, C7150b[] c7150bArr, C7180d[] c7180dArr) {
        if (c7150bArr.length != c7180dArr.length) {
            throw new IllegalArgumentException(String.format("Lengths of SecureData (%d) and SecureDataMapping (%d) do not match.", new Object[]{Integer.valueOf(c7150bArr.length), Integer.valueOf(c7180dArr.length)}));
        }
        int i;
        int size;
        ArrayList arrayList = new ArrayList(c7150bArr.length);
        for (C7150b c7150b : c7150bArr) {
            for (C7180d c7180d : c7180dArr) {
                if (c7150b.f34924b == c7180d.f35028b) {
                    arrayList.add(new C6631b(c7180d.f35029c, c7150b.f34925c));
                    break;
                }
            }
        }
        if (arrayList.size() != c7150bArr.length) {
            throw new IllegalArgumentException("SecureData and SecureDataMapping are mismatched.");
        }
        size = arrayList.size();
        for (i = 0; i < size; i++) {
            C6631b c6631b = (C6631b) arrayList.get(i);
            if (dVar.g == null || !c6631b.f32802a.b.equals(dVar.g.a.a)) {
                throw new IllegalArgumentException(String.format("Unsupported SecureData FormFieldReference formId=%s fieldId=%d.", new Object[]{c6631b.f32802a.b, Integer.valueOf(c6631b.f32802a.c)}));
            }
            switch (c6631b.f32802a.c) {
                case 1:
                    dVar.g.b = c6631b.f32803b;
                    break;
                case 2:
                    dVar.g.c = c6631b.f32803b;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported SecureData fieldId: %d.", new Object[]{Integer.valueOf(c6631b.f32802a.c)}));
            }
        }
    }

    public static C7150b[] m30009a(e eVar, C7180d[] c7180dArr) {
        int length = c7180dArr.length;
        C7150b[] c7150bArr = new C7150b[length];
        int i = 0;
        while (i < length) {
            C7180d c7180d = c7180dArr[i];
            if (eVar.a() != null && c7180d.f35029c.b.equals(eVar.a().a) && c7180d.f35029c.c == 1) {
                n nVar;
                at atVar;
                String str;
                com.google.a.a.a.a.b.a.a.f.r rVar = eVar.a().c[c7180d.f35029c.d];
                if (rVar.a == 1) {
                    nVar = rVar.d;
                } else {
                    nVar = null;
                }
                if (nVar.a == 0) {
                    atVar = nVar.c;
                } else {
                    atVar = null;
                }
                if (TextUtils.isEmpty(atVar.d())) {
                    if (atVar.a == 0) {
                        str = atVar.d;
                    } else {
                        str = "";
                    }
                    atVar.a("");
                } else {
                    str = atVar.d();
                    atVar.b("");
                }
                c7150bArr[i] = new C7150b();
                c7150bArr[i].f34924b = c7180d.f35028b;
                c7150bArr[i].f34925c = str;
                i++;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported SecureDataMapping FormFieldReference formId=%s fieldId=%d repeatedFieldIndex=%d", new Object[]{c7180d.f35029c.b, Integer.valueOf(c7180d.f35029c.c), Integer.valueOf(c7180d.f35029c.d)}));
            }
        }
        return c7150bArr;
    }
}
