package com.bus.management.system;

import javax.print.DocFlavor;

public class database {
    /**
     * this will be the class where all the backend will be done.
     */
    private int OwnerId,OwnerPhoneNo;
    private int DriverId,DriverPhoneNO;
    private String OwnerName,DriverName,VehicleRegNo;
    private String OwnerEmail,DriverEmail,VehicleName,RouteName,SacoName;

    public database(int OwnerId, int OwnerPhoneNo, int DriverId, int DriverPhoneNO, String OwnerName, String DriverName, String VehicleRegNo, String OwnerEmail, String DriverEmail, String VehicleName, String RouteName, String SacoName) {
        this.OwnerId=OwnerId;
        this.OwnerPhoneNo=OwnerPhoneNo;
        this.DriverId=DriverId;
        this.DriverPhoneNO=DriverPhoneNO;
        this.OwnerName=OwnerName;
        this.DriverName=DriverName;
        this.VehicleRegNo=VehicleRegNo;
        this.OwnerEmail=OwnerEmail;
        this.DriverEmail=DriverEmail;
        this.VehicleName=VehicleName;
        this.RouteName=RouteName;
        this.SacoName=SacoName;

    }



    /**
     * The following code is used to return values stored in the above variables.
     * @return
     */
    public int getOwnerId() {
        return OwnerId;
    }

    public int getOwnerPhoneNo() {
        return OwnerPhoneNo;
    }

    public int getDriverId() {
        return DriverId;
    }

    public int getDriverPhoneNO() {
        return DriverPhoneNO;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getDriverName() {
        return DriverName;
    }

    public String getVehicleRegNo() {
        return VehicleRegNo;
    }

    public String getOwnerEmail() {
        return OwnerEmail;
    }

    public String getDriverEmail() {
        return DriverEmail;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public String getRouteName() {
        return RouteName;
    }

    public String getSacoName() {
        return SacoName;
    }
    //the end of the getter code.

}
