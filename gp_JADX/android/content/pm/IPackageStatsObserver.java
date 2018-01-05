package android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public interface IPackageStatsObserver extends IInterface {

    public abstract class Stub extends C0022b implements IPackageStatsObserver {
        public static final String DESCRIPTOR = "android.content.pm.IPackageStatsObserver";
        public static final int TRANSACTION_onGetStatsCompleted = 1;

        public class Proxy extends C0021a implements IPackageStatsObserver {
            Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) packageStats);
                C0883c.m5516a(obtainAndWriteInterfaceToken, z);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPackageStatsObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IPackageStatsObserver) {
                return (IPackageStatsObserver) queryLocalInterface;
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
            onGetStatsCompleted((PackageStats) C0883c.m5513a(parcel, PackageStats.CREATOR), C0883c.m5517a(parcel));
            return true;
        }
    }

    void onGetStatsCompleted(PackageStats packageStats, boolean z);
}
