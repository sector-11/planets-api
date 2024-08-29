package com.northcoders.planetsapi.model;

import java.util.List;

public class Planet {
    private String name;
    private float distanceFromSun;
    private String planetType;
    private long size;
    private int yearLengthDays;
    private double orbitalCircumference;
    private List<Moon> moons;

    public Planet(String name, float distanceFromSun, String planetType, long size, int yearLengthDays, double orbitalCircumference, List<Moon> moons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.planetType = planetType;
        this.size = size;
        this.yearLengthDays = yearLengthDays;
        this.orbitalCircumference = orbitalCircumference;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(float distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String getPlanetType() {
        return planetType;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getYearLengthDays() {
        return yearLengthDays;
    }

    public void setYearLengthDays(int yearLengthDays) {
        this.yearLengthDays = yearLengthDays;
    }

    public double getOrbitalCircumference() {
        return orbitalCircumference;
    }

    public void setOrbitalCircumference(double orbitalCircumference) {
        this.orbitalCircumference = orbitalCircumference;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(List<Moon> moons) {
        this.moons = moons;
    }
}