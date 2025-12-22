package com.Nurzhan.grocerystore;

public class Workers {
    private int WorkerID;
    private String name;
    private double hourlyWage;
    private double hoursWorked;

    public Workers(int WorkerID, String name, double hourlyWage) {
        this.WorkerID = WorkerID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = 0.0;
    }

    public int getWorkerID() { return WorkerID; }
    public String getName() { return name; }
    public double getHourlyWage() { return hourlyWage; }
    public double getHoursWorked() { return hoursWorked; }

    public void setWorkerID(int workerID) { this.WorkerID = workerID; }
    public void setName(String name) { this.name = name; }
    public void setHourlyWage(double hourlyWage) { this.hourlyWage = hourlyWage; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    public void logHours(double hours) {
        if (hours > 0) {
            this.hoursWorked += hours;
            System.out.println(name + " worked for " + hours + " hours.");
        } else {
            System.out.println("Invalid hours entered.");
        }
    }

    public double calculatePaycheck() {
        return this.hoursWorked * this.hourlyWage;
    }

    @Override
    public String toString() {
        return "Worker [ID: " + WorkerID + ", Name: " + name +
                ", Wage: $" + hourlyWage + "/hr, Hours: " + hoursWorked + "]";
    }
}
