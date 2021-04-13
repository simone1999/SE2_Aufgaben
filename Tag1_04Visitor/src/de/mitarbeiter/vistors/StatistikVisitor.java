package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor {

    private int GehaltsEmpfaenger = 0;
    private int LohnEmpfaenger = 0;

    @Override
    public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
        this.GehaltsEmpfaenger++;

    }

    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) {
        this.LohnEmpfaenger++;

    }

    public void print(){
        System.out.println("GehaltsEmpafenger: " + this.GehaltsEmpfaenger);
        System.out.println("LohnEmpfaenger: " + this.LohnEmpfaenger);
        System.out.println("Gesamt Mitarbeiter: " + (this.LohnEmpfaenger + this.GehaltsEmpfaenger));
    }

}
