package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public interface IPackageDataObserver extends IInterface {

    public abstract class Stub extends C0022b implements IPackageDataObserver {
        public static final String DESCRIPTOR = "android.content.pm.IPackageDataObserver";
        public static final int TRANSACTION_onRemoveCompleted = 1;

        public class Proxy extends C0021a implements IPackageDataObserver {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public void onRemoveCompleted(String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                C0883c.m5516a(obtainAndWriteInterfaceToken, z);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPackageDataObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IPackageDataObserver) {
                return (IPackageDataObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
                return true;
            }
            if (i != 1) {
                return false;
            }
            onRemoveCompleted(parcel.readString(), C0883c.m5517a(parcel));
            return true;
        }
    }

    void onRemoveCompleted(String str, boolean z);
}
