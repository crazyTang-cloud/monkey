package action;

import Data.*;
import state.State;

public interface Action {
    /**
     * 猴子从a走向b
     * @param a 位置
     * @param b 位置
     * @return 操作完成返回true,否则返回false
     */
    public State Goto(Position a, Position b);

    /**
     * 猴子推着箱子从a走向b
     * @param a 位置
     * @param b 位置
     * @return 操作完成返回true,否则返回false
     */
    public State Pushbox(Position a, Position b);

    /**
     * 猴子爬上箱子
     * @return 操作完成返回true,否则返回false
     */
    public State Climbbox();

    /**
     * 猴子爬下箱子
     * @return
     */
    public State ClimbDown();

    /**
     * 猴子摘到香蕉
     * @return 操作完成返回true,否则返回false
     */
    public State Grasp();
}
