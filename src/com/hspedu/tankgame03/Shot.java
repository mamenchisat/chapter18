package com.hspedu.tankgame03;

/**
 * 项目名：    chapter18
 * 文件名：    Shot
 * 创建时间：   2022/9/4 11:24
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Shot implements Runnable {
    int x;
    int y;

    public Shot(int x, int y, int directory) {
        this.x = x;
        this.y = y;
        this.directory = directory;
    }

    int directory = 0;
    int speed = 2;
    boolean isLive = true;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (directory) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
                default:
            }
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                break;
            }
        }
    }
}
