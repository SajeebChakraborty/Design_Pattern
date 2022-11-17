public class AudioPlayer implements MediaPlayer{
    
    public MediaAdapter mediaAdapter;
    ;

    @Override
    public void play(String audioType, String fileName) {


        if(audioType.equalsIgnoreCase("mp3"))
        {

            System.out.println("mp3 running in ...");


        }   
        else if(audioType.equalsIgnoreCase("vlc"))
        {

            mediaAdapter=new MediaAdapter("vlc");
            mediaAdapter.play(audioType, fileName);


        }
        else if(audioType.equalsIgnoreCase("mp4"))
        {

            mediaAdapter=new MediaAdapter("mp4");
            mediaAdapter.play(audioType, fileName);

        
        }
        else
        {

            System.out.println("invalid media ...");


        }

    


    }

}
