package com.bartram.People;

public abstract class CrewMember extends Person{
    // can also be abstract

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
