package ozdemir0ozdemir.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound(Song song) {
        return String.format(" Playing the song %s by %s with Sony speakers",
                song.getTitle(), song.getSingerName());
    }
}
