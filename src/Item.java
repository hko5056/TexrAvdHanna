public class Item {
    protected String name;
    protected String desc;
    protected int value;

    //protected int damage;

    //constructor method
    public Item(String name, String desc, int value) {
        this.name = name;
        this.desc = desc;
        this.value = value;

    }
    public void setName(String Name){
        this.name = Name;

    }
    public String getName() {
        return name;
    }

    static class Gold extends Item {
        private int amt;
        public Gold(int amt) {
            super("Gold", String.format("Big Gold Bar! %d", amt), amt);
            this.value = amt;
        }
    }


    static class Weapon extends Item {
        private int damage; //protect the data/control Weapon can only access damage

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public void setName(String Name) {
            this.name = Name;
        }
        public Weapon(String name, String desc, int value, int damage) {
            super(name, desc, value);
            this.damage = damage;

        }

        static class Mace extends Weapon {
            public Mace() {
                super("Mace", "A mace is slightly more dangerous than a Sword", 10, 15);
            }
        }
        static class Sword extends Weapon {
            public Sword(){
                super("Sword", "Silver handmade lethal object that can cause death",10, 15);
            } //super goes the Weapon class
        }//this is the end of Sword class
        static class Pillow extends Weapon {

            public Pillow() {
                super("Pillow","A pillow is extremely soft", 1,1 );
            }

        }//This ends the Pillow class
        static class Arrow extends Weapon {
            public Arrow(){
                super("Arrow", "The Arrow is less dangerous than a Sword", 9, 20);
            }
        }//this is end of Arrow class
    }
    public class Enemy{
        protected String name;
        protected int hp;
        protected int damage;
        public Enemy(String name, int hp, int damage) {
            this.name = name;
            this.hp = hp;
            this.damage = damage;
        }
        }
    }
