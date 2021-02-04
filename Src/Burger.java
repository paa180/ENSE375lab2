public class Burger {

 double bun, ciabatta, englishMuffin, patty, feta, cheddar, mozzarella, cheeseCurds;
 double egg, mayo, mustard, sourCream, sriracha, arugula, blackGarlic, chives, iceBurg;
 double pickle, spinach,redOnion, ritzCrackers, tomato, fries, gravy;

    void changeBun(double newValue) {
         bun = newValue;
    }

    void changeCiabatta(double newValue) {
         ciabatta = newValue;
    }
     void changeEnglishMuffin(double newValue) {
         englishMuffin = newValue;
    }

    void changePatty(double newValue) {
         patty = newValue;
    }
    void changeFeta(double newValue) {
         feta = newValue;
    }

    void changeCheddar(double newValue) {
         cheddar = newValue;
    }
     void changeMozzarella(double newValue) {
         mozzarella = newValue;
    }

    void changeCheeseCurds(double newValue) {
         cheeseCurds = newValue;
    }
     void changeEgg(double newValue) {
         egg = newValue;
    }

    void changeMayo(double newValue) {
         mayo = newValue;
    }
     void changeMustard(double newValue) {
         mustard = newValue;
    }

    void changeSourCream(double newValue) {
         sourCream= newValue;
    }
    void changeSriracha(double newValue) {
         sriracha= newValue;
    }

    void changeArugula(double newValue) {
         arugula = newValue;
    }
     void changeBlackGarlic(double newValue) {
         blackGarlic = newValue;
    }

    void changeChives(double newValue) {
         chives = newValue;
    }
     void changeIceBurg(double newValue) {
         iceBurg= newValue;
    }

    void changePickle(double newValue) {
         pickle = newValue;
    }
     void changeSpinach(double newValue) {
         spinach = newValue;
    }

    void changeRedOnion(double newValue) {
         redOnion = newValue;
    }
    void changeRitzCrackers(double newValue) {
         ritzCrackers = newValue;
    }

    void changeTomato(double newValue) {
         tomato = newValue;
    }
     void changeFries(double newValue) {
         fries = newValue;
    }

    void changeGravy(double newValue) {
         gravy = newValue;
    }

    void totalBurger() {
         System.out.println(bun + ciabatta + englishMuffin + patty + feta + cheddar +
         mozzarella + cheeseCurds + egg + mayo + mustard + sourCream + sriracha + arugula +
         blackGarlic + chives + iceBurg + pickle + spinach + redOnion + ritzCrackers + tomato + fries + gravy);
    }
    void neverBeenFeta() {
         System.out.println( ciabatta + patty + feta + mayo + mustard + arugula + fries);      
    }
    void eggersCannotBeCheesers(){
        System.out.println(englishMuffin + patty + cheddar + egg + iceBurg + fries);
   }

   void poutineOnTheRizt(){
        System.out.println(bun + patty + iceBurg + tomato + redOnion + ritzCrackers + fries + gravy + cheeseCurds);
   }
   void babyYouCanChiveMyCar(){
        System.out.println( bun + patty + feta + mustard + sourCream + chives + pickle + fries);
   }
   void betItAllOnBlackGarlic(){
       System.out.println(bun + patty + mozzarella + mayo + sriracha + blackGarlic + spinach + fries);
   }
   void myBurg1(){
       System.out.println(bun + patty + mozzarella + blackGarlic + tomato + gravy + cheeseCurds + iceBurg);
   }

   void myBurg2(){
       System.out.println(englishMuffin + feta + egg + arugula + fries);
   }
   void myBurg3(){
       System.out.println(spinach + blackGarlic + mustard + cheddar + ciabatta + gravy);
   }
   
}
