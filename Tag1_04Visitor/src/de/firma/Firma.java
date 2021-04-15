package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.events.MitarbeiterChangedEvent;
import de.mitarbeiter.events.MitarbeiterChangedListener;
import de.mitarbeiter.vistors.MitarbeiterVisitor;

public class Firma {
	
	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	private List<MitarbeiterChangedListener> mitarbeiterChangedListeners = new ArrayList<>();

	private void fireMitarbeiterChangedEvent(MitarbeiterChangedEvent event) {
		for (MitarbeiterChangedListener listener : mitarbeiterChangedListeners) {
			listener.propertyChanged(event);
		}
	}

	public void addMitarbeiterChangedListener(MitarbeiterChangedListener mitarbeiterChangedListener) {
		mitarbeiterChangedListeners.add(mitarbeiterChangedListener);
	}

	public void removeMitarbeiterChangedListener(MitarbeiterChangedListener mitarbeiterChangedListener) {
		mitarbeiterChangedListeners.remove(mitarbeiterChangedListener);
	}

	public boolean add(AbstractMitarbeiter mitarbeiter) {
		MitarbeiterChangedEvent event = new MitarbeiterChangedEvent(this, "add");
		boolean eventSuccessful = mitarbeiters.add(mitarbeiter);
		fireMitarbeiterChangedEvent(event);
		return eventSuccessful;
	}

	public boolean remove(AbstractMitarbeiter mitarbeiter) {
		MitarbeiterChangedEvent event = new MitarbeiterChangedEvent(this, "remove");
		boolean eventSuccessful = mitarbeiters.remove(mitarbeiter);
		fireMitarbeiterChangedEvent(event);
		return eventSuccessful;
	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			mitarbeiter.accept(visitor);
		}
	}

}
