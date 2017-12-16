package com.yijiang.ecarx.helloandroid;

/**
 * Created by yijiangwang on 2017/12/16.
 */

interface IMediaSourceInteraction {

    /**
     * Update media source from media to dim
     *
     * @param id
     * @param name
     */
    void updateMediaSourceToDim(int id, String name);

    /**
     * IMediaSourceInteraction callback
     */
    interface MediaSourceCallback {
        /**
         * Update media source from dim to media
         *
         * @param id
         * @param name
         */
        void updateMediaSourceToMedia(int id, String name);
    }

    /**
     * Register MediaSourceCallback
     * 
     * @param callback
     */
    void registerSourceCallback(IMediaSourceInteraction.MediaSourceCallback callback);

    /**
     * Unregister MediaSourceCallback
     *
     * @param callback
     */
    void unRegisterSourceCallback(IMediaSourceInteraction.MediaSourceCallback callback);
}
