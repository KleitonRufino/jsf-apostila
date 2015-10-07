package br.com.phaselisteners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MonitorPhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 992685173324070617L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("MonitorPhaseListener.afterPhase() - " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("MonitorPhaseListener.beforePhase() - " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
