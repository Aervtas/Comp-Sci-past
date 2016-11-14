import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;


public class EasySound
{
  private SourceDataLine line = null;
  private byte[] audioBytes;
  private int numBytes;

  /**
   * Constructs an <code>EasySound</code> for a given audio file.
   * @param fileName the name or pathname of the audio clip file.
   */
  public EasySound(String fileName)
  {
    File  soundFile = new File(fileName);
    AudioInputStream audioInputStream = null;
    try
    {
      audioInputStream = AudioSystem.getAudioInputStream(soundFile);
    }
    catch (Exception ex)
    {
      System.out.println("*** Cannot find " + fileName + " ***");
      System.exit(1);
    }

    AudioFormat audioFormat = audioInputStream.getFormat();
    DataLine.Info info = new DataLine.Info(SourceDataLine.class,
                         audioFormat);
    try
    {
      line = (SourceDataLine)AudioSystem.getLine(info);
      line.open(audioFormat);
    }
    catch (Exception ex)
    {
      System.out.println("*** Audio line unavailable ***");
      return;
    }

    line.start();

    audioBytes = new byte[(int)soundFile.length()];

    try
    {
      numBytes = audioInputStream.read(audioBytes, 0, audioBytes.length);
    }
    catch (IOException ex)
    {
      System.out.println("*** Cannot read " + fileName + " ***");
      System.exit(1);
    }
  }

  /**
   * Plays this <code>EasySound</code>.
   */
  public void play()
  {
    // Our thanks to JP Fasano for helping debug audio line exceptions. 
    if (line != null)
      line.write(audioBytes, 0, numBytes);
    else
      System.out.println("La-la-la (the audio line is unavailable on this computer)");
  }
}
