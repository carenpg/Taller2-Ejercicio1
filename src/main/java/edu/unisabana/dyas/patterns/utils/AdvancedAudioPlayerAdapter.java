package edu.unisabana.dyas.patterns.utils;
public class AdvancedAudioPlayerAdapter implements AudioPlayer{
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer){
        this.advancedAudioPlayer = advancedAudioPlayer;
    }



    @Override
    public void play(String audioType, String fileName) {
       if (audioType.equalsIgnoreCase(audioType)){
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("Vlc")){
            advancedAudioPlayer.playVlc(fileName);
       }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}