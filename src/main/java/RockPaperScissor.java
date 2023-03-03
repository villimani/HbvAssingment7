public class RockPaperScissor {
    public static void main(String[] args) {
       int talva= (int)(Math.random()*3);
       int leikmadur= Integer.parseInt(args[0]);
      if(talva==leikmadur){
          System.out.println("Þið gerðuð það sama: Jafntefli");
      }
      else if(talva==0&&leikmadur==1){
          System.out.println("Þú gerðir blað hann gerði stein: Þú vannst!");
      }
      else if(talva==1&&leikmadur==2){
          System.out.println("Þú gerðir skæri hann gerði blað: Þú vannst! ");
      }
      else if(talva==2&&leikmadur==0){
          System.out.println("Þú gerðir stein hann gerði skæri: Þú vannst!");
      }
      else if(talva==0&&leikmadur==2){
          System.out.println("Þú gerðir skæri hann gerði stein: Þú tapaðir:(");
    }
      else if(talva==1&&leikmadur==0){
          System.out.println("Þú gerðir stein hann gerði blað: Þú tapaðir:(");
      }
      else if (talva==2&&leikmadur==1){
          System.out.println("Þú gerðir blað hann gerði skæri: Þú tapaðir:(");
      }
      }
    }