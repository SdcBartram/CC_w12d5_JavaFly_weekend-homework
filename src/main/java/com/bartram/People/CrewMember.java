package com.bartram.People;

public class CrewMember extends Person{

    private Rank rank;

    public CrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
