package org.symbaroum.api.admin.model;

public class Character {

    private String player;
    private String name;
    private Race race;
    private String occupation;

    private Attribute accurate = new Attribute();
    private Attribute cunning = new Attribute();
    private Attribute discreet = new Attribute();
    private Attribute persuasive = new Attribute();
    private Attribute quick = new Attribute();
    private Attribute resolute = new Attribute();
    private Attribute strong = new Attribute();
    private Attribute vigilant = new Attribute();

    private int toughness = this.strong.getValue();
    private final int maxToughness = this.strong.getValue();
    private int painThreshold = (this.toughness + 1) / 2; // round up integer division
    private int temporaryCurruption = 0;
    private int permanentCurruption = 0;
    private int curruptionThreshold = (this.resolute.getValue() + 1) / 2;
}
