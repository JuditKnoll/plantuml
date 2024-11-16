package nonreg.simple;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import nonreg.BasicTest;

/*

Test diagram MUST be put between triple quotes

source: UML2.5.1 Figure 14.9. Composite State with Regions
https://forum.plantuml.net/13394/statechart-leaving-parallel-transition-within-parallel-region?show=13394#q13394

"""
@startuml
[*] --> Studying


state Passed {

}

state Failed {

}

Studying -> Passed

state Studying {
  [*] --> Lab1
  Lab1 --> Lab2 : lab_done
  Lab2 --> [*] : lab_done
  --
  [*] --> Term_Project
  Term_Project --> [*] : project_done
  --
  [*] --> Final_Test
  Final_Test --> Failed : fail
  Final_Test --> [*] : pass
}

@enduml
"""

 */
public class StateMachineConcurrentFix_Test extends BasicTest {

	@Test
	void testSimple() throws IOException {
		String expectedDescription = "(11 entities)";
		// just checking the generation for now, not the images being identical
		runPlantUML(expectedDescription);
		// checkImage(expectedDescription);
	}
}
