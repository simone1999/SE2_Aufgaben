package de.mitarbeiter.events;

public class MitarbeiterChangedEvent {

    private final Object source;
    private final String propertyName;

    public MitarbeiterChangedEvent(Object source, String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }

    public Object getSource() {
        return source;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Anzahl geaendert [source=");
        builder.append(source);
        builder.append(", propertyName=");
        builder.append(propertyName);
        builder.append("]");
        return builder.toString();
    }




}
