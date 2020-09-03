package one.innovation.digital.finals;

public class CasualGamer extends  Gamer {
    @Override
    public String keboard(){
        return  "Simples Keboard...";
    }
   /* @Override
    public String mouse(){
        return super.mouse();
    }*/

    public String play(final String game){
        //game = "WoW;";
        return "Jogando "+ game;
    }
}
