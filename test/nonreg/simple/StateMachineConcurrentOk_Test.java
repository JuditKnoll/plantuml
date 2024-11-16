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
  Final_Test --> [*] : pass
}

@enduml
"""

 */
public class StateMachineConcurrentOk_Test extends BasicTest {

	@Test
	void testSimple() throws IOException {
		checkImage("(11 entities)");
	}

}
