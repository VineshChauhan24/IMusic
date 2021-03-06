package com.video.player.lib.constants;

/**
 * TinyHung@Outlook.com
 * 2019/4/10
 */

public interface VideoConstants {

    /**
     * 播放器方向
     */
    //常规
    int SCREEN_ORIENTATION_PORTRAIT = 0;
    //全屏
    int SCREEN_ORIENTATION_FULL = 1;
    //小窗口
    int SCREEN_ORIENTATION_TINY = 2;
    //悬浮窗口
    int SCREEN_ORIENTATION_WINDOW = 3;

    /**
     * 缩放类型
     */
    //缩放至控件宽高，会裁剪超出比例的画面
    int VIDEO_DISPLAY_TYPE_CUT = 0;
    //铺满延申至全屏，可能会有画面变形
    int VIDEO_DISPLAY_TYPE_PARENT = 1;
    //原始大小居中显示，不做任何裁剪和缩放
    int VIDEO_DISPLAY_TYPE_ORIGINAL = 2;
    //缩放宽度至控件最大宽度，高度按比例缩放
    int VIDEO_DISPLAY_TYPE_ZOOM = 3;

    /**
     * 视频入参KEY
     */
    String KEY_VIDEO_PARAMS = "video_params";
    String KEY_VIDEO_PLAYING = "video_playing";
    String KEY_VIDEO_URL = "video_url";
    String KEY_VIDEO_TITLE = "video_title";

    String VIDEO_HEADER = "video_header";
    //更多标题
    String ITEM_TITLE_FOOTER = "footer2";
    //热门所有排行
    String HOST_TOP_ALL = "ranklist";
}