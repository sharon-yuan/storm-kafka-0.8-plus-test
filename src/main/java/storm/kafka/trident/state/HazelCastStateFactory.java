package storm.kafka.trident.state;

import backtype.storm.task.IMetricsContext;
import storm.trident.state.State;
import storm.trident.state.StateFactory;
import storm.trident.state.map.TransactionalMap;

import java.util.Map;

public class HazelCastStateFactory implements StateFactory {


    /**
	 * 
	 */
	private static final long serialVersionUID = 2533595825619787406L;

	@SuppressWarnings("unchecked")
	@Override
    public State makeState(Map conf, IMetricsContext metrics, int partitionIndex, int numPartitions) {
        return TransactionalMap.build(new HazelCastState(new HazelCastHandler()));
    }
}
