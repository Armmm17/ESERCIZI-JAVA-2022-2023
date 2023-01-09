

public class FungoFurioso {
    private String name = "Fungo Furioso";
    private int healthPoints;
    private String ability;
    private int abilityValue;
    private int damage;
    private int protection;

    public FungoFurioso(int healthPoints, String ability , int abilityValue, int damage, int protection){
        this.healthPoints = healthPoints;
        this.ability = ability;

        this.abilityValue = abilityValue;
        if (this.abilityValue > 15){
            this.abilityValue = 15;
        }

        this.damage = damage;

        this.protection = protection;
        if (this.protection > 100){
            this.protection = 100;
        }
    }

    public void setHealthPoints(int hp){
        this.healthPoints = hp;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setProtection(int protection){
        this.protection = protection;
    }

    public String stampa(){
        String str;
        str = "Name: " + this.name + "\nHealthpoints: " + this.healthPoints + "\nAbility: " + this.ability + "\nAbility value: " + this.abilityValue + "\nDamage: " + this.damage + "\nProtection: " + this.protection;
        return str;
    }

    public boolean isDead(){
        boolean morto = true;
        if(this.healthPoints>0){
            morto = false;
        }
        return morto;
    }

    public int attack(){
        double dannoInflitto=0;
        dannoInflitto=this.damage*Math.random();
        return (int)dannoInflitto;
    }

    public void takeDamage(int damageTaken){
        this.protection -= damageTaken;
        if(this.protection < 0 ){
            this.healthPoints += this.protection;
            this.protection = 0;
        }
    }
    public void activateAbility(String target, int targetHealthPoints, int targetDamage, int targetProtection){
        if(isDead() == false){
            targetDamage -= this.abilityValue;
            targetProtection -= this.abilityValue;
            targetHealthPoints -= this.abilityValue;
        }
    }
}
