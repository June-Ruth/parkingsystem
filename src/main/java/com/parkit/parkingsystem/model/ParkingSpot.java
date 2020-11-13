package com.parkit.parkingsystem.model;

import com.parkit.parkingsystem.constants.ParkingType;

/**
 * ParkingSpot details.
 */
public class ParkingSpot {
    /**
     * Number ID of the parking spot.
     */
    private int number;
    /**
     * Type of the parking spot.
     */
    private ParkingType parkingType;
    /**
     * Availability of the parking spot.
     */
    private boolean isAvailable;

    /**
     * Constructor.
     * @param pNumber : spot ID
     * @param pParkingType of spot
     * @param pIsAvailable of spot
     */
    public ParkingSpot(final int pNumber, final ParkingType pParkingType,
                       final boolean pIsAvailable) {
        this.number = pNumber;
        this.parkingType = pParkingType;
        this.isAvailable = pIsAvailable;
    }

    /**
     * Getter ID.
     * @return number
     */
    public int getId() {
        return number;
    }

    /**
     * Setter ID.
     * @param pNumber : ID of spot
     */
    public void setId(final int pNumber) {
        this.number = pNumber;
    }

    /**
     * Getter parking type.
     * @return parking type
     */
    public ParkingType getParkingType() {
        return parkingType;
    }

    /**
     * Setter parking type.
     * @param pParkingType bike, car...
     */
    public void setParkingType(final ParkingType pParkingType) {
        this.parkingType = pParkingType;
    }

    /**
     * Getter availability.
     * @return availability.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Setter availability.
     * @param pAvailable or not
     */
    public void setAvailable(final boolean pAvailable) {
        isAvailable = pAvailable;
    }

    /**
     * Check equality of Parking Spot by ID.
     * @param o Parking spot
     * @return ID
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParkingSpot that = (ParkingSpot) o;
        return number == that.number;
    }

    /**
     * Define Hash with ID.
     * @return ID
     */
    @Override
    public int hashCode() {
        return number;
    }
}
