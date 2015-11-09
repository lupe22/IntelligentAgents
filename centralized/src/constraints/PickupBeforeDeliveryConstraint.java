package constraints;

import java.util.Map.Entry;

import logist.plan.Action.Pickup;
import template.Action;
import template.Assignment;

/**
 * 
 * times(Delivery(t_1)) > times(PickUp(t_1))
 *
 */
public class PickupBeforeDeliveryConstraint extends Constraint{

  @Override
  public boolean checkAssignment(Assignment a) {
    for(Entry<Action, Long> e : a.times.entrySet()){
      if(e.getKey().isDelivery()){
        long tpickup = a.times.get(new Pickup(e.getKey().task));
        if(tpickup >= e.getValue()){
          return false;
        }
      }
    }
    return true;
  }

}
