public abstract class Game {
    
    abstract void startPlay();
    abstract void endPlay();
    abstract void initilaize();

    public final void play()
    {

        startPlay();

        endPlay();

        initilaize();


    }


}
