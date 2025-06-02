package desgin_patterns;

//Simplifies complex subsystem.

class Cpu{
	public void startCpu() {
		System.out.println("Start the Cpu");
	}
}

class Memory{
	public void loadMemory() {
	System.out.println("Loaded the main memory");
	}
}

public class Fascade {
	
	private Cpu cpu = new Cpu();
	private Memory memory = new Memory();
	
	public void startTheComputer() {
		cpu.startCpu();
		memory.loadMemory();
		System.out.println("Computer was started successfully...");
	}

	public static void main(String[] args) {
		Fascade fascade = new Fascade();
		fascade.startTheComputer();
	}
}
