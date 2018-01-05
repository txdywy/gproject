package android.support.p027e;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class bc {
    public final Map f1081a = new HashMap();
    public View f1082b;
    public final ArrayList f1083c = new ArrayList();

    public final boolean equals(Object obj) {
        if ((obj instanceof bc) && this.f1082b == ((bc) obj).f1082b && this.f1081a.equals(((bc) obj).f1081a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1082b.hashCode() * 31) + this.f1081a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1082b + "\n") + "    values:";
        String str2 = str;
        for (String str3 : this.f1081a.keySet()) {
            str2 = str2 + "    " + str3 + ": " + this.f1081a.get(str3) + "\n";
        }
        return str2;
    }
}
