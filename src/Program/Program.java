package Program;

import Broadcasters.Broadcasters;
import org.jetbrains.annotations.Contract;

public class Program {
    private String name;
    private Schedule schedule;
    private int duration;
    private String musicGenre;
    private Broadcasters broadcaster;


    Program(String name, Schedule schedule, int duration, String musicGenre, Broadcasters broadcaster){

        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.musicGenre = musicGenre;
        this.broadcaster = broadcaster;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMusicGenre() {
        return musicGenre;
    }
    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public Broadcasters getBroadcaster() {
        return broadcaster;
    }
    public void setBroadcaster(Broadcasters broadcaster) {
        this.broadcaster = broadcaster;
    }
}
