
public class ComputationFactory {
	public Computation getComputation(String computationType)
	{
		if(computationType == null)
			return null;
		if(computationType.equalsIgnoreCase("ADD"))
			return new Add();
		else if(computationType.equalsIgnoreCase("SUBTRACT"))
			return new Subtract();
		else if(computationType.equalsIgnoreCase("MULTIPLY"))
			return new Multiply();
		else if(computationType.equalsIgnoreCase("DIVIDE"))
			return new Divide();
		return null;
	}
}
