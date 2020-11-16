package Share2Go;

import java.nio.file.Paths;

public abstract class Parking {
    private boolean full;
}

class ConventionatedPark extends Parking{
    private int parks;
}

class RoadPark extends Parking{

}