package action;

import Data.*;
import state.State;

public interface Action {
    /**
     * ���Ӵ�a����b
     * @param a λ��
     * @param b λ��
     * @return ������ɷ���true,���򷵻�false
     */
    public State Goto(Position a, Position b);

    /**
     * �����������Ӵ�a����b
     * @param a λ��
     * @param b λ��
     * @return ������ɷ���true,���򷵻�false
     */
    public State Pushbox(Position a, Position b);

    /**
     * ������������
     * @return ������ɷ���true,���򷵻�false
     */
    public State Climbbox();

    /**
     * ������������
     * @return
     */
    public State ClimbDown();

    /**
     * ����ժ���㽶
     * @return ������ɷ���true,���򷵻�false
     */
    public State Grasp();
}
