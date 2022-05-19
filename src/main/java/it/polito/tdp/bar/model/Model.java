package it.polito.tdp.bar.model;

public class Model {
	private Simulator sim;
	
	public Model() {
		this.sim = new Simulator();
	}
	
	public void simula() {
		this.sim.init();
		this.sim.run();
	}

}
