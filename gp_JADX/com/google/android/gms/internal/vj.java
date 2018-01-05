package com.google.android.gms.internal;

public class vj {
    public volatile vk f27562a;
    public volatile ud f27563b;

    static {
        uq.m25756a();
    }

    private final ud m25789a() {
        if (this.f27563b != null) {
            return this.f27563b;
        }
        synchronized (this) {
            if (this.f27563b != null) {
                ud udVar = this.f27563b;
                return udVar;
            }
            if (this.f27562a == null) {
                this.f27563b = ud.f27511a;
            } else {
                this.f27563b = this.f27562a.mo4845e();
            }
            udVar = this.f27563b;
            return udVar;
        }
    }

    private final vk m25790a(vk vkVar) {
        if (this.f27562a == null) {
            synchronized (this) {
                if (this.f27562a != null) {
                } else {
                    try {
                        this.f27562a = vkVar;
                        this.f27563b = ud.f27511a;
                    } catch (zzfxb e) {
                        this.f27562a = vkVar;
                        this.f27563b = ud.f27511a;
                    }
                }
            }
        }
        return this.f27562a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        vk vkVar = this.f27562a;
        vk vkVar2 = vjVar.f27562a;
        return (vkVar == null && vkVar2 == null) ? m25789a().equals(vjVar.m25789a()) : (vkVar == null || vkVar2 == null) ? vkVar != null ? vkVar.equals(vjVar.m25790a(vkVar.mo4848h())) : m25790a(vkVar2.mo4848h()).equals(vkVar2) : vkVar.equals(vkVar2);
    }

    public int hashCode() {
        return 1;
    }
}
