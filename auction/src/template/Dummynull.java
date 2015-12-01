package template;

import logist.agent.Agent;
import logist.task.TaskDistribution;
import logist.topology.Topology;

public class Dummynull extends DummyConstantBid{
	
	@Override
	public void setup(Topology topology, TaskDistribution distribution, Agent agent) {
		super.setup(topology, distribution, agent);
		this.bid = null;
	}

}
