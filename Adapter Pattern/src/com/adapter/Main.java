package com.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("         Adapter Pattern Demo             ");
        System.out.println("==========================================");

        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println("\n>>> Testing Supported Formats:");

        // Natively supported
        audioPlayer.play("mp3","beyond_the_horizon.mp3");

        //Supported via Adapter
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far_far_away.vlc");

        System.out.println("\n>>> Testing Unsupported Formats:");

        // Unsupported format triggering Error handling
        audioPlayer.play("avi", "mind_me.avi");
        audioPlayer.play("wav", "soundtrack.wav");
    }
}