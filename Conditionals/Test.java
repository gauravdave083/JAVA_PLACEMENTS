public class Test{
     public static void main(String [] args){
          boolean isSunny = true;
          boolean isWarm = true;

          if(isSunny && isWarm){
               System.out.println("Beach Day");
          } else if(isSunny){
               System.out.println("wear jacket and then go to beach");
          }else {
               System.out.println("Stay home");
          }
     }
}