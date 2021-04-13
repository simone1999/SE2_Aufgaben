package de.main;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;
import de.mitarbeiter.events.MitarbeiterChangedEvent;
import de.mitarbeiter.events.MitarbeiterChangedListener;
import de.mitarbeiter.vistors.PrintVisitor;
import de.mitarbeiter.vistors.StatistikVisitor;

/**
 * Events - 13.04.2021 - TINF18IT2 SE2
 * Maurice Gaster
 * Marvin Kohlmann
 * Simon Klein
 * Luca Steinke
 *
 */

public class Main {

	public static void main(String[] args) {

		Firma firma = new Firma();
		firma.addMitarbeiterChangedListener(new Maske());
		firma.add(new GehaltsEmpfaenger("Schmidt"));
		firma.add(new GehaltsEmpfaenger("Mayer"));
		firma.add(new LohnEmpfaenger("Hinz"));
		firma.add(new LohnEmpfaenger("Kunz"));
		firma.add(new GehaltsEmpfaenger("Schulz"));
		GehaltsEmpfaenger mitarbeiterZumFeuern = new GehaltsEmpfaenger("Giesenkemper");
		firma.add(mitarbeiterZumFeuern);
		firma.remove(mitarbeiterZumFeuern);

		//firma.print();
		firma.iterate(new PrintVisitor());
		StatistikVisitor firmaStatistik = new StatistikVisitor();
		firma.iterate(firmaStatistik);
		firmaStatistik.print();
	}

	static class Maske implements MitarbeiterChangedListener {

		@Override
		public void propertyChanged(MitarbeiterChangedEvent event) {
			System.out.println(event);
		}
	}

}
