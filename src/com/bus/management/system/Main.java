package com.bus.management.system;

import javax.swing.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //Declare variables to be used in the entire project.
        int MenuChooser;
        //attributes that will help when accepting input from the user.
        int OwId,OwnPhone,DrvId,DrvPhone;
        String OwName,OwnEmail,DrvName,DrvEmail,VRegNo,Vsacco,VeName,RouteName;
        //attributes that will be used to search in case 2.
        String searchTool;
        //Scanner....
        Scanner scanner= new Scanner(System.in);
        //create an object of database class.
        database database = null;


        do {
            // dispaly user Menu to the user.

            System.out.println("..............................................");
            System.out.println("\t\t\t......BUS MANAGEMENT SYSTEM.....\t\t\t");
            System.out.println("1. Record New Vehicle");
            System.out.println("2. Search Vehicle");
            System.out.println("3. View Registered Vehicles");
            System.out.println("4. Quit");
            System.out.println("...........................................");

            //prompt the user to select an option and scan it.
            System.out.println("Please make a choice above");
            MenuChooser = scanner.nextInt();

            //switch case
            switch (MenuChooser) {
                case 1: {
                    //this is the display form of the first case.
                    System.out.println("Thank You and please proceed to fill out the following form");
                    System.out.println("........Owner Information.......");
                    System.out.println("Enter Owner Identification Number");
                    OwId = scanner.nextInt();
                    System.out.println("Enter the Owner Phone");
                    OwnPhone = scanner.nextInt();
                    System.out.println("Enter Owners Name:");
                    OwName = scanner.next();
                    System.out.println("Enter Owner Email Address");
                    OwnEmail = scanner.next();

                    System.out.println("..........Driver Information.........");

                    System.out.println("Enter Driver's Name:");
                    DrvName = scanner.next();
                    System.out.println("Enter Driver's Identification Number");
                    DrvId = scanner.nextInt();
                    System.out.println("Enter the Driver's Phone");
                    DrvPhone = scanner.nextInt();
                    System.out.println("Enter the Driver's Email Address");
                    DrvEmail = scanner.next();

                    System.out.println("..........Vehicle Information.........");

                    System.out.println("Vehicle Name:");
                    VeName = scanner.next();
                    System.out.println("Enter Vehicle Registration  Number");
                    VRegNo = scanner.next();
                    System.out.println("Enter the Sacco Name");
                    Vsacco = scanner.next();
                    System.out.println("Vehicle Route");
                    RouteName = scanner.next();

                    database database1 = new database(OwId, OwnPhone, DrvId, DrvPhone, OwName, DrvName, VRegNo, OwnEmail, DrvEmail, VeName, RouteName, Vsacco);

                }break;
                case 2: {
                                        //here the user search for a vehicle based on the following parameters.
                    // Owner name, vehicle registration number or driver name.
                    System.out.println("........Search For Vehicle Information........");
                    System.out.println("==================================================");

                    System.out.println("Please Enter the Vehicle registration number, owner name, Vehicle name or Driver's Name below.");
                    searchTool = scanner.next();

                    //searching code.
                    if (searchTool == database.getOwnerName() || searchTool == database.getDriverName() || searchTool == database.getVehicleRegNo()) ;
                    {
                        System.out.println("The following are your search results");
                        System.out.println("Vehicle Reg\t \t\t\t\t\t\t\t ");
                        System.out.print("Vehicle Registration Number" +database.getVehicleRegNo());
                        System.out.println("Vehicle name" + database.getVehicleName());
                        System.out.println("Owner Name" + database.getOwnerName());
                        System.out.println("Owner Id"+ database.getOwnerId());
                        System.out.println("Owner Phone"+ database.getOwnerPhoneNo());
                        System.out.println("Drivers name"+ database.getDriverName());
                        System.out.println("Drivers Phone"+ database.getDriverPhoneNO());
                        System.out.println("Vehicle's Sacco"+ database.getSacoName());
                        System.out.println("Vehicle Route"+ database.getRouteName());


                    }

                        System.out.println("Oops! Sorry...");
                        System.out.println("Your values does not match with what we have on our database");

                }break;
                case 3:
                {
                    System.out.println("The following are your search results");
                    System.out.print("Vehicle Registration Number"+ database.getVehicleRegNo());
                    System.out.println("Vehicle name" + database.getVehicleName());
                    System.out.println("Owner Name" + database.getOwnerName());
                    System.out.println("Owner Id"+ database.getOwnerId());
                    System.out.println("Owner Phone"+ database.getOwnerPhoneNo());
                    System.out.println("Drivers name"+ database.getDriverName());
                    System.out.println("Drivers Phone"+ database.getDriverPhoneNO());
                    System.out.println("Vehicle's Sacco"+ database.getSacoName());
                    System.out.println("Vehicle Route"+ database.getRouteName());
                }
                break;
                case 4: {
                    System.exit(0);
                }
                break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println("Please try again");

            }

       }while (MenuChooser>4);

       }
    }



