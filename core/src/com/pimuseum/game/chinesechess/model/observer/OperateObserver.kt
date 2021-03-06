package com.pimuseum.game.chinesechess.model.observer

import com.pimuseum.game.chinesechess.model.chessman.Chessman

interface OperateObserver {

    /**
     * 把棋子放回原位
     */
    fun onDropBack(chessman : Chessman)

    /**
     * 吃掉棋子
     */
    fun onRemoveChessman(chessman : Chessman)

    /**
     * 移动棋子
     */
    fun onMoveChessman(row : Int, column : Int)

    /**
     * 载入棋子
     */
    fun onLoadChessmen()
}