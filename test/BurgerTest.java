import org.junit.Test; 

public class BurgerTest{

  Burger burg1 = new Burger();

  @Test
   void neverBeenFeta(){  
       assertEquals(2.58, burg1.neverBeenFeta() ); 
   }     

 @Test
    void eggersCannotBeCheesers() {  
       assertEquals(2.52, burg1.eggersCannotBeCheesers() );   
    }  
 @Test
  void poutineOnTheRizt() {  
       assertEquals(4.35, burg1.poutineOnTheRizt() );    
  }  

 @Test
     void babyYouCanChiveMyCar() {  
       assertEquals(2.19, burg1.babyYouCanChiveMyCar() );     
}  
@Test
   void betItAllOnBlackGarlic() {  
       assertEquals(2.53,  burg1.betItAllOnBlackGarlic() );     
   } 

 @Test
    void myBurg1()  {  
       assertEquals(4.24, burg1.myBurg1() );   
    }  
 @Test
  void myBurg2(){  
       assertEquals(1.7, burg1.myBurg2() );  
  }    

 @Test
     void myBurg3(){  
       assertEquals(1.48, burg1.myBurg3());     
}   
}   