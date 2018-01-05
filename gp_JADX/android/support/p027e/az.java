package android.support.p027e;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class az extends an {
    public ArrayList f1075a = new ArrayList();
    public boolean f1076b = true;
    public int f1077c;
    public boolean f1078d = false;

    public final az m889a(int i) {
        switch (i) {
            case 0:
                this.f1076b = true;
                break;
            case 1:
                this.f1076b = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    public final az m890a(an anVar) {
        this.f1075a.add(anVar);
        anVar.f1031E = this;
        if (this.p >= 0) {
            anVar.mo204a(this.p);
        }
        return this;
    }

    public final an m895b(int i) {
        if (i < 0 || i >= this.f1075a.size()) {
            return null;
        }
        return (an) this.f1075a.get(i);
    }

    public final an mo207a(String str, boolean z) {
        for (int i = 0; i < this.f1075a.size(); i++) {
            ((an) this.f1075a.get(i)).mo207a(str, z);
        }
        return super.mo207a(str, z);
    }

    protected final void mo211a(ViewGroup viewGroup, bd bdVar, bd bdVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f1046o;
        int size = this.f1075a.size();
        int i = 0;
        while (i < size) {
            an anVar = (an) this.f1075a.get(i);
            if (j > 0 && (this.f1076b || i == 0)) {
                long j2 = anVar.f1046o;
                if (j2 > 0) {
                    anVar.mo212b(j2 + j);
                } else {
                    anVar.mo212b(j);
                }
            }
            anVar.mo211a(viewGroup, bdVar, bdVar2, arrayList, arrayList2);
            i++;
        }
    }

    protected final void mo216b() {
        if (this.f1075a.isEmpty()) {
            m861c();
            m863d();
            return;
        }
        at bbVar = new bb(this);
        ArrayList arrayList = this.f1075a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((an) obj).mo206a(bbVar);
        }
        this.f1077c = this.f1075a.size();
        if (this.f1076b) {
            arrayList = this.f1075a;
            int size2 = arrayList.size();
            i = 0;
            while (i < size2) {
                obj = arrayList.get(i);
                i++;
                ((an) obj).mo216b();
            }
            return;
        }
        for (i = 1; i < this.f1075a.size(); i++) {
            ((an) this.f1075a.get(i - 1)).mo206a(new ba((an) this.f1075a.get(i)));
        }
        an anVar = (an) this.f1075a.get(0);
        if (anVar != null) {
            anVar.mo216b();
        }
    }

    public final void mo210a(bc bcVar) {
        if (m850a(bcVar.f1082b)) {
            ArrayList arrayList = this.f1075a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                an anVar = (an) obj;
                if (anVar.m850a(bcVar.f1082b)) {
                    anVar.mo210a(bcVar);
                    bcVar.f1083c.add(anVar);
                }
            }
        }
    }

    public final void mo217b(bc bcVar) {
        if (m850a(bcVar.f1082b)) {
            ArrayList arrayList = this.f1075a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                an anVar = (an) obj;
                if (anVar.m850a(bcVar.f1082b)) {
                    anVar.mo217b(bcVar);
                    bcVar.f1083c.add(anVar);
                }
            }
        }
    }

    final void mo220c(bc bcVar) {
        super.mo220c(bcVar);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo220c(bcVar);
        }
    }

    public final void mo222d(View view) {
        super.mo222d(view);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo222d(view);
        }
    }

    public final void mo224e(View view) {
        super.mo224e(view);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo224e(view);
        }
    }

    final void mo218b(boolean z) {
        super.mo218b(z);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo218b(z);
        }
    }

    public final void mo209a(as asVar) {
        super.mo209a(asVar);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo209a(asVar);
        }
    }

    final String mo208a(String str) {
        String a = super.mo208a(str);
        int i = 0;
        while (i < this.f1075a.size()) {
            String str2 = a + "\n" + ((an) this.f1075a.get(i)).mo208a(str + "  ");
            i++;
            a = str2;
        }
        return a;
    }

    public final an mo223e() {
        az azVar = (az) super.mo223e();
        azVar.f1075a = new ArrayList();
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            azVar.m890a((an) ((an) this.f1075a.get(i)).clone());
        }
        return azVar;
    }

    final /* synthetic */ an mo215b(ViewGroup viewGroup) {
        super.mo215b(viewGroup);
        int size = this.f1075a.size();
        for (int i = 0; i < size; i++) {
            ((an) this.f1075a.get(i)).mo215b(viewGroup);
        }
        return this;
    }

    public final /* synthetic */ an mo213b(at atVar) {
        return (az) super.mo213b(atVar);
    }

    public final /* synthetic */ an mo206a(at atVar) {
        return (az) super.mo206a(atVar);
    }

    public final /* synthetic */ an mo219c(View view) {
        for (int i = 0; i < this.f1075a.size(); i++) {
            ((an) this.f1075a.get(i)).mo219c(view);
        }
        return (az) super.mo219c(view);
    }

    public final /* synthetic */ an mo214b(View view) {
        for (int i = 0; i < this.f1075a.size(); i++) {
            ((an) this.f1075a.get(i)).mo214b(view);
        }
        return (az) super.mo214b(view);
    }

    public final /* synthetic */ an mo205a(TimeInterpolator timeInterpolator) {
        return (az) super.mo205a(timeInterpolator);
    }

    public final /* synthetic */ an mo212b(long j) {
        return (az) super.mo212b(j);
    }

    public final /* synthetic */ an mo204a(long j) {
        super.mo204a(j);
        if (this.p >= 0) {
            int size = this.f1075a.size();
            for (int i = 0; i < size; i++) {
                ((an) this.f1075a.get(i)).mo204a(j);
            }
        }
        return this;
    }

    public /* synthetic */ Object clone() {
        return mo223e();
    }
}
