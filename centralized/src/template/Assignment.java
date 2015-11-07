package template;

import java.util.List;
import java.util.Map;

import logist.plan.Plan;
import logist.simulation.Vehicle;
import logist.task.Task;

public class Assignment {
  public final Map<Vehicle, Action> firstAction;
  public final Map<Action, Action> nextAction;
  public final Map<Task, Vehicle> vehicles;
  public final Map<Action, Long> times;

  public Assignment(Map<Vehicle, Action> firstAction,
      Map<Action, Action> nextAction, Map<Task, Vehicle> vehicles,
      Map<Action, Long> times) {
    this.firstAction = firstAction;
    this.nextAction = nextAction;
    this.vehicles = vehicles;
    this.times = times;
  }

  public List<Plan> generatePlans() {
    // TODO Auto-generated method stub
    return null;
  }
}
