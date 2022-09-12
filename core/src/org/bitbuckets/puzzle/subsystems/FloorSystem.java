package org.bitbuckets.puzzle.subsystems;

import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
public class FloorSystem implements SubSystem {

    PlayerSystem ps = new PlayerSystem();

    public void init() {

    }

    public void periodic(Graphics graphics) {
        System.out.println(ps.pose2d[0]);
        /*
        for (int i = 0; i < ps.pose2d.length; i++) {
            System.out.println(i);
        }*/
    }




}
