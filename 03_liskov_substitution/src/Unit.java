abstract sealed class Unit permits Apartment, Studio{
    int numberOfBedrooms;
    int squareFootage;

    abstract void setSquareFootage(int sqft);
}
