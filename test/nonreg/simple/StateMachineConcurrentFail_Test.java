package nonreg.simple;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import nonreg.BasicTest;

/*

Test diagram MUST be put between triple quotes

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
  Final_Test --> Term_Project : ok
  Final_Test --> [*] : pass
}

@enduml
"""

 */
public class StateMachineConcurrentFail_Test extends BasicTest {

	@Test
	void testSimple() throws IOException {
		checkImageContains("(Error)");
		// The image generation fails as expected, but the generated output is nondeterministic
	}
}
