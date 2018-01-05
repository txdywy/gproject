package com.google.android.gms.internal;

final class uz implements vc {
    public int f27547a = 0;

    uz() {
    }

    public final int mo4929a(boolean z, int i, boolean z2, int i2) {
        this.f27547a = (this.f27547a * 53) + i;
        return i;
    }

    public final ud mo4930a(boolean z, ud udVar, boolean z2, ud udVar2) {
        this.f27547a = (this.f27547a * 53) + udVar.hashCode();
        return udVar;
    }

    public final vf mo4931a(vf vfVar, vf vfVar2) {
        this.f27547a = (this.f27547a * 53) + vfVar.hashCode();
        return vfVar;
    }

    public final vk mo4932a(vk vkVar, vk vkVar2) {
        int i;
        if (vkVar == null) {
            i = 37;
        } else if (vkVar instanceof uu) {
            Object obj = (uu) vkVar;
            if (obj.g == 0) {
                int i2 = this.f27547a;
                this.f27547a = 0;
                obj.mo4849a(vb.f27552b, (Object) this, obj);
                obj.f27255h = mo4933a(obj.f27255h, obj.f27255h);
                obj.g = this.f27547a;
                this.f27547a = i2;
            }
            i = obj.g;
        } else {
            i = vkVar.hashCode();
        }
        this.f27547a = i + (this.f27547a * 53);
        return vkVar;
    }

    public final wb mo4933a(wb wbVar, wb wbVar2) {
        this.f27547a = (this.f27547a * 53) + wbVar.hashCode();
        return wbVar;
    }

    public final String mo4934a(boolean z, String str, boolean z2, String str2) {
        this.f27547a = (this.f27547a * 53) + str.hashCode();
        return str;
    }
}
