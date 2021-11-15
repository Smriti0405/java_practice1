public class Room {
    boolean fan;
    boolean ac;
    boolean home_theatre;
    boolean light;
    Room(boolean fan, boolean ac, boolean home_theatre, boolean light){
        this.home_theatre = home_theatre;
        this.ac = ac;
        this.fan = fan;
        this.light = light;
    }
    public void On_off() {
        int acO;
        int home_theatreO;
        int lightO;
        int fanO;
        if(fan == true && ac == true && light == true && home_theatre == true) {
             acO = 1200;
             home_theatreO = 600;
            lightO = 100;
            fanO = 400;
        }
        else{
            fanO = 0;
            home_theatreO = 0;
            lightO = 0;
            acO = 0;
        }
        int power = (fanO + home_theatreO + lightO + acO);
        if(power > 2000)
            System.out.println("Overload");
        else
            System.out.println("OK");

    }
        public static void main(String[] args){
        Room obj = new Room(true, true, true, true);
        obj.On_off();
        }

}

