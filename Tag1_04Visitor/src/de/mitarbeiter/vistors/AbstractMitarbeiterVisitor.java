package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{


	@Override
	public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
		// Ok

	}

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		// Ok

	}

}
