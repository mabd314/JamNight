package instrument;

public abstract class AbstractInstrument implements Instrument {

  private final String manufacturerName;

  public AbstractInstrument(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  @Override
  public String toString() {
    return "-manufacturer: " + manufacturerName;
  }

}
