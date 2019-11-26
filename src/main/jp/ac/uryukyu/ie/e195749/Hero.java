package jp.ac.uryukyu.ie.e195749;

public class Hero extends LivingThing{

    Hero(String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        getName();
    }


}