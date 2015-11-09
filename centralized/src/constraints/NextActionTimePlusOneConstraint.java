package constraints;

import java.util.Map;
import java.util.Map.Entry;

import template.Action;
import template.Assignment;

/**
 * 
 * nextAction(a_i) = a_j => times(a_j) = times(a_i) + 1
 *
 */
public class NextActionTimePlusOneConstraint extends Constraint{

  @Override
  public boolean checkAssignment(Assignment a) {
    Map<Action, Long> times = a.times;
    
    for(Entry<Action, Action> e : a.nextAction.entrySet()){
      long time1 = times.get(e.getKey());
      long time2 = times.get(e.getValue());
      
      if(time1 != (time2+1)){
        return false;
      }
    }    
    return true;
  }

}
