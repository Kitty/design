package com.adapter;

/**
 * 适配器模式
 *
 * @author lzy
 * @date 2018-8-7
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
