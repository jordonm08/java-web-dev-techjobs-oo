package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;

    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        if (this.employer.getValue().equals("") && this.name.equals("")
                && this.location.getValue().equals("") && this.positionType.getValue().equals("")
                && this.coreCompetency.getValue().equals("")) {
            return "OOPS! This job does not seem to exist.";
        }
        String nameValue = this.name;
        String employerValue = this.getEmployer().toString();
        String locationValue = this.getLocation().toString();
        String positionTypeValue = this.getPositionType().toString();
        String coreCompetencyValue = this.getCoreCompetency().toString();

        if (this.employer.getValue().equals("")) {
            employerValue = "Data not available";
        }
        if (this.name.equals("")) {
            nameValue = "Data not available";
        }
        if (this.location.getValue().equals("")) {
            locationValue = "Data not available";
        }
        if (this.positionType.getValue().equals("")) {
            positionTypeValue = "Data not available";
        }
        if (this.coreCompetency.getValue().equals("")) {
            coreCompetencyValue = "Data not available";
        }

        return "\nID: " + this.id+ "\nName: " + nameValue + "\nEmployer: "
                + employerValue + "\nLocation: " + locationValue
                + "\nPosition Type: " + positionTypeValue
                + "\nCore Competency: " + coreCompetencyValue + "\n";
    }
}
