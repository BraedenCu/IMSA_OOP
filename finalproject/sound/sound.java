
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
        
        playSound(44100, 659, 1);
        playSound(44100, 200, 1);
        playSound(44100, 400, 1);
        playSound(44100, 300, 1);
        playSound(44100, 800, 1);
        playSound(44100, 659, 1);
        playSound(44100, 200, 1);
        playSound(44100, 400, 1);
        playSound(44100, 300, 1);
        playSound(44100, 800, 1);
        playSound(44100, 500, 1);
    }
    
    public void playSound(int sp, int hzs, int dur) {
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
