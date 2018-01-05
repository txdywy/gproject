package android.support.v7.widget;

final class aa {
    public int f3074a;
    public int f3075b;
    public Object f3076c;
    public int f3077d;

    aa(int i, int i2, int i3, Object obj) {
        this.f3074a = i;
        this.f3075b = i2;
        this.f3077d = i3;
        this.f3076c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
        switch (this.f3074a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
            default:
                str = "??";
                break;
        }
        return append.append(str).append(",s:").append(this.f3075b).append("c:").append(this.f3077d).append(",p:").append(this.f3076c).append("]").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        if (this.f3074a != aaVar.f3074a) {
            return false;
        }
        if (this.f3074a == 8 && Math.abs(this.f3077d - this.f3075b) == 1 && this.f3077d == aaVar.f3075b && this.f3075b == aaVar.f3077d) {
            return true;
        }
        if (this.f3077d != aaVar.f3077d) {
            return false;
        }
        if (this.f3075b != aaVar.f3075b) {
            return false;
        }
        if (this.f3076c != null) {
            if (this.f3076c.equals(aaVar.f3076c)) {
                return true;
            }
            return false;
        } else if (aaVar.f3076c != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return (((this.f3074a * 31) + this.f3075b) * 31) + this.f3077d;
    }
}
