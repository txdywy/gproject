package com.google.android.finsky.billing.b;

import com.android.volley.VolleyError;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.dfe.api.DfeResponseVerifier$DfeResponseVerifierException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.ag;
import com.google.wireless.android.finsky.dfe.c.a.ds;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.b.l implements com.android.volley.x
{

    public boolean a;
    public final com.google.android.finsky.billing.b.i b;

    l(com.google.android.finsky.billing.b.i p0) {
        this.b = p0;
    }

    public final void b_(Object p0) {
  4:    if (this.a != 0)
 48:        return;
 14:    if (this.b.b != 0) goto 49;
 20:    if (!this.b.n.v.isEmpty())
 29:        throw new DfeResponseVerifier$DfeResponseVerifierException("Unexpected nonce with no verifier.");
 21:    goto 143;
 38:    this.b.a(new VolleyError(ex));
 45:    this.b.l.release();
 48:    return;
 53:    if (this.b.n.v.isEmpty())
 62:        throw new DfeResponseVerifier$DfeResponseVerifierException("Unexpected verifier with no nonce.");
 63:    v2 = ((com.google.wireless.android.finsky.dfe.c.a.ae)p0).d;
 65:    if (v2 == 0) goto 143;
 70:    if (v2.b.length > 0)
 79:        throw new DfeResponseVerifier$DfeResponseVerifierException("Unexpected unsigned library updates.");
 83:    if (v2.g.length == 0) goto 143;
 89:    if (v2.a & 4)
 91:        v0 = 1;
        else
102:        v0 = 0;
 92:    if (v0 == 0)
101:        throw new DfeResponseVerifier$DfeResponseVerifierException("Missing expected library updates signature.");
108:    this.b.b.a(v2.g, v2.h);
113:    v0 = new com.google.wireless.android.finsky.dfe.c.a.ds();
116:    try {
116:        com.google.protobuf.nano.i.a(v0, v2.g);
        }
        catch (InvalidProtocolBufferNanoException ex) {
157:        throw new DfeResponseVerifier$DfeResponseVerifierException("Failed to deserialize LibraryUpdates.");
        }
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
 38:        this.b.a(new VolleyError(ex));
 45:        this.b.l.release();
 48:        return;
        }
121:    v2.b = v0.a;
125:    v2.g = com.google.protobuf.nano.l.l;
131:    v2.a = v2.a & -3;
135:    v2.h = "";
141:    v2.a = v2.a & -5;
145:    this.b.a((com.google.wireless.android.finsky.dfe.c.a.ae)p0);
148:    goto 41;
158:    try
            run 119...158
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
119:        goto 30;
        }
160:    try
            run 49...116
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
 49:        goto 30;
        }
161:    try
            run 6...30
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
  6:        goto 30;
        }
    }

}
