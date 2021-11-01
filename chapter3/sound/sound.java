
/**
 * Write a description of class sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sound
{
    /**
     * Constructor for objects of class sound
     */
    public sound()
    {
        // initialise instance variables
        int sps = 44100; //samples per second
        int hz = 622; // concert A
        double duration = 1; // ten seconds
        int N = (int) (sps * duration); // total number of samples
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++)
        {
            a[i] = Math.sin(2*Math.PI * i * hz / sps);
        }
        StdAudio.play(a);
        
        playSound(44100, 659, 0.7);
        playSound(44100, 500, 0.7);
        playSound(44100, 400, 0.6);
        playSound(44100, 300, 0.5);
        playSound(44100, 800, 0.6);
        playSound(44100, 659, 1);
        playSound(44100, 200, 1);
        playSound(44100, 400, 1);
        playSound(44100, 300, 1);
        playSound(44100, 800, 1);
        playSound(44100, 750, 0.4);
        playSound(44100, 700, 0.4);
        playSound(44100, 650, 0.4);
        playSound(44100, 600, 0.4);
        playSound(44100, 550, 0.4);
        playSound(44100, 500, 0.4);
        playSound(44100, 450, 0.4);
        playSound(44100, 400, 0.4);
        playSound(44100, 350, 0.4);
        playSound(44100, 300, 2);
    }
    
    public void playSound(int sp, int hzs, double dur) {
        // initialise instance variables
        int sps = sp; //samples per second
        int hz = hzs; // concert E
        double duration = dur; // ten seconds
        int N = (int) (sps * duration); // total number of samples
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++)
        {
            a[i] = Math.sin(2*Math.PI * i * hz / sps);
        }
        StdAudio.play(a);
    }
}
