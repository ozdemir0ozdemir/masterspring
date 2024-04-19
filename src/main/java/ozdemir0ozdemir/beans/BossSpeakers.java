package ozdemir0ozdemir.beans;

import org.springframework.stereotype.Component;

@Component
public class BossSpeakers implements Speakers {

    @Override
    public String makeSound(Song song) {
        return String.format(" Playing the song %s by %s with Boss speakers",
                song.getTitle(), song.getSingerName());
    }
}
