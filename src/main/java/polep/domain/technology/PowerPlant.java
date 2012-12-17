package polep.domain.technology;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class PowerPlant {

        // @Indexed
    private String nameTechnology;
    private double capacity;
    private double efficiency; 
    private double marginalCost;
    
    @RelatedTo(type = "USES_FUEL", elementClass = Fuel.class, direction = Direction.OUTGOING)
    public Fuel fuel;
    
   
    public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public String getName() {
        return nameTechnology;
    }

    public void setName(String name) {
        this.nameTechnology = name;
    }

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	public double getMarginalCost() {
		return marginalCost;
	}
	
	public void setMarginalCost(double marginalCost){
		this.marginalCost = marginalCost;
	} 

}
