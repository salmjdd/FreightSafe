package com.example.freightsafe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DriveLog {
    final double HOUR_CONSTANT = 3600000;
    private Date date = new Date();
    private Long clockedIn;
    private Long clockedOut;

    public DriveLog() {
        this.date = date;
        this.clockedIn = clockedIn;
        this.clockedOut = clockedOut;
    }

    public void clockIn() {
        this.setClockedIn(date.getTime());
    }

    public void clockOut() {
        this.setClockedOut(date.getTime());
    }

    public double hoursDriven() {
        Long timeDriven = this.getClockedOut() - this.getClockedIn();
        System.out.println(timeDriven);
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss");
        double time = timeDriven / HOUR_CONSTANT;
        return time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getClockedIn() {
        return clockedIn;
    }

    public void setClockedIn(Long clockedIn) {
        this.clockedIn = clockedIn;
    }

    public Long getClockedOut() {
        return clockedOut;
    }

    public void setClockedOut(Long clockedOut) {
        this.clockedOut = clockedOut;
    }
}
