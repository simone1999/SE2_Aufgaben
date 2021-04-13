package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public interface MitarbeiterVisitor {
	
	void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
	void visit(LohnEmpfaenger lohnEmpfaenger);

}
