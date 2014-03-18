package chapter4.tip16;

import chapter4.tip16.entity.AutoClip;

/**
 * Created by snakecc on 14-3-18.
 */
public interface SingerSongWriter extends Singer,SongWriter{
    AutoClip strum();
    void actSensitive();

}
