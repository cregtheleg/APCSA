package Music;

public class LoopAudio {

    public static void main(String[] args)
    {
        String filepath = "tetris.wav";
        
        Audio musicObject = new Audio();  
        musicObject.playMusic(filepath);

    }

}
