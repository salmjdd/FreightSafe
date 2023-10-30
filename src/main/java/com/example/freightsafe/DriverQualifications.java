package com.example.freightsafe;

public interface DriverQualifications {
    public boolean checkHours();
    public boolean checkCredentials();
    public boolean checkAge();

    //Check:
       /*
              I feel like these methods should be in a controller
              class or smth. Unless we're storing an instance of drivers,
              it doesnt make sense to add/remove a driver to a driver obhject.
        */
       /*public void addDriver(Driver d);
       public Driver removeDriver();*/



}