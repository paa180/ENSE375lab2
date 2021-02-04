class BurgerMain {
    public static void main(String[] args) {

        Burger burg1 = new Burger();
        burg1.changeBun(0.50);
        burg1.changeCiabatta(0.70);
        burg1.changeEnglishMuffin(0.70);
        burg1.changePatty(1.00);
        burg1.changeFeta(0.25);
        burg1.changeCheddar(0.20);
        burg1.changeMozzarella(0.20);
        burg1.changeCheeseCurds(2.00);
        burg1.changeEgg(0.20);
        burg1.changeMayo(0.05);
        burg1.changeMustard(0.03);
        burg1.changeSourCream(0.03);
        burg1.changeSriracha(0.03);
        burg1.changeArugula(0.25);
        burg1.changeBlackGarlic(0.25);
        burg1.changeChives(0.05);
        burg1.changeIceBurg(0.12);
        burg1.changePickle(0.03);
        burg1.changeSpinach(0.20);
        burg1.changeRedOnion(0.01);
        burg1.changeRitzCrackers(0.25);
        burg1.changeTomato(0.07);
        burg1.changeFries(0.30);
        burg1.changeGravy(0.10);
        System.out.print(" Total cost for all include ingredients is $");
        burg1.totalBurger();  
        System.out.print(" neverBeenFeta burger cost $");
        burg1.neverBeenFeta();
        System.out.print(" eggersCannotBeCheesers burger cost $");
        burg1.eggersCannotBeCheesers();
        System.out.print(" poutineOnTheRizt burger cost $");
        burg1.poutineOnTheRizt();
        System.out.print("babyYouCanChiveMyCar burger cost $");
        burg1.babyYouCanChiveMyCar();
        System.out.print(" betItAllOnBlackGarlic burger cost $");
        burg1.betItAllOnBlackGarlic();
        System.out.print(" myBurg1 cost $");
        burg1.myBurg1();
        System.out.print(" myBurg2 cost $");
        burg1.myBurg2();
        System.out.print(" myBurg3 cost $");
        burg1.myBurg3();

        if (false){
            System.out.println("please input value");
        }
    }
}