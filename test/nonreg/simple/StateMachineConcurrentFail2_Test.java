package nonreg.simple;

import nonreg.BasicTest;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/*

Test diagram MUST be put between triple quotes

"""
@startuml
[*] --> Studying


state Passed {

}

state Failed {

}

state Studying {
  [*] --> Lab1
  Lab1 --> Lab2 : lab_done
  Lab2 --> [*] : lab_done
  --
  [*] --> Term_Project
  Term_Project --> Lab2 : lab
  Term_Project --> [*] : project_done
  --
  [*] --> Final_Test
  Final_Test --> [*] : pass
}

Studying -> Passed

@enduml
"""

 */
public class StateMachineConcurrentFail2_Test extends BasicTest {

	@Test
	void testSimple() throws IOException {
		checkImageContains("(Error)");
		// The image generation fails as expected, but the generated output is nondeterministic
	}
}
