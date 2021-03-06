package com.adapter;

/**
 * 适配器模式
 *
 * @author lzy
 * @date 2018-8-7
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        //进行测试
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
