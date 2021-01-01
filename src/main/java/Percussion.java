public abstract class Percussion implements Instrument{
  private final String manufacturerName;
  private final boolean hasHiHat;

  public abstract static class Builder {

    private String manufacturerName;
    private boolean hasHiHat;

    public Builder() {
      manufacturerName="unknown";
      hasHiHat=false;
    }

    public Builder manufactureName(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }
    public Builder hasHiHat(boolean hasHiHat) {
      this.hasHiHat=hasHiHat;
      return this;
    }

    public abstract Percussion build();
  }

  public Percussion(Builder builder) {
    manufacturerName=builder.manufacturerName;
    hasHiHat=builder.hasHiHat;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public boolean hasHiHat() {
    return hasHiHat;
  }
}
