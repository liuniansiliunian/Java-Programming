package Week9;

public class TV {

        int channel = 1;
        int volumelevel = 1;
        boolean on = false;

        public TV(){

        }

        public void turnon(){
            on = true;
        }
        public void turnoff(){
            on = false;
        }
        public void setChannel(int newchannel){
            if(on && newchannel >= 1&& newchannel<= 120)
                channel = newchannel;
        }

        public void setVolume(int newvolume){
            if(on && newvolume >= 1&& newvolume <= 7)
                volumelevel = newvolume;
        }

        public void channelUp(){
            if(on&& channel >= 1&& channel <= 120)
                channel++;
        }

    public void channelDown(){
        if(on&& channel >= 1&& channel <= 120)
            channel--;
        }

        public void volumeUp(){
            if(on &&volumelevel<8)
                volumelevel++;
        }
        public void volumeDown(){
            if(on &&volumelevel>1)
                volumelevel--;
        }
    }

     class TestTV{
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnon();
        tv1.setChannel(1);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnon();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println(tv1.channel+tv1.volumelevel);
        System.out.println(tv2.channel+tv2.volumelevel);


    }
    }


