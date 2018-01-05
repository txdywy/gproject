package com.google.android.gms.peerdownloadmanager.comms.rpc;

import com.google.android.gms.peerdownloadmanager.comms.rpc.p299a.C5439c;

final class C5442a extends ab {
    public final C5439c f28139a;
    public final C5439c f28140b;
    public final boolean f28141c;

    C5442a(C5439c c5439c, C5439c c5439c2, boolean z) {
        if (c5439c == null) {
            throw new NullPointerException("Null egressStats");
        }
        this.f28139a = c5439c;
        if (c5439c2 == null) {
            throw new NullPointerException("Null ingressStats");
        }
        this.f28140b = c5439c2;
        this.f28141c = z;
    }

    final C5439c mo5010a() {
        return this.f28139a;
    }

    final C5439c mo5011b() {
        return this.f28140b;
    }

    final boolean mo5012c() {
        return this.f28141c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f28139a);
        String valueOf2 = String.valueOf(this.f28140b);
        return new StringBuilder((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length()).append("StreamResult{egressStats=").append(valueOf).append(", ingressStats=").append(valueOf2).append(", appFinished=").append(this.f28141c).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (this.f28139a.equals(abVar.mo5010a()) && this.f28140b.equals(abVar.mo5011b()) && this.f28141c == abVar.mo5012c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28141c ? 1231 : 1237) ^ ((((this.f28139a.hashCode() ^ 1000003) * 1000003) ^ this.f28140b.hashCode()) * 1000003);
    }
}
