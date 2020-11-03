package action;

import Data.Position;
import state.State;

public class Move {
    //State state;
    MonckeyAction monckeyAction;
    public State move(State state){
        monckeyAction = new MonckeyAction(state);
        Position a = state.getMonkeySite().getPosition();
        Position b = state.getBoxSite().getPosition();
        if(!a.equals(b)){
            monckeyAction.Goto(a,b);
            return state;
        }
        Position c = state.getHang().getB();
        if(!b.equals(c)){
            if(state.getOn().getIsOn()){
                monckeyAction.ClimbDown();
                return state;
            }
            else{
                monckeyAction.Pushbox(b,c);
                return state;
            }
        }
//        if(!b.equals(c)){
//            monckeyAction.Pushbox(b,c);
//            return state;
//        }
        if(!state.getOn().getIsOn()){
            monckeyAction.Climbbox();
            return state;
        }
        if(!state.getHolds().getHolds()){
            monckeyAction.Grasp();
            return state;
        }

        return null;
    }
}
