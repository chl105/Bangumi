package com.fanchen.zzplayer.controller;

/**
 * Created by fanchen on 2017/4/28.
 * 控制栏功能回调
 */
public interface IControllerImpl {
    /**
     * 播放/暂停按钮被触发时
     */
    void onPlayTurn();

    /**
     * 进度条被用户拖动时触发
     */
    void onProgressChange(int state, int progress);

    /**
     * 触发全屏/退出全屏功能
     */
    void onOrientationChange();
}
