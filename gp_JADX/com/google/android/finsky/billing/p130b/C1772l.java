package com.google.android.finsky.billing.p130b;

import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.play.dfe.api.DfeResponseVerifier.DfeResponseVerifierException;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.l;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.ag;
import com.google.wireless.android.finsky.dfe.c.a.ds;

final class C1772l implements C0660x {
    public boolean f9172a;
    public final /* synthetic */ C1769i f9173b;

    C1772l(C1769i c1769i) {
        this.f9173b = c1769i;
    }

    public final /* synthetic */ void b_(Object obj) {
        ae aeVar = (ae) obj;
        if (!this.f9172a) {
            try {
                C1769i c1769i = this.f9173b;
                String str = c1769i.f9155n.v;
                if (c1769i.f9143b == null) {
                    if (!str.isEmpty()) {
                        throw new DfeResponseVerifierException("Unexpected nonce with no verifier.");
                    }
                } else if (str.isEmpty()) {
                    throw new DfeResponseVerifierException("Unexpected verifier with no nonce.");
                } else {
                    ag agVar = aeVar.d;
                    if (agVar != null) {
                        if (agVar.b.length > 0) {
                            throw new DfeResponseVerifierException("Unexpected unsigned library updates.");
                        }
                        byte[] bArr = agVar.g;
                        if (bArr.length != 0) {
                            if (((agVar.a & 4) != 0 ? 1 : null) == null) {
                                throw new DfeResponseVerifierException("Missing expected library updates signature.");
                            }
                            c1769i.f9143b.mo1550a(bArr, agVar.h);
                            C0757i dsVar = new ds();
                            C0757i.m4905a(dsVar, bArr);
                            agVar.b = dsVar.a;
                            agVar.g = l.l;
                            agVar.a &= -3;
                            agVar.h = "";
                            agVar.a &= -5;
                        }
                    }
                }
                this.f9173b.m9715a(aeVar);
            } catch (InvalidProtocolBufferNanoException e) {
                throw new DfeResponseVerifierException("Failed to deserialize LibraryUpdates.");
            } catch (Throwable e2) {
                this.f9173b.m9714a(new VolleyError(e2));
            }
            this.f9173b.f9153l.release();
        }
    }
}
