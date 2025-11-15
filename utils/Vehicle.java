package utils;

public class Vehicle
{
  private String vehicleType;
  private int vehicleAge;
  private double vehicleMiles;

  public Vehicle(String vType, int vAge, double vMiles)
  {
    vehicleType = vType;
    vehicleAge = vAge;
    vehicleMiles = vMiles;
  }

  public String getType()
  {
    return vehicleType;
  }

  public int getAge()
  {
    return vehicleAge;
  }

  public double getMiles()
  {
    return vehicleMiles;
  }

  public double estimateMilesPerYear()
  {
    return vehicleMiles / vehicleAge;
  }
}