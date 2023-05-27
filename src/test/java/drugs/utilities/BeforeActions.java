package drugs.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
@Before
public void beforeactions(Scenario scen){
	System.out.println("--->>>>Initializing Driver....");
	SetupDrivers.setupDriver();
	System.out.println("Test scenario Name : "+ scen.getName());
	
}
}
