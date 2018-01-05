package p046b.p047a;

import java.io.IOException;
import java.io.ObjectOutput;

final class C0521c implements ai, aj, an, ao, C0520y {
    public final ObjectOutput f3696a;
    public IOException f3697b;

    C0521c(ObjectOutput objectOutput) {
        this.f3696a = objectOutput;
    }

    public final boolean mo939a(long j) {
        try {
            this.f3696a.writeLong(j);
            return true;
        } catch (IOException e) {
            this.f3697b = e;
            return false;
        }
    }

    public final boolean execute(Object obj) {
        try {
            this.f3696a.writeObject(obj);
            return true;
        } catch (IOException e) {
            this.f3697b = e;
            return false;
        }
    }

    public final boolean mo947a(Object obj, Object obj2) {
        try {
            this.f3696a.writeObject(obj);
            this.f3696a.writeObject(obj2);
            return true;
        } catch (IOException e) {
            this.f3697b = e;
            return false;
        }
    }

    public final boolean mo946a(int i, Object obj) {
        try {
            this.f3696a.writeInt(i);
            this.f3696a.writeObject(obj);
            return true;
        } catch (IOException e) {
            this.f3697b = e;
            return false;
        }
    }

    public final boolean mo940a(long j, Object obj) {
        try {
            this.f3696a.writeLong(j);
            this.f3696a.writeObject(obj);
            return true;
        } catch (IOException e) {
            this.f3697b = e;
            return false;
        }
    }
}
