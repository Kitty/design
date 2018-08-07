package com.adapter;

/**
 * 适配器模式
 *
 * @author lzy
 * @date 2018-8-7
 */
public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
