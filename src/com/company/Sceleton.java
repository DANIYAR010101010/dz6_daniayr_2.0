package com.company;


public class Sceleton extends Boss{

    private int Strely;



    public Sceleton(int health,int damage,int Strely){
        super(health, damage);
        this.Strely=Strely;
        this.setHealth(900);
        this.setDamage(150);
        this.setStrely(15);
    }

    public void print_info(){

        System.out.println("Health: "+this.getHealth()+"; "+"Damage: "+this.getDamage());
    }

    public int getStrely() {
        return Strely;
    }

    public void setStrely(int strely) {
        Strely = strely;
    }
}

